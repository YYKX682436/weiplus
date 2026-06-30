package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f264726a;

    /* renamed from: b, reason: collision with root package name */
    public final fl1.c0 f264727b;

    /* renamed from: c, reason: collision with root package name */
    public final fl1.o f264728c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 f264729d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jv5 f264730e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f264731f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f264732g;

    /* renamed from: h, reason: collision with root package name */
    public int f264733h;

    /* renamed from: i, reason: collision with root package name */
    public int f264734i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f264735j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f264736k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f264737l;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var, android.content.Context context, fl1.c0 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f264737l = f3Var;
        this.f264726a = context;
        this.f264727b = container;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0();
        r0Var.G(r0Var.f169178d);
        this.f264728c = new fl1.o(context, r0Var, p2Var);
        this.f264731f = new java.util.ArrayList();
        this.f264735j = "";
        this.f264736k = "";
    }

    public final void a(r45.jv5 jv5Var, fl1.o oVar, java.util.List list, boolean z17, int i17) {
        oVar.mo2041x3f8132ef(list);
        android.content.Context context = this.f264726a;
        if (!z17 && i17 > list.size()) {
            oVar.mo2030x8f8b3d79(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8a));
            oVar.mo2031x5951856a(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
            oVar.mo2029x3aaeeaf1(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o2(this, this.f264737l));
        } else {
            if (z17) {
                oVar.mo2030x8f8b3d79("");
            } else {
                oVar.mo2030x8f8b3d79(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8a));
                oVar.mo2031x5951856a(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
            }
            oVar.mo2029x3aaeeaf1(null);
        }
    }
}
