package qt3;

/* loaded from: classes8.dex */
public class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f448179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f448180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt3.m f448181f;

    public l(qt3.m mVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        this.f448181f = mVar;
        this.f448179d = context;
        this.f448180e = c16991x15ced046;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = this.f448180e;
        qt3.m mVar = this.f448181f;
        android.content.Context context = this.f448179d;
        if (i17 == 0) {
            java.lang.String str = c16991x15ced046.f237195f;
            mVar.f448182d = str;
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            jd5.a aVar = new jd5.a();
            aVar.p(str);
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            n13.r a17 = n13.r.a(1);
            a17.f415653d.f415672a = 9;
            ((dk5.b0) b0Var).Bi(context, aVar, a17);
            return;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, new qt3.j(this), new qt3.k(this));
                return;
            }
            return;
        }
        java.lang.String str2 = c16991x15ced046.f237195f;
        mVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.g(c5303xc75d2f73, 2, str2);
        c5303xc75d2f73.f135623g.f87860m = 44;
        c5303xc75d2f73.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "[doFavInMM] path:%s", str2);
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9o), 1).show();
        ((android.app.Activity) context).setResult(-1);
        ((android.app.Activity) context).finish();
    }
}
