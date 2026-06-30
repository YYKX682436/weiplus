package ci5;

/* loaded from: classes12.dex */
public final class b0 extends jg3.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f123253f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f123254g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f123255h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123253f = new java.util.LinkedHashMap();
        this.f123254g = new java.util.LinkedHashMap();
        this.f123255h = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // jg3.b
    public void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "cancelAllTasks");
        java.util.Map map = this.f123254g;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            this.f123255h.removeCallbacks((java.lang.Runnable) it.next());
        }
        ((java.util.LinkedHashMap) map).clear();
        java.util.Map map2 = this.f123253f;
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map2).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().j(str, new ci5.r(this, str));
        }
        ((java.util.LinkedHashMap) map2).clear();
    }

    public final void Y6(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.Map map = this.f123253f;
        if (map.containsKey(mediaId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "cancel download, id: ".concat(mediaId));
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().j(mediaId, new ci5.s(this, mediaId));
            map.remove(mediaId);
            java.util.Map map2 = this.f123254g;
            if (map2.containsKey(mediaId)) {
                java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) map2).get(mediaId);
                if (runnable != null) {
                    this.f123255h.removeCallbacks(runnable);
                }
                map2.remove(mediaId);
            }
        }
    }

    @Override // jg3.b, gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        super.a5(mediaInfo, listener);
        ci5.j jVar = mediaInfo instanceof ci5.j ? (ci5.j) mediaInfo : null;
        if (jVar == null) {
            return;
        }
        gg3.c a17 = jVar.a();
        dn.o oVar = jVar.f123265d;
        java.lang.String str = oVar.f69601xaca5bdda;
        java.lang.String str2 = oVar.f69595x6d25b0d9;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "updateState mediaId: " + str + ",path: " + str2);
        java.lang.String str3 = a17.f353261c;
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str3);
        java.lang.String str4 = a18.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "video already exists. mediaId: " + str + " path: " + str3);
            jg3.b.X6(this, mediaInfo, gg3.d.f353266e, a17, null, 4, null);
            return;
        }
        jg3.b.X6(this, mediaInfo, gg3.d.f353265d, a17, null, 4, null);
        java.util.Map map = this.f123253f;
        if (map.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "task already exists. mediaId: " + str);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        map.put(str, oVar);
        ci5.a0 a0Var = new ci5.a0(this, str, jVar, a17);
        this.f123255h.postDelayed(a0Var, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        this.f123254g.put(str, a0Var);
        oVar.f323320f = new ci5.x(this, str, a0Var, str2, mediaInfo, a17, jVar);
        ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
        ci5.y yVar = new ci5.y(oVar);
        ci5.z zVar = new ci5.z(this, str, jVar, a17);
        Di.getClass();
        if (str.length() == 0) {
            return;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.n(yVar, str, Di, zVar));
    }

    @Override // jg3.b, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
    }
}
