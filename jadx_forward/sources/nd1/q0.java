package nd1;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f417915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f417917f;

    public q0(nd1.r0 r0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17, long j17) {
        this.f417915d = v5Var;
        this.f417916e = i17;
        this.f417917f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f417915d;
        if (v5Var.a2() == null) {
            return;
        }
        v5Var.a2().E(this.f417916e, this.f417917f);
    }
}
