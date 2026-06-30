package c4;

/* loaded from: classes15.dex */
public abstract class r extends android.service.media.MediaBrowserService {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.s f38334d;

    public r(c4.s sVar, android.content.Context context) {
        this.f38334d = sVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String str, int i17, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        int i18;
        c4.l lVar;
        android.support.v4.media.session.f fVar;
        android.support.v4.media.session.f0.a(bundle);
        android.os.Bundle bundle3 = bundle == null ? null : new android.os.Bundle(bundle);
        c4.s sVar = this.f38334d;
        androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = sVar.f38341d;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
            i18 = -1;
        } else {
            bundle3.remove("extra_client_version");
            sVar.f38340c = new android.os.Messenger(mediaBrowserServiceCompat.f11706h);
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putInt("extra_service_version", 2);
            j3.e.b(bundle4, "extra_messenger", sVar.f38340c.getBinder());
            android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = mediaBrowserServiceCompat.f11707i;
            if (mediaSessionCompat$Token != null) {
                synchronized (mediaSessionCompat$Token.f8943d) {
                    fVar = mediaSessionCompat$Token.f8945f;
                }
                j3.e.b(bundle4, "extra_session_binder", fVar == null ? null : fVar.asBinder());
            } else {
                ((java.util.ArrayList) sVar.f38338a).add(bundle4);
            }
            int i19 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i18 = i19;
            bundle2 = bundle4;
        }
        c4.n nVar = new c4.n(sVar.f38341d, str, i18, i17, bundle3, null);
        mediaBrowserServiceCompat.getClass();
        c4.l b17 = mediaBrowserServiceCompat.b(str, i17, bundle3);
        if (b17 == null) {
            lVar = null;
        } else {
            if (sVar.f38340c != null) {
                mediaBrowserServiceCompat.f11704f.add(nVar);
            }
            android.os.Bundle bundle5 = b17.f38319b;
            if (bundle2 == null) {
                bundle2 = bundle5;
            } else if (bundle5 != null) {
                bundle2.putAll(bundle5);
            }
            lVar = new c4.l(b17.f38318a, bundle2);
        }
        if (lVar == null) {
            return null;
        }
        return new android.service.media.MediaBrowserService.BrowserRoot(lVar.f38318a, lVar.f38319b);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result result) {
        c4.a0 a0Var = new c4.a0(result);
        c4.s sVar = this.f38334d;
        sVar.getClass();
        c4.q qVar = new c4.q(sVar, str, a0Var);
        androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat = sVar.f38341d;
        c4.n nVar = mediaBrowserServiceCompat.f11703e;
        mediaBrowserServiceCompat.c(str, qVar);
    }
}
