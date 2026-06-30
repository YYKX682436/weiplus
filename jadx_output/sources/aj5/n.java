package aj5;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.r f5479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.List list, aj5.r rVar) {
        super(1);
        this.f5478d = list;
        this.f5479e = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        aj5.r rVar;
        boolean z17;
        wi5.n0 n0Var;
        java.util.Map map;
        java.util.List list;
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "commonChatroomSearchResultListener: resultSize: " + it.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        g95.d dVar = g95.e.f269801a;
        java.util.List list2 = this.f5478d;
        java.util.Iterator it6 = ((java.util.ArrayList) dVar.f(list2)).iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            rVar = this.f5479e;
            if (!hasNext) {
                break;
            }
            java.lang.String g27 = ((com.tencent.mm.storage.z3) it6.next()).g2();
            if (g27 == null) {
                g27 = "";
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(g27);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(rVar.getActivity().getColor(com.tencent.mm.R.color.Brand_100)), 0, g27.length(), 33);
            arrayList.add(spannableString);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(rVar.getActivity().getString(com.tencent.mm.R.string.ogm));
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
                spannableStringBuilder.append((java.lang.CharSequence) rVar.getActivity().getString(com.tencent.mm.R.string.ogn));
            }
            spannableStringBuilder.append(charSequence);
            i17 = i18;
        }
        rVar.V6().k().getAdapter();
        java.util.List list3 = rVar.f5499f;
        ((java.util.ArrayList) list3).clear();
        ((java.util.ArrayList) list3).addAll(it);
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = rVar.V6().k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.z(rVar.f5500g);
        }
        java.util.List f17 = dVar.f(it);
        java.util.List a18 = g95.b.f269794a.a(it);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it8 = kz5.n0.K0(f17, 3).iterator();
        int i19 = 0;
        while (true) {
            boolean hasNext2 = it8.hasNext();
            ti5.c cVar = ti5.d.f419663i;
            if (!hasNext2) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) f17;
                if (arrayList3.size() > 3) {
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3("fake_user_create_chatroom_more");
                    androidx.appcompat.app.AppCompatActivity activity = rVar.getActivity();
                    ri5.h hVar = ri5.j.I;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    int i27 = ri5.j.M;
                    ri5.j b17 = cVar.b(activity, hVar.a(d17, i27, 2), z3Var, i27, new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null));
                    b17.f396129z = true;
                    z17 = false;
                    b17.f396125v = false;
                    arrayList2.add(b17);
                } else {
                    z17 = false;
                }
                com.tencent.mm.view.recyclerview.WxRecyclerView k18 = rVar.V6().k();
                kotlin.jvm.internal.o.f(k18, "getSelectContactRv(...)");
                com.tencent.mm.plugin.mvvmlist.MvvmList a19 = xm3.u0.a(k18);
                if (a19 != null) {
                    a19.n(arrayList2, z17);
                }
                jz5.l lVar = new jz5.l("view_id", "group_list_recommend");
                jz5.l lVar2 = new jz5.l("appear_type", "2");
                jz5.l lVar3 = new jz5.l("exist_group_list_num", java.lang.String.valueOf(arrayList3.size()));
                jz5.l lVar4 = new jz5.l("select_num", java.lang.String.valueOf(list2.size()));
                androidx.appcompat.app.AppCompatActivity activity2 = rVar.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                java.util.Map k19 = kz5.c1.k(lVar, lVar2, lVar3, lVar4, new jz5.l("create_group_sessionid", ((aj5.l1) pf5.z.f353948a.a(activity2).a(aj5.l1.class)).T6()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", null, k19, 35568);
                j75.f Q6 = rVar.Q6();
                if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null && (map = n0Var.F) != null) {
                    ((java.util.LinkedHashMap) map).clear();
                    map.putAll(k19);
                }
                return jz5.f0.f302826a;
            }
            java.lang.Object next2 = it8.next();
            int i28 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.storage.z3 z3Var2 = (com.tencent.mm.storage.z3) next2;
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "Processing contact " + i19 + ": " + z3Var2.d1());
            com.tencent.mm.storage.a3 a3Var = (com.tencent.mm.storage.a3) kz5.n0.a0(a18, i19);
            if (a3Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "Adding contact " + i19 + " to list");
                list = a18;
                int i29 = i19;
                ti5.d dVar2 = new ti5.d(null, null, 0, 0, i29, 0, null, false, 239, null);
                ri5.h hVar2 = ri5.j.I;
                int i37 = ri5.j.L;
                java.lang.String d18 = z3Var2.d1();
                kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                ri5.j b18 = cVar.b(rVar.getActivity(), hVar2.a(d18, i37, i29), z3Var2, i37, dVar2);
                b18.f396127x = false;
                b18.f396129z = true;
                b18.A = true;
                b18.F = a3Var.field_memberCount;
                b18.n(spannableStringBuilder);
                if (i29 == 0) {
                    b18.f396118o = true;
                    java.lang.String string = rVar.getActivity().getString(com.tencent.mm.R.string.f490326ml2);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    b18.f396119p = string;
                    b18.f396120q = rVar.getActivity().getResources().getColor(com.tencent.mm.R.color.f478489a);
                    b18.f396121r = false;
                }
                if (i28 == ((java.util.ArrayList) f17).size()) {
                    b18.f396123t = true;
                }
                arrayList2.add(b18);
            } else {
                list = a18;
                com.tencent.mars.xlog.Log.w("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "chatroomMemberList missing for index " + i19);
            }
            i19 = i28;
            a18 = list;
        }
    }
}
