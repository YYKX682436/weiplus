package gf;

/* loaded from: classes7.dex */
public final class h implements com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe f352614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f352615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f352616c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f352617d;

    public h(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var) {
        this.f352614a = c3955x2d990bfe;
        this.f352615b = yVar;
        this.f352616c = i17;
        this.f352617d = f0Var;
    }

    @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25561xb8af7aac
    /* renamed from: onDone */
    public void mo95651xc3989e01() {
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = this.f352614a;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f352615b;
        c3955x2d990bfe.d(yVar, false);
        if (!c3955x2d990bfe.f129250m) {
            c3955x2d990bfe.e(new gf.p(yVar));
            c3955x2d990bfe.f129250m = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppServiceSkylineExtensionImpl", "SkylineGlobalReady " + this.f352616c);
        this.f352614a.f129244g = true;
        if (this.f352614a.f129245h) {
            this.f352617d.k0(new gf.g(this.f352614a));
        }
    }
}
