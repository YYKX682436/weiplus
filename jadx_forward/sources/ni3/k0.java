package ni3;

/* loaded from: classes3.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 f419153d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9) {
        this.f419153d = c16559xedc507d9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9 = this.f419153d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = c16559xedc507d9.f230992h;
        if (c13920xa5f564aa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            throw null;
        }
        java.util.Iterator<T> it = c13920xa5f564aa.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((so2.j5) it.next()).mo2128x1ed62e84() == c16559xedc507d9.f230994m) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m66991x4905e9fa = c16559xedc507d9.m66991x4905e9fa();
        if (i17 <= 0) {
            i17 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m66991x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$onAttach$3$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        m66991x4905e9fa.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m66991x4905e9fa, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$onAttach$3$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
