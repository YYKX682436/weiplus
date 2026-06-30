package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class z3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f267115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.m f267116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267117e;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3, o45.m mVar) {
        this.f267117e = c1Var;
        this.f267114b = y2Var;
        this.f267115c = c19775x58fd37b3;
        this.f267116d = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar, java.lang.String str, java.util.LinkedList linkedList, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar2;
        int i19;
        int i27;
        nw4.y2 y2Var = this.f267114b;
        ((java.util.HashMap) y2Var.c()).put("baseErrorCode", java.lang.Integer.valueOf(i17));
        ((java.util.HashMap) y2Var.c()).put("jsapiErrorCode", java.lang.Integer.valueOf(i18));
        java.lang.String str2 = y2Var.f422552i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f267117e;
        boolean O6 = c1Var.O6(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_OK;
        if (O6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "current jsapi(%s) invoked is came from menu event.(original retCode : %s)", y2Var.f422552i, mVar);
            mVar2 = mVar3;
        } else {
            mVar2 = mVar;
        }
        i19 = c1Var.B;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onJSVerifyEnd, put webviewID = %d, %s, %d", java.lang.Integer.valueOf(i19), y2Var.f422552i, java.lang.Integer.valueOf(mVar2.h()));
        java.util.Map map = y2Var.f422323a;
        i27 = c1Var.B;
        ((java.util.HashMap) map).put("webview_instance_id", java.lang.Integer.valueOf(i27));
        boolean z17 = false;
        if (mVar2 != mVar3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m mVar4 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_ACCESS_DENIED;
            o45.m mVar5 = this.f267116d;
            if (mVar2 == mVar4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "handleMsg access denied %s", mVar5.b());
                if (y2Var.f422552i.equalsIgnoreCase("getBrandWCPayRequest")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(157L, 1L, 1L, false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.A3(c1Var, y2Var);
                c1Var.i5(y2Var, "system:access_denied", null);
                c(true);
            } else if (mVar2 == com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m.RET_REJECT) {
                c1Var.i5(y2Var, mVar5.a() + ":" + str, null);
                c(true);
            } else {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar5.a())) {
                    c1Var.f266526v = false;
                    c(false);
                    c1Var.Q6(y2Var, false);
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    c1Var.i5(y2Var, mVar5.a() + ":fail", null);
                } else {
                    c1Var.i5(y2Var, mVar5.a() + ":fail_" + str, null);
                }
                c(true);
            }
        } else {
            if (xw4.a.a(y2Var, c1Var)) {
                c(true);
                return;
            }
            boolean equals = y2Var.f422552i.equals("sendAppMessage");
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = this.f267115c;
            if (equals) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.n3(c1Var, y2Var, c19775x58fd37b3, false);
                c(true);
            } else if (y2Var.f422552i.equals("sendAppMessagePrivate")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.n3(c1Var, y2Var, c19775x58fd37b3, true);
                c(true);
            } else if (y2Var.f422552i.equals(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589)) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.R3(c1Var, y2Var, c19775x58fd37b3));
            } else if (y2Var.f422552i.equals("shareWeibo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.c4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1.f34800x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.n4(c1Var, y2Var, c19775x58fd37b3, false);
                c(true);
            } else if (y2Var.f422552i.equals("shareTimelinePrivate")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.n4(c1Var, y2Var, c19775x58fd37b3, true);
                c(true);
            } else if (y2Var.f422552i.equals("updateTimelineShareData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.y4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals("updateAppMessageShareData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z1.f35029x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.U4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals("streamingVideoPlay")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.a(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals("addContact")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.l(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals("getWidgetCaptureImgUrl")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.w(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equals("imagePreview")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.H(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equals("hideOptionMenu")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.S(c1Var);
                c(false);
            } else if (y2Var.f422552i.equals("showOptionMenu")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.d0(c1Var);
                c(false);
            } else if (y2Var.f422552i.equals("closeWindow")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.o0(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g0.f33725x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.z0(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals("scanQRCode")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K0(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals("jumpToInstallUrl")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.V0(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getBrandWCPayRequest")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.h1(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(yc1.f0.f77520x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.s1(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("wcpaySecurityCrosscutBack")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.D1(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("editAddress")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.O1(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getLatestAddress")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Z1(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getHeadingAndPitch")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.k2(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("sendEmail")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.v2(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q.f33745x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.G2(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("addDownloadApp")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.R2(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.x.f33757x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.c3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33727x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.o3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pc.f34669x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.z3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.l1.f33739x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.E3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33741x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.G3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openSpecificView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.H3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("launch3rdApp")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("jumpWCMall")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.M3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cf.f33974x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.O3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openProductView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.P3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openProductViewWithPid")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Q3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getBrandWCPayBindCardRequest")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.S3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("geoLocation")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.T3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("jumpToBizProfile")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.U3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.g0.f34402x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.V3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("timelineCheckIn")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.W3(c1Var, y2Var, c19775x58fd37b3));
            } else if (y2Var.f422552i.equalsIgnoreCase("getBrandWCPayCreateCreditCardRequest")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.X3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("sendServiceAppMessage")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Y3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("mmsf0001")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Z3(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("musicPlay")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.a4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getTransferMoneyRequest")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.b4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.m0.f34627x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.d4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("chooseCard")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.e4(c1Var, y2Var, c19775x58fd37b3));
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s4.f34738x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.f4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("batchAddCard")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.g4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("setCloseWindowConfirmDialogInfo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.h4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("preVerifyJSAPI")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.i4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.j4(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.k4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.v2.f33832x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.l4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.y1.f33842x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.m4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.h3.f33794x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.o4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("uploadVoice")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.p4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("downloadVoice")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.q4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.r4(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("uploadImage")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.s4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("downloadImage")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.t4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("hideMenuItems")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.u4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("showMenuItems")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.v4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("hideAllNonBaseMenuItem")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.w4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("showAllNonBaseMenuItem")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.x4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("checkJsApi")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.z4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("translateVoice")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.A4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("shareQQ")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.B4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("shareWeiboApp")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.C4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("configWXDeviceWiFi")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.D4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getCurrentSSID")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.E4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getPaymentOrderRequest")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.F4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("verifyWCPayPassword")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.G4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("startMonitoringBeacons")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.H4(c1Var, y2Var, c19775x58fd37b3, new int[0]);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("stopMonitoringBeacons")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.I4(c1Var, y2Var, c19775x58fd37b3, new int[0]);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getSendC2CMessageRequest")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("batchViewCard")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.L4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("setPageOwner")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.M4(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getWechatVerifyTicket")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.N4(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("openWXDeviceLib")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.O4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("closeWXDeviceLib")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.P4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("startScanWXDevice")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Q4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("stopScanWXDevice")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.R4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("connectWXDevice")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.S4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("disconnectWXDevice")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.T4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getWXDeviceTicket")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.V4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getWXDeviceInfos")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.W4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("sendDataToWXDevice")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.X4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("setSendDataDirection")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Y4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openGameDetail")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Z4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openGameCenter")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.a5(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("setGameDebugConfig")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.b5(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("shareQZone")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.B4(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("startTempSession")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.c5(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getRecevieBizHongBaoRequest")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.d5(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openMyDeviceProfile")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.e5(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("selectPedometerSource")) {
                c1Var.P5(y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getH5PrepayRequest")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.b(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getH5TransactionRequest")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.c(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("jumpToWXWallet")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.d(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("nfcIsConnect")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.e(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("nfcConnect")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.f(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("nfcTransceive")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.g(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("nfcBatchTransceive")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.h(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("nfcGetId")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.i(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("nfcGetInfo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.j(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("nfcCheckState")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.k(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getSearchData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.m(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("enterWeappContact")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.n(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getFestivalLiveInfo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.o(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("showWeDrawHomeView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.p(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getChatSearchData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.q(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getPoiInfo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.r(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("updateReddotTimeStamps")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.s(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("reloadSearchWAWidgetData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.t(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("gotoEmoticonPad")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.u(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("querySimilarEmotion")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.v(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("openFinderFeed")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.x(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getCurrentLocation")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.y(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("navControl")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.z(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("setInteractivePopGestureEnabled")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.A(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("showNavBarShadow")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.B(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("hideNavBarShadow")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.C(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.h0.f34297x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.D(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("playMusic")) {
                c1Var.N6(y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("openMusicPage")) {
                c1Var.L6(y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getTeachSearchData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.E(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getSearchGuideData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.F(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getSearchAvatarList")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.G(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getSearchSnsImageList")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.I(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getSearchImageList")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getSearchDisplayNameList")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("startSearchItemDetailPage")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.L(c1Var, y2Var, c19775x58fd37b3));
            } else if (y2Var.f422552i.equalsIgnoreCase("startCommonSearchItemDetailPage")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.M(c1Var, y2Var, c19775x58fd37b3));
            } else if (y2Var.f422552i.equalsIgnoreCase("reportSearchStatistics")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.N(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("reportSearchRealTimeStatistics")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.O(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("searchDataHasResult")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.P(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getSearchSuggestionData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Q(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("openEmotionPage")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.R(c1Var, y2Var, c19775x58fd37b3));
            } else if (y2Var.f422552i.equalsIgnoreCase("setSearchInputWord")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.T(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("querySearchWeb")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.U(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("openWeAppPage")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.V(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("reportWeAppSearchRealtime")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.W(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("doSearchOperation")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.X(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("operateGameCenterMsg")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Y(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getWebPayCheckoutCounterRequst")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Z(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("setSnsObjectXmlDescList")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.a0(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("clickSnsMusicPlayButton")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.b0(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("addCustomMenuItems")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.c0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openEnterpriseChat")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.e0(c1Var, y2Var));
            } else if (y2Var.f422552i.equalsIgnoreCase("openEnterpriseContact")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.f0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("selectEnterpriseContact")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.g0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("sendEnterpriseChat")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.h0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("enterEnterpriseChat")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.i0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getEnterpriseChat")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.j0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("reportActionInfo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.k0(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("showSearchOfBizHistory")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.l0(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("changePayActivityView")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.m0(c1Var, y2Var));
            } else if (y2Var.f422552i.equalsIgnoreCase("scanLicence")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.n0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openWeApp")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.p0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openECard")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.q0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("sendDataToMiniProgram")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.r0(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("preloadMiniProgramContacts")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.s0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getFinderLivePreviewUrl")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.t0(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("getFinderLivePreviewMicCover")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.u0(c1Var, y2Var, c19775x58fd37b3);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("enablePullDownRefresh")) {
                c1Var.D5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(nd1.f2.f72926x24728b)) {
                c1Var.W5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(nd1.g2.f72930x24728b)) {
                c1Var.Y5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("disablePullDownRefresh")) {
                c1Var.C5();
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("disableBounceScroll")) {
                c1Var.B5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("clearBounceBackground")) {
                c1Var.z5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(hc1.i.f69827x24728b)) {
                c1Var.V5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openMapNavigateMenu")) {
                c1Var.L5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("enableFullScreen")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.v0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("setStatusBarStyle")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.w0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("forceUpdateWxaAttr")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.x0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l.f34522x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.y0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openFinderProduct")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.A0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h.f34168x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.B0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("reportIDKey")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.C0(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("quicklyAddBrandContact")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.D0(c1Var, y2Var));
            } else if (y2Var.f422552i.equalsIgnoreCase("consumedShareCard")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.E0(c1Var, y2Var));
            } else if (y2Var.f422552i.equalsIgnoreCase(vd1.h.f77285x24728b)) {
                c1Var.H5(y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("realtimeReport")) {
                c1Var.N5(y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getLocalData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.F0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("setLocalData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.G0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("clearLocalData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.H0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("selectSingleContact")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.I0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("sendAppMessageToSpecifiedContact")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("deleteAccountSuccess")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.L0(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("chooseVideo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.M0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("uploadVideo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.N0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openDesignerEmojiView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.O0(c1Var, y2Var, false);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m.f34146x24728b)) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.P0(c1Var, y2Var, false));
            } else if (y2Var.f422552i.equalsIgnoreCase("openEmoticonTopicList")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Q0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openDesignerEmojiViewLocal")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.O0(c1Var, y2Var, true);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("openDesignerProfileLocal")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.P0(c1Var, y2Var, true));
            } else if (y2Var.f422552i.equalsIgnoreCase("openEmotionDetailViewLocal")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.R0(c1Var, y2Var, true));
            } else if (y2Var.f422552i.equalsIgnoreCase("openNewPage")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.S0(c1Var, y2Var));
            } else if (y2Var.f422552i.equalsIgnoreCase("getSearchEmotionData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.T0(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equalsIgnoreCase("openEmotionUrl")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.U0(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("getWCPayRealnameVerify")) {
                c1Var.b6(y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("selectWalletCurrency")) {
                c1Var.Z5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e1.f33788x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.W0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.g0.f33792x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.X0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("clearWebviewCache")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Y0(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("requireSoterBiometricAuthentication")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Z0(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals("getSupportSoter")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.a1(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals("unbindBankCard")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.b1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("setBounceBackground")) {
                c1Var.S5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("doExposePreparation")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.c1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("getMsgProofItems")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.d1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("uploadMediaFile")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.e1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openSecurityView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.f1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("getOpenDeviceId")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.i1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase("getRouteUrl")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.j1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("idCardRealnameVerify")) {
                c1Var.G5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("uploadIdCardSuccess")) {
                c1Var.a6(y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openCamera")) {
                c(c1Var.J5(y2Var));
            } else if (y2Var.f422552i.equals("getGameCommInfo")) {
                c1Var.F5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openGameRegion")) {
                c1Var.K5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("chooseIdCard")) {
                c1Var.u5(y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openLuckyMoneyDetailView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.k1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("resendRemittanceMsg")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.l1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("recordVideo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.m1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("previewVideo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.n1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("uploadEncryptMediaFile")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.o1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openCustomWebview")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.p1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3.f34512x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.q1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openLuckyMoneyHistory")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.r1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("requestWxFacePictureVerify")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.t1(c1Var, y2Var, false);
                c(true);
            } else if (y2Var.f422552i.equals("getWePkgAuthResult")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.u1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("getLocalWePkgInfo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.v1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openGameWebView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.w1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("launchApplication")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.x1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("login") || y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o1.f33860x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.y1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("requestWxFacePictureVerifyUnionVideo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.t1(c1Var, y2Var, true);
                c(true);
            } else if (y2Var.f422552i.equals("checkIsSupportFaceDetect")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.z1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.p0.f33824x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.A1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e2.f33790x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.B1(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33786x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.C1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("setBackgroundAudioStateMV")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.E1(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.i0.f33796x24728b)) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.F1(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("setTingAudioState")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.G1(c1Var, y2Var));
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u1.f33828x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.H1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.v.f33753x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.I1(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals("setScreenOrientation")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("addToEmoticon")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K1(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("shareEmoticon")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.L1(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("requestWxFaceRegisterInternal")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.M1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("requestWxFaceVerifyInternal")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.N1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.r.f33698x24728b)) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.P1(c1Var, y2Var, 0));
            } else if (y2Var.f422552i.equals("openSearchCanvas")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.P1(c1Var, y2Var, 1));
            } else if (y2Var.f422552i.equals("opVoteAdData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Q1(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("opJumpView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.R1(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("opAdH5Func")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.S1(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("selectContact")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.T1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z7.f35035x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.U1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("setWCPayPassword")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.V1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u4.f34897x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.W1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("showSearchActionSheet")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.X1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("cancelSearchActionSheet")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Y1(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("showSearchToast")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.a2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("showSearchLoading")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.b2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("hideSearchLoading")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.c2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("updateWASearchTemplate")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.d2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("preloadSearchWeapp")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.e2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("uxSearchOpLog")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.f2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openSearchWAWidgetLogView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.g2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openBizChat")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.h2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("tapSearchWAWidgetView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.i2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("getMatchContactList")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.j2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("openSearchWebView")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.l2(c1Var, y2Var));
            } else if (y2Var.f422552i.equalsIgnoreCase("openWXSearchPage")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.m2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("viewTypeChange")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.n2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("openGameUrlWithExtraWebView")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.o2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("requestWxVoicePrintVerifyInternal")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.p2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("closeWindowAndGoNext")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.q2(c1Var, y2Var, c19775x58fd37b3);
                c(true);
            } else if (y2Var.f422552i.equals(pf1.f.f76414x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.r2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("setGameData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.s2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("getGameData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.t2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("clearGameData")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.u2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("handleWCPayWalletBuffer")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.w2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("reportGamePageTime")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.x2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("insertVideoPlayer")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.y2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.m.f34935x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.z2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.l.f34933x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.A2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.h.f34929x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.B2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("getSearchHistory")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.C2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("deleteSearchHistory")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.D2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("doGoToRecVideoList") || y2Var.f422552i.equals("jumpWSRecVideoList")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.E2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("recordHistory")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.F2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w9.f34941x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.H2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openWCPayCardList")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.I2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("bindEmail")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("getSystemInfo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("serviceClick")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.L2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals(cb1.o0.f4276x24728b)) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.M2(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("sendSingleAppMessage")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.N2(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("openWebSearchOutLinkItem")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.O2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("wcPrivacyPolicyResult")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.P2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("currentMpInfo")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Q2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33900x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.S2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("jumpDownloaderWidget")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.T2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("batchUpdateWepkg")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.U2(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("privateOpenWeappFunctionalPage")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.V2(c1Var, y2Var);
                c(false);
            } else if (y2Var.f422552i.equals("privateCommonApi")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.W2(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("internelWxFaceVerify")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.X2(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("openWebViewUseFastLoad")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Y2(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("handleHaokanAction")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.Z2(c1Var, y2Var));
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p1.f34641x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.a3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.g0.f34613x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.b3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h1.f34617x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.d3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(be1.a1.f4207x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.e3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.q.f34951x24728b)) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.f3(c1Var, y2Var));
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.s.f34953x24728b)) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.g3(c1Var, y2Var));
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.y.f34959x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.h3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1122xd0b2775d.u.f34955x24728b)) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.i3(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("getCCData")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.j3(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("calRqt")) {
                c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.k3(c1Var, y2Var));
            } else if (y2Var.f422552i.equals("addGameDownloadTask")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.l3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("reportGameWeb")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.m3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("getDownloadWidgetTaskInfos")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.p3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("chooseHaowanMedia")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.q3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("queryHaowanPublish")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.r3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("publishHaowanEdition")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.s3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("cancelHaowanPublish")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.t3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("launchGameVideoEditor")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.u3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.v3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("qqMailLoginResult")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.w3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("requestOverlayPermission")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.x3(c1Var, y2Var);
                c(true);
            } else if (y2Var.f422552i.equals("getWAServiceVoipRecordLocalId")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.y3(c1Var, y2Var);
                c(true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "unknown function = " + y2Var.f422552i);
                c1Var.i5(y2Var, "system:function_not_exist", null);
                c(true);
            }
            z17 = true;
        }
        java.lang.Object obj = ((java.util.HashMap) y2Var.c()).get("Internal@AsyncReport");
        if (obj == null || !(obj instanceof java.lang.Boolean) || !((java.lang.Boolean) obj).booleanValue()) {
            c1Var.Q6(y2Var, z17);
        }
        if (z17) {
            return;
        }
        c1Var.a7(y2Var, 1, mVar2.h());
    }
}
