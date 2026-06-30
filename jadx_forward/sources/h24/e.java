package h24;

/* loaded from: classes.dex */
public final class e implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17566x8eeffdf6 f359850a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17566x8eeffdf6 c17566x8eeffdf6) {
        this.f359850a = c17566x8eeffdf6;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17566x8eeffdf6 c17566x8eeffdf6 = this.f359850a;
        c17566x8eeffdf6.getClass();
        c17566x8eeffdf6.t7(c17566x8eeffdf6.m158354x19263085().getIntent());
        boolean z18 = !z17;
        c17566x8eeffdf6.getClass();
        int p17 = c01.z1.p();
        c17566x8eeffdf6.f243461i = p17;
        if (z18) {
            c17566x8eeffdf6.f243461i = p17 | 524288;
        } else {
            c17566x8eeffdf6.f243461i = p17 & (-524289);
        }
        c17566x8eeffdf6.f243460h.put(30, java.lang.Integer.valueOf(z18 ? 1 : 2));
        c17566x8eeffdf6.getClass();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(c17566x8eeffdf6.f243461i));
        java.util.HashMap hashMap = c17566x8eeffdf6.f243460h;
        for (java.lang.Object obj : hashMap.entrySet()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Integer num = (java.lang.Integer) entry.getKey();
            if (num != null) {
                int intValue = num.intValue();
                java.lang.Integer num2 = (java.lang.Integer) entry.getValue();
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    r45.p53 p53Var = new r45.p53();
                    p53Var.f464294d = intValue;
                    p53Var.f464295e = intValue2;
                    ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
                }
            }
        }
        hashMap.clear();
    }
}
