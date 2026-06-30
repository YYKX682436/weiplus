package qa4;

/* loaded from: classes4.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f442611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 f442613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f442614g;

    public d(r45.jj4 jj4Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f442611d = jj4Var;
        this.f442612e = str;
        this.f442613f = m0Var;
        this.f442614g = qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onImageFinish */
    public void mo852x876bfa6f(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f442611d.f459388d)) {
            this.f442613f.v(this);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f442614g.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(this.f442612e));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSetbg */
    public void mo853xb04a0d88(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSetbg", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetbg", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSightFinish */
    public void mo854x822e7131(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageLoader", "onSightFinish: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onThumbFinish */
    public void mo855x8dbd7aaa(java.lang.String mediaId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onThumbFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mediaId, this.f442611d.f459388d)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onThumbFinish: ");
            java.lang.String str = this.f442612e;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageLoader", sb6.toString());
            this.f442613f.v(this);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f442614g.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onThumbFinish", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePathFromMedia$2$1$listener$1");
    }
}
