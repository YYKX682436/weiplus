package yw;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f547792d;

    public a(int i17) {
        this.f547792d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yw.q0 q0Var = yw.q0.f547962a;
        yw.d0 d0Var = yw.d0.f547825f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("eventType=");
        int i17 = this.f547792d;
        sb6.append(i17);
        q0Var.a(d0Var, sb6.toString());
        if (i17 != 6) {
            if (i17 == 8) {
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5192x4c17a6dc().e();
            }
        } else {
            o25.q qVar = o25.q.f424107a;
            if (qVar.f() && qVar.g()) {
                qVar.h();
            }
        }
    }
}
