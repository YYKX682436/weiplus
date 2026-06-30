package j93;

/* loaded from: classes.dex */
public final class p2 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f380009d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f380010e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f380011f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f380012g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f380013h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f380009d = jz5.h.b(new j93.o2(this));
        this.f380010e = jz5.h.b(new j93.k2(this));
        this.f380011f = jz5.h.b(new j93.n2(this));
    }

    public static final void U6(j93.p2 p2Var) {
        java.util.ArrayList arrayList;
        p2Var.getClass();
        android.content.Intent intent = new android.content.Intent(p2Var.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", p2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbj));
        intent.putExtra("list_type", 0);
        intent.putExtra("list_attr", 64);
        intent.putExtra("menu_mode", 2);
        intent.putExtra("key_confirm_menu_name", p2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbi));
        intent.putExtra("recommend_chatroom", true);
        intent.putExtra("need_show_expand_btn", true);
        intent.putExtra("need_show_multiSelect_bottom", true);
        intent.putExtra("key_label_click_source", ((java.lang.Number) ((jz5.n) p2Var.f380011f).mo141623x754a37bb()).intValue());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(c01.z1.r());
        arrayList2.add("weixin");
        arrayList2.add("filehelper");
        arrayList2.addAll(c01.e2.i());
        arrayList2.addAll(c01.e2.h());
        arrayList2.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = p2Var.W6().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null && (arrayList = a17.f233598o) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ri5.j) it.next()).f477644f);
            }
            arrayList2.addAll(arrayList3);
            intent.putExtra("INTENT_KEY_ORIGIN_USER_COUNT", arrayList3.size());
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2)) {
            intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ","));
        }
        pf5.j0.a(intent, cj5.d1.class);
        pf5.j0.a(intent, aj5.g1.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, cj5.b3.class);
        pf5.j0.a(intent, j93.v2.class);
        intent.putExtra("key_confirm_menu_name", p2Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573899mb4));
        intent.putExtra("key_confirm_menu_color", 0);
        pf5.j0.a(intent, cj5.n1.class);
        pf5.j0.a(intent, cj5.o.class);
        pf5.j0.a(intent, j93.r0.class);
        intent.putExtra("INTENT_KEY_PAGE_SESSION_ID", en1.a.a() + '_' + c01.id.c());
        intent.putExtra("INTENT_KEY_SELECT_CONTACT_FROM_SCENE", 1);
        intent.putExtra("INTENT_KEY_SELECT_CONTACT_FROM_SCENE_SUB_TYPE", 23);
        pf5.j0.a(intent, bj5.r0.class);
        p2Var.m158354x19263085().startActivityForResult(intent, 1);
    }

    public static final void V6(j93.p2 p2Var, boolean z17) {
        em.l2 W6 = p2Var.W6();
        if (W6.f336101y == null) {
            W6.f336101y = (android.widget.FrameLayout) W6.f336077a.findViewById(com.p314xaae8f345.mm.R.id.gbu);
        }
        W6.f336101y.setVisibility(z17 ? 0 : 8);
    }

    public final em.l2 W6() {
        return (em.l2) ((jz5.n) this.f380009d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelFooterViewUIC", "onActivityResult() called with: requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent);
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra, ",");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelFooterViewUIC", "onActivityResult: userNameList:" + O1.size());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(O1);
            jz5.g gVar = this.f380010e;
            if (!L0) {
                for (java.lang.Object obj : O1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str = (java.lang.String) obj;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c01.z1.r())) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
                        if (n17 != null) {
                            java.lang.String D0 = n17.D0();
                            java.lang.String b17 = b93.n.b(D0, (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelFooterViewUIC", "labels:%s mixLabelIds:%s", D0, b17);
                            if (!r26.i0.p(b17, D0, true)) {
                                r45.gw6 gw6Var = new r45.gw6();
                                gw6Var.f457114d = n17.d1();
                                gw6Var.f457115e = b17;
                                linkedList.add(gw6Var);
                            }
                            f0Var = jz5.f0.f384359a;
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectLabelFooterViewUIC", "doUpdateContactList: contact is null");
                        }
                    }
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                this.f380012g = ((cj5.o) pf5.z.f435481a.a(activity).a(cj5.o.class)).T6();
                r45.ip4 ip4Var = new r45.ip4();
                ip4Var.f458789e = linkedList;
                ip4Var.f458788d = linkedList.size();
                ip4Var.b().l().K(new j93.h2(O1, this));
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("label_id", (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelFooterViewUIC", "setResult: labelId = " + ((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb()));
            m158354x19263085.setResult(-1, intent2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new j93.m2(this));
    }
}
