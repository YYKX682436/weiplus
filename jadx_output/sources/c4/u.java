package c4;

/* loaded from: classes15.dex */
public class u extends c4.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.media.MediaBrowserServiceCompat f38343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.f38343e = mediaBrowserServiceCompat;
    }

    @Override // c4.o
    public void onCreate() {
        c4.t tVar = new c4.t(this, this.f38343e);
        this.f38339b = tVar;
        tVar.onCreate();
    }
}
