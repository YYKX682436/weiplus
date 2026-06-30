package qe;

/* loaded from: classes7.dex */
public class z0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f443543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f443544e;

    public z0(qe.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var) {
        this.f443544e = d1Var;
        this.f443543d = f0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.SUSPEND != bVar || this.f443544e.f443468h == null) {
            return;
        }
        this.f443543d.k(new qe.y0(this), true);
    }
}
