package uf1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f508689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf1.a f508690e;

    public e(uf1.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f508690e = aVar;
        this.f508689d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        uf1.a.r(this.f508690e, this.f508689d);
    }
}
