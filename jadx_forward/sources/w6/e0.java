package w6;

/* loaded from: classes13.dex */
public class e0 implements w6.p {

    /* renamed from: a, reason: collision with root package name */
    public final y6.a f524626a;

    /* renamed from: b, reason: collision with root package name */
    public volatile y6.c f524627b;

    public e0(y6.a aVar) {
        this.f524626a = aVar;
    }

    public y6.c a() {
        if (this.f524627b == null) {
            synchronized (this) {
                if (this.f524627b == null) {
                    y6.i iVar = (y6.i) this.f524626a;
                    y6.k kVar = (y6.k) iVar.f541126b;
                    java.io.File cacheDir = kVar.f541132a.getCacheDir();
                    y6.j jVar = null;
                    if (cacheDir == null) {
                        cacheDir = null;
                    } else {
                        java.lang.String str = kVar.f541133b;
                        if (str != null) {
                            cacheDir = new java.io.File(cacheDir, str);
                        }
                    }
                    if (cacheDir != null && (cacheDir.mkdirs() || (cacheDir.exists() && cacheDir.isDirectory()))) {
                        jVar = new y6.j(cacheDir, iVar.f541125a);
                    }
                    this.f524627b = jVar;
                }
                if (this.f524627b == null) {
                    this.f524627b = new y6.d();
                }
            }
        }
        return this.f524627b;
    }
}
