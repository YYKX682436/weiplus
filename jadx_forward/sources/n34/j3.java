package n34;

/* loaded from: classes4.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f416176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f416177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f416178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416179g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, int i17, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f416176d = u3Var;
        this.f416177e = i17;
        this.f416178f = context;
        this.f416179g = c17933xe8d1b226;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        n34.j3 j3Var = new n34.j3(this.f416176d, this.f416177e, this.f416178f, this.f416179g, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        return j3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        java.lang.Object mo150x989b7ca4 = ((n34.j3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f416176d.dismiss();
        if (this.f416177e == 1) {
            android.content.Context context = this.f416178f;
            db5.t7.e(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jf7), com.p314xaae8f345.mm.R.raw.f81099xac84f24);
            ta4.g1.f498280a.a(1, 2, this.f416179g);
        } else {
            this.f416178f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jey);
            android.content.Context context2 = this.f416178f;
            db5.t7.e(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jey), com.p314xaae8f345.mm.R.raw.f81100xc230f9d4);
            ta4.g1.f498280a.a(2, 2, this.f416179g);
        }
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        long j17 = this.f416179g.f68891x29d1292e;
        o75.b bVar = o75.b.f425114b;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(gVar.i7(j17, o75.b.f425116d));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$1");
        return valueOf;
    }
}
