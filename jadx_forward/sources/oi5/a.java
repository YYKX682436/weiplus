package oi5;

/* loaded from: classes.dex */
public final class a extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f427180d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f427181e;

    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f427180d = activity;
        this.f427181e = new java.util.ArrayList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f427181e;
        int size = arrayList.size();
        int i17 = request.f544677b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f544678c + i17;
            if (size2 > i18) {
                dVar.f544681b = true;
            } else {
                i18 = arrayList.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g95.e.f351334a.f(arrayList2)) {
                if (((int) z3Var.E2) != 0) {
                    ti5.d dVar2 = new ti5.d(null, null, 0, 0, 0, 0, null, false, 223, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.Z;
                    java.lang.String d17 = z3Var.d1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                    dVar.f544682c.add(ti5.d.f501196i.a(this.f427180d, hVar.a(d17, i19, 0), z3Var, i19, dVar2));
                }
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 1;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = this.f427181e;
        arrayList.clear();
        java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(this.f427180d.getIntent().getStringExtra("custom_contact"), ",");
        if (O1 != null) {
            java.util.Iterator it = O1.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) it.next());
            }
        }
    }
}
