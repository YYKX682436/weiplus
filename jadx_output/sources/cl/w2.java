package cl;

/* loaded from: classes7.dex */
public class w2 extends cl.r1 {

    /* renamed from: d, reason: collision with root package name */
    public volatile android.os.Looper f42815d;

    /* renamed from: b, reason: collision with root package name */
    public int f42813b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f42814c = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f42816e = false;

    public static int d(java.lang.String str, int i17) {
        if (str == null) {
            return i17;
        }
        try {
            return str.length() <= 0 ? i17 : java.lang.Integer.decode(str).intValue();
        } catch (java.lang.NumberFormatException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.J2V8.V8DirectApiTimer", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }

    @Override // cl.r1
    public void a() {
        for (int i17 = 0; i17 < this.f42814c.size(); i17++) {
            ((cl.u2) this.f42814c.valueAt(i17)).a();
        }
        this.f42814c.clear();
        android.os.Looper looper = this.f42815d;
        if (looper == null || android.os.Looper.getMainLooper() == looper) {
            return;
        }
        looper.quit();
        this.f42815d = null;
    }

    @Override // cl.r1
    public void c(cl.q0 q0Var, com.eclipsesource.mmv8.V8Object v8Object) {
        if (!(q0Var.f42724b instanceof cl.h)) {
            this.f42815d = android.os.Looper.getMainLooper();
        }
        if (!this.f42816e) {
            cl.p pVar = q0Var.f42724b;
            if ((pVar instanceof cl.e0) && ((cl.e0) pVar).f42584q) {
                com.tencent.mars.xlog.Log.i("MicroMsg.J2V8.V8DirectApiTimer", "hy: node env do not need java imp timer");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.J2V8.V8DirectApiTimer", "hy: not node. need to inject direct timer");
        v8Object.registerJavaMethod(new cl.o2(this, q0Var), "setTimeout");
        v8Object.registerJavaMethod(new cl.p2(this, q0Var), "setInterval");
        v8Object.registerJavaMethod(new cl.q2(this), "clearTimeout");
        v8Object.registerJavaMethod(new cl.r2(this), "clearInterval");
    }
}
