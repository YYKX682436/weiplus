package l01;

/* loaded from: classes7.dex */
public class e implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l01.f f396295d;

    public e(l01.f fVar) {
        this.f396295d = fVar;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AppBrandSimpleImageLoaderDownloadThread";
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.f fVar = this.f396295d;
        l01.c0.d(fVar.f396298f, fVar.f396301i, fVar.f396297e.f396277f);
        r.a aVar = fVar.f396299g;
        if (aVar != null) {
            try {
                aVar.mo1850x58b836e(((l01.k) fVar.f396297e.f396277f).b(fVar.f396298f.f396306b));
            } catch (java.lang.Throwable unused) {
            }
        }
        fVar.c();
    }
}
