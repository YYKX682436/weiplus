package xc5;

/* loaded from: classes12.dex */
public final class e3 extends jg3.b {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f534971f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f534972g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f534973h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f534971f = jz5.h.b(xc5.b3.f534931d);
        this.f534972g = new java.util.HashMap();
        this.f534973h = new java.util.HashMap();
    }

    @Override // gg3.b
    public void H5(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        java.lang.String mo2110x5db1b11 = mediaInfo.mo2110x5db1b11();
        java.lang.String str = mo2110x5db1b11 + "_origin";
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) this.f534972g.remove(mo2110x5db1b11);
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        Z6().remove(str);
        this.f534973h.remove(mo2110x5db1b11);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "cancelOriginDownload mediaId: " + mo2110x5db1b11);
    }

    @Override // jg3.b
    public void V6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAllTasks, loadingIdSet size: ");
        sb6.append(Z6().size());
        sb6.append(", originJobs size: ");
        java.util.HashMap hashMap = this.f534972g;
        sb6.append(hashMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", sb6.toString());
        Z6().clear();
        this.f534973h.clear();
        java.util.Collection<p3325xe03a0797.p3326xc267989b.r2> values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (p3325xe03a0797.p3326xc267989b.r2 r2Var : values) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2Var);
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        hashMap.clear();
    }

    public final boolean Y6(mf3.k kVar, gg3.c cVar, boolean z17) {
        java.lang.String mo2110x5db1b11 = kVar.mo2110x5db1b11();
        java.lang.String str = z17 + '|' + cVar.f353261c;
        java.util.HashMap hashMap = this.f534973h;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hashMap.get(mo2110x5db1b11), str)) {
            return false;
        }
        hashMap.put(mo2110x5db1b11, str);
        jg3.b.X6(this, kVar, gg3.d.f353266e, cVar, null, 4, null);
        return true;
    }

    public final java.util.HashSet Z6() {
        return (java.util.HashSet) ((jz5.n) this.f534971f).mo141623x754a37bb();
    }

    @Override // jg3.b, gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        int i17;
        java.lang.String str;
        xf0.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        super.a5(mediaInfo, listener);
        uh5.i iVar2 = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "updateState failed, not IChatMsgMediaInfo. mediaId: " + mediaInfo.mo2110x5db1b11());
            return;
        }
        gg3.c a17 = mediaInfo.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "updateState failed, loadParam null. mediaId: " + mediaInfo.mo2110x5db1b11());
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17 = iVar2.b();
        java.lang.String mo2110x5db1b11 = mediaInfo.mo2110x5db1b11();
        boolean z17 = mediaInfo.mo147256x74bf41ce() == mf3.w.f407662e;
        if (z17) {
            try {
                i17 = ((java.lang.Number) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(b17).f384366d).intValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "getC2COriginVideoStatus failed: " + e17.getMessage());
                i17 = -1;
            }
            if (i17 == 2 || i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "origin video ready (strict). mediaId: " + mo2110x5db1b11 + ", status: " + i17);
                Y6(mediaInfo, a17, z17);
                return;
            }
            try {
                str = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(b17, false);
            } catch (java.lang.Exception unused) {
                str = "";
            }
            if ((!r26.n0.N(str)) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "origin video file exists on disk (status=" + i17 + "). mediaId: " + mo2110x5db1b11 + ", path: " + str);
                Y6(mediaInfo, a17, z17);
                return;
            }
        } else {
            java.lang.String str2 = a17.f353261c;
            if (!r26.n0.N(str2)) {
                com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str2);
                java.lang.String str3 = a18.f294812f;
                if (str3 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "video already exists. mediaId: " + mo2110x5db1b11 + " path: " + str2);
                    Y6(mediaInfo, a17, z17);
                    return;
                }
            }
        }
        boolean e18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.e(b17);
        java.util.HashMap hashMap = this.f534973h;
        if (e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "video expired. mediaId: " + mo2110x5db1b11 + ", msgCreateTime: " + b17.mo78012x3fdd41df() + ", serverTime: " + c01.id.a());
            hashMap.remove(mo2110x5db1b11);
            jg3.b.X6(this, mediaInfo, gg3.d.f353267f, a17, null, 4, null);
            return;
        }
        xf0.f fVar = z17 ? xf0.f.f535697e : xf0.f.f535696d;
        hashMap.remove(mo2110x5db1b11);
        jg3.b.X6(this, mediaInfo, gg3.d.f353265d, a17, null, 4, null);
        java.lang.String mo2110x5db1b112 = mediaInfo.mo2110x5db1b11();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "tryStartDownload mediaId: " + mo2110x5db1b112 + ", transitType: " + fVar);
        try {
            iVar = xf0.s.f535749f.a().U6(b17, fVar, true);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "genDownloadParams failed: " + e19.getMessage());
            iVar = null;
        }
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "tryStartDownload failed, downloadParams null. mediaId: " + mo2110x5db1b112);
            jg3.b.X6(this, mediaInfo, gg3.d.f353267f, a17, null, 4, null);
            return;
        }
        if (Z6().add(mo2110x5db1b112)) {
            iVar.f535718m = new xc5.c3(mo2110x5db1b112, this, mediaInfo, a17);
            v65.i.b(this.f381187e, null, new xc5.d3(iVar, this, mo2110x5db1b112, mediaInfo, a17, z17, null), 1, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "already downloading. mediaId: " + mo2110x5db1b112);
        }
    }

    @Override // gg3.b
    public void f4(mf3.k mediaInfo, yz5.l lVar, yz5.l lVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "downloadOriginVideo failed, not IChatMsgMediaInfo");
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17 = iVar.b();
        java.lang.String mo2110x5db1b11 = mediaInfo.mo2110x5db1b11();
        java.lang.String str = mo2110x5db1b11 + "_origin";
        if (Z6().contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "origin video already downloading, skip. mediaId: " + mo2110x5db1b11);
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "downloadOriginVideo start. mediaId: " + mo2110x5db1b11);
        this.f534973h.remove(mo2110x5db1b11);
        Z6().add(str);
        this.f534972g.put(mo2110x5db1b11, v65.i.b(this.f381187e, null, new xc5.a3(b17, mo2110x5db1b11, this, str, lVar2, lVar, null), 1, null));
    }
}
