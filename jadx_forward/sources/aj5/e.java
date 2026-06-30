package aj5;

/* loaded from: classes.dex */
public final class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f86949d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f86950e;

    /* renamed from: f, reason: collision with root package name */
    public p13.c f86951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f86949d = jz5.h.b(new aj5.d(this));
        this.f86950e = jz5.h.b(aj5.b.f86927d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = m158359x1e885992().getStringArrayListExtra("chatroommemberlist");
        java.util.List V0 = stringArrayListExtra != null ? kz5.n0.V0(kz5.n0.V(stringArrayListExtra)) : new java.util.ArrayList();
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = m158359x1e885992().getStringArrayListExtra("chatroomlist");
        java.util.List V02 = stringArrayListExtra2 != null ? kz5.n0.V0(kz5.n0.V(stringArrayListExtra2)) : new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((!V02.isEmpty()) && (!V0.isEmpty())) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogm));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            g95.d dVar = g95.e.f351334a;
            java.util.Iterator it = ((java.util.ArrayList) dVar.f(V0)).iterator();
            while (it.hasNext()) {
                java.lang.String P0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next()).P0();
                android.text.SpannableString spannableString = new android.text.SpannableString(P0);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(m158354x19263085().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19)), 0, P0.length(), 33);
                arrayList2.add(spannableString);
            }
            java.util.Iterator it6 = arrayList2.iterator();
            int i17 = 0;
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.CharSequence charSequence = (java.lang.CharSequence) next;
                if (i17 > 0) {
                    spannableStringBuilder.append((java.lang.CharSequence) m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogn));
                }
                spannableStringBuilder.append(charSequence);
                i17 = i18;
            }
            java.util.List f17 = dVar.f(V02);
            java.util.List a17 = g95.b.f351327a.a(V02);
            int i19 = 0;
            for (java.lang.Object obj : f17) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreDuplicateGroupUIC", "Processing contact " + i19 + ": " + z3Var.d1());
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.a3) kz5.n0.a0(a17, i19);
                if (a3Var != null) {
                    ti5.d dVar2 = new ti5.d(null, null, 0, 0, i19, 0, null, false, 239, null);
                    ri5.h hVar = ri5.j.I;
                    int i28 = ri5.j.L;
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    ri5.j b17 = ti5.d.f501196i.b(m158354x19263085(), hVar.a(d17, i28, i19), z3Var, i28, dVar2);
                    b17.f477660x = false;
                    b17.f477662z = true;
                    b17.A = true;
                    b17.F = a3Var.f69098xbcb1bed0;
                    b17.n(spannableStringBuilder);
                    arrayList.add(b17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MoreDuplicateGroupUIC", "chatroomMemberList missing for index " + i19);
                }
                i19 = i27;
            }
        }
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("detail_query");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreDuplicateGroupUIC", "selectedMemberList: " + V0.size() + ", chatroomList: " + V02.size() + ", originQuery: " + stringExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new aj5.c(arrayList, this, stringExtra));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (this.f86951f != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f86951f);
        }
        this.f86951f = null;
    }
}
