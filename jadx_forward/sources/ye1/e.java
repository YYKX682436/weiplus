package ye1;

/* loaded from: classes7.dex */
public interface e extends ye1.s {
    void B(ye1.m mVar);

    void b(boolean z17);

    void c(float f17, float f18);

    void d(ye1.f fVar);

    boolean f(float f17);

    void g(ye1.q qVar);

    /* renamed from: getCurrentPosition */
    int mo1851x9746038c();

    /* renamed from: getDuration */
    int mo1852x51e8b0a();

    /* renamed from: getPlayerType */
    int mo1853x6b2cfdb1();

    /* renamed from: getState */
    int mo53293x75286adb();

    /* renamed from: getVideoHeight */
    int mo1854x463504c();

    /* renamed from: getVideoWidth */
    int mo1855x8d5c7601();

    void h(ye1.n nVar);

    void i(ye1.o oVar);

    /* renamed from: isPlaying */
    boolean mo1856xc00617a4();

    void j(boolean z17);

    void k(ye1.k kVar);

    ye1.e l(java.lang.Class cls);

    void m(java.lang.String str, java.lang.String str2);

    void n(double d17);

    void p(ye1.l lVar);

    /* renamed from: pause */
    void mo1857x65825f6();

    /* renamed from: prepareAsync */
    void mo1858x857611b5();

    void q(ye1.i iVar);

    void r(ye1.j jVar);

    /* renamed from: release */
    void mo1859x41012807();

    /* renamed from: reset */
    void mo1860x6761d4f();

    default void s(ye1.p pVar) {
    }

    /* renamed from: seekTo */
    void mo1861xc9fc1b13(long j17);

    /* renamed from: setDataSource */
    void mo1862x683d6267(java.lang.String str);

    /* renamed from: setMinBufferDuration */
    default void mo53286x3dc294a4(long j17) {
    }

    /* renamed from: setMute */
    void mo1863x764d819b(boolean z17);

    /* renamed from: setSurface */
    void mo1864x42c875eb(android.view.Surface surface);

    /* renamed from: start */
    void mo1865x68ac462();

    /* renamed from: stop */
    void mo1866x360802();

    void t(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17);

    default void u(final java.lang.String str, final java.lang.String str2, final ye1.h hVar) {
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: ye1.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                ye1.e eVar = ye1.e.this;
                java.lang.String str3 = str;
                java.lang.String str4 = str2;
                final ye1.h hVar2 = hVar;
                eVar.m(str3, str4);
                if (hVar2 != null) {
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: ye1.e$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ff1.i) ye1.h.this).a();
                        }
                    });
                }
            }
        });
    }

    void w(java.lang.String str);

    void x(java.lang.String str, java.lang.String str2, int i17);

    default void y(java.lang.String str, int i17) {
        mo1862x683d6267(str);
    }

    void z(ye1.g gVar);
}
