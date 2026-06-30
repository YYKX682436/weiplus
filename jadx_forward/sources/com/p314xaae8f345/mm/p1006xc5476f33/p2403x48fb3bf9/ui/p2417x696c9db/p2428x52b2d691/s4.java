package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class s4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268047e;

    public s4(nw4.k kVar, nw4.y2 y2Var) {
        this.f268046d = kVar;
        this.f268047e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19433xdbdb1298 c19433xdbdb1298 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19433xdbdb1298) obj;
        boolean z17 = c19433xdbdb1298.f267409d;
        nw4.k kVar = this.f268046d;
        nw4.y2 y2Var = this.f268047e;
        if (!z17) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", kz5.b1.e(new jz5.l("err_desc", c19433xdbdb1298.f267413h)));
            return;
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("nick_name", c19433xdbdb1298.f267410e), new jz5.l("head_img_url", c19433xdbdb1298.f267411f), new jz5.l("user_name", c19433xdbdb1298.f267412g));
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", k17);
    }
}
