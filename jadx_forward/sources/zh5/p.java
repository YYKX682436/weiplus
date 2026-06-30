package zh5;

/* loaded from: classes12.dex */
public final class p extends jg3.b {

    /* renamed from: f, reason: collision with root package name */
    public final zh5.k f554590f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f554591g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f554592h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f554590f = new zh5.k();
        this.f554591g = new java.util.LinkedHashMap();
        this.f554592h = jz5.h.b(zh5.m.f554575d);
    }

    @Override // jg3.b
    public void V6() {
        for (java.lang.String str : (java.util.HashSet) ((jz5.n) this.f554592h).mo141623x754a37bb()) {
            this.f554590f.a(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNVideoStateManager", "cancel download, id: ".concat(str));
        }
    }

    @Override // jg3.b, gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        gg3.c a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        super.a5(mediaInfo, listener);
        zh5.x xVar = mediaInfo instanceof zh5.x ? (zh5.x) mediaInfo : null;
        if (xVar == null || (a17 = mediaInfo.a()) == null) {
            return;
        }
        mediaInfo.mo2110x5db1b11();
        dn.m d17 = xVar.d();
        java.lang.String str = xVar.f554528e;
        java.lang.String str2 = xVar.f554524a;
        zh5.l lVar = new zh5.l(str2, str, d17);
        java.lang.String mo2110x5db1b11 = mediaInfo.mo2110x5db1b11();
        zh5.o oVar = new zh5.o(mediaInfo, this, a17);
        this.f554591g.put(mo2110x5db1b11, oVar);
        lVar.f554574d = new java.lang.ref.WeakReference(oVar);
        java.lang.String str3 = lVar.f554572b;
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str3);
        java.lang.String str4 = a18.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNVideoStateManager", "video already exists. mediaId: " + mediaInfo.mo2110x5db1b11() + " path: " + str3);
            jg3.b.X6(this, mediaInfo, gg3.d.f353266e, a17, null, 4, null);
            return;
        }
        jg3.b.X6(this, mediaInfo, gg3.d.f353265d, a17, null, 4, null);
        java.lang.String str5 = xVar.f554524a;
        java.lang.String str6 = lVar.f554571a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNVideoStateManager", "tryStartDownload video mediaId: " + str2 + " videoKey:" + str6 + " path: " + str3);
        if (((java.util.HashSet) ((jz5.n) this.f554592h).mo141623x754a37bb()).add(str6) && (!r26.n0.N(str3))) {
            v65.i.b(this.f381187e, null, new zh5.n(this, lVar, str5, str3, str6, xVar, a17, null), 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CDNVideoStateManager", "already downloading, mediaId: " + str5);
    }

    @Override // jg3.b, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
    }
}
