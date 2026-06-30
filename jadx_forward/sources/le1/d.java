package le1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f399659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ le1.f f399661f;

    public d(le1.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f399661f = fVar;
        this.f399659d = lVar;
        this.f399660e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f399661f.C(this.f399659d, this.f399660e);
    }
}
