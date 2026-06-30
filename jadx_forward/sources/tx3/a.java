package tx3;

/* loaded from: classes10.dex */
public final class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5246x83c809ee event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5246x83c809ee) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        mx3.b0 b0Var = mx3.b0.f414061a;
        boolean z17 = event.f135579g.f88657a;
        mx3.b0.f414062b = z17;
        if (z17) {
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) mx3.b0.f414064d).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            f9Var.l1(f9Var.F | 16384);
            c01.w9.C(f9Var);
        }
        ((java.util.ArrayList) mx3.b0.f414064d).clear();
        mx3.b0.f414063c.clear();
        return false;
    }
}
