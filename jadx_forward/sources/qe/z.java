package qe;

/* loaded from: classes7.dex */
public class z implements com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f443541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qe.f0 f443542b;

    public z(qe.f0 f0Var, java.lang.ref.WeakReference weakReference) {
        this.f443542b = f0Var;
        this.f443541a = weakReference;
    }

    @Override // com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepListener
    /* renamed from: onCallBack */
    public void mo45670x9ac7b764(long j17, java.lang.String str) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) this.f443541a.get()).mo51545x3498a0(new qe.y(this, str, j17));
    }
}
