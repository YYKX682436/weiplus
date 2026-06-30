package rh;

/* loaded from: classes12.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f477048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f477049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rh.x3 f477050f;

    public u3(rh.x3 x3Var, android.os.Handler handler, long j17) {
        this.f477050f = x3Var;
        this.f477048d = handler;
        this.f477049e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.x3 x3Var = this.f477050f;
        int i17 = x3Var.f477088c + 1;
        x3Var.f477088c = i17;
        rh.v3 v3Var = x3Var.f477090e;
        if (v3Var != null) {
            rh.w3 w3Var = x3Var.f477087b;
            rh.p3 p3Var = (rh.p3) v3Var;
            rh.q3 q3Var = p3Var.f477027b;
            q3Var.f477032a.f476827a.h(i17, w3Var);
            rh.x3 x3Var2 = p3Var.f477026a;
            if (x3Var2.f477088c >= 30) {
                rh.z3 z3Var = q3Var.f477032a;
                x3Var2.a(z3Var.f476827a.f444870f);
                java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) z3Var.f477108c).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((java.util.Map.Entry) it.next()).getValue() == x3Var2) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        int i18 = x3Var.f477088c;
        x3Var.getClass();
        if (i18 < 30) {
            this.f477048d.postDelayed(this, this.f477049e);
        }
    }
}
