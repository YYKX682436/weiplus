package ci5;

@j95.b
/* loaded from: classes10.dex */
public final class h extends i95.w implements s40.x0 {
    public void wi(android.content.Context context, t40.b config, java.util.List params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (params.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderLiveGalleryService", "params is empty");
            return;
        }
        java.util.Iterator it = params.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646) it.next()).f148136d != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderLiveGalleryService", "only support video");
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
        intent.putParcelableArrayListExtra("FinderLiveGalleryData", new java.util.ArrayList<>(params));
        intent.putExtra("FinderLiveGalleryConfig", config);
        pf5.j0.a(intent, di5.d.class);
        o72.x1.L0(context, "com.tencent.mm.ui.media.MediaGalleryContainerUI", intent, null);
    }
}
