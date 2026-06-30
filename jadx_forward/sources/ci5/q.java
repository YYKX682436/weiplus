package ci5;

/* loaded from: classes12.dex */
public final class q extends tf3.b {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f123306g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f123307h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f123308i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123306g = new java.util.LinkedHashMap();
        this.f123307h = new java.util.LinkedHashMap();
        this.f123308i = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // sf3.f
    public void I2(mf3.k mediaInfo, java.lang.String path, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ci5.e eVar = mediaInfo instanceof ci5.e ? (ci5.e) mediaInfo : null;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "refreshState failed, baseMediaInfo null, MediaInfoID: " + mediaInfo.mo2110x5db1b11());
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "image already exists. path: " + path + ", MediaInfoID: " + mediaInfo.mo2110x5db1b11());
            W6(eVar, sf3.k.f488932g, a17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "image not exists. path: " + path + ", MediaInfoID: " + mediaInfo.mo2110x5db1b11());
        W6(eVar, sf3.k.f488931f, a17);
    }

    @Override // tf3.b
    public void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "cancelAllTasks");
        java.util.Map map = this.f123307h;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            this.f123308i.removeCallbacks((java.lang.Runnable) it.next());
        }
        ((java.util.LinkedHashMap) map).clear();
        java.util.Map map2 = this.f123306g;
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map2).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "cancelTask, mediaId: " + str + ",isSuccess : true");
            dn.m mVar = (dn.m) ((java.util.LinkedHashMap) map2).get(str);
            if (mVar != null) {
                mVar.f323320f = null;
            }
        }
        ((java.util.LinkedHashMap) map2).clear();
    }

    @Override // tf3.b, sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        super.W4(mediaInfo, listener);
        ci5.e eVar = mediaInfo instanceof ci5.e ? (ci5.e) mediaInfo : null;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "refreshState failed, baseMediaInfo null, MediaInfoID: " + mediaInfo.mo2110x5db1b11());
            return;
        }
        dn.j jVar = eVar.f123260c;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "refreshState failed, imageTaskInfo null, MediaInfoID: " + mediaInfo.mo2110x5db1b11());
            return;
        }
        sf3.g e17 = ((ci5.j) eVar).e();
        sf3.g a17 = e17.a(sf3.m.f488937f);
        java.lang.String str = jVar.f69601xaca5bdda;
        java.lang.String str2 = jVar.f69595x6d25b0d9;
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(e17.c());
        java.lang.String str3 = a18.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "image already exists. mediaId: " + str + " path: " + e17.c());
            W6(mediaInfo, sf3.k.f488930e, a17);
            return;
        }
        W6(mediaInfo, sf3.k.f488929d, a17);
        java.util.Map map = this.f123306g;
        if (map.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "task already exists. mediaId: " + str);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        map.put(str, jVar);
        ci5.p pVar = new ci5.p(this, str, mediaInfo, a17);
        this.f123308i.postDelayed(pVar, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        this.f123307h.put(str, pVar);
        jVar.f323320f = new ci5.o(this, str, pVar, str2, mediaInfo, a17, e17);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "addRecvTask success, mediaId=".concat(str));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "addRecvTask failed, mediaId=".concat(str));
        X6(str);
        W6(mediaInfo, sf3.k.f488931f, e17);
    }

    public final void X6(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.Map map = this.f123306g;
        if (map.containsKey(mediaId)) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "cancelTask, mediaId: " + mediaId + ",isSuccess : true ");
            dn.m mVar = (dn.m) ((java.util.LinkedHashMap) map).get(mediaId);
            if (mVar != null) {
                mVar.f323320f = null;
            }
            map.remove(mediaId);
            java.util.Map map2 = this.f123307h;
            if (map2.containsKey(mediaId)) {
                java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) map2).get(mediaId);
                if (runnable != null) {
                    this.f123308i.removeCallbacks(runnable);
                }
                map2.remove(mediaId);
            }
        }
    }
}
