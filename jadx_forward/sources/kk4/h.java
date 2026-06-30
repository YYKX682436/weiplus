package kk4;

/* loaded from: classes15.dex */
public final class h extends com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f390078d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f390079e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f390080f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f390081g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f390082h;

    /* renamed from: i, reason: collision with root package name */
    public int f390083i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f390084m;

    /* renamed from: n, reason: collision with root package name */
    public final long f390085n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kk4.v f390086o;

    public h(kk4.v vVar, java.lang.String mediaId, java.lang.String mediaPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaPath, "mediaPath");
        this.f390086o = vVar;
        this.f390078d = mediaId;
        this.f390079e = mediaPath;
        this.f390085n = 1048576L;
    }

    public final java.lang.String a() {
        return this.f390086o.w() + " isMoovReady:" + this.f390080f + " isAllComplete:" + this.f390081g + " isRequestingData:" + this.f390082h;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        kk4.v vVar = this.f390086o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "onProgress mediaId:" + str + " offset:" + j17 + " total:" + j18 + ' ' + a());
        vVar.N = j18;
        dn.o oVar = vVar.f390114f;
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null) {
            bVar.f124079p2 = j17;
            bVar.f124080q2 = j18;
            kk4.v.j(vVar);
            nk4.s sVar = vVar.f390121m;
            if (sVar != null) {
                dn.o oVar2 = vVar.f390114f;
                ck4.b bVar2 = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
                ((kw2.m0) sVar).o(new nk4.h(bVar2 != null ? bVar2.f124067d2 : 0L, j17, j18, android.os.SystemClock.uptimeMillis(), null));
            }
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        this.f390081g = true;
        yz5.p pVar = this.f390084m;
        if (pVar != null) {
            pVar.mo149xb9724478(str, java.lang.Integer.valueOf(i17));
        }
        kk4.v vVar = this.f390086o;
        dn.o oVar = vVar.f390114f;
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null) {
            if (i17 == 0 && hVar != null) {
                long j17 = hVar.f69523x17c343e7;
                bVar.f124079p2 = j17;
                bVar.f124080q2 = j17;
                kk4.v.j(vVar);
            }
            nk4.s sVar = vVar.f390121m;
            if (sVar != null) {
                dn.o oVar2 = vVar.f390114f;
                ck4.b bVar2 = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
                ((kw2.m0) sVar).n(new nk4.g(bVar2 != null ? bVar2.f124067d2 : 0L, hVar, android.os.SystemClock.uptimeMillis(), null));
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390086o.f390109a, "getContentType() fileId:" + i17 + ", fileKey:" + str + " contentType:video/mp4 " + a());
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        return com.p314xaae8f345.mm.vfs.w6.i(this.f390079e, false);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        kk4.v vVar = this.f390086o;
        long j17 = vVar.N;
        if (j17 <= 0) {
            j17 = com.p314xaae8f345.mm.vfs.w6.k(this.f390079e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f390109a, "getDataTotalSize() fileId:" + i17 + ", fileKey:" + str + " fileLength:" + j17 + ' ' + a());
        return j17;
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390086o.f390109a, "onDataAvailable mediaId:" + str + " offset:" + j17 + ' ' + a());
        this.f390082h = false;
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f390080f = true;
        kk4.v vVar = this.f390086o;
        dn.o oVar = vVar.f390114f;
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null) {
            bVar.f124078o2 = true;
            kk4.v.j(vVar);
            nk4.s sVar = vVar.f390121m;
            if (sVar != null) {
                dn.o oVar2 = vVar.f390114f;
                ck4.b bVar2 = oVar2 instanceof ck4.b ? (ck4.b) oVar2 : null;
                ((kw2.m0) sVar).s(new nk4.l(bVar2 != null ? bVar2.f124067d2 : 0L, android.os.SystemClock.uptimeMillis(), j17, j18, null));
            }
        }
        vVar.y(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r4 > 0) goto L28;
     */
    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo103121x715d255f(int r20, java.lang.String r21, java.lang.String r22, long r23, long r25) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk4.h.mo103121x715d255f(int, java.lang.String, java.lang.String, long, long):int");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStartReadData */
    public int mo103122x6e58d43(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390086o.f390109a, "onStartReadData() fileId:" + i17 + ", fileKey:" + str + " requestStart:" + j17 + " requestEnd:" + j18 + ' ' + a());
        int i18 = this.f390083i;
        this.f390083i = i18 + 1;
        return i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390086o.f390109a, "onStopReadData() fileId:" + i17 + ", fileKey:" + str + " requestId:" + i18 + ' ' + a());
        return this.f390083i;
    }
}
