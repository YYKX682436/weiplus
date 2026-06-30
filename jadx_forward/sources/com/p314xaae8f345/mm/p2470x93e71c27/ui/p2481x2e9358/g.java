package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class g implements db5.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 f271856a;

    public g(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083) {
        this.f271856a = c19664x489a3083;
    }

    @Override // db5.y1
    public void a(int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083 = this.f271856a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppPanel", "onMeasure width: %d, heigth:%d, isMeasured:%b, gridWidth:%d, gridHeight:%d", valueOf, valueOf2, java.lang.Boolean.valueOf(c19664x489a3083.f271477v), java.lang.Integer.valueOf(c19664x489a3083.f271475t), java.lang.Integer.valueOf(c19664x489a3083.f271476u));
        if ((c19664x489a3083.f271477v && java.lang.Math.abs(c19664x489a3083.f271476u - i18) < 10) || i18 == 0 || i17 == 0) {
            return;
        }
        c19664x489a3083.m75406x60c5290e();
        c19664x489a3083.f271477v = true;
        c19664x489a3083.f271476u = i18;
        c19664x489a3083.f271475t = i17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083.n(c19664x489a3083);
    }
}
