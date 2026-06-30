package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class s implements rh3.k, rh3.d, rh3.n, rh3.i, rh3.m, rh3.e, rh3.g, rh3.h, rh3.j, rh3.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.v f90904d;

    public s(com.tencent.mm.plugin.appbrand.video.player.thumb.v vVar) {
        this.f90904d = vVar;
    }

    @Override // rh3.k
    public void b(rh3.o mp6, rh3.s mediaInfo) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        com.tencent.mm.plugin.appbrand.video.player.thumb.v vVar = this.f90904d;
        ye1.m mVar = vVar.f90916j;
        if (mVar != null) {
            mVar.a(vVar);
        }
    }

    @Override // rh3.e
    public void c(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.appbrand.video.player.thumb.v vVar = this.f90904d;
        ye1.g gVar = vVar.f90917k;
        if (gVar != null) {
            gVar.a(vVar);
        }
    }

    @Override // rh3.l
    public void d(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.appbrand.video.player.thumb.v vVar = this.f90904d;
        vVar.f90909c = false;
        ye1.n nVar = vVar.f90918l;
        if (nVar != null) {
            nVar.a(vVar);
        }
    }

    @Override // rh3.m
    public void h(rh3.o mp6, int i17, int i18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mars.xlog.Log.i(this.f90904d.E(), "onStateChange from " + i17 + " to " + i18);
    }

    @Override // rh3.h
    public void i(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mars.xlog.Log.i(this.f90904d.E(), "onFirstFrameRenderStart");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0168  */
    @Override // rh3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(rh3.o r8, int r9, long r10, long r12, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.video.player.thumb.s.j(rh3.o, int, long, long, java.lang.Object):void");
    }

    @Override // rh3.n
    public void m(rh3.o mp6, int i17, int i18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.appbrand.video.player.thumb.v vVar = this.f90904d;
        ye1.q qVar = vVar.f90920n;
        if (qVar != null) {
            qVar.a(vVar, i17, i18);
        }
    }

    @Override // rh3.j
    public void n(rh3.o mp6, long j17, long j18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
    }

    @Override // rh3.d
    public void p(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mars.xlog.Log.i(this.f90904d.E(), "onBufferingEnd");
    }

    @Override // rh3.d
    public void q(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mars.xlog.Log.i(this.f90904d.E(), "onBufferingStart");
    }

    @Override // rh3.g
    public void r(rh3.o mp6, int i17, int i18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mm.plugin.appbrand.video.player.thumb.v vVar = this.f90904d;
        com.tencent.mars.xlog.Log.w(vVar.E(), "onError, errorType: " + i17 + ", errorCode: " + i18 + ", errorType: " + i17 + ", errorCode: " + i18);
        if (1000 == i18) {
            return;
        }
        if (1100 == i17) {
            if (11070000 <= i18 && i18 < 11080000) {
                int i19 = i18 - 11070000;
                ye1.j jVar = vVar.f90915i;
                if (jVar != null) {
                    jVar.a(vVar, com.tencent.mm.hardcoder.HardCoderJNI.CLIENT_CONNECT, i19);
                    return;
                }
                return;
            }
        }
        int i27 = (-10000) - i17;
        ye1.j jVar2 = vVar.f90915i;
        if (jVar2 != null) {
            jVar2.a(vVar, i27, i18);
        }
    }
}
