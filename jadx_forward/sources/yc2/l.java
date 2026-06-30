package yc2;

/* loaded from: classes2.dex */
public final class l extends yc2.c {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f542368g = jz5.h.b(new yc2.k(this));

    @Override // yc2.c
    public java.lang.String v() {
        android.content.Context context;
        android.content.res.Resources resources;
        in5.s0 s0Var = this.f534694a;
        java.lang.String string = (s0Var == null || (context = s0Var.f374654e) == null || (resources = context.getResources()) == null) ? null : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5q);
        return string == null ? "" : string;
    }

    @Override // yc2.c
    public java.lang.String w() {
        android.content.Context context;
        android.content.res.Resources resources;
        in5.s0 s0Var = this.f534694a;
        java.lang.String string = (s0Var == null || (context = s0Var.f374654e) == null || (resources = context.getResources()) == null) ? null : resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575332p43);
        return string == null ? "" : string;
    }

    @Override // yc2.c
    public java.util.Map x(yc2.b bVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        xc2.p0 p0Var = this.f534695b;
        if (p0Var == null || (abstractC14490x69736cb5 = p0Var.f534777f) == null || (str = jz5.x.a(abstractC14490x69736cb5.mo2128x1ed62e84())) == null) {
            str = "0";
        }
        linkedHashMap.put("feed_id", str);
        if (bVar != null) {
            linkedHashMap.put("post_ip_clk_area", java.lang.String.valueOf(bVar.f542361d));
        }
        return linkedHashMap;
    }

    @Override // yc2.c
    public java.lang.String y() {
        return "post_ip_identify";
    }

    @Override // yc2.c
    public void z() {
        xc2.p0 p0Var = this.f534695b;
        if (p0Var == null) {
            return;
        }
        in5.s0 s0Var = this.f534694a;
        android.content.Context context = s0Var != null ? s0Var.f374654e : null;
        if (context == null) {
            return;
        }
        xc2.y2.L(xc2.y2.f534876a, context, p0Var, s0Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s) ((jz5.n) this.f542368g).mo141623x754a37bb(), null, 16, null);
    }
}
