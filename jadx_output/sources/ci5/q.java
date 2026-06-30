package ci5;

/* loaded from: classes12.dex */
public final class q extends tf3.b {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f41773g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f41774h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f41775i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f41773g = new java.util.LinkedHashMap();
        this.f41774h = new java.util.LinkedHashMap();
        this.f41775i = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // sf3.f
    public void I2(mf3.k mediaInfo, java.lang.String path, sf3.l listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(listener, "listener");
        ci5.e eVar = mediaInfo instanceof ci5.e ? (ci5.e) mediaInfo : null;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "refreshState failed, baseMediaInfo null, MediaInfoID: " + mediaInfo.getId());
            return;
        }
        java.lang.String mediaId = mediaInfo.getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407405g;
        linkedHashMap.put(mVar, path);
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(a17.c());
        java.lang.String str = a18.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "image already exists. path: " + path + ", MediaInfoID: " + mediaInfo.getId());
            W6(eVar, sf3.k.f407399g, a17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "image not exists. path: " + path + ", MediaInfoID: " + mediaInfo.getId());
        W6(eVar, sf3.k.f407398f, a17);
    }

    @Override // tf3.b
    public void V6() {
        com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "cancelAllTasks");
        java.util.Map map = this.f41774h;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            this.f41775i.removeCallbacks((java.lang.Runnable) it.next());
        }
        ((java.util.LinkedHashMap) map).clear();
        java.util.Map map2 = this.f41773g;
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map2).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "cancelTask, mediaId: " + str + ",isSuccess : true");
            dn.m mVar = (dn.m) ((java.util.LinkedHashMap) map2).get(str);
            if (mVar != null) {
                mVar.f241787f = null;
            }
        }
        ((java.util.LinkedHashMap) map2).clear();
    }

    @Override // tf3.b, sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        super.W4(mediaInfo, listener);
        ci5.e eVar = mediaInfo instanceof ci5.e ? (ci5.e) mediaInfo : null;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "refreshState failed, baseMediaInfo null, MediaInfoID: " + mediaInfo.getId());
            return;
        }
        dn.j jVar = eVar.f41727c;
        if (jVar == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "refreshState failed, imageTaskInfo null, MediaInfoID: " + mediaInfo.getId());
            return;
        }
        sf3.g e17 = ((ci5.j) eVar).e();
        sf3.g a17 = e17.a(sf3.m.f407404f);
        java.lang.String str = jVar.field_mediaId;
        java.lang.String str2 = jVar.field_fullpath;
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(e17.c());
        java.lang.String str3 = a18.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "image already exists. mediaId: " + str + " path: " + e17.c());
            W6(mediaInfo, sf3.k.f407397e, a17);
            return;
        }
        W6(mediaInfo, sf3.k.f407396d, a17);
        java.util.Map map = this.f41773g;
        if (map.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "task already exists. mediaId: " + str);
            return;
        }
        kotlin.jvm.internal.o.d(str);
        map.put(str, jVar);
        ci5.p pVar = new ci5.p(this, str, mediaInfo, a17);
        this.f41775i.postDelayed(pVar, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        this.f41774h.put(str, pVar);
        jVar.f241787f = new ci5.o(this, str, pVar, str2, mediaInfo, a17, e17);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "addRecvTask success, mediaId=".concat(str));
            return;
        }
        com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "addRecvTask failed, mediaId=".concat(str));
        X6(str);
        W6(mediaInfo, sf3.k.f407398f, e17);
    }

    public final void X6(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.Map map = this.f41773g;
        if (map.containsKey(mediaId)) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "cancelTask, mediaId: " + mediaId + ",isSuccess : true ");
            dn.m mVar = (dn.m) ((java.util.LinkedHashMap) map).get(mediaId);
            if (mVar != null) {
                mVar.f241787f = null;
            }
            map.remove(mediaId);
            java.util.Map map2 = this.f41774h;
            if (map2.containsKey(mediaId)) {
                java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) map2).get(mediaId);
                if (runnable != null) {
                    this.f41775i.removeCallbacks(runnable);
                }
                map2.remove(mediaId);
            }
        }
    }
}
