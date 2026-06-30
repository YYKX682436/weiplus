package ph1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f435866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph1.l f435867e;

    public j(ph1.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f435867e = lVar;
        this.f435866d = c11510xdd90c2f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f435867e.b(this.f435866d, false);
    }
}
