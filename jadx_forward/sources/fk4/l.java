package fk4;

/* loaded from: classes12.dex */
public final class l extends com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3 {

    /* renamed from: d, reason: collision with root package name */
    public final fk4.u f345171d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f345172e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f345173f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f345174g;

    /* renamed from: h, reason: collision with root package name */
    public long f345175h;

    public l(fk4.u downloader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloader, "downloader");
        this.f345171d = downloader;
        this.f345172e = new java.util.concurrent.atomic.AtomicInteger(0);
        java.lang.String str = "MicroMsg.DownloaderTPAssetResourceLoader@" + hashCode();
        this.f345173f = str;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        this.f345174g = concurrentHashMap;
        this.f345175h = -1L;
        java.lang.String f17 = ((fk4.k) downloader).f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        concurrentHashMap.put(f17, downloader);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "<init>, downloader=" + downloader.hashCode());
    }

    public final void a(fk4.u downloader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloader, "downloader");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f345174g;
        fk4.k kVar = (fk4.k) downloader;
        java.lang.String f17 = kVar.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        concurrentHashMap.put(f17, downloader);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345173f, "switchDefine id:" + kVar.f() + " downloader:" + downloader.hashCode());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345173f, "getContentType: fileId=" + i17 + ", fileKey=" + str);
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        fk4.u uVar = (fk4.u) this.f345174g.get(str);
        java.lang.String str2 = this.f345173f;
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "getDataFilePath: fileId=" + i17 + ", fileKey=" + str + " return for downloader.");
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "getDataFilePath: fileId=" + i17 + ", fileKey=" + str);
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(((fk4.k) uVar).n(), false);
        return i18 == null ? "" : i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        fk4.u uVar = (fk4.u) this.f345174g.get(str);
        java.lang.String str2 = this.f345173f;
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "getDataTotalSize: fileId=" + i17 + ", fileKey=" + str + " return for downloader.");
            return 0L;
        }
        fk4.k kVar = (fk4.k) uVar;
        if (this.f345175h != kVar.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "getDataTotalSize: fileId=" + i17 + ", fileKey=" + str + ", length=" + kVar.g() + ", downloader=" + uVar.hashCode());
            this.f345175h = kVar.g();
        }
        return kVar.g();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    public int mo103121x715d255f(int i17, java.lang.String fileName, java.lang.String fileKey, long j17, long j18) {
        long min;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileKey, "fileKey");
        fk4.u uVar = (fk4.u) this.f345174g.get(fileKey);
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f345173f, "onReadData: fileId=" + i17 + ", fileKey=" + fileKey + " return for downloader.");
            return 0;
        }
        fk4.k kVar = (fk4.k) uVar;
        if (kVar.h()) {
            min = j18;
        } else {
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
            java.lang.String f17 = kVar.f();
            long[] jArr = kVar.f345161p;
            c4446x11b6e6e0.m37760xcac8ee98(f17, j17, jArr);
            min = java.lang.Math.min(jArr[0], j18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345173f, "onReadData: fileId=" + i17 + ", fileKey=" + fileKey + ", checkAvailable(" + j17 + ", " + j18 + ")=" + min);
        if (min >= j18) {
            return (int) j18;
        }
        if (!kVar.f345163r.get()) {
            synchronized (kVar.f345159n) {
                if (kVar.f345154i || !kVar.f345158m.contains("0_-1")) {
                    java.util.HashSet hashSet = kVar.f345158m;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(j17);
                    sb6.append('_');
                    sb6.append(j18);
                    if (hashSet.add(sb6.toString())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f345147b, "request(" + j17 + ", " + j18 + "), mediaId=" + kVar.f());
                        kVar.f345148c.mo50293x3498a0(new fk4.i(kVar, j17, j18));
                        kVar.f345163r.set(true);
                    }
                }
            }
        }
        return (int) min;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStartReadData */
    public int mo103122x6e58d43(int i17, java.lang.String fileName, java.lang.String fileKey, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileKey, "fileKey");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345173f, "onStartReadData: fileId=" + i17 + ", fileKey=" + fileKey + ", " + j17 + '-' + j18 + ", path=" + ((fk4.k) this.f345171d).n());
        return this.f345172e.incrementAndGet();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345173f, "onStopReadData: fileId=" + i17 + ", fileKey=" + str + ", requestId=" + i18);
        return this.f345172e.get();
    }
}
