package dy3;

/* loaded from: classes.dex */
public final class c extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f326108d;

    public c() {
        jz5.h.b(dy3.b.f326107d);
        this.f326108d = new java.util.ArrayList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        int size;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f326108d;
        int size2 = arrayList.size();
        int i17 = request.f544677b;
        if (i17 < size2) {
            int size3 = arrayList.size();
            int i18 = request.f544678c;
            if (size3 > i17 + i18) {
                dVar.f544681b = true;
                size = i18 + i17;
            } else {
                size = arrayList.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i17 < size) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.f(arrayList2)) {
                if (((int) z3Var.E2) != 0) {
                    dVar.f544682c.add(new dy3.p(0, z3Var, 2, null, 8, null));
                }
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return -1;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = this.f326108d;
        arrayList.clear();
        android.database.Cursor K = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().K();
        if (K != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            while (K.moveToNext()) {
                z3Var.mo9015xbf5d97fd(K);
                arrayList.add(z3Var.d1());
            }
            K.close();
        }
        arrayList.remove(c01.z1.r());
        arrayList.remove("blogapp");
        arrayList.remove("tmessage");
        arrayList.remove("officialaccounts");
        arrayList.remove("service_officialaccounts");
        arrayList.remove("BrandEcsTemplateMsg@fakeuser");
        arrayList.remove("helper_entry");
        arrayList.remove("filehelper");
        arrayList.remove("weixin");
    }
}
