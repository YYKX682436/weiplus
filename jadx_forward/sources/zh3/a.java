package zh3;

/* loaded from: classes12.dex */
public final class a extends com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3 {

    /* renamed from: d, reason: collision with root package name */
    public final rh3.p f554493d;

    /* renamed from: e, reason: collision with root package name */
    public final qh3.a f554494e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f554495f;

    /* renamed from: g, reason: collision with root package name */
    public final zh3.b f554496g;

    /* renamed from: h, reason: collision with root package name */
    public final yh3.d f554497h;

    public a(rh3.p onePlayContext, wh3.d mediaSource, rh3.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f554493d = onePlayContext;
        this.f554494e = ((rh3.q) onePlayContext).e();
        this.f554495f = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f554496g = new zh3.b();
        this.f554497h = new yh3.d(onePlayContext, mediaSource, fVar);
    }

    public final java.lang.String a() {
        return ((rh3.q) this.f554493d).f("MMMarsDownloaderProxy");
    }

    public final void b() {
        yh3.d dVar = this.f554497h;
        xh3.a aVar = dVar.f536106i;
        xh3.a aVar2 = xh3.a.f536096g;
        if (aVar == aVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(dVar.b(), "startDownload return for state:" + dVar.f536106i);
            return;
        }
        if (aVar != xh3.a.f536093d && aVar != xh3.a.f536094e) {
            dVar.d();
            dVar.a(aVar2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(dVar.b(), "startDownload return for state:" + dVar.f536106i);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rh3.p.b(this.f554493d, null, 1, null), "getContentType() fileId:" + i17 + ", fileKey:" + str + " contentType:video/mp4");
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String mo53277x5000ed37 = this.f554494e.mo53277x5000ed37();
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(mo53277x5000ed37, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a(), "getDataFilePath(), dataFilePath:" + i18 + " isExists:" + com.p314xaae8f345.mm.vfs.w6.j(i18) + " mediaInfoPath:" + mo53277x5000ed37);
        return i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        long c17 = this.f554494e.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a(), "getDataTotalSize() fileId:" + i17 + ", fileKey:" + str + " dataTotalSize:" + c17);
        return c17;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x02c1  */
    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo103121x715d255f(int r29, java.lang.String r30, java.lang.String r31, long r32, long r34) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh3.a.mo103121x715d255f(int, java.lang.String, java.lang.String, long, long):int");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStartReadData */
    public int mo103122x6e58d43(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        int andIncrement = this.f554495f.getAndIncrement();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a(), "onStartReadData, requestId: " + andIncrement);
        this.f554497h.c();
        return andIncrement;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a(), "onStopReadData() fileId:" + i17 + ", fileKey:" + str + ", requestId:" + i18);
        return 0;
    }
}
