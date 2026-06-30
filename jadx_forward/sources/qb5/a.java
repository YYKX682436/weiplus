package qb5;

/* loaded from: classes9.dex */
public class a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo.m f442857e;

    public a(qb5.g gVar, java.lang.String str, lo.m mVar) {
        this.f442856d = str;
        this.f442857e = mVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "tryInitAttachInfo errType:%d errCode:%d, errMsg:%s type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (m1Var.mo808xfb85f7b0() != 728) {
            return;
        }
        bt3.i0 i0Var = (bt3.i0) m1Var;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = i0Var.f105819f;
        java.lang.String str2 = dVar != null ? dVar.f68105x2c1f0acb : "";
        java.lang.String str3 = this.f442856d;
        if (!str3.equals(str2)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = i0Var.f105819f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChooseMsgFileCompat", "media:%s is not equal targetMedia:%s", str3, dVar2 != null ? dVar2.f68105x2c1f0acb : "");
            return;
        }
        c01.d9.e().q(728, this);
        lo.m mVar = this.f442857e;
        if (i17 == 0 && i18 == 0) {
            if (mVar != null) {
                ((vv1.g) mVar).a(0, "");
            }
        } else if (mVar != null) {
            ((vv1.g) mVar).a(i18, str);
        }
    }
}
