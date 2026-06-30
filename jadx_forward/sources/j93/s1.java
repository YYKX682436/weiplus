package j93;

/* loaded from: classes.dex */
public final class s1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f380027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j93.w1 f380028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f380029f;

    public s1(java.util.HashMap hashMap, j93.w1 w1Var, wi5.z zVar) {
        this.f380027d = hashMap;
        this.f380028e = w1Var;
        this.f380029f = zVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        p13.v vVar = (p13.v) obj;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f380027d;
        hashMap.put(num, vVar);
        j93.w1 w1Var = this.f380028e;
        j75.f Q6 = w1Var.Q6();
        if (Q6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List list = vVar.f432693e;
            if (list != null) {
                int i17 = 0;
                for (java.lang.Object obj2 : list) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str = ((p13.y) obj2).f432720e;
                    if (!x51.t1.b(str) && ((java.util.List) ((jz5.n) w1Var.f380063g).mo141623x754a37bb()).contains(str) && (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) != null && !n17.s2()) {
                        ti5.d dVar = new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null);
                        ri5.h hVar = ri5.j.I;
                        int i19 = ri5.j.W;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        arrayList.add(ti5.d.f501196i.b(w1Var.m158354x19263085(), hVar.a(str, i19, 0), n17, ri5.j.Z, dVar));
                    }
                    i17 = i18;
                }
            }
            Q6.B3(new wi5.v(this.f380029f, hashMap, arrayList));
        }
        return jz5.f0.f384359a;
    }
}
