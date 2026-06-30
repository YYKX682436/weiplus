package qr;

/* loaded from: classes12.dex */
public class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.uu6 f447563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f447564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr.r f447565c;

    public p(qr.r rVar, r45.uu6 uu6Var, boolean z17) {
        this.f447565c = rVar;
        this.f447563a = uu6Var;
        this.f447564b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadCDN", "prepare callback: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        qr.r rVar = this.f447565c;
        if (i17 != 0 || i18 != 0) {
            rVar.c();
            return null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        java.lang.String i19 = (fVar2 == null || (gVar = ((r45.yt6) fVar2).f472902d) == null) ? "" : gVar.i();
        r45.uu6 uu6Var = this.f447563a;
        boolean z17 = uu6Var == null ? false : uu6Var.f469186d;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoticon_custom_add_from_album_userid_android, false)) {
            z17 = z17 || this.f447564b;
        }
        qr.s sVar = new qr.s();
        sVar.f447575a = i19;
        sVar.f447576b = z17;
        qr.r.e(rVar, sVar);
        return null;
    }
}
