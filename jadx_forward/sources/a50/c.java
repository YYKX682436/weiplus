package a50;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82992d;

    public c(int i17) {
        this.f82992d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a50.j0 j0Var = a50.j0.f83029a;
        a50.a aVar = a50.a.f82976f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("eventType=");
        int i17 = this.f82992d;
        sb6.append(i17);
        j0Var.a(aVar, sb6.toString());
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
