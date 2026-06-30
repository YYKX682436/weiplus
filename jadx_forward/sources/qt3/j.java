package qt3;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt3.l f448177d;

    public j(qt3.l lVar) {
        this.f448177d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "save pic ,imageState : %s", valueOf);
        java.lang.Boolean bool = (java.lang.Boolean) this.f448177d.f448180e.a().b("KEY_PHOTO_IS_EDITED_BOOLEAN", java.lang.Boolean.TRUE);
        if (!valueOf.booleanValue() || !bool.booleanValue()) {
            ((ku5.t0) ku5.t0.f394148d).g(new qt3.i(this));
        }
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f448177d.f448179d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572693c62, q75.c.d()), 1).show();
        ((android.app.Activity) this.f448177d.f448179d).setResult(-1);
        ((android.app.Activity) this.f448177d.f448179d).finish();
    }
}
