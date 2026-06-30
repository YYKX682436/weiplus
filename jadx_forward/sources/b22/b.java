package b22;

/* loaded from: classes12.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.m f98912d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f98913e;

    public b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "[cpan] empty productid");
        }
        this.f98913e = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.m mVar) {
        this.f98912d = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    /* renamed from: equals */
    public boolean mo9637xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof b22.b)) {
            return false;
        }
        b22.b bVar = (b22.b) obj;
        java.lang.String str = this.f98913e;
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.mo9638xb5884f29()) || !str.equals(bVar.mo9638xb5884f29())) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    /* renamed from: getKey */
    public java.lang.String mo9638xb5884f29() {
        java.lang.String str = this.f98913e;
        return str == null ? "" : str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f98912d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", mo9638xb5884f29());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "call back is null");
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().f1("17", false);
        f17.f68378x225ba391 = 0;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().mo11260x413cb2b4(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.m mVar = this.f98912d;
        if (mVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.k) mVar).d(mo9638xb5884f29(), 2, true);
        }
    }
}
