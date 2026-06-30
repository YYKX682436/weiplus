package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class h4 implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f86661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f86662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f86663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86664g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86665h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f86666i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86667m;

    public h4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, long j17, long j18, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2, android.view.animation.Animation animation) {
        this.f86667m = i3Var;
        this.f86661d = j17;
        this.f86662e = j18;
        this.f86663f = wdVar;
        this.f86664g = w2Var;
        this.f86665h = w2Var2;
        this.f86666i = animation;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        float elapsedRealtime = (((float) (android.os.SystemClock.elapsedRealtime() - this.f86661d)) + 0.0f) / ((float) this.f86662e);
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f86665h;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var2 = this.f86664g;
        com.tencent.mm.plugin.appbrand.page.wd wdVar = this.f86663f;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f86667m;
        if (1.0f <= elapsedRealtime) {
            i3Var.l(wdVar, w2Var2, w2Var);
        } else {
            i3Var.m(wdVar, w2Var2, w2Var, (int) (this.f86666i.getInterpolator().getInterpolation(elapsedRealtime) * 100.0f));
            android.view.Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
