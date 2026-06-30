package vu0;

/* loaded from: classes5.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.r0 f521675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float[] f521676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f521677f;

    public q0(vu0.r0 r0Var, float[] fArr, float f17) {
        this.f521675d = r0Var;
        this.f521676e = fArr;
        this.f521677f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f521675d.f521679a.J4(this.f521676e, this.f521677f);
    }
}
