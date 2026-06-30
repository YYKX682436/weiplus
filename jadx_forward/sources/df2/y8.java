package df2;

/* loaded from: classes3.dex */
public final class y8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f313383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.a9 f313384e;

    public y8(boolean z17, df2.a9 a9Var) {
        this.f313383d = z17;
        this.f313384e = a9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        byte[] j17;
        df2.a9 a9Var = this.f313384e;
        try {
            if (this.f313383d && c01.id.e() - a9Var.a7().getInt(a9Var.f311225r, 0) < a9Var.f311226s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a9Var.f311220m, "[saveRecordCache] to frequently， return");
                return;
            }
            r45.yb4 yb4Var = a9Var.f311227t;
            if (yb4Var == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a76 = a9Var.a7();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a76, "access$getMmkv(...)");
                java.lang.String str = a9Var.f311224q;
                if (a76.f(str) && (j17 = a76.j(str)) != null) {
                    if (!(j17.length == 0)) {
                        try {
                            java.lang.Object newInstance = r45.yb4.class.newInstance();
                            ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(j17);
                            obj = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                        }
                        yb4Var = (r45.yb4) obj;
                    }
                }
                obj = null;
                yb4Var = (r45.yb4) obj;
            }
            if (yb4Var != null) {
                java.util.LinkedList m75941xfb821914 = yb4Var.m75941xfb821914(0);
                if (m75941xfb821914 != null) {
                    pm0.v.d0(m75941xfb821914, df2.x8.f313298d);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a9Var.f311220m, "[saveRecordCache] cache = " + pm0.b0.g(yb4Var));
                java.util.LinkedList m75941xfb8219142 = yb4Var.m75941xfb821914(0);
                boolean z17 = m75941xfb8219142 == null || m75941xfb8219142.isEmpty();
                java.lang.String str2 = a9Var.f311224q;
                if (z17) {
                    a9Var.a7().W(str2);
                } else {
                    a9Var.a7().H(str2, yb4Var.mo14344x5f01b1f6());
                }
                a9Var.a7().putInt(a9Var.f311225r, c01.id.e());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(a9Var.f311220m, "[saveRecordCache] e:" + th6.getMessage());
        }
    }
}
