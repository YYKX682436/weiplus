package oj5;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f427397c;

    /* renamed from: d, reason: collision with root package name */
    public final oj5.q f427398d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f427399e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f427400f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f427401g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f427402h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f427403i;

    /* renamed from: j, reason: collision with root package name */
    public final oj5.h f427404j;

    /* renamed from: k, reason: collision with root package name */
    public final oj5.n f427405k;

    /* renamed from: l, reason: collision with root package name */
    public oj5.g f427406l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f427407m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f427408n;

    public o(java.lang.String TAG, int i17, int i18, oj5.q boundCaches, boolean z17, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 handler, int[] records) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TAG, "TAG");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boundCaches, "boundCaches");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(records, "records");
        this.f427395a = TAG;
        this.f427396b = i17;
        this.f427397c = i18;
        this.f427398d = boundCaches;
        this.f427399e = z17;
        this.f427400f = handler;
        this.f427401g = records;
        this.f427403i = jz5.h.b(new oj5.l(this));
        this.f427404j = new oj5.h(this);
        this.f427405k = new oj5.n(this);
        this.f427407m = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f427408n = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    public static final void a(oj5.o oVar) {
        oVar.f427407m.set(oVar.f427408n.incrementAndGet());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(oj5.o r17, boolean r18, java.lang.String r19, long r20, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj5.o.b(oj5.o, boolean, java.lang.String, long, int, java.lang.Object):void");
    }

    public final void c(android.util.Range range, int i17, java.util.ArrayList arrayList) {
        java.lang.Integer num = (java.lang.Integer) (i17 > 0 ? range.getLower() : range.getUpper());
        java.lang.Integer num2 = (java.lang.Integer) (i17 > 0 ? range.getUpper() : range.getLower());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
        int intValue2 = num2.intValue();
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i17 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        int a17 = sz5.b.a(intValue, intValue2, i17);
        if ((i17 <= 0 || intValue > a17) && (i17 >= 0 || a17 > intValue)) {
            return;
        }
        while (true) {
            arrayList.add(java.lang.Integer.valueOf(intValue));
            if (intValue == a17) {
                return;
            } else {
                intValue += i17;
            }
        }
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f427402h;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df19 == null || i17 < 0 || this.f427398d.values().size() >= this.f427397c) {
            return null;
        }
        int mo863xcdaf1228 = mo7946xf939df19.mo863xcdaf1228(i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f427402h;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 b17 = c1163xf1deaba42.m7957x4145728().b(mo863xcdaf1228);
        if (b17 == null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f427402h;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            b17 = mo7946xf939df19.m8142xeac316cd(c1163xf1deaba43, mo863xcdaf1228);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        android.view.ViewGroup.LayoutParams layoutParams = b17.f3639x46306858.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2);
        }
        b17.f3639x46306858.setLayoutParams(layoutParams);
        jz5.g gVar = oj5.x.f427439a;
        java.lang.reflect.Field declaredField = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams.class.getDeclaredField("d");
        declaredField.setAccessible(true);
        declaredField.set((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams, b17);
        z2Var.b(b17.f3639x46306858, i17);
        return b17;
    }
}
