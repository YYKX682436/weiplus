package vr3;

/* loaded from: classes11.dex */
public final class o implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f521172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f521173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.j0 f521174f;

    public o(yz5.l lVar, yz5.l lVar2, p012xc85e97e9.p093xedfae76a.j0 j0Var) {
        this.f521172d = lVar;
        this.f521173e = lVar2;
        this.f521174f = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        r45.wl wlVar = fVar instanceof r45.wl ? (r45.wl) fVar : null;
        yz5.l lVar = this.f521172d;
        if (i17 != 0 || i18 != 0 || wlVar == null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            gr3.c.c(55L);
            return 0;
        }
        yz5.l lVar2 = this.f521173e;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(wlVar);
        }
        r45.wl wlVar2 = new r45.wl();
        wlVar2.mo11468x92b714fd(wlVar.mo14344x5f01b1f6());
        this.f521174f.mo523x53d8522f(wlVar2);
        lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        return 0;
    }
}
