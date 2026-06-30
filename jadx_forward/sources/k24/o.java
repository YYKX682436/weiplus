package k24;

/* loaded from: classes.dex */
public final class o implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17591xf252ec85 f385299a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17591xf252ec85 c17591xf252ec85) {
        this.f385299a = c17591xf252ec85;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17591xf252ec85 c17591xf252ec85 = this.f385299a;
        c17591xf252ec85.getClass();
        c17591xf252ec85.t7(c17591xf252ec85.m158354x19263085().getIntent());
        ip.l.j(z17);
        if (z17) {
            c17591xf252ec85.f243491h |= (int) 1073741824;
        } else {
            c17591xf252ec85.f243491h &= (int) (-1073741825);
        }
        c17591xf252ec85.f243492i.put(71, java.lang.Integer.valueOf(z17 ? 1 : 2));
        c17591xf252ec85.getClass();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(c17591xf252ec85.f243491h));
        java.util.HashMap hashMap = c17591xf252ec85.f243492i;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(key);
            int intValue = ((java.lang.Number) key).intValue();
            java.lang.Object value = entry.getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(value);
            int intValue2 = ((java.lang.Number) value).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = intValue;
            p53Var.f464295e = intValue2;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }
}
