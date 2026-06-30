package le1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f399669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ le1.k f399671f;

    public j(le1.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f399671f = kVar;
        this.f399669d = lVar;
        this.f399670e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f399671f.C(this.f399669d, this.f399670e);
    }
}
