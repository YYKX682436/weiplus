package qq3;

/* loaded from: classes12.dex */
public final class j implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq3.k f447496d;

    public j(qq3.k kVar) {
        this.f447496d = kVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        qq3.k kVar = this.f447496d;
        kVar.f447495g = j17;
        kVar.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CVideoMsgTask", "c2c video pre download progress, msgId:" + kVar.f447493e.m125327x74d37ac6() + ", msgSvrId:" + kVar.f447494f + "offset:" + kVar.f447495g + ", total:" + j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        qq3.k kVar = this.f447496d;
        if (i17 != 0) {
            if (((rq3.i) ((cc0.k) i95.n0.c(cc0.k.class))).f480459d != null) {
                java.lang.String filename = kVar.f447497h.E1;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filename, "filename");
                long j17 = kVar.f447495g;
                t21.d3.y(filename);
            }
            kVar.d(2, i17);
            return;
        }
        bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
        long j18 = kVar.f447494f;
        java.lang.String w07 = kVar.f447493e.w0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getFromUser(...)");
        ((kq3.e) sVar).Bi(3L, j18, w07, kVar.f447493e.u0(), kVar.f447493e.G0(), kVar.f447493e.v0(), kVar.f447493e.m125326x3fdd41df());
        if (((rq3.i) ((cc0.k) i95.n0.c(cc0.k.class))).f480459d != null) {
            java.lang.String filename2 = kVar.f447497h.E1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filename2, "filename");
            t21.d3.N(filename2, (int) kVar.f447495g);
        }
        qq3.i.e(kVar, 1, 0, 2, null);
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
    }
}
