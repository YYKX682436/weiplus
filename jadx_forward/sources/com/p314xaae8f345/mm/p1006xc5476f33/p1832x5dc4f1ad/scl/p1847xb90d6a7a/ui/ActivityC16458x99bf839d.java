package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1847xb90d6a7a.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/scl/nativedemo/ui/MagicSclNativeDemoUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.scl.nativedemo.ui.MagicSclNativeDemoUI */
/* loaded from: classes7.dex */
public final class ActivityC16458x99bf839d extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f229664f = 0;

    /* renamed from: d, reason: collision with root package name */
    public hq0.e0 f229665d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f229666e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dcw;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        hq0.e0 e0Var;
        super.onCreate(bundle);
        mo54450xbf7c1df6("MagicSclNativeDemoUI");
        mo54448x9c8c0d33(new ne3.a(this));
        this.f229666e = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f565580cu0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclNativeDemoUI", "setupDynamicCardEnv");
        if (r26.n0.N("mock_123")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclNativeDemoUI", "frameSetName null or data null");
            return;
        }
        me3.j jVar = (me3.j) ((me3.i) i95.n0.c(me3.i.class));
        synchronized (jVar) {
            if (jVar.f407467d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclNativeDemoServiceFeatureService", "has create biz");
            } else {
                le3.a aVar = new le3.a();
                jVar.f407467d = aVar;
                aVar.X0();
            }
        }
        le3.a aVar2 = ((me3.j) ((me3.i) i95.n0.c(me3.i.class))).f407467d;
        if (aVar2 != null) {
            java.lang.Object obj = new java.lang.Object();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            e0Var = hq0.i0.K0(aVar2, obj, context, "MagicSclNativeDemo", "frames", "", false, 32, null);
        } else {
            e0Var = null;
        }
        this.f229665d = e0Var;
        if (e0Var != null) {
            android.view.ViewGroup viewGroup = this.f229666e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclNativeDemoUI", "createFrameSetView");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d(context2, null, 0, 6, null);
            c10867x3e50a04d.setBackgroundColor(-65536);
            c10867x3e50a04d.e("mock_123");
            c10867x3e50a04d.setId(android.view.View.generateViewId());
            c10867x3e50a04d.setLayoutParams(new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1));
            viewGroup.addView(c10867x3e50a04d);
            c10867x3e50a04d.a(e0Var);
            c10867x3e50a04d.bringToFront();
            c10867x3e50a04d.getId();
            hq0.e0 e0Var2 = this.f229665d;
            if (e0Var2 != null) {
                cl0.g gVar = new cl0.g();
                gVar.h("frameSetName", "mock_123");
                e0Var2.a("\n          {\n          \"type\": 1,\n          \"data\": \"{\\\"iconUrl\\\":\\\"https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png\\\",\\\"pagIconUrl\\\":\\\"\\\",\\\"iconType\\\":0,\\\"recommendReason\\\":\\\"商品\\\",\\\"wording\\\":\\\"古琴零基础入门年课\\\"}\"\n          }\n         ", gVar.toString());
            }
        }
    }
}
