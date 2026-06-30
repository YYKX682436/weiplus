package ci5;

/* loaded from: classes12.dex */
public final class b0 extends jg3.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f41720f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f41721g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f41722h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f41720f = new java.util.LinkedHashMap();
        this.f41721g = new java.util.LinkedHashMap();
        this.f41722h = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // jg3.b
    public void V6() {
        com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "cancelAllTasks");
        java.util.Map map = this.f41721g;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            this.f41722h.removeCallbacks((java.lang.Runnable) it.next());
        }
        ((java.util.LinkedHashMap) map).clear();
        java.util.Map map2 = this.f41720f;
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map2).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().j(str, new ci5.r(this, str));
        }
        ((java.util.LinkedHashMap) map2).clear();
    }

    public final void Y6(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.Map map = this.f41720f;
        if (map.containsKey(mediaId)) {
            com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "cancel download, id: ".concat(mediaId));
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().j(mediaId, new ci5.s(this, mediaId));
            map.remove(mediaId);
            java.util.Map map2 = this.f41721g;
            if (map2.containsKey(mediaId)) {
                java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) map2).get(mediaId);
                if (runnable != null) {
                    this.f41722h.removeCallbacks(runnable);
                }
                map2.remove(mediaId);
            }
        }
    }

    @Override // jg3.b, gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        super.a5(mediaInfo, listener);
        ci5.j jVar = mediaInfo instanceof ci5.j ? (ci5.j) mediaInfo : null;
        if (jVar == null) {
            return;
        }
        gg3.c a17 = jVar.a();
        dn.o oVar = jVar.f41732d;
        java.lang.String str = oVar.field_mediaId;
        java.lang.String str2 = oVar.field_fullpath;
        com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "updateState mediaId: " + str + ",path: " + str2);
        java.lang.String str3 = a17.f271728c;
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str3);
        java.lang.String str4 = a18.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "video already exists. mediaId: " + str + " path: " + str3);
            jg3.b.X6(this, mediaInfo, gg3.d.f271733e, a17, null, 4, null);
            return;
        }
        jg3.b.X6(this, mediaInfo, gg3.d.f271732d, a17, null, 4, null);
        java.util.Map map = this.f41720f;
        if (map.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "task already exists. mediaId: " + str);
            return;
        }
        kotlin.jvm.internal.o.d(str);
        map.put(str, oVar);
        ci5.a0 a0Var = new ci5.a0(this, str, jVar, a17);
        this.f41722h.postDelayed(a0Var, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        this.f41721g.put(str, a0Var);
        oVar.f241787f = new ci5.x(this, str, a0Var, str2, mediaInfo, a17, jVar);
        ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
        ci5.y yVar = new ci5.y(oVar);
        ci5.z zVar = new ci5.z(this, str, jVar, a17);
        Di.getClass();
        if (str.length() == 0) {
            return;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.n(yVar, str, Di, zVar));
    }

    @Override // jg3.b, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
    }
}
