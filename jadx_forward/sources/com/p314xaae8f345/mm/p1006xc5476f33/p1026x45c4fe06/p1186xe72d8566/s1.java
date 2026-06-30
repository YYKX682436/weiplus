package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class s1 extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f170087a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s0 f170088b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f170089c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f170090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.lang.String dirPath, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s0 listener) {
        super(dirPath, 200);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPath, "dirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f170087a = dirPath;
        this.f170088b = listener;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null) {
            return;
        }
        java.lang.String path = this.f170087a + str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ScreenshotObserver", "onEvent, event: " + i17 + ", takenPath: " + path);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.s0 s0Var = this.f170088b;
        if (i17 == 8) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170089c, path)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.c) s0Var;
            cVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.e eVar = cVar.f170001a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.e.a(eVar), "onScreenshotTaken, path: ".concat(path));
            eVar.f170008b.a(eVar.f170007a, path);
            this.f170089c = path;
            return;
        }
        if (i17 == 64) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170089c, path)) {
                this.f170090d = true;
                return;
            }
            return;
        }
        if (i17 == 128 && this.f170090d) {
            this.f170090d = false;
            java.lang.String str2 = this.f170089c;
            if (str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ScreenshotObserver", "onEvent, fromPath is null");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.c cVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.c) s0Var;
            cVar2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "toPath");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.e eVar2 = cVar2.f170001a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.e.a(eVar2), "onScreenshotMove, fromPath: " + str2 + ", toPath: " + path);
            eVar2.f170008b.b(eVar2.f170007a, str2, path);
        }
    }
}
