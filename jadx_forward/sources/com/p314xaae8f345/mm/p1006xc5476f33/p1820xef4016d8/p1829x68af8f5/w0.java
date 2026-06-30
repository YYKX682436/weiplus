package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes4.dex */
public class w0 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f227457d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var) {
        this.f227457d = new java.lang.ref.WeakReference(b1Var);
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) this.f227457d.get();
        if (b1Var == null) {
            return;
        }
        b1Var.f227366m.f(str, j17, j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        if (hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "download finish: %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237.b().putInt(str, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) this.f227457d.get();
        if (b1Var == null) {
            return;
        }
        b1Var.f227366m.o(str, i17);
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) this.f227457d.get();
        if (b1Var == null) {
            return;
        }
        b1Var.f227366m.mo48220x9bb59ea0(str, j17, j18);
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1) this.f227457d.get();
        if (b1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.v0(this, b1Var, str, j17, j18, videoInfo));
    }
}
