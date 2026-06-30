package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 f166120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.me3[] f166121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f166122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 f166123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166124h;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var, r45.me3[] me3VarArr, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var, java.lang.String str) {
        this.f166120d = z6Var;
        this.f166121e = me3VarArr;
        this.f166122f = f4Var;
        this.f166123g = q4Var;
        this.f166124h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var = this.f166120d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(z6Var.f166997g) && z6Var.f167002o) {
            java.lang.Integer a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y6.a(this.f166121e);
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.start, get invalid app_version using needLatestVersion, request=" + z6Var);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j4) this.f166123g.f166598h).mo149xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6.f166020e, "invalid cgi response");
                return;
            }
            i17 = a17.intValue();
        } else {
            i17 = z6Var.f166998h;
        }
        m81.c[] cVarArr = {m81.c.OK, m81.c.ENV_ERR, m81.c.DISK_FULL};
        int i18 = i17;
        ((km5.q) km5.u.d()).n(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x3(this.f166121e, this.f166120d, this.f166123g, i18, this.f166122f, cVarArr)).n(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z3(this.f166121e, this.f166120d, this.f166123g, i18, this.f166122f, cVarArr)).n(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c4(this.f166121e, this.f166123g, this.f166120d, i18, this.f166122f, this.f166124h)).a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d4.f166098a);
    }
}
