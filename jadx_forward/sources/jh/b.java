package jh;

/* loaded from: classes13.dex */
public class b implements java.io.FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jh.n f381201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jh.c f381202b;

    public b(jh.c cVar, jh.n nVar) {
        this.f381202b = cVar;
        this.f381201a = nVar;
    }

    @Override // java.io.FileFilter
    public boolean accept(java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            jh.c cVar = this.f381202b;
            if (!jh.m.b(cVar.f381205e, absolutePath, 0) && (absolutePath.endsWith(".so") || absolutePath.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55698xb5cf7628) || absolutePath.endsWith(".oat") || absolutePath.endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99))) {
                oj.j.c("Matrix.WarmUpDelegate", "Warming up so %s", absolutePath);
                if (!this.f381201a.a(absolutePath, 0)) {
                    cVar.f381205e.getClass();
                    jh.p pVar = jh.m.f381257h;
                    if (pVar != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.c) pVar).a(jh.o.WarmUpFailed, absolutePath, 0);
                    }
                }
            }
        }
        return false;
    }
}
