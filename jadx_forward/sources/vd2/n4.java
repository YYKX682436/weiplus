package vd2;

/* loaded from: classes3.dex */
public final class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f517360e;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, int i17) {
        this.f517359d = c14167x40aca97c;
        this.f517360e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f517359d.z(this.f517360e, -1);
    }
}
