package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f90301a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f90302b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f90303c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f90304d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f90305e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f90306f;

    /* renamed from: g, reason: collision with root package name */
    public int f90307g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.u6 f90308h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f90309i = new com.tencent.mm.plugin.appbrand.ui.v6(this);

    public w6(com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI, android.content.Context context) {
        this.f90301a = context;
    }

    public void a() {
        com.tencent.mm.plugin.appbrand.ui.u6 u6Var = this.f90308h;
        if (u6Var != null) {
            boolean z17 = this.f90305e;
            java.lang.String str = this.f90306f;
            int i17 = this.f90307g;
            com.tencent.mm.plugin.appbrand.ui.o6 o6Var = (com.tencent.mm.plugin.appbrand.ui.o6) u6Var;
            o6Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessShareMessageProxyUI", "onProcessDone, result:%b", java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.appbrand.ui.t6 t6Var = o6Var.f89900c.f89400e;
            if (t6Var != null) {
                t6Var.a(z17, str, i17);
            }
            ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Ui(o6Var.f89898a, o6Var.f89899b);
        }
    }

    public void b(boolean z17, java.lang.String str, int i17) {
        this.f90303c = true;
        this.f90305e = z17;
        this.f90306f = str;
        this.f90307g = i17;
        if (this.f90304d) {
            a();
        } else if (z17) {
            android.content.Context context = this.f90301a;
            this.f90302b = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490552yb), false, true, null);
            com.tencent.mm.sdk.platformtools.u3.i(this.f90309i, 5000L);
        }
    }
}
