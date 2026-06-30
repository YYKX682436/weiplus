package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.b.class)
/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.b {

    /* renamed from: e, reason: collision with root package name */
    public nr4.a f280528e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe f280529f = null;

    /* renamed from: g, reason: collision with root package name */
    public final l75.q0 f280530g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b(this);

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f280531h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c(this);

    /* renamed from: i, reason: collision with root package name */
    public final qi3.a0 f280532i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d(this);

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        nr4.a c17 = nr4.a.c(this.f280113d.u().d1(), 1);
        this.f280528e = c17;
        c17.a(1, this.f280113d.u().d1());
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).Zi(this.f280532i);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().add(this.f280530g);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().add(this.f280531h);
        if (this.f280529f == null) {
            this.f280529f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe(this.f280113d);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe.f284161d.a(this.f280529f, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        o0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        o0();
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (i17 == 210) {
            if (i18 == -1) {
                n0(pt0.f0.Li(intent.getStringExtra("App_MsgTalker"), intent.getLongExtra("App_MsgId", 0L)), null);
                return;
            }
            return;
        }
        if (i17 == 222 && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("service_app_package_name");
            java.lang.String stringExtra2 = intent.getStringExtra("service_app_openid");
            java.lang.String stringExtra3 = intent.getStringExtra("service_app_appid");
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(this.f280529f != null);
            objArr[1] = stringExtra;
            objArr[2] = stringExtra3;
            objArr[3] = stringExtra2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg, wxmessage[%b], package[%s], appId[%s], openId[%s]", objArr);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "REQUEST_CODE_SERVICE_APP openId is null");
                return;
            }
            if (this.f280529f == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                m0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra3));
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ui().b(stringExtra3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg fail, openId is null, go get it");
            } else {
                if (this.f280529f.c(stringExtra, stringExtra2)) {
                    return;
                }
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                m0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra3));
            }
        }
    }

    public final void m0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        int i17;
        if (mVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67370x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "jumpServiceH5 error args");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f319914p1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "ForwardUrl is null");
            return;
        }
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(this.f280113d.g().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), this.f280113d.g());
        if ("language_default".equalsIgnoreCase(o17) && java.util.Locale.getDefault() != null) {
            o17 = java.util.Locale.getDefault().toString();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f280113d.x())) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(this.f280113d.x());
            if (z07 != null) {
                i17 = z07.A0().size();
                android.content.Intent intent = new android.content.Intent();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("jsapi_args_appid", mVar.f67370x28d45f97);
                bundle.putBoolean("isFromService", true);
                intent.putExtra("forceHideShare", true);
                bundle.putString("sendAppMsgToUserName", this.f280113d.u().d1());
                intent.putExtra("jsapiargs", bundle);
                intent.putExtra("show_bottom", false);
                intent.putExtra("rawUrl", java.lang.String.format("%s&wxchatmembers=%s&lang=%s", mVar.f319914p1, java.lang.Integer.valueOf(i17), o17));
                j45.l.j(this.f280113d.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
        i17 = 1;
        android.content.Intent intent2 = new android.content.Intent();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("jsapi_args_appid", mVar.f67370x28d45f97);
        bundle2.putBoolean("isFromService", true);
        intent2.putExtra("forceHideShare", true);
        bundle2.putString("sendAppMsgToUserName", this.f280113d.u().d1());
        intent2.putExtra("jsapiargs", bundle2);
        intent2.putExtra("show_bottom", false);
        intent2.putExtra("rawUrl", java.lang.String.format("%s&wxchatmembers=%s&lang=%s", mVar.f319914p1, java.lang.Integer.valueOf(i17), o17));
        j45.l.j(this.f280113d.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:27|(2:28|29)|(7:31|32|(1:72)(1:36)|(5:59|60|(2:62|(2:65|66)(1:64))|69|67)|38|39|40)|74|32|(1:34)|72|(0)|38|39|40) */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r21, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 r22) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f.n0(com.tencent.mm.storage.f9, com.tencent.mm.pluginsdk.model.app.a5):void");
    }

    public final void o0() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe qeVar = this.f280529f;
        if (qeVar != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe.f284161d.j(qeVar);
            ((java.util.HashSet) qeVar.f284164c).clear();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe.d(qeVar.f284162a.mo7438x76847179(), null);
        }
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo49775xc84af884(this.f280530g);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo49775xc84af884(this.f280531h);
            ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).fj(this.f280532i);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.me.f283520a.clear();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.me.f283521b.clear();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.me.f283522c.clear();
    }
}
