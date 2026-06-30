package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class pk implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f281251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sb5.s0 f281252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281253c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk f281255e;

    public pk(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk lkVar, boolean z17, sb5.s0 s0Var, java.lang.String str, java.lang.String str2) {
        this.f281255e = lkVar;
        this.f281251a = z17;
        this.f281252b = s0Var;
        this.f281253c = str;
        this.f281254d = str2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        boolean z17 = this.f281251a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk lkVar = this.f281255e;
        if (z17) {
            sb5.s0 s0Var = this.f281252b;
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e != null && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e.m75440x71965dbb() != null && (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e.m75440x71965dbb() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.i8)) {
                java.lang.String str = this.f281253c;
                if (str.contains("com.sohu.inputmethod.sogou")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1062, 3);
                } else if (str.contains("com.tencent.qqpinyin")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1062, 4);
                }
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                java.lang.String str2 = this.f281254d;
                if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2, options) == null || options.outHeight <= ip.c.c()) && options.outWidth <= ip.c.c()) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984(str2));
                    java.lang.String J2 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).J(lkVar.f280113d.g(), c11286x34a5504, null);
                    if (J2 != null) {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.i8) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e.m75440x71965dbb()).d(((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(J2));
                    }
                } else {
                    dp.a.m125853x26a183b(lkVar.f280113d.g(), com.p314xaae8f345.mm.R.C30867xcad56011.bvm, 0).show();
                }
                lkVar.f280971e.B();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1062, 21);
        k70.i0 i0Var = new k70.i0();
        i0Var.f386175a = 5;
        java.lang.String str3 = this.f281254d;
        java.lang.String t17 = lkVar.f280113d.t();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (t17 == null) {
            t17 = "";
        }
        r70.g gVar = new r70.g(str3, 0, t17, lkVar.f280113d.x(), i0Var);
        gVar.f474641j = "component_copy_send_img";
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        lkVar.f280971e.B();
    }
}
