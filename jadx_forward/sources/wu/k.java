package wu;

/* loaded from: classes9.dex */
public final class k extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        s15.c j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = (com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905) containerView.findViewById(com.p314xaae8f345.mm.R.id.uxi);
        if (abstractC11172x705e5905 == null) {
            return;
        }
        z01.g gVar = new z01.g();
        s15.x C = item.f366530e.C();
        if (C != null && (j17 = C.j()) != null) {
            java.lang.String j18 = j17.j();
            if (j18 == null) {
                j18 = "";
            }
            gVar.f550547e = j18;
            java.lang.String n17 = j17.n();
            if (n17 == null) {
                n17 = "";
            }
            gVar.f550552m = n17;
            java.lang.String m163570x7531c8a2 = j17.m163570x7531c8a2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m163570x7531c8a2, "<set-?>");
            gVar.f550549g = m163570x7531c8a2;
            java.lang.String m163569xd93f812f = j17.m163569xd93f812f();
            gVar.f550548f = m163569xd93f812f != null ? m163569xd93f812f : "";
            java.lang.String l17 = j17.l();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "<set-?>");
            gVar.f550556q = l17;
            gVar.f550553n = j17.m163568x7444f759();
            gVar.f550555p = gVar.c(j17.k());
            java.lang.String str = gVar.f550547e;
            gVar.f550546d = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "photo") ? z01.f.f550537d : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "video") ? z01.f.f550538e : z01.f.f550539f;
            gVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.odg));
        if (gVar.f550552m.length() > 0) {
            sb6.append(" · ");
            sb6.append(gVar.f550552m);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        gVar.f550551i = sb7;
        gVar.f550557r = new wu.g(item, this);
        gVar.f550558s = new wu.i(item, this);
        gVar.f550560u = com.p314xaae8f345.mm.R.C30861xcebc809e.d87;
        gVar.f550563x = wu.j.f531120d;
        abstractC11172x705e5905.setOnClickListener(new wu.f(this, abstractC11172x705e5905, item));
        abstractC11172x705e5905.m48330xfcfee142(gVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        s15.x C = item.f366530e.C();
        q80.d0 d0Var = new q80.d0();
        java.lang.String str3 = "";
        if (C == null || (str = C.m163624x74292566()) == null) {
            str = "";
        }
        d0Var.f442182a = str;
        if (C == null || (str2 = C.m163625xfb83cc9b()) == null) {
            str2 = "";
        }
        d0Var.f442183b = str2;
        if (C != null && (l17 = C.l()) != null) {
            str3 = l17;
        }
        d0Var.f442184c = str3;
        d0Var.f442185d = java.lang.Boolean.valueOf(C != null && C.n() == 1);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        if ((C != null ? C.j() : null) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("shareImageCardFlag", 1);
            c3708xc1f46f80.f14309xf0df6fda = jSONObject;
            d0Var.f442207z = c3708xc1f46f80;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new wu.e(d0Var));
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271(context, null, 0, 6, null);
        c22073xa4763271.setId(com.p314xaae8f345.mm.R.id.uxi);
        containerView.addView(c22073xa4763271, -2, -2);
    }
}
