package fx3;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx3.q f348676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fx3.g f348677e;

    public m(fx3.q qVar, fx3.g gVar) {
        this.f348676d = qVar;
        this.f348677e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 a17 = ((em.g3) ((jz5.n) this.f348676d.f348679d).mo141623x754a37bb()).a();
        int h17 = kz5.c0.h(this.f348677e.f348669b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(h17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/repairer/ui/monitor/RepairerMonitorListUIC$observeState$1$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        a17.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/repairer/ui/monitor/RepairerMonitorListUIC$observeState$1$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
