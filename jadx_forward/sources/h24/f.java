package h24;

/* loaded from: classes.dex */
public final class f implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17567x9927305f f359851a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17567x9927305f c17567x9927305f) {
        this.f359851a = c17567x9927305f;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17567x9927305f c17567x9927305f = this.f359851a;
        c17567x9927305f.getClass();
        c17567x9927305f.t7(c17567x9927305f.m158354x19263085().getIntent());
        boolean z18 = !z17;
        c17567x9927305f.getClass();
        int p17 = c01.z1.p();
        c17567x9927305f.f243464i = p17;
        if (z18) {
            c17567x9927305f.f243464i = p17 | 512;
        } else {
            c17567x9927305f.f243464i = p17 & (-513);
        }
        c17567x9927305f.f243463h.put(8, java.lang.Integer.valueOf(z18 ? 1 : 2));
        c17567x9927305f.getClass();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(c17567x9927305f.f243464i));
        java.util.HashMap hashMap = c17567x9927305f.f243463h;
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
