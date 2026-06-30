package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.ThreadLocal f12205h = new java.lang.ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Comparator f12206i = new androidx.recyclerview.widget.o0();

    /* renamed from: e, reason: collision with root package name */
    public long f12208e;

    /* renamed from: f, reason: collision with root package name */
    public long f12209f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f12207d = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f12210g = new java.util.ArrayList();

    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        if (recyclerView.isAttachedToWindow() && this.f12208e == 0) {
            this.f12208e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.recyclerview.widget.p0 p0Var = recyclerView.E1;
        p0Var.f12185a = i17;
        p0Var.f12186b = i18;
    }

    public void b(long j17) {
        androidx.recyclerview.widget.q0 q0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.q0 q0Var2;
        java.util.ArrayList arrayList = this.f12207d;
        int size = arrayList.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i18);
            if (recyclerView3.getWindowVisibility() == 0) {
                androidx.recyclerview.widget.p0 p0Var = recyclerView3.E1;
                p0Var.b(recyclerView3, false);
                i17 += p0Var.f12188d;
            }
        }
        java.util.ArrayList arrayList2 = this.f12210g;
        arrayList2.ensureCapacity(i17);
        int i19 = 0;
        for (int i27 = 0; i27 < size; i27++) {
            androidx.recyclerview.widget.RecyclerView recyclerView4 = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i27);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.recyclerview.widget.p0 p0Var2 = recyclerView4.E1;
                int abs = java.lang.Math.abs(p0Var2.f12185a) + java.lang.Math.abs(p0Var2.f12186b);
                for (int i28 = 0; i28 < p0Var2.f12188d * 2; i28 += 2) {
                    if (i19 >= arrayList2.size()) {
                        q0Var2 = new androidx.recyclerview.widget.q0();
                        arrayList2.add(q0Var2);
                    } else {
                        q0Var2 = (androidx.recyclerview.widget.q0) arrayList2.get(i19);
                    }
                    int[] iArr = p0Var2.f12187c;
                    int i29 = iArr[i28 + 1];
                    q0Var2.f12195a = i29 <= abs;
                    q0Var2.f12196b = abs;
                    q0Var2.f12197c = i29;
                    q0Var2.f12198d = recyclerView4;
                    q0Var2.f12199e = iArr[i28];
                    i19++;
                }
            }
        }
        java.util.Collections.sort(arrayList2, f12206i);
        for (int i37 = 0; i37 < arrayList2.size() && (recyclerView = (q0Var = (androidx.recyclerview.widget.q0) arrayList2.get(i37)).f12198d) != null; i37++) {
            androidx.recyclerview.widget.k3 c17 = c(recyclerView, q0Var.f12199e, q0Var.f12195a ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : j17);
            if (c17 != null && c17.mNestedRecyclerView != null && c17.isBound() && !c17.isInvalid() && (recyclerView2 = c17.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.I && recyclerView2.f11891h.h() != 0) {
                    recyclerView2.R0();
                }
                androidx.recyclerview.widget.p0 p0Var3 = recyclerView2.E1;
                p0Var3.b(recyclerView2, true);
                if (p0Var3.f12188d != 0) {
                    try {
                        java.lang.reflect.Method method = j3.v.f297343b;
                        j3.t.a("RV Nested Prefetch");
                        androidx.recyclerview.widget.h3 h3Var = recyclerView2.F1;
                        androidx.recyclerview.widget.f2 f2Var = recyclerView2.f11901r;
                        h3Var.f12062d = 1;
                        h3Var.f12063e = f2Var.getItemCount();
                        h3Var.f12065g = false;
                        h3Var.f12066h = false;
                        h3Var.f12067i = false;
                        for (int i38 = 0; i38 < p0Var3.f12188d * 2; i38 += 2) {
                            c(recyclerView2, p0Var3.f12187c[i38], j17);
                        }
                        j3.t.b();
                        q0Var.f12195a = false;
                        q0Var.f12196b = 0;
                        q0Var.f12197c = 0;
                        q0Var.f12198d = null;
                        q0Var.f12199e = 0;
                    } catch (java.lang.Throwable th6) {
                        java.lang.reflect.Method method2 = j3.v.f297343b;
                        j3.t.b();
                        throw th6;
                    }
                }
            }
            q0Var.f12195a = false;
            q0Var.f12196b = 0;
            q0Var.f12197c = 0;
            q0Var.f12198d = null;
            q0Var.f12199e = 0;
        }
    }

    public final androidx.recyclerview.widget.k3 c(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, long j17) {
        boolean z17;
        int h17 = recyclerView.f11891h.h();
        int i18 = 0;
        while (true) {
            if (i18 >= h17) {
                z17 = false;
                break;
            }
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(recyclerView.f11891h.g(i18));
            if (x07.mPosition == i17 && !x07.isInvalid()) {
                z17 = true;
                break;
            }
            i18++;
        }
        if (z17) {
            return null;
        }
        androidx.recyclerview.widget.z2 z2Var = recyclerView.f11888e;
        try {
            recyclerView.I0();
            androidx.recyclerview.widget.k3 m17 = z2Var.m(i17, false, j17);
            if (m17 != null) {
                if (!m17.isBound() || m17.isInvalid()) {
                    z2Var.a(m17, false);
                } else {
                    z2Var.i(m17.itemView);
                }
            }
            return m17;
        } finally {
            recyclerView.J0(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.reflect.Method method = j3.v.f297343b;
            j3.t.a("RV Prefetch");
            java.util.ArrayList arrayList = this.f12207d;
            if (arrayList.isEmpty()) {
                this.f12208e = 0L;
                j3.t.b();
                return;
            }
            int size = arrayList.size();
            long j17 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) arrayList.get(i17);
                if (recyclerView.getWindowVisibility() == 0) {
                    j17 = java.lang.Math.max(recyclerView.getDrawingTime(), j17);
                }
            }
            if (j17 == 0) {
                this.f12208e = 0L;
                j3.t.b();
            } else {
                b(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j17) + this.f12209f);
                this.f12208e = 0L;
                j3.t.b();
            }
        } catch (java.lang.Throwable th6) {
            this.f12208e = 0L;
            java.lang.reflect.Method method2 = j3.v.f297343b;
            j3.t.b();
            throw th6;
        }
    }
}
