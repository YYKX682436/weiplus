package b22;

/* loaded from: classes12.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.m f98914d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f98915e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f98916f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f98917g;

    public c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BKGLoader.EmojiUploadTask", "[cpan] can not create task. md5 is null.");
        }
        this.f98915e = str;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        this.f98917g = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.m mVar) {
        this.f98914d = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    /* renamed from: equals */
    public boolean mo9637xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof b22.c)) {
            return false;
        }
        b22.c cVar = (b22.c) obj;
        java.lang.String str = this.f98915e;
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f98915e) || !str.equals(cVar.f98915e)) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    /* renamed from: getKey */
    public java.lang.String mo9638xb5884f29() {
        return this.f98915e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.m mVar = this.f98914d;
        java.lang.String str = this.f98915e;
        if (mVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BKGLoader.EmojiUploadTask", "call back is null.");
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f98917g;
        if (c21053xdbf1e5f4 == null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k) this.f98914d).d(str, 1, false);
        } else {
            this.f98916f = new z12.j(c21053xdbf1e5f4);
            gm0.j1.n().f354821b.g(this.f98916f);
        }
    }
}
