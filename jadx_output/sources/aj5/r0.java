package aj5;

/* loaded from: classes.dex */
public final class r0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f5503d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f5504e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f5505f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f5506g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f5507h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f5508i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f5509m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f5503d = jz5.h.b(new aj5.e0(activity));
        this.f5504e = jz5.h.b(aj5.f0.f5426d);
        this.f5505f = new java.util.ArrayList();
        this.f5506g = jz5.h.b(new aj5.q0(this));
        this.f5507h = jz5.h.b(new aj5.d0(this));
        this.f5508i = new java.util.ArrayList();
    }

    public static final java.util.List T6(aj5.r0 r0Var, int i17, boolean z17, p13.v vVar) {
        com.tencent.mm.storage.k4 k4Var;
        r0Var.getClass();
        java.util.List list = vVar.f351160e;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        if (z17 && list.size() > 3) {
            list = kz5.n0.K0(list, 3);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        com.tencent.mm.storage.k4 Bi = x3Var != null ? ((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).Bi() : null;
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            ti5.c cVar = ti5.d.f419663i;
            if (!hasNext) {
                if (z17 && vVar.f351160e.size() > 3) {
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                    z3Var.X1(i17 + "_collapse");
                    ti5.d dVar = new ti5.d(null, null, i17, Integer.MAX_VALUE, 0, 0, null, z17, 115, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.X;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    arrayList.add(cVar.b(r0Var.getActivity(), hVar.a(d17, i19, i17), z3Var, i19, dVar));
                }
                return arrayList;
            }
            java.lang.Object next = it.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            p13.y yVar = (p13.y) next;
            java.lang.String str = yVar.f351187e;
            java.lang.String str2 = str instanceof java.lang.String ? str : null;
            if (str2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SelectContactAddressBookSearchUIC", "Invalid auxIndex type: ".concat(str.getClass().getSimpleName()));
            } else {
                com.tencent.mm.storage.z3 n17 = Bi != null ? Bi.n(str2, true) : null;
                if (n17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SelectContactAddressBookSearchUIC", "Contact not found for username: ".concat(str2));
                } else if (!n17.s2()) {
                    k4Var = Bi;
                    ti5.d dVar2 = new ti5.d(yVar, vVar.f351159d, i17, i18, 0, 0, null, z17, 112, null);
                    ri5.h hVar2 = ri5.j.I;
                    int i28 = ri5.j.W;
                    java.lang.String d18 = n17.d1();
                    kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                    ri5.j b17 = cVar.b(r0Var.getActivity(), hVar2.a(d18, i28, i17), n17, i28, dVar2);
                    if (i18 == 0 && z17) {
                        b17.f396118o = true;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\"");
                        p13.r rVar = vVar.f351159d;
                        java.lang.String str3 = rVar != null ? rVar.f351129a : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb6.append(str3);
                        sb6.append('\"');
                        b17.o(sb6.toString());
                    }
                    arrayList.add(b17);
                    i18 = i27;
                    Bi = k4Var;
                }
            }
            k4Var = Bi;
            i18 = i27;
            Bi = k4Var;
        }
    }

    public static final em.l2 U6(aj5.r0 r0Var) {
        return (em.l2) ((jz5.n) r0Var.f5506g).getValue();
    }

    public final void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "stopSearch");
        java.util.ArrayList arrayList = this.f5505f;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        S6(new aj5.g0(this));
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new aj5.h0(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.ArrayList arrayList = this.f5505f;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}
