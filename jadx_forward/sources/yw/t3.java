package yw;

/* loaded from: classes11.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.u3 f548005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f548006e;

    public t3(yw.u3 u3Var, long j17) {
        this.f548005d = u3Var;
        this.f548006e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v vVar = this.f548005d.f548012a;
        if (vVar != null) {
            vVar.Z0(this.f548006e);
        }
    }
}
