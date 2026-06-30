package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 f255693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f255694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f255695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var, mj4.h hVar, boolean z17) {
        super(0);
        this.f255693d = q3Var;
        this.f255694e = hVar;
        this.f255695f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = this.f255693d;
        boolean l17 = q3Var.f255722d.l(524288);
        android.content.Context context = q3Var.f255730n;
        cj4.l1 l1Var = q3Var.C;
        mj4.h hVar = this.f255694e;
        if (l17) {
            mj4.h t17 = hVar != null ? ai4.m0.f86706a.G().t(((mj4.k) hVar).l()) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateBtnMore: onClick item expired=");
            sb6.append(t17 != null ? java.lang.Boolean.valueOf(((mj4.k) t17).w()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q3Var.f255723e, sb6.toString());
            if (t17 == null || !(!((mj4.k) t17).w())) {
                l1Var.h(context, hVar);
            } else {
                l1Var.a(context, hVar);
            }
        } else {
            if (q3Var.f255722d.l(1048576) && this.f255695f) {
                l1Var.a(context, hVar);
                qj4.s.m(qj4.s.f445491a, q3Var.f255730n, 37L, null, this.f255694e, 0L, 0L, 0L, 0L, null, null, r6.f102600g, 1012, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
