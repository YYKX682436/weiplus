package zh5;

/* loaded from: classes12.dex */
public final class d extends tf3.b {

    /* renamed from: g, reason: collision with root package name */
    public final zh5.k f554547g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f554548h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f554547g = new zh5.k();
        this.f554548h = jz5.h.b(zh5.b.f554531d);
    }

    @Override // sf3.f
    public void I2(mf3.k mediaInfo, java.lang.String path, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        zh5.w wVar = mediaInfo instanceof zh5.w ? (zh5.w) mediaInfo : null;
        if (wVar == null) {
            return;
        }
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
            W6(wVar, sf3.k.f488932g, a17);
        } else {
            W6(wVar, sf3.k.f488931f, a17);
        }
    }

    @Override // tf3.b
    public void V6() {
        for (java.lang.String str : (java.util.HashSet) ((jz5.n) this.f554548h).mo141623x754a37bb()) {
            this.f554547g.a(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", "cancel download, id: ".concat(str));
        }
    }

    @Override // tf3.b, sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        super.W4(mediaInfo, listener);
        zh5.a aVar = mediaInfo instanceof zh5.a ? (zh5.a) mediaInfo : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", "updateState mediaId: " + mediaInfo.mo2110x5db1b11());
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", "unknown param: " + mediaInfo.mo2110x5db1b11());
            return;
        }
        zh5.a aVar2 = (zh5.a) mediaInfo;
        sf3.g e17 = aVar2.e();
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", "updateStateInternal failed, param null");
            return;
        }
        sf3.g a17 = e17.a(sf3.m.f488937f);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", "image already exists. mediaId: " + aVar2.mo2110x5db1b11() + " path: " + a17.c());
            W6(aVar2, sf3.k.f488930e, a17);
            return;
        }
        W6(aVar2, sf3.k.f488929d, a17);
        java.lang.String mo2110x5db1b11 = aVar2.mo2110x5db1b11();
        dn.m d17 = aVar2.d();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.CDNImageStateManager", "download failed, no cdnInfo param. mediaId: " + mo2110x5db1b11);
            return;
        }
        zh5.l lVar = new zh5.l(mo2110x5db1b11, aVar2.g(), d17);
        java.lang.String g17 = aVar2.g();
        java.lang.String str2 = aVar2.f554524a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", "tryStartDownload image mediaId: " + aVar2.mo2110x5db1b11() + " imageKey:" + str2 + " path: " + g17);
        if (((java.util.HashSet) ((jz5.n) this.f554548h).mo141623x754a37bb()).add(str2) && (!r26.n0.N(g17))) {
            v65.i.b(this.f500481f, null, new zh5.c(this, lVar, mo2110x5db1b11, g17, str2, aVar2, e17, null), 1, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNImageStateManager", "image already downloading, mediaId: ".concat(mo2110x5db1b11));
        }
    }
}
