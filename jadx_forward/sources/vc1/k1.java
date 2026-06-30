package vc1;

/* loaded from: classes13.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.n1 f516532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.q2 f516533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 f516534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vc1.l1 f516535g;

    public k1(vc1.l1 l1Var, vc1.n1 n1Var, vc1.q2 q2Var, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 c4410xea4764e4) {
        this.f516535g = l1Var;
        this.f516532d = n1Var;
        this.f516533e = q2Var;
        this.f516534f = c4410xea4764e4;
    }

    @Override // java.lang.Runnable
    public void run() {
        vc1.o2 o2Var;
        vc1.l1 l1Var = this.f516535g;
        vc1.n1 n1Var = this.f516532d;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a m100186x24a3b730 = l1Var.m100186x24a3b730((vc1.l1) n1Var);
        vc1.o1 o1Var = (vc1.o1) ((java.util.concurrent.ConcurrentHashMap) l1Var.f516538z.Y).get(n1Var.f516554a);
        if (o1Var != null && o1Var.f516563c == null && m100186x24a3b730 != null) {
            o1Var.f516563c = m100186x24a3b730;
        }
        int i17 = n1Var.f516556c;
        vc1.q2 q2Var = this.f516533e;
        if (i17 == 0 && o1Var != null) {
            l1Var.f516538z.o(n1Var.f516554a, q2Var, o1Var);
            if (q2Var != null && (o2Var = q2Var.f516681s) != null && o2Var.f516580n == 1) {
                l1Var.f516538z.d0(m100186x24a3b730);
            }
        }
        if (m100186x24a3b730 != null && q2Var != null) {
            if (android.text.TextUtils.isEmpty(q2Var.f516679q) || !q2Var.f516679q.equals("withLabel")) {
                m100186x24a3b730.mo37250xbc4aa583(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.NONE);
            } else {
                m100186x24a3b730.mo37250xbc4aa583(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.POI);
            }
        }
        vc1.p1.h(l1Var.f516538z, n1Var.f516554a, this.f516534f, q2Var, m100186x24a3b730);
    }
}
