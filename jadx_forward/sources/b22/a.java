package b22;

/* loaded from: classes12.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.m f98908d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f98909e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98910f;

    /* renamed from: g, reason: collision with root package name */
    public z12.l f98911g;

    public a(java.lang.String str) {
        this.f98910f = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
        }
        this.f98909e = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    public void a() {
        z12.l lVar = this.f98911g;
        if (lVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f550862r)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "failed cancel exchange emotion pack.");
            return;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(this.f98911g.f550862r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "success cancel exchange emotion pack clientid:%s", this.f98911g.f550862r);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.m mVar) {
        this.f98908d = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    /* renamed from: equals */
    public boolean mo9637xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof b22.a)) {
            return false;
        }
        b22.a aVar = (b22.a) obj;
        java.lang.String str = this.f98909e;
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.mo9638xb5884f29()) || !str.equals(aVar.mo9638xb5884f29())) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1370x361a9b.l
    /* renamed from: getKey */
    public java.lang.String mo9638xb5884f29() {
        java.lang.String str = this.f98909e;
        return str == null ? "" : str;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        if (this.f98908d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", mo9638xb5884f29());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "call back is null");
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().f1(mo9638xb5884f29(), true);
        if (!this.f98910f && f17 != null && f17.f68402x2261bec0 == 2 && f17.f68401x10a0fed7 == 7) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934 c5324xe5a14934 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934();
            java.lang.String mo9638xb5884f29 = mo9638xb5884f29();
            am.p4 p4Var = c5324xe5a14934.f135636g;
            p4Var.f89136b = mo9638xb5884f29;
            p4Var.f89135a = 2;
            p4Var.f89137c = true;
            c5324xe5a14934.e();
            return;
        }
        java.lang.String str = this.f98909e;
        this.f98911g = new z12.l(str);
        gm0.j1.n().f354821b.g(this.f98911g);
        r45.se3 se3Var = new r45.se3();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        z85.s y07 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().d().y0(str);
        if (y07 != null && (bArr = y07.f65848xad49e234) != null) {
            try {
                se3Var.mo11468x92b714fd(bArr);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        if (se3Var.f467185d == null) {
            gm0.j1.n().f354821b.g(new z12.q(str, 15, -1));
        }
    }

    public a(java.lang.String str, boolean z17) {
        this.f98910f = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
        }
        this.f98909e = str;
        this.f98910f = z17;
    }
}
