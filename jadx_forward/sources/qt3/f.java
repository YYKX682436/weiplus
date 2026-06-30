package qt3;

/* loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt3.g f448171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f448172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f448173f;

    public f(qt3.g gVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        this.f448171d = gVar;
        this.f448172e = context;
        this.f448173f = c16991x15ced046;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qt3.g gVar = this.f448171d;
        android.content.Context context = this.f448172e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = this.f448173f;
        gVar.getClass();
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "handleSaveMediaToLocalWithPermission save pic, imageState : %s", java.lang.Boolean.valueOf(o17));
        java.lang.Boolean bool = (java.lang.Boolean) c16991x15ced046.a().b("KEY_PHOTO_IS_EDITED_BOOLEAN", java.lang.Boolean.TRUE);
        if (!o17 || !bool.booleanValue()) {
            ((ku5.t0) ku5.t0.f394148d).g(new qt3.b(c16991x15ced046));
        }
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572693c62, q75.c.d()), 1).show();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
    }
}
