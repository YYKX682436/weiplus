package bg2;

/* loaded from: classes3.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1494xdcdf3d8f.C14207x67cb93cf f101796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f101797e;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1494xdcdf3d8f.C14207x67cb93cf c14207x67cb93cf, android.app.Activity activity) {
        this.f101796d = c14207x67cb93cf;
        this.f101797e = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1494xdcdf3d8f.C14207x67cb93cf c14207x67cb93cf = this.f101796d;
        if (c14207x67cb93cf.f193161m == null) {
            c14207x67cb93cf.f193161m = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this.f101797e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1494xdcdf3d8f.C14207x67cb93cf c14207x67cb93cf2 = this.f101796d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = c14207x67cb93cf2.f193161m;
            if (f5Var != null) {
                f5Var.f291933e = new bg2.k1(c14207x67cb93cf2);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f101796d.f193161m;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
