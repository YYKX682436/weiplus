package aj5;

/* loaded from: classes.dex */
public final class g1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f5431d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f5432e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f5433f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f5434g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f5435h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f5431d = jz5.h.b(new aj5.v0(activity));
        this.f5432e = jz5.h.b(aj5.w0.f5524d);
        this.f5433f = new java.util.ArrayList();
        this.f5434g = jz5.h.b(new aj5.f1(this));
        this.f5435h = jz5.h.b(new aj5.u0(this));
    }

    public static final java.util.List T6(aj5.g1 g1Var, int i17, boolean z17, p13.v vVar) {
        g1Var.getClass();
        java.util.List subList = (!z17 || vVar.f351160e.size() <= 3) ? vVar.f351160e : vVar.f351160e.subList(0, 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.o.d(subList);
        java.util.Iterator it = subList.iterator();
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
                    arrayList.add(cVar.b(g1Var.getActivity(), hVar.a(d17, i19, i17), z3Var, i19, dVar));
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
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f351187e, true);
            if (!n17.s2()) {
                ti5.d dVar2 = new ti5.d(yVar, vVar.f351159d, i17, i18, 0, 0, null, z17, 112, null);
                ri5.h hVar2 = ri5.j.I;
                int i28 = ri5.j.W;
                java.lang.String d18 = n17.d1();
                kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                ri5.j b17 = cVar.b(g1Var.getActivity(), hVar2.a(d18, i28, i17), n17, i28, dVar2);
                if (i18 == 0 && z17) {
                    b17.f396118o = true;
                    p13.r rVar = vVar.f351159d;
                    java.lang.String str = rVar != null ? rVar.f351129a : null;
                    if (str == null) {
                        str = "";
                    }
                    b17.f396119p = str;
                }
                arrayList.add(b17);
            }
            i18 = i27;
        }
    }

    public static final em.l2 U6(aj5.g1 g1Var) {
        return (em.l2) ((jz5.n) g1Var.f5434g).getValue();
    }

    public final void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "stopSearch");
        java.util.ArrayList arrayList = this.f5433f;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        S6(new aj5.x0(this));
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new aj5.y0(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.ArrayList arrayList = this.f5433f;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}
