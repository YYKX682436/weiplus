package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.SendImgProxyUI */
/* loaded from: classes12.dex */
public class ActivityC21639xb2c1ee07 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f279848g;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f279849e = null;

    /* renamed from: f, reason: collision with root package name */
    public final pe5.f f279850f = new pe5.f(this);

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        com.p314xaae8f345.mm.ui.bk.k0(getWindow());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendImgProxyUI", "onCreate isRunning:%b ,%d", java.lang.Boolean.valueOf(f279848g), java.lang.Integer.valueOf(hashCode()));
        if (f279848g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendImgProxyUI", "duplicate instance");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
            c6423x452b9f7c.f137646e = 3020L;
            c6423x452b9f7c.k();
            finish();
            return;
        }
        f279848g = true;
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569701j3);
        this.f279849e = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqx), true, false, null);
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.SendImgProxyUI$$a
            /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0166 A[SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1215
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.RunnableC21640x35d30c7a.run():void");
            }
        });
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendImgProxyUI", "onDestroy isRunning:%b , %d", java.lang.Boolean.valueOf(f279848g), java.lang.Integer.valueOf(hashCode()));
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendImgProxyUI", "onResume isRunning:%b ,%d", java.lang.Boolean.valueOf(f279848g), java.lang.Integer.valueOf(hashCode()));
        super.onResume();
    }
}
