package yc1;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f542347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yc1.y f542349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yc1.z f542350g;

    public w(yc1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, yc1.y yVar) {
        this.f542350g = zVar;
        this.f542347d = lVar;
        this.f542348e = str;
        this.f542349f = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s75.d.b(new yc1.v(this), "stopScanServices");
    }
}
