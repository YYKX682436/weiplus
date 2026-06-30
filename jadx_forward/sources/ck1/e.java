package ck1;

/* loaded from: classes4.dex */
public final class e implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f123849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 f123850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f123852g;

    public e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 c12720x8e4fa2d4, ck1.k0 k0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de) {
        this.f123849d = c1163xf1deaba4;
        this.f123850e = c12720x8e4fa2d4;
        this.f123851f = k0Var;
        this.f123852g = c1162x665295de;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#initContentArea");
        if (!ck1.n0.f123887a.e((r45.uf7) obj)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#initContentArea, rawUsageInfo is null or invalid");
            return;
        }
        this.f123849d.post(new ck1.d(this.f123851f, this.f123852g));
        this.f123850e.l0().f123908f.mo522xb5bdeb7a(this);
    }
}
