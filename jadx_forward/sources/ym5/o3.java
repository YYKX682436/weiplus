package ym5;

/* loaded from: classes3.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b f544984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f544985e;

    public o3(com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b, int i17) {
        this.f544984d = c22800xb2c6317b;
        this.f544985e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f544984d.g1(this.f544985e, true, true);
    }
}
