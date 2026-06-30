package mi1;

/* loaded from: classes7.dex */
public class g extends mi1.t2 implements mi1.f {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f408088e;

    /* renamed from: f, reason: collision with root package name */
    public final mi1.w0 f408089f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f408090g;

    /* renamed from: h, reason: collision with root package name */
    public int f408091h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f408092i = Integer.MIN_VALUE;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, mi1.w0 w0Var) {
        this.f408088e = c11510xdd90c2f2;
        this.f408089f = w0Var;
    }

    @Override // mi1.f
    public mi1.w0 a(mi1.d dVar, mi1.e eVar, java.lang.String str) {
        int i17 = dVar.f408065d;
        mi1.w0 n17 = n(eVar, 0);
        final mi1.n2 n2Var = (mi1.n2) n17;
        n2Var.f408170g = str;
        n2Var.f(dVar.ordinal(), false);
        final int i18 = dVar.f408066e;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: mi1.n2$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.content.Context r07;
                int i19 = i18;
                mi1.n2 n2Var2 = mi1.n2.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = ((mi1.g) n2Var2.f408175o).f408088e;
                try {
                    r07 = c11510xdd90c2f2.x0().m52169xfdaa7672().mo14682x9dee9c37().r1().getContext();
                } catch (java.lang.NullPointerException unused) {
                    r07 = c11510xdd90c2f2.r0();
                }
                if (r07 == null) {
                    r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                try {
                    n2Var2.c(b3.l.m9707x4a96be14(r07, i19));
                } catch (android.content.res.Resources.NotFoundException unused2) {
                    n2Var2.c(null);
                }
            }
        };
        mi1.t2 t2Var = n2Var.f408175o;
        t2Var.m(runnable);
        t2Var.m(new mi1.q2(n2Var, i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandCapsuleBarBlinkHelper", "new blinkCapsuleBar");
        return n17;
    }

    @Override // mi1.f
    public int d() {
        return this.f408092i;
    }

    @Override // mi1.f
    public void g(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (true) {
            java.util.LinkedList linkedList2 = this.f408226d;
            if (linkedList2.peekFirst() == null) {
                linkedList2.addAll(linkedList);
                return;
            } else if (((mi1.n2) linkedList2.peekFirst()).f408170g.equals(str)) {
                linkedList2.remove(linkedList2.peekFirst());
            } else {
                linkedList.addLast((mi1.n2) linkedList2.pollFirst());
            }
        }
    }

    @Override // mi1.f
    public mi1.w0 h(mi1.d dVar) {
        return a(dVar, mi1.e.LOW, "");
    }

    @Override // mi1.f
    public int j() {
        return this.f408091h;
    }

    @Override // mi1.f
    public mi1.w0 k(java.util.Map map, mi1.e eVar, java.lang.String str) {
        mi1.w0 n17 = n(eVar, 1);
        mi1.n2 n2Var = (mi1.n2) n17;
        n2Var.f408170g = str;
        n2Var.f(((mi1.a) map.get("key_type")).ordinal(), true);
        n2Var.e(map);
        return n17;
    }

    @Override // mi1.g0
    public void m(java.lang.Runnable runnable) {
        this.f408088e.m(runnable);
    }

    public final boolean p() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f408088e;
        return c11510xdd90c2f2 == null || c11510xdd90c2f2.L0() || this.f408088e.S || this.f408088e.f156354z == null;
    }
}
