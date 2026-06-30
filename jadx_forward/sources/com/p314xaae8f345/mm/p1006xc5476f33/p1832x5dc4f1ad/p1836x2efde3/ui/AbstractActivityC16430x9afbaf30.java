package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/ui/MagicBaseDemoActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.demo.ui.MagicBaseDemoActivity */
/* loaded from: classes7.dex */
public abstract class AbstractActivityC16430x9afbaf30 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f229449f = 0;

    /* renamed from: d, reason: collision with root package name */
    public zc3.c f229450d;

    /* renamed from: e, reason: collision with root package name */
    public zq0.a f229451e;

    public abstract zc3.c T6();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570786ej5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("MagicSimpleBizDemo");
        mo54448x9c8c0d33(new zc3.b(this));
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) kz5.c1.l(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.usn), "preload"), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ngb), "start"), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.v5g), "show"), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.nja), "stop"))).entrySet()) {
            ((android.widget.Button) findViewById(((java.lang.Number) entry.getKey()).intValue())).setOnClickListener(new zc3.a(this, (java.lang.String) entry.getValue()));
        }
    }
}
