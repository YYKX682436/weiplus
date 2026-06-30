package gl4;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f354432a = jz5.h.b(gl4.k.f354399d);

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f354433b;

    public static final void a(qk.y8 y8Var) {
        if (y8Var != null) {
            y8Var.a(new qk.ea(qk.ga.f445668e, qk.da.f445617f));
        }
    }

    public static void c(gl4.z zVar, android.content.Context context, bw5.r70 r70Var, java.lang.String str, android.widget.ImageView imageView, hl4.a aVar, int i17, android.view.View.OnClickListener onClickListener, android.view.View.OnClickListener onClickListener2, android.view.View.OnClickListener onClickListener3, android.content.DialogInterface.OnCancelListener onCancelListener, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            str = null;
        }
        if ((i18 & 8) != 0) {
            imageView = null;
        }
        if ((i18 & 16) != 0) {
            aVar = hl4.a.f363634d;
        }
        if ((i18 & 32) != 0) {
            i17 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561270du);
        }
        if ((i18 & 64) != 0) {
            onClickListener = null;
        }
        if ((i18 & 128) != 0) {
            onClickListener2 = null;
        }
        if ((i18 & 256) != 0) {
            onClickListener3 = null;
        }
        if ((i18 & 512) != 0) {
            onCancelListener = null;
        }
        zVar.getClass();
        if (r70Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", "showTipsDialog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2292xb01d87d6.p2293x373aa5.DialogC18718x36d28c3a dialogC18718x36d28c3a = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2292xb01d87d6.p2293x373aa5.DialogC18718x36d28c3a(context, null);
        dialogC18718x36d28c3a.setOnCancelListener(new gl4.v(onCancelListener));
        hl4.b bVar = new hl4.b();
        boolean[] zArr = r70Var.f113967i;
        java.lang.String str2 = zArr[1] ? r70Var.f113962d : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getTitle(...)");
        bVar.f363637a = str2;
        java.lang.String str3 = zArr[2] ? r70Var.f113963e : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getDescription(...)");
        bVar.f363638b = str3;
        java.lang.String str4 = zArr[3] ? r70Var.f113964f : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getConfirmText(...)");
        bVar.f363639c = str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        bVar.f363640d = aVar;
        bVar.f363641e = new gl4.s(onClickListener);
        bVar.f363642f = new gl4.t(onClickListener2);
        bVar.f363643g = i17;
        if (str == null || str.length() == 0) {
            bVar.f363644h = false;
        } else {
            bVar.f363644h = true;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            bVar.f363645i = str;
        }
        bVar.f363646j = new gl4.u(onClickListener3);
        bVar.f363647k = imageView;
        dialogC18718x36d28c3a.f256244z = bVar;
        dialogC18718x36d28c3a.L(bVar);
        dialogC18718x36d28c3a.show();
    }

    public final java.lang.Object b(bw5.u80 u80Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", "doJoinMembership joinType: " + i17);
        bw5.x80 x80Var = new bw5.x80();
        java.lang.String str = "";
        if (u80Var != null) {
            java.lang.String str2 = u80Var.f115340q[1] ? u80Var.f115330d : "";
            if (str2 != null) {
                str = str2;
            }
        }
        x80Var.f116535e = str;
        boolean[] zArr = x80Var.f116538h;
        zArr[3] = true;
        x80Var.f116534d = i17;
        zArr[2] = true;
        jm4.c2 c2Var = (jm4.c2) ((jz5.n) this.f354432a).mo141623x754a37bb();
        if (c2Var != null) {
            gl4.d dVar = new gl4.d(nVar);
            byte[] mo14344x5f01b1f6 = x80Var.mo14344x5f01b1f6();
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f381981n = dVar;
            long m105978x2737f10 = ((jm4.d2) c2Var).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            p3380x6a61f93.p3381xf512d0a5.C30485x21b88584.m169280x21b88e79(m105978x2737f10, mo14344x5f01b1f6, x1Var);
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public final void d(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f context, com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9, bw5.w80 joinMembershipInfo, qk.y8 y8Var) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(joinMembershipInfo, "joinMembershipInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", "showWecoinSubscribeView request: " + c4990x83627a9 + ", jumpType: " + joinMembershipInfo.f116139e);
        gl4.a aVar = new gl4.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = joinMembershipInfo.b().f115747f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getPackages(...)");
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            bw5.u80 u80Var = (bw5.u80) it.next();
            boolean[] zArr = u80Var.f115340q;
            boolean z17 = zArr[1];
            java.lang.String str3 = zArr[3] ? u80Var.f115332f : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getPackageWording(...)");
            pr4.h hVar = new pr4.h(str3, (int) u80Var.f115331e, u80Var.f115333g ? pr4.i.f439542d : pr4.i.f439543e, new gl4.w(this, u80Var, aVar, null), null);
            hVar.f439539f = (int) u80Var.f115334h;
            hVar.f439538e = u80Var.f115337n;
            if (zArr[12]) {
                str = u80Var.f115338o;
            }
            hVar.f439541h = str;
            arrayList.add(hVar);
        }
        bw5.v80 b17 = joinMembershipInfo.b();
        java.lang.String str4 = b17.f115751m[1] ? b17.f115745d : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getTitle(...)");
        bw5.v80 b18 = joinMembershipInfo.b();
        java.lang.String str5 = b18.f115751m[2] ? b18.f115746e : "";
        bw5.v80 b19 = joinMembershipInfo.b();
        java.lang.String str6 = b19.f115751m[4] ? b19.f115748g : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str6, "getAgreementWording(...)");
        pr4.e eVar = new pr4.e(context, str4, str5, arrayList, str6, kz5.p0.f395529d);
        if (c4990x83627a9 != null && (str2 = c4990x83627a9.f134747g) != null) {
            str = str2;
        }
        eVar.f439527h = str;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context);
        c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f81198x7e0f8e91, com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77676x8b2bf6a3 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77908xe61cad8f);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561269dt), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1));
        marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561249d9);
        marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        c22699x3dcdb352.setLayoutParams(marginLayoutParams);
        eVar.f439526g = c22699x3dcdb352;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new gl4.x(arrayList, eVar, aVar, y8Var, null), 3, null);
    }

    public final void e(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, com.p314xaae8f345.mm.api.C4990x83627a9 request, bw5.w80 w80Var, qk.y8 y8Var) {
        int i17 = w80Var.f116139e;
        if (i17 == 4) {
            d(activityC1102x9ee2d9f, request, w80Var, y8Var);
            return;
        }
        if (i17 != 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMembershipHelper", "startMembershipSubscribe invalid jumpType: " + w80Var.f116139e);
            if (y8Var != null) {
                y8Var.a(new qk.ea(qk.ga.f445669f, null));
            }
        } else {
            boolean[] zArr = w80Var.f116146o;
            if ((zArr[5] ? w80Var.f116142h : new bw5.r70()) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("view_id", "tyt_vip_qmusic_authent_panel");
                hashMap.put("buy_vip_session", request.f134747g);
                hashMap.put("currscene", java.lang.Integer.valueOf(request.f134748h));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, hashMap, 5, false);
                bw5.r70 r70Var = zArr[5] ? w80Var.f116142h : new bw5.r70();
                java.lang.String string = activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgf);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(activityC1102x9ee2d9f);
                c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f81198x7e0f8e91, com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77676x8b2bf6a3 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77908xe61cad8f);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(activityC1102x9ee2d9f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561269dt), activityC1102x9ee2d9f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1));
                marginLayoutParams.topMargin = activityC1102x9ee2d9f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561249d9);
                marginLayoutParams.bottomMargin = activityC1102x9ee2d9f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
                c22699x3dcdb352.setLayoutParams(marginLayoutParams);
                c(this, activityC1102x9ee2d9f, r70Var, string, c22699x3dcdb352, null, activityC1102x9ee2d9f.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj), new gl4.o(request, this, activityC1102x9ee2d9f, y8Var), new gl4.p(y8Var), new gl4.q(request, this, activityC1102x9ee2d9f, w80Var, y8Var), new gl4.r(y8Var), 16, null);
            }
        }
    }
}
