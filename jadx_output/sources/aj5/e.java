package aj5;

/* loaded from: classes.dex */
public final class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f5416d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f5417e;

    /* renamed from: f, reason: collision with root package name */
    public p13.c f5418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f5416d = jz5.h.b(new aj5.d(this));
        this.f5417e = jz5.h.b(aj5.b.f5394d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("chatroommemberlist");
        java.util.List V0 = stringArrayListExtra != null ? kz5.n0.V0(kz5.n0.V(stringArrayListExtra)) : new java.util.ArrayList();
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("chatroomlist");
        java.util.List V02 = stringArrayListExtra2 != null ? kz5.n0.V0(kz5.n0.V(stringArrayListExtra2)) : new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((!V02.isEmpty()) && (!V0.isEmpty())) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(getActivity().getString(com.tencent.mm.R.string.ogm));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            g95.d dVar = g95.e.f269801a;
            java.util.Iterator it = ((java.util.ArrayList) dVar.f(V0)).iterator();
            while (it.hasNext()) {
                java.lang.String P0 = ((com.tencent.mm.storage.z3) it.next()).P0();
                android.text.SpannableString spannableString = new android.text.SpannableString(P0);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(getActivity().getColor(com.tencent.mm.R.color.Brand_100)), 0, P0.length(), 33);
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
                    spannableStringBuilder.append((java.lang.CharSequence) getActivity().getString(com.tencent.mm.R.string.ogn));
                }
                spannableStringBuilder.append(charSequence);
                i17 = i18;
            }
            java.util.List f17 = dVar.f(V02);
            java.util.List a17 = g95.b.f269794a.a(V02);
            int i19 = 0;
            for (java.lang.Object obj : f17) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) obj;
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreDuplicateGroupUIC", "Processing contact " + i19 + ": " + z3Var.d1());
                com.tencent.mm.storage.a3 a3Var = (com.tencent.mm.storage.a3) kz5.n0.a0(a17, i19);
                if (a3Var != null) {
                    ti5.d dVar2 = new ti5.d(null, null, 0, 0, i19, 0, null, false, 239, null);
                    ri5.h hVar = ri5.j.I;
                    int i28 = ri5.j.L;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    ri5.j b17 = ti5.d.f419663i.b(getActivity(), hVar.a(d17, i28, i19), z3Var, i28, dVar2);
                    b17.f396127x = false;
                    b17.f396129z = true;
                    b17.A = true;
                    b17.F = a3Var.field_memberCount;
                    b17.n(spannableStringBuilder);
                    arrayList.add(b17);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MoreDuplicateGroupUIC", "chatroomMemberList missing for index " + i19);
                }
                i19 = i27;
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("detail_query");
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreDuplicateGroupUIC", "selectedMemberList: " + V0.size() + ", chatroomList: " + V02.size() + ", originQuery: " + stringExtra);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new aj5.c(arrayList, this, stringExtra));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (this.f5418f != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f5418f);
        }
        this.f5418f = null;
    }
}
