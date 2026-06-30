package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/fts/ui/voice/FTSFloatingVoiceHalfScreenActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "k23/z", "ui-fts_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity */
/* loaded from: classes12.dex */
public final class ActivityC15617x8cb23e95 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: g, reason: collision with root package name */
    public static k23.v2 f219738g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.ref.WeakReference f219739h = null;

    /* renamed from: i, reason: collision with root package name */
    public static int f219740i = 3;

    /* renamed from: m, reason: collision with root package name */
    public static int f219741m = 6;

    /* renamed from: d, reason: collision with root package name */
    public final k23.v0 f219745d = new k23.v0(this);

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f219746e;

    /* renamed from: f, reason: collision with root package name */
    public static final k23.z f219737f = new k23.z(null);

    /* renamed from: n, reason: collision with root package name */
    public static k23.w0 f219742n = k23.w0.f385272i;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f219743o = "";

    /* renamed from: p, reason: collision with root package name */
    public static k23.u2 f219744p = k23.u2.f385234d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ef8;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo78514x143f1b92().G.o();
        m78563x4e0f6657(false);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cg7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f219746e = (android.widget.RelativeLayout) findViewById;
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.u2n)).setHint((java.lang.String) ((jz5.n) new k23.c(this).f385068c).mo141623x754a37bb());
        android.widget.RelativeLayout relativeLayout = this.f219746e;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        k23.d0 d0Var = new k23.d0(relativeLayout, new android.view.ViewGroup.LayoutParams(-1, -1), f219738g, null, f219742n, f219741m, f219740i, f219743o, f219744p, null, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de, null);
        k23.v0 v0Var = this.f219745d;
        v0Var.t(d0Var);
        k23.i1 q17 = v0Var.q();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        android.widget.RelativeLayout relativeLayout2 = this.f219746e;
        if (relativeLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        relativeLayout2.addView(q17, layoutParams);
        f219739h = new java.lang.ref.WeakReference(this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f219738g = null;
        java.lang.ref.WeakReference weakReference = f219739h;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f219745d.v();
    }
}
