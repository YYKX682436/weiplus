package c4;

/* loaded from: classes15.dex */
public class x extends c4.u {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.media.MediaBrowserServiceCompat f38348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.f38348f = mediaBrowserServiceCompat;
    }

    @Override // c4.u, c4.o
    public void onCreate() {
        c4.w wVar = new c4.w(this, this.f38348f);
        this.f38339b = wVar;
        wVar.onCreate();
    }
}
