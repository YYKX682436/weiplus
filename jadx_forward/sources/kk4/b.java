package kk4;

/* loaded from: classes10.dex */
public interface b {
    static /* synthetic */ void a(kk4.b bVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        bVar.c(str);
    }

    static /* synthetic */ void e(kk4.b bVar, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopCdnDownload");
        }
        if ((i17 & 1) != 0) {
            aVar = kk4.a.f390048d;
        }
        bVar.d(aVar);
    }

    static /* synthetic */ void f(kk4.b bVar, int i17, boolean z17, yz5.l lVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: seekTo");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        if ((i18 & 4) != 0) {
            lVar = null;
        }
        ((kk4.v) bVar).z(i17, z17, lVar);
    }

    static /* synthetic */ void g(kk4.b bVar, pk4.v vVar, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setProgressListener");
        }
        if ((i17 & 2) != 0) {
            j17 = 200;
        }
        ((kk4.v) bVar).I(vVar, j17);
    }

    static /* synthetic */ void h(kk4.b bVar, android.view.Surface surface, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSurface");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        ((kk4.v) bVar).J(surface, z17);
    }

    static /* synthetic */ void i(kk4.b bVar, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        bVar.b(z17, z18);
    }

    void b(boolean z17, boolean z18);

    void c(java.lang.String str);

    void d(yz5.a aVar);

    /* renamed from: recycle */
    void mo143590x408b7293();

    /* renamed from: stop */
    void mo143591x360802();
}
