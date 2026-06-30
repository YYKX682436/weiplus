package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI */
/* loaded from: classes8.dex */
public class ActivityC16146xeed29e14 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final q83.b A = new q83.b();
    public java.lang.String B = null;
    public java.lang.String C = null;
    public java.lang.String D = null;
    public java.util.LinkedList E = null;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d F = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14.AnonymousClass1(com.p314xaae8f345.mm.app.a0.f134821d);
    public boolean G = false;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f224223d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f224224e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f224225f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f224226g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f224227h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f224228i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f224229m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f224230n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f224231o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f224232p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f224233q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f224234r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f224235s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f224236t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f224237u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f224238v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f224239w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f224240x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16135x36fae7ec f224241y;

    /* renamed from: z, reason: collision with root package name */
    public android.app.ProgressDialog f224242z;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5645xbd38c0> {
        public AnonymousClass1(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 682820784;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5645xbd38c0 c5645xbd38c0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.r4(this));
            return true;
        }
    }

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 activityC16146xeed29e14) {
        activityC16146xeed29e14.A.f442285e++;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 2L, 1L, true);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573872g42);
        try {
            string = string + "&version=" + o45.wf.f424562g + "&lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) + ("&uin=" + gm0.j1.b().h() + "&deviceName=" + java.net.URLEncoder.encode(o45.wf.f424559d, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "&timeZone=" + java.net.URLEncoder.encode("" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "&imei=" + java.net.URLEncoder.encode(wo.w0.g(true), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "&deviceBrand=" + java.net.URLEncoder.encode(o45.wf.f424557b, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "&deviceModel=" + java.net.URLEncoder.encode(o45.wf.f424558c, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "&ostype=" + java.net.URLEncoder.encode(wo.q.f529317e, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "&clientSeqID=" + java.net.URLEncoder.encode(gm0.m.e(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "&signature=" + java.net.URLEncoder.encode(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "&scene=0");
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallShareCouponUI", "[royle]UnsupportedEncodingException:%s", e17.getMessage());
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("showShare", false);
        j45.l.j(activityC16146xeed29e14, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14 activityC16146xeed29e14) {
        activityC16146xeed29e14.A.f442286f++;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 3L, 1L, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", activityC16146xeed29e14.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3f));
        intent.putExtra("showShare", false);
        j45.l.j(activityC16146xeed29e14, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public void V6() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
            java.lang.String str = this.B;
            if (str == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16135x36fae7ec c16135x36fae7ec = this.f224241y;
                java.lang.String str2 = this.C;
                c16135x36fae7ec.b(str2, str2);
            } else {
                this.f224241y.b(str, this.C);
            }
            this.B = this.C;
        }
        this.f224238v.getText();
        this.f224238v.setText(this.D);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.D)) {
            this.f224238v.setVisibility(8);
        } else {
            this.f224238v.setVisibility(0);
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
        java.util.LinkedList linkedList = this.E;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = this.E.iterator();
            while (it.hasNext()) {
                r45.o57 o57Var = (r45.o57) it.next();
                if (o57Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o57Var.f463499d)) {
                    stringBuffer.append(o57Var.f463499d);
                    stringBuffer.append('\n');
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringBuffer.toString())) {
            this.f224239w.setText("");
            this.f224239w.setVisibility(8);
        } else {
            if (stringBuffer.charAt(stringBuffer.length() - 1) == '\n') {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            this.f224239w.setText(stringBuffer.toString());
            this.f224239w.setVisibility(0);
        }
        if (this.f224238v.getVisibility() == 0 && this.f224239w.getVisibility() == 0) {
            android.view.View view = this.f224240x;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f224240x;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blq;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e6  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(257, this);
        this.F.mo48814x2efc64();
        q83.b bVar = this.A;
        bVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bVar.f442283c = java.lang.System.currentTimeMillis();
        bVar.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (r83.b.f474844b == null) {
            r83.b.f474844b = new r83.b();
        }
        r83.b.f474844b.a(false);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof p83.g) {
            if (i17 != 0 || i18 != 0) {
                android.app.ProgressDialog progressDialog = this.f224242z;
                if (progressDialog == null || !progressDialog.isShowing()) {
                    return;
                }
                this.f224242z.dismiss();
                db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3x), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3s), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y4(this));
                return;
            }
            r45.zr3 zr3Var = ((p83.g) m1Var).f434281e;
            java.lang.String str2 = zr3Var.f473850d;
            this.C = zr3Var.f473856m;
            this.D = zr3Var.f473857n;
            this.E = zr3Var.f473866w;
            V6();
            android.app.ProgressDialog progressDialog2 = this.f224242z;
            if (progressDialog2 == null || !progressDialog2.isShowing()) {
                return;
            }
            this.f224242z.dismiss();
        }
    }
}
