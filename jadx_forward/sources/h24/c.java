package h24;

/* loaded from: classes.dex */
public final class c implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17564x7a283a40 f359848a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17564x7a283a40 c17564x7a283a40) {
        this.f359848a = c17564x7a283a40;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17564x7a283a40 c17564x7a283a40 = this.f359848a;
        c17564x7a283a40.getClass();
        c17564x7a283a40.t7(c17564x7a283a40.m158354x19263085().getIntent());
        boolean z18 = !z17;
        c17564x7a283a40.getClass();
        long j17 = c01.z1.j();
        c17564x7a283a40.f243457i = j17;
        if (z18) {
            c17564x7a283a40.f243457i = j17 | 140737488355328L;
        } else {
            c17564x7a283a40.f243457i = j17 & (-140737488355329L);
        }
        c17564x7a283a40.f243456h.put(105, java.lang.Integer.valueOf(z18 ? 1 : 2));
        c17564x7a283a40.getClass();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(c17564x7a283a40.f243457i));
        java.util.HashMap hashMap = c17564x7a283a40.f243456h;
        for (java.lang.Object obj : hashMap.entrySet()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
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
