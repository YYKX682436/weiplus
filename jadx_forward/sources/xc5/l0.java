package xc5;

/* loaded from: classes12.dex */
public final class l0 extends tf3.b {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f535065g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f535065g = jz5.h.b(xc5.j0.f535026d);
    }

    @Override // sf3.f
    public void I2(mf3.k mediaInfo, java.lang.String path, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.lang.String mediaId = mediaInfo.mo2110x5db1b11();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488938g;
        linkedHashMap.put(mVar, path);
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(a17.c());
        java.lang.String str = a18.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            W6(mediaInfo, sf3.k.f488932g, a17);
        } else {
            W6(mediaInfo, sf3.k.f488931f, a17);
        }
    }

    @Override // tf3.b
    public void V6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAllTasks, size: ");
        jz5.g gVar = this.f535065g;
        sb6.append(((java.util.HashSet) ((jz5.n) gVar).mo141623x754a37bb()).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", sb6.toString());
        ((java.util.HashSet) ((jz5.n) gVar).mo141623x754a37bb()).clear();
    }

    @Override // tf3.b, sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        super.W4(mediaInfo, listener);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "refreshState mediaId: " + mediaInfo.mo2110x5db1b11());
        sf3.g e17 = mediaInfo.e();
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "updateStateInternal failed, param null");
            return;
        }
        sf3.g b18 = e17.b(sf3.m.f488936e);
        sf3.m mVar = b18.f488924e;
        sf3.m mVar2 = sf3.m.f488935d;
        if (mVar != mVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "origin image exists. mediaId: " + mediaInfo.mo2110x5db1b11() + " path: " + b18.c());
            W6(mediaInfo, sf3.k.f488930e, b18);
            return;
        }
        sf3.m mVar3 = sf3.m.f488937f;
        sf3.g b19 = e17.b(mVar3);
        if (b19.f488924e != mVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "mid image exists. mediaId: " + mediaInfo.mo2110x5db1b11() + " path: " + b19.c());
            W6(mediaInfo, sf3.k.f488930e, b19);
            return;
        }
        sf3.g b27 = e17.b(sf3.m.f488939h);
        if (b27.f488924e == mVar2) {
            uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
            b17 = iVar != null ? iVar.b() : null;
            if (b17 != null && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.e(b17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "image expired. mediaId: " + mediaInfo.mo2110x5db1b11() + ", msgCreateTime: " + b17.mo78012x3fdd41df());
                W6(mediaInfo, sf3.k.f488931f, e17);
                return;
            }
            sf3.g a17 = e17.a(mVar3);
            if (a17.f488924e == mVar2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "no downloadable type found. mediaId: " + mediaInfo.mo2110x5db1b11());
                W6(mediaInfo, sf3.k.f488931f, e17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "image not found, try download mid. mediaId: " + mediaInfo.mo2110x5db1b11());
            W6(mediaInfo, sf3.k.f488929d, a17);
            X6(mediaInfo, a17);
            return;
        }
        boolean z17 = mediaInfo instanceof uh5.i;
        uh5.i iVar2 = z17 ? (uh5.i) mediaInfo : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b28 = iVar2 != null ? iVar2.b() : null;
        if (b28 != null && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.e(b28)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "image expired with thumb. mediaId: " + mediaInfo.mo2110x5db1b11() + ", msgCreateTime: " + b28.mo78012x3fdd41df());
            W6(mediaInfo, sf3.k.f488931f, b27);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "thumb image exists. mediaId: " + mediaInfo.mo2110x5db1b11() + " path: " + b27.c() + ", try silent mid download");
        W6(mediaInfo, sf3.k.f488930e, b27);
        uh5.i iVar3 = z17 ? (uh5.i) mediaInfo : null;
        b17 = iVar3 != null ? iVar3.b() : null;
        if (b17 != null && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.e(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "skip silent mid download: expired. mediaId: " + mediaInfo.mo2110x5db1b11() + ", msgCreateTime: " + b17.mo78012x3fdd41df());
            return;
        }
        sf3.g a18 = e17.a(mVar3);
        if (a18.f488924e != mVar2) {
            X6(mediaInfo, a18);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "skip silent mid download: no downloadable mid. mediaId: " + mediaInfo.mo2110x5db1b11());
    }

    public final void X6(mf3.k kVar, sf3.g gVar) {
        l70.d dVar;
        uh5.i iVar = kVar instanceof uh5.i ? (uh5.i) kVar : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17 = iVar != null ? iVar.b() : null;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryImageStateManager", "tryStartDownload failed, not IChatMsgMediaInfo. mediaId: " + kVar.mo2110x5db1b11());
            W6(kVar, sf3.k.f488931f, gVar);
            return;
        }
        try {
            dVar = ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).cj(b17, s70.c.f485452g, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryImageStateManager", "genDownloadParams failed: " + e17.getMessage());
            dVar = null;
        }
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryImageStateManager", "tryStartDownload failed, downloadParams null. mediaId: " + kVar.mo2110x5db1b11());
            W6(kVar, sf3.k.f488931f, gVar);
            return;
        }
        java.lang.String mo2110x5db1b11 = kVar.mo2110x5db1b11();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryStartDownload mediaId: ");
        sb6.append(mo2110x5db1b11);
        sb6.append(" path: ");
        sb6.append(dVar.f398338f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", sb6.toString());
        if (((java.util.HashSet) ((jz5.n) this.f535065g).mo141623x754a37bb()).add(mo2110x5db1b11) && (!r26.n0.N(r3))) {
            v65.i.b(this.f500481f, null, new xc5.k0(dVar, this, mo2110x5db1b11, kVar, gVar, null), 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "already downloading. mediaId: " + mo2110x5db1b11);
    }
}
