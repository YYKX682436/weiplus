package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class u30 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f196047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f196048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f196049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f196050g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, k91.v5 v5Var, android.content.Context context, cm2.b0 b0Var) {
        super(0);
        this.f196047d = h0Var;
        this.f196048e = v5Var;
        this.f196049f = context;
        this.f196050g = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        ((az2.f) this.f196047d.f391656d).b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        cm2.b0 b0Var = this.f196050g;
        android.content.Context context = this.f196049f;
        jz5.f0 f0Var2 = null;
        k91.v5 v5Var = this.f196048e;
        if (v5Var != null && (str = v5Var.f68913x21f9b213) != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar.f293262s = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3r, str);
                aVar.A = false;
                aVar.f293265v = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3p);
                aVar.f293266w = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m3q);
                aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s30(context, b0Var);
                aVar.F = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t30.f195870d;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var.e(aVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f293370r);
                }
                j0Var.show();
                f0Var2 = f0Var;
            }
        }
        if (f0Var2 == null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = b0Var.f124864v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(info);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        return f0Var;
    }
}
