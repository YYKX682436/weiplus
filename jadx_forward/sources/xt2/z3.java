package xt2;

/* loaded from: classes3.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f538673d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f538674e;

    /* renamed from: f, reason: collision with root package name */
    public final xt2.i5 f538675f;

    /* renamed from: g, reason: collision with root package name */
    public final xt2.u3 f538676g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f538677h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f538678i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f538679m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f538680n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f538681o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f538682p;

    /* renamed from: q, reason: collision with root package name */
    public final tt2.i f538683q;

    public z3(android.view.View root, java.util.LinkedList shoppingListData, xt2.i5 config, xt2.u3 u3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shoppingListData, "shoppingListData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f538673d = root;
        this.f538674e = shoppingListData;
        this.f538675f = config;
        this.f538676g = u3Var;
        this.f538677h = "FinderLiveShoppingEditWidget";
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.muz);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.mux);
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.muy);
        this.f538678i = root.findViewById(com.p314xaae8f345.mm.R.id.od7);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) root.findViewById(com.p314xaae8f345.mm.R.id.muq);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.mun);
        this.f538679m = findViewById;
        this.f538680n = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.mus);
        android.widget.TextView textView3 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.mur);
        this.f538681o = textView3;
        android.widget.TextView textView4 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.mup);
        this.f538682p = textView4;
        tt2.i iVar = new tt2.i();
        this.f538683q = iVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new xt2.v3(this));
        findViewById.setOnClickListener(this);
        c22699x3dcdb352.setOnClickListener(this);
        zl2.r4.c3(zl2.r4.f555483a, c22699x3dcdb352, 0, 0, 6, null);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        iVar.f503470n = new xt2.t3(this, iVar);
        c1163xf1deaba4.mo7960x6cab2c8d(iVar);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
        g1Var.d(c1163xf1deaba4);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }

    public static void c(xt2.z3 z3Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        tt2.i iVar = z3Var.f538683q;
        if (!z17) {
            if (z18) {
                z3Var.f538673d.animate().translationY(com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y).setListener(new xt2.x3(z3Var)).start();
                return;
            }
            java.util.Iterator it = iVar.f503467h.iterator();
            while (it.hasNext()) {
                ((tt2.e) it.next()).f503406b = false;
            }
            android.view.View view = z3Var.f538673d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = z3Var.f538673d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        iVar.getClass();
        java.util.LinkedList dataList = z3Var.f538674e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        xt2.i5 priceViewConfig = z3Var.f538675f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priceViewConfig, "priceViewConfig");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : dataList) {
            if (!(((so2.j5) obj2) instanceof cm2.m0)) {
                arrayList3.add(obj2);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateProductList otherItem:");
        java.util.Iterator it6 = arrayList3.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("[" + i18 + ',' + ((so2.j5) next).mo2128x1ed62e84() + ']');
            i18 = i19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveShoppingEditAdapter", sb6.toString());
        java.util.ArrayList arrayList4 = iVar.f503467h;
        arrayList4.clear();
        iVar.f503468i.clear();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(dataList, 10));
        java.util.Iterator it7 = dataList.iterator();
        while (it7.hasNext()) {
            arrayList5.add(new tt2.e((so2.j5) it7.next(), false, 2, null));
        }
        arrayList4.addAll(arrayList5);
        iVar.K(arrayList4, "updateProductList dataList");
        iVar.f503469m = priceViewConfig;
        iVar.m8146xced61ae5();
        z3Var.a(false);
        z3Var.b();
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f538681o;
        android.widget.TextView textView2 = this.f538682p;
        if (z17) {
            textView2.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560577o8));
            textView2.setEnabled(true);
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560577o8));
            textView.setEnabled(true);
            return;
        }
        textView2.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
        textView2.setEnabled(false);
        textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
        textView.setEnabled(false);
    }

    public final void b() {
        int L = this.f538683q.L();
        android.widget.TextView textView = this.f538680n;
        if (L > 0) {
            textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.edv, java.lang.Integer.valueOf(L)));
            textView.setVisibility(0);
        } else {
            textView.setText("");
            textView.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        so2.j5 j5Var;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        xt2.u3 u3Var = this.f538676g;
        tt2.i iVar = this.f538683q;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mux) {
            if (((java.util.ArrayList) iVar.J()).isEmpty()) {
                if (u3Var != null) {
                    java.util.ArrayList allList = iVar.f503468i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allList, "allList");
                    vt2.j jVar = ((vt2.h) u3Var).f521495a;
                    jVar.f521498b.a(allList, true);
                    jVar.f521497a.finish();
                }
            } else if (u3Var != null) {
                java.util.List J2 = iVar.J();
                vt2.j jVar2 = ((vt2.h) u3Var).f521495a;
                jVar2.f521498b.a(J2, false);
                jVar2.f521497a.finish();
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.muy) {
            if (u3Var != null) {
                vt2.g gVar = ((vt2.h) u3Var).f521495a.f521498b;
                r45.i56 i56Var = gVar.f521493e;
                java.lang.Object obj = "";
                if (i56Var == null || (str = i56Var.m75945x2fec8307(0)) == null) {
                    str = "";
                }
                r45.i56 i56Var2 = gVar.f521493e;
                if (i56Var2 == null || (str2 = i56Var2.m75945x2fec8307(1)) == null) {
                    str2 = "";
                }
                r45.i56 i56Var3 = gVar.f521493e;
                long m75942xfb822ef2 = i56Var3 != null ? i56Var3.m75942xfb822ef2(2) : 0L;
                r45.i56 i56Var4 = gVar.f521493e;
                long m75942xfb822ef22 = i56Var4 != null ? i56Var4.m75942xfb822ef2(3) : 0L;
                r45.i56 i56Var5 = gVar.f521493e;
                if (i56Var5 == null || (str3 = i56Var5.m75945x2fec8307(4)) == null) {
                    str3 = "";
                }
                r45.i56 i56Var6 = gVar.f521493e;
                if (i56Var6 == null || (str4 = i56Var6.m75945x2fec8307(5)) == null) {
                    str4 = "";
                }
                r45.i56 i56Var7 = gVar.f521493e;
                if (i56Var7 == null || (str5 = i56Var7.m75945x2fec8307(6)) == null) {
                    str5 = "";
                }
                r45.i56 i56Var8 = gVar.f521493e;
                if (i56Var8 == null || (str6 = i56Var8.m75945x2fec8307(7)) == null) {
                    str6 = "";
                }
                java.lang.String obj2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0().toString();
                l81.b1 b1Var = new l81.b1();
                b1Var.f398547b = str;
                st2.c2 c2Var = st2.c2.f493782a;
                b1Var.f398555f = c2Var.a(str2, m75942xfb822ef2);
                b1Var.f398561i = new dk2.ah();
                b1Var.f398565k = 1176;
                b1Var.f398567l = "post_live_add:" + m75942xfb822ef22 + ':' + str3 + "::" + str4 + ':' + obj2 + ':' + str5 + ':' + str6;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f409116i;
                java.lang.String sceneNote = b1Var.f398567l;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sceneNote, "sceneNote");
                y4Var.getClass();
                y4Var.f409839n = sceneNote;
                p52.c cVar = p52.h.f433549a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj2, "<set-?>");
                p52.h.f433562n = obj2;
                zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
                java.lang.String appId = b1Var.f398547b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) qaVar).Ck(3L, appId, obj2, 1176L, str4, "post_live_add", str5);
                c2Var.k(b1Var);
                gk2.e eVar = dk2.ef.I;
                if (eVar != null) {
                    dk2.q4.f315471a.l(gVar.f521489a, eVar, b1Var, true, new vt2.d(gVar));
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.t2[] t2VarArr = ml2.t2.f409547d;
                jSONObject.put("type", 2);
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                jSONObject.put("sessionid", y4Var.f409839n);
                jSONObject.put("shopwindowid", "");
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                y4Var.Y = true;
                gk2.e eVar2 = gk2.e.f354004n;
                jSONObject.put("appid", eVar2 != null ? ((mm2.f6) eVar2.a(mm2.f6.class)).A : null);
                gk2.e eVar3 = gk2.e.f354004n;
                long m75942xfb822ef23 = (eVar3 == null || (nw1Var = ((mm2.e1) eVar3.a(mm2.e1.class)).f410521r) == null) ? -1L : nw1Var.m75942xfb822ef2(0);
                if (m75942xfb822ef23 < 0) {
                    jSONObject.put("liveid", "");
                } else {
                    ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                    jSONObject.put("liveid", b52.b.q(m75942xfb822ef23));
                }
                jSONObject.put("clickid", p52.h.f433562n);
                p52.h.f433562n = "";
                gk2.e eVar4 = gk2.e.f354004n;
                if (eVar4 != null && (j5Var = ((mm2.f6) eVar4.a(mm2.f6.class)).f410582w) != null) {
                    obj = java.lang.Long.valueOf(j5Var.mo2128x1ed62e84());
                }
                jSONObject.put("productid", obj);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mur) {
            java.util.ArrayList arrayList2 = iVar.f503467h;
            try {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (((tt2.e) next).f503406b) {
                        arrayList3.add(next);
                    }
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next2 = it6.next();
                    if (!((tt2.e) next2).f503406b) {
                        arrayList4.add(next2);
                    }
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                arrayList2.addAll(arrayList4);
                iVar.K(arrayList2, "after moveSelectItem");
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, "FinderLiveShoppingEditAdapter,moveSelectItem:");
            }
            iVar.m8146xced61ae5();
            java.util.Iterator it7 = iVar.f503467h.iterator();
            while (it7.hasNext()) {
                ((tt2.e) it7.next()).f503406b = false;
            }
            a(false);
            b();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mup) {
            xt2.w3 w3Var = new xt2.w3(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.h(com.p314xaae8f345.mm.R.C30867xcad56011.mou, java.lang.Integer.valueOf(iVar.L())));
            u1Var.a(true);
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.mot);
            u1Var.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.mos));
            u1Var.b(new xt2.y3(w3Var));
            u1Var.q(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
