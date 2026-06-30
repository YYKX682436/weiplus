package vd2;

/* loaded from: classes3.dex */
public final class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f517581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f517582f;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, java.lang.Integer num, int i17) {
        this.f517580d = c14167x40aca97c;
        this.f517581e = num;
        this.f517582f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f517580d.v(this.f517581e.intValue(), "bindCheckPrepareLive", this.f517582f);
    }
}
