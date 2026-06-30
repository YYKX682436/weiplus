package xi0;

/* loaded from: classes4.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f536203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 f536205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f536206g;

    public d(r45.jj4 jj4Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f536203d = jj4Var;
        this.f536204e = str;
        this.f536205f = m0Var;
        this.f536206g = qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onImageFinish */
    public void mo852x876bfa6f(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", "onImageFinish: mediaId=" + str + ", isOk=" + z17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f536203d.f459388d)) {
            this.f536205f.v(this);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f536206g.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(this.f536204e));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSetbg */
    public void mo853xb04a0d88(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSightFinish */
    public void mo854x822e7131(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", "onSightFinish: " + str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onThumbFinish */
    public void mo855x8dbd7aaa(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", "onThumbFinish:".concat(mediaId));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mediaId, this.f536203d.f459388d)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onThumbFinish: ");
            java.lang.String str = this.f536204e;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", sb6.toString());
            this.f536205f.v(this);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f536206g.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str));
        }
    }
}
