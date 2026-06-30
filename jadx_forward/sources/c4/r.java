package c4;

/* loaded from: classes15.dex */
public abstract class r extends android.service.media.MediaBrowserService {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.s f119867d;

    public r(c4.s sVar, android.content.Context context) {
        this.f119867d = sVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String str, int i17, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        int i18;
        c4.l lVar;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f fVar;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
        android.os.Bundle bundle3 = bundle == null ? null : new android.os.Bundle(bundle);
        c4.s sVar = this.f119867d;
        p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33 = sVar.f119874d;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
            i18 = -1;
        } else {
            bundle3.remove("extra_client_version");
            sVar.f119873c = new android.os.Messenger(abstractServiceC1134x1ae0da33.f93239h);
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putInt("extra_service_version", 2);
            j3.e.b(bundle4, "extra_messenger", sVar.f119873c.getBinder());
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989 = abstractServiceC1134x1ae0da33.f93240i;
            if (c0047xab30f989 != null) {
                synchronized (c0047xab30f989.f90476d) {
                    fVar = c0047xab30f989.f90478f;
                }
                j3.e.b(bundle4, "extra_session_binder", fVar == null ? null : fVar.asBinder());
            } else {
                ((java.util.ArrayList) sVar.f119871a).add(bundle4);
            }
            int i19 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i18 = i19;
            bundle2 = bundle4;
        }
        c4.n nVar = new c4.n(sVar.f119874d, str, i18, i17, bundle3, null);
        abstractServiceC1134x1ae0da33.getClass();
        c4.l b17 = abstractServiceC1134x1ae0da33.b(str, i17, bundle3);
        if (b17 == null) {
            lVar = null;
        } else {
            if (sVar.f119873c != null) {
                abstractServiceC1134x1ae0da33.f93237f.add(nVar);
            }
            android.os.Bundle bundle5 = b17.f119852b;
            if (bundle2 == null) {
                bundle2 = bundle5;
            } else if (bundle5 != null) {
                bundle2.putAll(bundle5);
            }
            lVar = new c4.l(b17.f119851a, bundle2);
        }
        if (lVar == null) {
            return null;
        }
        return new android.service.media.MediaBrowserService.BrowserRoot(lVar.f119851a, lVar.f119852b);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(java.lang.String str, android.service.media.MediaBrowserService.Result result) {
        c4.a0 a0Var = new c4.a0(result);
        c4.s sVar = this.f119867d;
        sVar.getClass();
        c4.q qVar = new c4.q(sVar, str, a0Var);
        p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 abstractServiceC1134x1ae0da33 = sVar.f119874d;
        c4.n nVar = abstractServiceC1134x1ae0da33.f93236e;
        abstractServiceC1134x1ae0da33.c(str, qVar);
    }
}
