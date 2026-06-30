package sh5;

/* loaded from: classes12.dex */
public final class b extends lf3.n implements gg3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        gg3.c a17 = mediaInfo.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DiskVideoStateManager", "updateState failed, param null");
        } else if (com.p314xaae8f345.mm.vfs.w6.j(a17.f353261c)) {
            gg3.f.x(listener, a17, gg3.d.f353266e, null, 4, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DiskVideoStateManager", "updateState: onLoad");
        } else {
            gg3.f.x(listener, a17, gg3.d.f353267f, null, 4, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DiskVideoStateManager", "updateState: onVideoLoadFailed");
        }
    }
}
