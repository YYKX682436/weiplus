package xc5;

/* loaded from: classes12.dex */
public final class t2 extends xc5.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        super(msgInfo, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
    }

    @Override // mf3.k
    public gg3.c a() {
        java.lang.String k17 = k();
        java.lang.String j17 = j();
        if (mo147256x74bf41ce() == mf3.w.f407662e) {
            j17 = i();
        } else if (l()) {
            j17 = i();
        }
        java.lang.String str = j17;
        if (r26.n0.N(str) || r26.n0.N(k17)) {
            return null;
        }
        java.lang.String mo2110x5db1b11 = mo2110x5db1b11();
        long j18 = 0;
        try {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = this.f534932a.z0();
            ((vf0.y1) x1Var).getClass();
            if (t21.d3.h(z07) != null) {
                j18 = r0.f496548m * 1000;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "getVideoDurationMs failed: " + e17.getMessage());
        }
        return new gg3.c(mo2110x5db1b11, k17, str, null, j18, false, 40, null);
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    @Override // xc5.b
    public co.a d() {
        java.lang.String k17 = k();
        java.lang.String j17 = j();
        boolean l17 = l();
        if (l17) {
            j17 = i();
        }
        if (r26.n0.N(j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "createForwardViewModel: empty videoPath, msgId=" + this.f534932a.m124847x74d37ac6());
            return null;
        }
        jd5.c cVar = new jd5.c();
        h(cVar);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (k17 == null) {
            k17 = "";
        }
        cVar.o(k17);
        if (j17 == null) {
            j17 = "";
        }
        cVar.r(j17);
        cVar.l(!l17);
        cVar.q(0);
        return cVar;
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String path = k();
        if (path.length() == 0) {
            return null;
        }
        java.lang.String mediaId = mo2110x5db1b11();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488939h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
    }

    @Override // mf3.k
    public java.lang.String g() {
        return j();
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407657f;
    }

    public final java.lang.String i() {
        try {
            return ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(this.f534932a, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "getOriginVideoPath failed: " + e17.getMessage());
            return "";
        }
    }

    public final java.lang.String j() {
        try {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f534932a;
            return ((k90.b) u0Var).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "getVideoFilePath failed: " + e17.getMessage());
            return "";
        }
    }

    public final java.lang.String k() {
        try {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f534932a;
            return ((k90.b) u0Var).tj(f9Var, f9Var.z0(), false);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final boolean l() {
        try {
            int intValue = ((java.lang.Number) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(this.f534932a).f384366d).intValue();
            if (intValue != 2 && intValue != 3) {
                if (intValue != 1 && intValue != 4) {
                    return false;
                }
                java.lang.String i17 = i();
                if (!(!r26.n0.N(i17))) {
                    return false;
                }
                if (!com.p314xaae8f345.mm.vfs.w6.j(i17)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsgHistoryGalleryMediaInfo", "isOriginVideoReady failed: " + e17.getMessage());
            return false;
        }
    }
}
