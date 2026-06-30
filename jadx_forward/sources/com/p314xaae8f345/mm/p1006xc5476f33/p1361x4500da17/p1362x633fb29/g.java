package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public class g implements k02.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h02.a f178803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 f178804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f178805c;

    public g(h02.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var, android.content.Context context) {
        this.f178803a = aVar;
        this.f178804b = r0Var;
        this.f178805c = context;
    }

    @Override // k02.k
    public void a() {
    }

    @Override // k02.k
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.f(this.f178805c, this.f178803a, this.f178804b, true, null);
    }

    @Override // k02.k
    public void c() {
        h02.a aVar = this.f178803a;
        java.lang.String str = aVar.f68404x28d45f97;
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.x.f178871g.iterator();
        while (it.hasNext()) {
            r02.y0 y0Var = (r02.y0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.w) it.next());
            y0Var.getClass();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928.f178950s2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928 c13250xfa9a7928 = y0Var.f449877a;
            c13250xfa9a7928.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it6 = c13250xfa9a7928.f178951f2.f449857d.iterator();
            int i18 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) it6.next();
                if (r0Var.f178850f.equals(str)) {
                    linkedList.add(r0Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.e(r0Var.f178850f);
                    break;
                }
                i18++;
            }
            if (linkedList.size() != 0) {
                c13250xfa9a7928.f178951f2.x(linkedList);
                c13250xfa9a7928.f178951f2.m8155x27702c4(i18);
                if (c13250xfa9a7928.f178951f2.f449857d.size() <= 5) {
                    if (c13250xfa9a7928.getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5) c13250xfa9a7928.getContext()).W6(true);
                    }
                    c13250xfa9a7928.f178951f2.m8146xced61ae5();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.e(aVar, this.f178804b);
    }

    @Override // k02.k
    public void d() {
    }
}
