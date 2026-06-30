package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.ThreadLocal f93738h = new java.lang.ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Comparator f93739i = new p012xc85e97e9.p103xe821e364.p104xd1075a44.o0();

    /* renamed from: e, reason: collision with root package name */
    public long f93741e;

    /* renamed from: f, reason: collision with root package name */
    public long f93742f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f93740d = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f93743g = new java.util.ArrayList();

    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        if (c1163xf1deaba4.isAttachedToWindow() && this.f93741e == 0) {
            this.f93741e = c1163xf1deaba4.m7954xebd10517();
            c1163xf1deaba4.post(this);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.p0 p0Var = c1163xf1deaba4.E1;
        p0Var.f93718a = i17;
        p0Var.f93719b = i18;
    }

    public void b(long j17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.q0 q0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.q0 q0Var2;
        java.util.ArrayList arrayList = this.f93740d;
        int size = arrayList.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) arrayList.get(i18);
            if (c1163xf1deaba43.getWindowVisibility() == 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.p0 p0Var = c1163xf1deaba43.E1;
                p0Var.b(c1163xf1deaba43, false);
                i17 += p0Var.f93721d;
            }
        }
        java.util.ArrayList arrayList2 = this.f93743g;
        arrayList2.ensureCapacity(i17);
        int i19 = 0;
        for (int i27 = 0; i27 < size; i27++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) arrayList.get(i27);
            if (c1163xf1deaba44.getWindowVisibility() == 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.p0 p0Var2 = c1163xf1deaba44.E1;
                int abs = java.lang.Math.abs(p0Var2.f93718a) + java.lang.Math.abs(p0Var2.f93719b);
                for (int i28 = 0; i28 < p0Var2.f93721d * 2; i28 += 2) {
                    if (i19 >= arrayList2.size()) {
                        q0Var2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.q0();
                        arrayList2.add(q0Var2);
                    } else {
                        q0Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.q0) arrayList2.get(i19);
                    }
                    int[] iArr = p0Var2.f93720c;
                    int i29 = iArr[i28 + 1];
                    q0Var2.f93728a = i29 <= abs;
                    q0Var2.f93729b = abs;
                    q0Var2.f93730c = i29;
                    q0Var2.f93731d = c1163xf1deaba44;
                    q0Var2.f93732e = iArr[i28];
                    i19++;
                }
            }
        }
        java.util.Collections.sort(arrayList2, f93739i);
        for (int i37 = 0; i37 < arrayList2.size() && (c1163xf1deaba4 = (q0Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.q0) arrayList2.get(i37)).f93731d) != null; i37++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c17 = c(c1163xf1deaba4, q0Var.f93732e, q0Var.f93728a ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : j17);
            if (c17 != null && c17.f3645x8e83ad68 != null && c17.m8192x7a81e674() && !c17.m8193x5241396d() && (c1163xf1deaba42 = c17.f3645x8e83ad68.get()) != null) {
                if (c1163xf1deaba42.I && c1163xf1deaba42.f93424h.h() != 0) {
                    c1163xf1deaba42.R0();
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.p0 p0Var3 = c1163xf1deaba42.E1;
                p0Var3.b(c1163xf1deaba42, true);
                if (p0Var3.f93721d != 0) {
                    try {
                        java.lang.reflect.Method method = j3.v.f378876b;
                        j3.t.a("RV Nested Prefetch");
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = c1163xf1deaba42.F1;
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = c1163xf1deaba42.f93434r;
                        h3Var.f93595d = 1;
                        h3Var.f93596e = f2Var.mo1894x7e414b06();
                        h3Var.f93598g = false;
                        h3Var.f93599h = false;
                        h3Var.f93600i = false;
                        for (int i38 = 0; i38 < p0Var3.f93721d * 2; i38 += 2) {
                            c(c1163xf1deaba42, p0Var3.f93720c[i38], j17);
                        }
                        j3.t.b();
                        q0Var.f93728a = false;
                        q0Var.f93729b = 0;
                        q0Var.f93730c = 0;
                        q0Var.f93731d = null;
                        q0Var.f93732e = 0;
                    } catch (java.lang.Throwable th6) {
                        java.lang.reflect.Method method2 = j3.v.f378876b;
                        j3.t.b();
                        throw th6;
                    }
                }
            }
            q0Var.f93728a = false;
            q0Var.f93729b = 0;
            q0Var.f93730c = 0;
            q0Var.f93731d = null;
            q0Var.f93732e = 0;
        }
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, long j17) {
        boolean z17;
        int h17 = c1163xf1deaba4.f93424h.h();
        int i18 = 0;
        while (true) {
            if (i18 >= h17) {
                z17 = false;
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(c1163xf1deaba4.f93424h.g(i18));
            if (x07.f3650x519040b6 == i17 && !x07.m8193x5241396d()) {
                z17 = true;
                break;
            }
            i18++;
        }
        if (z17) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var = c1163xf1deaba4.f93421e;
        try {
            c1163xf1deaba4.I0();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m17 = z2Var.m(i17, false, j17);
            if (m17 != null) {
                if (!m17.m8192x7a81e674() || m17.m8193x5241396d()) {
                    z2Var.a(m17, false);
                } else {
                    z2Var.i(m17.f3639x46306858);
                }
            }
            return m17;
        } finally {
            c1163xf1deaba4.J0(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.reflect.Method method = j3.v.f378876b;
            j3.t.a("RV Prefetch");
            java.util.ArrayList arrayList = this.f93740d;
            if (arrayList.isEmpty()) {
                this.f93741e = 0L;
                j3.t.b();
                return;
            }
            int size = arrayList.size();
            long j17 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) arrayList.get(i17);
                if (c1163xf1deaba4.getWindowVisibility() == 0) {
                    j17 = java.lang.Math.max(c1163xf1deaba4.getDrawingTime(), j17);
                }
            }
            if (j17 == 0) {
                this.f93741e = 0L;
                j3.t.b();
            } else {
                b(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j17) + this.f93742f);
                this.f93741e = 0L;
                j3.t.b();
            }
        } catch (java.lang.Throwable th6) {
            this.f93741e = 0L;
            java.lang.reflect.Method method2 = j3.v.f378876b;
            j3.t.b();
            throw th6;
        }
    }
}
