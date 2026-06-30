package com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/palm/ui/PalmPrintMainUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-face_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.palm.ui.PalmPrintMainUI */
/* loaded from: classes14.dex */
public final class ActivityC16781xd3c41868 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: d, reason: collision with root package name */
    public jp3.k f234404d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f234409i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f234410m;

    /* renamed from: q, reason: collision with root package name */
    public kp3.f f234414q;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f234405e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f234406f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f234407g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f234408h = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f234411n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f234412o = "";

    /* renamed from: p, reason: collision with root package name */
    public final r45.t45 f234413p = new r45.t45();

    public final boolean U6() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f234407g, "1");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dmr;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{kp3.p0.class, kp3.x.class});
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.palmPrintMainUI", "[onBackPressed]");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        kp3.x xVar = (kp3.x) pf5.z.f435481a.a(mo55332x76847179).a(kp3.x.class);
        xVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onCancel]");
        if (xVar.f392587m.compareAndSet(false, true)) {
            xVar.R6(1, "cancel", "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PalmPrintCameraSettingUIC", "[onCancel] ignore, isVerifyHadResult is true!");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0365, code lost:
    
        if (r0 != 0) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x050a  */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        jp3.k kVar = this.f234404d;
        if (kVar != null) {
            java.lang.String str = kVar.f382545e;
            if (str == null || str.length() == 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintLogic", "[release] currentCdnMediaId ：" + kVar.f382545e);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(kVar.f382545e);
            kVar.f382545e = "";
        }
    }
}
