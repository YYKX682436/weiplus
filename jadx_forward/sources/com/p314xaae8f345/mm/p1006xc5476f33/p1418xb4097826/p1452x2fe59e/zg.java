package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class zg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f192789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f192790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f192791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192794i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f192795m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f192796n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192797o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f192798p;

    public zg(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, r45.v71 v71Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, zy2.i5 i5Var, zy2.i5 i5Var2, java.lang.String str4, r45.h32 h32Var) {
        this.f192789d = abstractActivityC21394xb3d2c0cf;
        this.f192790e = v71Var;
        this.f192791f = i17;
        this.f192792g = str;
        this.f192793h = str2;
        this.f192794i = str3;
        this.f192795m = i5Var;
        this.f192796n = i5Var2;
        this.f192797o = str4;
        this.f192798p = h32Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh jhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188634a;
        if (itemId == 1) {
            jhVar.a(this.f192789d, this.f192790e, this.f192791f, this.f192792g, this.f192793h, this.f192794i, this.f192795m, this.f192796n);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d = 7;
            ml2.i5 i5Var = ml2.i5.f409105g;
            java.lang.String str = this.f192797o;
            r45.v71 v71Var = this.f192790e;
            r45.aa2 aa2Var = (r45.aa2) v71Var.m75936x14adae67(2);
            long m75942xfb822ef2 = aa2Var != null ? aa2Var.m75942xfb822ef2(2) : 0L;
            r45.aa2 aa2Var2 = (r45.aa2) v71Var.m75936x14adae67(2);
            int i18 = 0;
            if (aa2Var2 != null && aa2Var2.m75939xb282bd08(3) == 2) {
                i18 = 1;
            }
            int i19 = i18 ^ 1;
            java.lang.String str2 = this.f192792g;
            java.lang.String m75945x2fec8307 = this.f192798p.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            jhVar.d(i5Var, str, m75942xfb822ef2, i19, str2, m75945x2fec8307, this.f192793h);
        }
    }
}
