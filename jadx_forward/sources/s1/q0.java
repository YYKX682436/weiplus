package s1;

/* loaded from: classes14.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final u1.w f483594a;

    /* renamed from: b, reason: collision with root package name */
    public n0.g1 f483595b;

    /* renamed from: c, reason: collision with root package name */
    public s1.n2 f483596c;

    /* renamed from: d, reason: collision with root package name */
    public int f483597d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f483598e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f483599f;

    /* renamed from: g, reason: collision with root package name */
    public final s1.l0 f483600g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f483601h;

    /* renamed from: i, reason: collision with root package name */
    public final s1.m2 f483602i;

    /* renamed from: j, reason: collision with root package name */
    public int f483603j;

    /* renamed from: k, reason: collision with root package name */
    public int f483604k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f483605l;

    public q0(u1.w root, s1.n2 slotReusePolicy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotReusePolicy, "slotReusePolicy");
        this.f483594a = root;
        this.f483596c = slotReusePolicy;
        this.f483598e = new java.util.LinkedHashMap();
        this.f483599f = new java.util.LinkedHashMap();
        this.f483600g = new s1.l0(this);
        this.f483601h = new java.util.LinkedHashMap();
        this.f483602i = new s1.m2(null, 1, null);
        this.f483605l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void a(int i17) {
        this.f483603j = 0;
        u1.w wVar = this.f483594a;
        int i18 = (((o0.f) wVar.o()).f423377d.f423385f - this.f483604k) - 1;
        if (i17 <= i18) {
            s1.m2 m2Var = this.f483602i;
            m2Var.clear();
            java.util.Map map = this.f483598e;
            if (i17 <= i18) {
                int i19 = i17;
                while (true) {
                    java.lang.Object obj = ((java.util.LinkedHashMap) map).get((u1.w) ((o0.f) wVar.o()).get(i19));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    m2Var.f483571d.add(((s1.k0) obj).f483552a);
                    if (i19 == i18) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            this.f483596c.a(m2Var);
            while (i18 >= i17) {
                u1.w wVar2 = (u1.w) ((o0.f) wVar.o()).get(i18);
                java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(wVar2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                s1.k0 k0Var = (s1.k0) obj2;
                java.lang.Object obj3 = k0Var.f483552a;
                if (m2Var.contains(obj3)) {
                    u1.e0 e0Var = u1.e0.NotUsed;
                    wVar2.getClass();
                    wVar2.E = e0Var;
                    this.f483603j++;
                    ((n0.q4) k0Var.f483556e).mo148714x53d8522f(java.lang.Boolean.FALSE);
                } else {
                    wVar.f505226q = true;
                    map.remove(wVar2);
                    n0.f1 f1Var = k0Var.f483554c;
                    if (f1Var != null) {
                        f1Var.mo7062x63a5261f();
                    }
                    wVar.F(i18, 1);
                    wVar.f505226q = false;
                }
                this.f483599f.remove(obj3);
                i18--;
            }
        }
        b();
    }

    public final void b() {
        java.util.Map map = this.f483598e;
        int size = map.size();
        u1.w wVar = this.f483594a;
        if (!(size == wVar.o().size())) {
            throw new java.lang.IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + map.size() + ") and the children count on the SubcomposeLayout (" + wVar.o().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if (!((wVar.o().size() - this.f483603j) - this.f483604k >= 0)) {
            throw new java.lang.IllegalArgumentException(("Incorrect state. Total children " + wVar.o().size() + ". Reusable children " + this.f483603j + ". Precomposed children " + this.f483604k).toString());
        }
        java.util.Map map2 = this.f483601h;
        if (map2.size() == this.f483604k) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Incorrect state. Precomposed children " + this.f483604k + ". Map size " + map2.size()).toString());
    }

    public final void c(u1.w container, java.lang.Object obj, yz5.p pVar) {
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f483598e;
        java.lang.Object obj2 = linkedHashMap.get(container);
        if (obj2 == null) {
            yz5.p pVar2 = s1.j.f483549a;
            obj2 = new s1.k0(obj, s1.j.f483549a, null, 4, null);
            linkedHashMap.put(container, obj2);
        }
        s1.k0 k0Var = (s1.k0) obj2;
        n0.f1 f1Var = k0Var.f483554c;
        boolean c17 = f1Var != null ? f1Var.c() : true;
        if (k0Var.f483553b != pVar || c17 || k0Var.f483555d) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<set-?>");
            k0Var.f483553b = pVar;
            x0.m g17 = x0.z.g((x0.m) x0.z.f532495a.a(), null);
            try {
                x0.m i17 = g17.i();
                try {
                    u1.w wVar = this.f483594a;
                    wVar.f505226q = true;
                    yz5.p pVar3 = k0Var.f483553b;
                    n0.f1 f1Var2 = k0Var.f483554c;
                    n0.g1 g1Var = this.f483595b;
                    if (g1Var == null) {
                        throw new java.lang.IllegalStateException("parent composition reference not set".toString());
                    }
                    u0.a c18 = u0.j.c(-34810602, true, new s1.p0(k0Var, pVar3));
                    if (f1Var2 == null || f1Var2.a()) {
                        android.view.ViewGroup.LayoutParams layoutParams = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.s5.f92278a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
                        f1Var2 = n0.k1.a(new u1.c2(container), g1Var);
                    }
                    f1Var2.b(c18);
                    k0Var.f483554c = f1Var2;
                    wVar.f505226q = false;
                    g17.c();
                    k0Var.f483555d = false;
                } finally {
                    g17.o(i17);
                }
            } catch (java.lang.Throwable th6) {
                g17.c();
                throw th6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        if ((!r2.isEmpty()) == true) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u1.w d(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q0.d(java.lang.Object):u1.w");
    }
}
