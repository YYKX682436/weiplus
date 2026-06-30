package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class m0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI f283472h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        super(dVar, a0Var);
        this.f283472h = appBrandServiceChattingFmUI;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r0, com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17;
        java.lang.String str;
        if (f9Var.J2()) {
            super.a(view, dVar, f9Var);
            return;
        }
        if (!f9Var.k2()) {
            super.a(view, dVar, f9Var);
            return;
        }
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = this.f283472h;
        if (appBrandServiceChattingFmUI.N == 2 && v17.f430199i == 33 && (str = appBrandServiceChattingFmUI.P.f159011d) != null && str.equals(v17.f430210k2)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI.n1(appBrandServiceChattingFmUI, v17.f430202i2);
        } else {
            super.a(view, dVar, f9Var);
        }
    }
}
