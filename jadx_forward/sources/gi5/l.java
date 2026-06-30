package gi5;

/* loaded from: classes12.dex */
public final class l extends tf3.b {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f353852g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f353853h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f353852g = jz5.h.b(gi5.i.f353842d);
        this.f353853h = jz5.h.b(gi5.j.f353843d);
    }

    @Override // sf3.f
    public void I2(mf3.k mediaInfo, java.lang.String path, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ai5.c cVar = mediaInfo instanceof ai5.c ? (ai5.c) mediaInfo : null;
        if (cVar == null) {
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
            W6(cVar, sf3.k.f488932g, a17);
        } else {
            W6(cVar, sf3.k.f488931f, a17);
        }
    }

    @Override // tf3.b
    public void V6() {
        for (java.lang.String str : (java.util.HashSet) ((jz5.n) this.f353853h).mo141623x754a37bb()) {
            ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", "cancel download, id: ".concat(str));
        }
    }

    @Override // tf3.b, sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        super.W4(mediaInfo, listener);
        ai5.c cVar = mediaInfo instanceof ai5.c ? (ai5.c) mediaInfo : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", "updateState mediaId: " + mediaInfo.mo2110x5db1b11());
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", "unknown param: " + mediaInfo.mo2110x5db1b11());
            return;
        }
        ai5.c cVar2 = (ai5.c) mediaInfo;
        sf3.g e17 = cVar2.e();
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", "updateStateInternal failed, param null");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", "image already exists. mediaId: " + cVar2.mo2110x5db1b11() + " path: " + a17.c());
            W6(cVar2, sf3.k.f488930e, a17);
            return;
        }
        long mo78012x3fdd41df = pt0.f0.f439742b1.n(cVar2.f86742c, cVar2.f86741b).mo78012x3fdd41df();
        if (mo78012x3fdd41df > 0 && c01.id.a() - mo78012x3fdd41df > ((java.lang.Number) ((jz5.n) this.f353852g).mo141623x754a37bb()).longValue()) {
            W6(cVar2, sf3.k.f488931f, a17);
            return;
        }
        W6(cVar2, sf3.k.f488929d, a17);
        java.lang.String mo2110x5db1b11 = cVar2.mo2110x5db1b11();
        tt.h d17 = cVar2.d();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.RecordImageStateManager", "download failed, no download param. mediaId: " + mo2110x5db1b11);
            return;
        }
        java.lang.String str2 = d17.f503297a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryStartDownload image mediaId: ");
        sb6.append(cVar2.mo2110x5db1b11());
        sb6.append(" imageKey:");
        sb6.append(str2);
        sb6.append(" path: ");
        java.lang.String str3 = d17.f503300d;
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", sb6.toString());
        if (((java.util.HashSet) ((jz5.n) this.f353853h).mo141623x754a37bb()).add(str2) && (!r26.n0.N(str3))) {
            v65.i.b(this.f500481f, null, new gi5.k(d17, mo2110x5db1b11, str3, this, str2, cVar2, e17, null), 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordImageStateManager", "image already downloading, mediaId: " + mo2110x5db1b11);
    }
}
