package ni3;

/* loaded from: classes10.dex */
public final class w0 implements ni3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni3.a1 f419284a;

    public w0(ni3.a1 a1Var) {
        this.f419284a = a1Var;
    }

    @Override // ni3.a
    public void a(int i17, int i18) {
        ni3.a1 a1Var = this.f419284a;
        ni3.a1.a(a1Var, i17).f419173c = c01.id.a();
        ni3.a1.a(a1Var, i17).f419174d = i18;
        long j17 = ni3.a1.a(a1Var, i17).f419173c - ni3.a1.a(a1Var, i17).f419172b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd tabType:");
        sb6.append(i17);
        sb6.append(" time:");
        sb6.append(j17);
        sb6.append(" size:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = a1Var.f419060c;
        if (c13920xa5f564aa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
            throw null;
        }
        sb6.append(c13920xa5f564aa.size());
        sb6.append(" remainSize:");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
    }

    @Override // ni3.a
    public void b(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiStart tabType:");
        sb6.append(i17);
        sb6.append(" size:");
        ni3.a1 a1Var = this.f419284a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = a1Var.f419060c;
        if (c13920xa5f564aa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
            throw null;
        }
        sb6.append(c13920xa5f564aa.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
        ni3.a1.a(a1Var, i17).f419172b = c01.id.a();
    }
}
