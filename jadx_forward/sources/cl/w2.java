package cl;

/* loaded from: classes7.dex */
public class w2 extends cl.r1 {

    /* renamed from: d, reason: collision with root package name */
    public volatile android.os.Looper f124348d;

    /* renamed from: b, reason: collision with root package name */
    public int f124346b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f124347c = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f124349e = false;

    public static int d(java.lang.String str, int i17) {
        if (str == null) {
            return i17;
        }
        try {
            return str.length() <= 0 ? i17 : java.lang.Integer.decode(str).intValue();
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.J2V8.V8DirectApiTimer", e17, "", new java.lang.Object[0]);
            return i17;
        }
    }

    @Override // cl.r1
    public void a() {
        for (int i17 = 0; i17 < this.f124347c.size(); i17++) {
            ((cl.u2) this.f124347c.valueAt(i17)).a();
        }
        this.f124347c.clear();
        android.os.Looper looper = this.f124348d;
        if (looper == null || android.os.Looper.getMainLooper() == looper) {
            return;
        }
        looper.quit();
        this.f124348d = null;
    }

    @Override // cl.r1
    public void c(cl.q0 q0Var, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        if (!(q0Var.f124257b instanceof cl.h)) {
            this.f124348d = android.os.Looper.getMainLooper();
        }
        if (!this.f124349e) {
            cl.p pVar = q0Var.f124257b;
            if ((pVar instanceof cl.e0) && ((cl.e0) pVar).f124117q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.J2V8.V8DirectApiTimer", "hy: node env do not need java imp timer");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.J2V8.V8DirectApiTimer", "hy: not node. need to inject direct timer");
        c1477x4679881.mo16337x1af320a6(new cl.o2(this, q0Var), "setTimeout");
        c1477x4679881.mo16337x1af320a6(new cl.p2(this, q0Var), "setInterval");
        c1477x4679881.mo16338x1af320a6(new cl.q2(this), "clearTimeout");
        c1477x4679881.mo16338x1af320a6(new cl.r2(this), "clearInterval");
    }
}
