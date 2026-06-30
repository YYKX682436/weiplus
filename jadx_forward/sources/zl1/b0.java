package zl1;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f555105a = new java.util.HashMap();

    public final zl1.y a(java.lang.String iconPath, zl1.w errorHandler, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service, int i17) {
        zl1.y f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconPath, "iconPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorHandler, "errorHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (true == (android.webkit.URLUtil.isHttpsUrl(iconPath) || android.webkit.URLUtil.isHttpUrl(iconPath))) {
            f0Var = new zl1.d0(iconPath, errorHandler, service);
        } else if (true == r26.i0.y(iconPath, "wxfile://", false)) {
            f0Var = new zl1.h0(iconPath, errorHandler, service);
        } else {
            f0Var = true == (r26.i0.n(iconPath, ".png", false) || r26.i0.n(iconPath, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG, false) || r26.i0.n(iconPath, ".bmp", false) || r26.i0.n(iconPath, ".gif", false)) ? new zl1.f0(iconPath, errorHandler, service) : new zl1.v(iconPath, errorHandler);
        }
        f0Var.f555163e = i17;
        f0Var.f555162d = new zl1.a0(this);
        zl1.y yVar = (zl1.y) this.f555105a.get(java.lang.Integer.valueOf(i17));
        if (yVar != null) {
            yVar.f555164f = null;
        }
        this.f555105a.put(java.lang.Integer.valueOf(i17), f0Var);
        return f0Var;
    }
}
