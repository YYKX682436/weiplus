package yh3;

/* loaded from: classes12.dex */
public final class d extends xh3.b implements dn.n, dn.k {

    /* renamed from: o, reason: collision with root package name */
    public final rh3.f f543934o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicBoolean f543935p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f543936q;

    /* renamed from: r, reason: collision with root package name */
    public yh3.c f543937r;

    /* renamed from: s, reason: collision with root package name */
    public yh3.b f543938s;

    /* renamed from: t, reason: collision with root package name */
    public dn.h f543939t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rh3.p onePlayContext, wh3.d mediaSource, rh3.f fVar) {
        super(onePlayContext, mediaSource);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f543934o = fVar;
        this.f543935p = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f536103f = "MMMarsDownloaderTask";
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public void d() {
        int i17;
        dn.h hVar;
        rh3.p pVar = this.f536101d;
        ((xh3.h) pVar.c()).b(this);
        dn.h hVar2 = new dn.h();
        xh3.h hVar3 = (xh3.h) pVar.c();
        java.lang.String str = this.f536104g;
        java.util.List c17 = hVar3.c(str);
        boolean isEmpty = ((java.util.concurrent.CopyOnWriteArrayList) c17).isEmpty();
        java.lang.String str2 = this.f536105h;
        if (isEmpty) {
            yh3.b bVar = this.f543938s;
            i17 = bVar != null ? bVar.b(str, hVar2) : -112;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "stopDownloadInternal real stop ret:" + i17 + " taskId:" + str2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "stopDownloadInternal fake stop ret:0 taskId:" + str2 + " list:" + c17);
            i17 = 0;
        }
        if (i17 != 0 && (hVar = this.f543939t) != null && this.f536106i == xh3.a.f536097h) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
            hVar2 = hVar;
        }
        rh3.f fVar = this.f543934o;
        if (fVar != null) {
            wh3.d dVar = this.f536102e;
            fVar.l(dVar, dVar.f527505c, hVar2);
        }
    }

    public final void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "updateRequestingData " + z17 + ' ' + this);
        this.f543935p.set(z17);
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "onProgress start offset=" + j17 + " total=" + j18 + ' ' + this);
        this.f536107m.g(j17, j18, 1);
        rh3.f fVar = this.f543934o;
        if (fVar != null) {
            fVar.o(this.f536102e, (int) j17, (int) j18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "onProgress end offset=" + j17 + " total=" + j18 + ' ' + this);
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h sceneResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneResult, "sceneResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "onFinish mediaId=" + mediaId + " ret=" + i17 + " recvBytes=" + sceneResult.f69548xe026fea1 + " fileLength=" + sceneResult.f69523x17c343e7 + " format:" + sceneResult.f69571x9373c88d);
        if (i17 != 0) {
            a(xh3.a.f536098i);
            this.f536107m.f(i17);
        } else {
            this.f543939t = sceneResult;
            a(xh3.a.f536097h);
            qh3.a aVar = this.f536107m;
            long j17 = sceneResult.f69523x17c343e7;
            aVar.g(j17, j17, 3);
        }
        ((xh3.h) this.f536101d.c()).b(this);
        wh3.d dVar = this.f536102e;
        dn.o oVar = dVar.f527505c;
        if (oVar.f323346a2 && sceneResult.f69553xb5f54fe9 == 0) {
            r45.hv hvVar = new r45.hv();
            hvVar.f457998d = oVar.f69595x6d25b0d9;
            hvVar.f457999e = sceneResult.f69523x17c343e7;
            df0.r rVar = (df0.r) i95.n0.c(df0.r.class);
            java.lang.String b17 = b();
            java.lang.String str = oVar.f69601xaca5bdda;
            ((cf0.t) rVar).getClass();
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(6, str, hvVar, new cf0.s(b17));
        }
        rh3.f fVar = this.f543934o;
        if (fVar != null) {
            fVar.a(dVar, i17, sceneResult);
        }
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String mediaId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        e(false);
        rh3.f fVar = this.f543934o;
        if (fVar != null) {
            fVar.g(this.f536102e, (int) j17, (int) j18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "onDataAvailable offset=" + j17 + " length=" + j18 + ' ' + this + '}');
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String mediaId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "mediaId:" + mediaId + " m3u8:" + str);
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        java.lang.String str2 = videoInfo != null ? videoInfo.f18114x9330627b : null;
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "onMoovReady start offset=" + j17 + " length=" + j18 + " svrflag=" + str2 + ' ' + this);
        this.f543937r = new yh3.c(j17, j18);
        this.f536101d.getClass();
        qh3.a aVar = this.f536107m;
        boolean e17 = aVar.e() ^ true;
        aVar.h();
        aVar.d(str2);
        rh3.f fVar = this.f543934o;
        if (fVar != null) {
            fVar.f(this.f536102e, (int) j17, (int) j18, e17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "onMoovReady end offset=" + j17 + " length=" + j18 + " svrflag=" + str2 + ' ' + this);
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.String b17 = b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloaderOnStart mediaId=");
        sb6.append(mediaId);
        sb6.append(" startRet=");
        sb6.append(i17);
        sb6.append(" finishedLength=");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.f69496x83ec3dd) : null);
        sb6.append(" fileFormat=");
        sb6.append(hVar != null ? hVar.f69570xea0afd82 : null);
        sb6.append(' ');
        sb6.append(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
        if (gVar != null) {
            if (!(i17 == 0 && gVar.f69496x83ec3dd > 0)) {
                gVar = null;
            }
            if (gVar != null) {
                long j17 = gVar.f69496x83ec3dd;
                long j18 = gVar.f69500x8ab84c59;
                this.f536107m.g(j17, j18, j17 >= j18 ? 3 : 1);
            }
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
