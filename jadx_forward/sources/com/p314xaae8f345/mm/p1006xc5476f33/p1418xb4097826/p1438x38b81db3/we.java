package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class we extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 f186399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f186400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 f186401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f186402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.d1 f186403h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff902, so2.d1 d1Var) {
        super(0);
        this.f186399d = c15401xb8016041;
        this.f186400e = c15178x4303ff90;
        this.f186401f = c14493xfdc11530;
        this.f186402g = c15178x4303ff902;
        this.f186403h = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = this.f186399d;
        boolean z17 = c15401xb8016041.f213857v || this.f186400e.T;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 musicPlayer = this.f186401f;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(musicPlayer, "$musicPlayer");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530.f202962r;
            musicPlayer.d(false);
            c15401xb8016041.o();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m4 m4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m4) kz5.n0.k0(c15401xb8016041.m62719xa072572a());
            if (m4Var != null) {
                m4Var.f206670f = 1;
            }
            musicPlayer.setTag(com.p314xaae8f345.mm.R.id.fun, java.lang.Boolean.FALSE);
        } else {
            musicPlayer.setTag(com.p314xaae8f345.mm.R.id.fun, java.lang.Boolean.TRUE);
            musicPlayer.e();
            c15401xb8016041.m();
        }
        this.f186402g.m61289x1980547e(!z17);
        this.f186403h.f491843d = z17;
        return java.lang.Boolean.valueOf(z17);
    }
}
