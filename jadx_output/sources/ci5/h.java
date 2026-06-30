package ci5;

@j95.b
/* loaded from: classes10.dex */
public final class h extends i95.w implements s40.x0 {
    public void wi(android.content.Context context, t40.b config, java.util.List params) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(params, "params");
        if (params.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MediaGallery.FinderLiveGalleryService", "params is empty");
            return;
        }
        java.util.Iterator it = params.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams) it.next()).f66603d != 1) {
                com.tencent.mars.xlog.Log.e("MediaGallery.FinderLiveGalleryService", "only support video");
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.media.MediaGalleryContainerUI.class);
        intent.putParcelableArrayListExtra("FinderLiveGalleryData", new java.util.ArrayList<>(params));
        intent.putExtra("FinderLiveGalleryConfig", config);
        pf5.j0.a(intent, di5.d.class);
        o72.x1.L0(context, "com.tencent.mm.ui.media.MediaGalleryContainerUI", intent, null);
    }
}
