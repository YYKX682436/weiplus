package gi5;

/* loaded from: classes12.dex */
public final class v extends jg3.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f353870f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f353871g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f353872h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f353870f = new java.util.LinkedHashMap();
        this.f353871g = jz5.h.b(gi5.s.f353858d);
        this.f353872h = jz5.h.b(gi5.r.f353857d);
    }

    @Override // jg3.b
    public void V6() {
        for (java.lang.String str : (java.util.HashSet) ((jz5.n) this.f353871g).mo141623x754a37bb()) {
            ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordVideoStateManager", "cancel download, id: ".concat(str));
        }
    }

    @Override // jg3.b, gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        gg3.c a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        super.a5(mediaInfo, listener);
        ai5.c cVar = mediaInfo instanceof ai5.c ? (ai5.c) mediaInfo : null;
        if (cVar == null || (a17 = mediaInfo.a()) == null) {
            return;
        }
        mediaInfo.mo2110x5db1b11();
        tt.h i17 = cVar.i();
        if (i17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.RecordVideoStateManager", "updateState failed, downloadParam null. mediaId: " + mediaInfo.mo2110x5db1b11());
            return;
        }
        java.lang.String mo2110x5db1b11 = mediaInfo.mo2110x5db1b11();
        gi5.u uVar = new gi5.u(mediaInfo, this, a17);
        this.f353870f.put(mo2110x5db1b11, uVar);
        i17.f503305i = new java.lang.ref.WeakReference(uVar);
        java.lang.String str = i17.f503300d;
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a18.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordVideoStateManager", "video already exists. mediaId: " + mediaInfo.mo2110x5db1b11() + " path: " + str);
            jg3.b.X6(this, mediaInfo, gg3.d.f353266e, a17, null, 4, null);
            return;
        }
        long mo78012x3fdd41df = pt0.f0.f439742b1.n(cVar.f86742c, cVar.f86741b).mo78012x3fdd41df();
        if (mo78012x3fdd41df > 0 && c01.id.a() - mo78012x3fdd41df > ((java.lang.Number) ((jz5.n) this.f353872h).mo141623x754a37bb()).longValue()) {
            jg3.b.X6(this, mediaInfo, gg3.d.f353267f, a17, null, 4, null);
            return;
        }
        jg3.b.X6(this, mediaInfo, gg3.d.f353265d, a17, null, 4, null);
        java.lang.String mo2110x5db1b112 = cVar.mo2110x5db1b11();
        java.lang.String str3 = i17.f503297a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordVideoStateManager", "tryStartDownload video mediaId: " + cVar.mo2110x5db1b11() + " videoKey:" + str3 + " path: " + str);
        if (((java.util.HashSet) ((jz5.n) this.f353871g).mo141623x754a37bb()).add(str3) && (!r26.n0.N(str))) {
            v65.i.b(this.f381187e, null, new gi5.t(i17, mo2110x5db1b112, str, this, str3, cVar, a17, null), 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordVideoStateManager", "already downloading, mediaId: " + mo2110x5db1b112);
    }

    @Override // jg3.b, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
    }
}
