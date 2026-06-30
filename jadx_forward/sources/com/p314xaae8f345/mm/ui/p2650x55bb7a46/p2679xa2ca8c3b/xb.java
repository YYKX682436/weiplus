package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class xb extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Pair f287511d;

    /* renamed from: e, reason: collision with root package name */
    public int f287512e;

    public xb(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar) {
        super(f9Var, context, qVar);
        this.f287512e = 0;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null && v17.f430199i == 57) {
            ti3.l f17 = ti3.i.f(context, 0.0f, f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.b(qVar.f542278d, qVar.f542275a, f9Var.m124847x74d37ac6(), f9Var.Q0(), v17.f430258w2, "handleQuoteMsgFillingFrom"), v17.f430258w2), v17.f430258w2);
            this.f287511d = new android.util.Pair(java.lang.Boolean.valueOf(f17.f501159a), f17.f501160b);
        }
        this.f287512e = go.d.f355229a.d(f9Var.Q0(), f9Var.m124847x74d37ac6());
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    public boolean U(java.lang.Object obj) {
        android.util.Pair pair;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xb xbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xb) obj;
        android.util.Pair pair2 = this.f287511d;
        if (pair2 == null && xbVar.f287511d == null) {
            return true;
        }
        if (pair2 == null || (pair = xbVar.f287511d) == null || pair2.first != pair.first || this.f287512e != xbVar.f287512e) {
            return false;
        }
        return android.text.TextUtils.equals((java.lang.CharSequence) pair2.second, (java.lang.CharSequence) pair.second);
    }
}
