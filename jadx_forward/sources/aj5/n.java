package aj5;

/* loaded from: classes.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f87011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.r f87012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.List list, aj5.r rVar) {
        super(1);
        this.f87011d = list;
        this.f87012e = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        aj5.r rVar;
        boolean z17;
        wi5.n0 n0Var;
        java.util.Map map;
        java.util.List list;
        java.util.List it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "commonChatroomSearchResultListener: resultSize: " + it.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        g95.d dVar = g95.e.f351334a;
        java.util.List list2 = this.f87011d;
        java.util.Iterator it6 = ((java.util.ArrayList) dVar.f(list2)).iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            rVar = this.f87012e;
            if (!hasNext) {
                break;
            }
            java.lang.String g27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.z3) it6.next()).g2();
            if (g27 == null) {
                g27 = "";
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(g27);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(rVar.m158354x19263085().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19)), 0, g27.length(), 33);
            arrayList.add(spannableString);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(rVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogm));
        java.util.Iterator it7 = arrayList.iterator();
        int i17 = 0;
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.CharSequence charSequence = (java.lang.CharSequence) next;
            if (i17 > 0) {
                spannableStringBuilder.append((java.lang.CharSequence) rVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogn));
            }
            spannableStringBuilder.append(charSequence);
            i17 = i18;
        }
        rVar.V6().k().mo7946xf939df19();
        java.util.List list3 = rVar.f87032f;
        ((java.util.ArrayList) list3).clear();
        ((java.util.ArrayList) list3).addAll(it);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = rVar.V6().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.z(rVar.f87033g);
        }
        java.util.List f17 = dVar.f(it);
        java.util.List a18 = g95.b.f351327a.a(it);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it8 = kz5.n0.K0(f17, 3).iterator();
        int i19 = 0;
        while (true) {
            boolean hasNext2 = it8.hasNext();
            ti5.c cVar = ti5.d.f501196i;
            if (!hasNext2) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) f17;
                if (arrayList3.size() > 3) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3("fake_user_create_chatroom_more");
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = rVar.m158354x19263085();
                    ri5.h hVar = ri5.j.I;
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    int i27 = ri5.j.M;
                    ri5.j b17 = cVar.b(m158354x19263085, hVar.a(d17, i27, 2), z3Var, i27, new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null));
                    b17.f477662z = true;
                    z17 = false;
                    b17.f477658v = false;
                    arrayList2.add(b17);
                } else {
                    z17 = false;
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k18 = rVar.V6().k();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getSelectContactRv(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a19 = xm3.u0.a(k18);
                if (a19 != null) {
                    a19.n(arrayList2, z17);
                }
                jz5.l lVar = new jz5.l("view_id", "group_list_recommend");
                jz5.l lVar2 = new jz5.l("appear_type", "2");
                jz5.l lVar3 = new jz5.l("exist_group_list_num", java.lang.String.valueOf(arrayList3.size()));
                jz5.l lVar4 = new jz5.l("select_num", java.lang.String.valueOf(list2.size()));
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = rVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                java.util.Map k19 = kz5.c1.k(lVar, lVar2, lVar3, lVar4, new jz5.l("create_group_sessionid", ((aj5.l1) pf5.z.f435481a.a(activity).a(aj5.l1.class)).T6()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", null, k19, 35568);
                j75.f Q6 = rVar.Q6();
                if (Q6 != null && (n0Var = (wi5.n0) Q6.mo140437x75286adb()) != null && (map = n0Var.F) != null) {
                    ((java.util.LinkedHashMap) map).clear();
                    map.putAll(k19);
                }
                return jz5.f0.f384359a;
            }
            java.lang.Object next2 = it8.next();
            int i28 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) next2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "Processing contact " + i19 + ": " + z3Var2.d1());
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.a3) kz5.n0.a0(a18, i19);
            if (a3Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "Adding contact " + i19 + " to list");
                list = a18;
                int i29 = i19;
                ti5.d dVar2 = new ti5.d(null, null, 0, 0, i29, 0, null, false, 239, null);
                ri5.h hVar2 = ri5.j.I;
                int i37 = ri5.j.L;
                java.lang.String d18 = z3Var2.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                ri5.j b18 = cVar.b(rVar.m158354x19263085(), hVar2.a(d18, i37, i29), z3Var2, i37, dVar2);
                b18.f477660x = false;
                b18.f477662z = true;
                b18.A = true;
                b18.F = a3Var.f69098xbcb1bed0;
                b18.n(spannableStringBuilder);
                if (i29 == 0) {
                    b18.f477651o = true;
                    java.lang.String string = rVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571859ml2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    b18.f477652p = string;
                    b18.f477653q = rVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
                    b18.f477654r = false;
                }
                if (i28 == ((java.util.ArrayList) f17).size()) {
                    b18.f477656t = true;
                }
                arrayList2.add(b18);
            } else {
                list = a18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "chatroomMemberList missing for index " + i19);
            }
            i19 = i28;
            a18 = list;
        }
    }
}
