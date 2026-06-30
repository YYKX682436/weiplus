package c4;

/* loaded from: classes15.dex */
public class w extends c4.t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c4.x f38347f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c4.x xVar, android.content.Context context) {
        super(xVar, context);
        this.f38347f = xVar;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result result, android.os.Bundle bundle) {
        android.support.v4.media.session.f0.a(bundle);
        c4.x xVar = this.f38347f;
        androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = xVar.f38348f;
        c4.n nVar = mediaBrowserServiceCompat.f11703e;
        mediaBrowserServiceCompat.getClass();
        c4.a0 a0Var = new c4.a0(result);
        xVar.getClass();
        c4.v vVar = new c4.v(xVar, str, a0Var, bundle);
        androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat2 = xVar.f38348f;
        c4.n nVar2 = mediaBrowserServiceCompat2.f11703e;
        vVar.f38352d = 1;
        mediaBrowserServiceCompat2.c(str, vVar);
        xVar.f38348f.getClass();
    }
}
