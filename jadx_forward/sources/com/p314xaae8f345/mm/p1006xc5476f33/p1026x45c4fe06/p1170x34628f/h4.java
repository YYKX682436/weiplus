package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class h4 implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f168194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f168195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd f168196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f168197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f168198h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f168199i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168200m;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, long j17, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2, android.view.animation.Animation animation) {
        this.f168200m = i3Var;
        this.f168194d = j17;
        this.f168195e = j18;
        this.f168196f = wdVar;
        this.f168197g = w2Var;
        this.f168198h = w2Var2;
        this.f168199i = animation;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        float elapsedRealtime = (((float) (android.os.SystemClock.elapsedRealtime() - this.f168194d)) + 0.0f) / ((float) this.f168195e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f168198h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2 = this.f168197g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar = this.f168196f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var = this.f168200m;
        if (1.0f <= elapsedRealtime) {
            i3Var.l(wdVar, w2Var2, w2Var);
        } else {
            i3Var.m(wdVar, w2Var2, w2Var, (int) (this.f168199i.getInterpolator().getInterpolation(elapsedRealtime) * 100.0f));
            android.view.Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
