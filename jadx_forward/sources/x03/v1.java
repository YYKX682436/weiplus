package x03;

/* loaded from: classes15.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.w1 f532685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f532686e;

    public v1(x03.w1 w1Var, java.lang.String str) {
        this.f532685d = w1Var;
        this.f532686e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x03.w1 w1Var = this.f532685d;
        if (com.p314xaae8f345.mm.vfs.w6.j(w1Var.f532690e)) {
            com.p314xaae8f345.mm.vfs.w6.x(w1Var.f532690e, w1Var.f532691f, true);
            java.lang.String str = w1Var.f532692g;
            try {
                w1Var.f532689d.mo37932xc5dd699b(this.f532686e, com.p314xaae8f345.mm.vfs.w6.M(w1Var.f532691f));
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(w1Var.f532692g, "unable to parse m3u8 content");
            }
        }
    }
}
