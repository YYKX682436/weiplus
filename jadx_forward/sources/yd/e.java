package yd;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f542471j = "wagame://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyj) + "/WAGameVConsole.html";

    /* renamed from: a, reason: collision with root package name */
    public yd.d0 f542472a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f542473b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f542474c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f542475d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f542476e;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f542478g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f542479h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f542477f = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f542480i = false;

    public e(com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        this.f542473b = d0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = d0Var.t3();
        this.f542474c = t37;
        this.f542475d = context;
        this.f542476e = c4209xd2d3ddad;
        if (wd.h.f526218a == null) {
            synchronized (wd.h.class) {
                if (wd.h.f526218a == null) {
                    wd.h.f526218a = new wd.h();
                }
            }
        }
        wd.h.f526218a.getClass();
        yd.z zVar = (yd.z) i95.n0.c(yd.z.class);
        yd.d0 d0Var2 = new yd.d0(new android.content.MutableContextWrapper(context), t37, zVar == null ? new yd.h() : zVar);
        this.f542472a = d0Var2;
        d0Var2.m176828x40fe4367().O4().a(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.b0(context);
        this.f542478g = b0Var;
        b0Var.setOnClickListener(new yd.a(this));
        this.f542472a.m176828x40fe4367().N7(new yd.b(this));
        this.f542472a.m176828x40fe4367().mo142290x141096a9(f542471j);
        this.f542472a.setTranslationY(100000.0f);
        this.f542472a.setVisibility(8);
    }

    public final int a() {
        return ((int) (this.f542476e.f130123n.m34846x2ff5b9(0).getWidth() * this.f542475d.getResources().getDisplayMetrics().density)) + 1;
    }

    public final void b(java.lang.String str) {
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str);
        this.f542472a.m176828x40fe4367().jf("console._log('" + a17 + "')");
    }
}
