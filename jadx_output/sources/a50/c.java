package a50;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1459d;

    public c(int i17) {
        this.f1459d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a50.j0 j0Var = a50.j0.f1496a;
        a50.a aVar = a50.a.f1443f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("eventType=");
        int i17 = this.f1459d;
        sb6.append(i17);
        j0Var.a(aVar, sb6.toString());
        if (i17 != 6) {
            if (i17 == 8) {
                new com.tencent.mm.autogen.events.BizCreationCenterInfoUpdateEvent().e();
            }
        } else {
            o25.q qVar = o25.q.f342574a;
            if (qVar.f() && qVar.g()) {
                qVar.h();
            }
        }
    }
}
