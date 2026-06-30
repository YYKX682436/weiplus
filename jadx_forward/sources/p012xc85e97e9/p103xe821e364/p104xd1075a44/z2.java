package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f93842a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f93843b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f93844c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f93845d;

    /* renamed from: e, reason: collision with root package name */
    public int f93846e;

    /* renamed from: f, reason: collision with root package name */
    public int f93847f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 f93848g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.i3 f93849h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93850i;

    public z2(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f93850i = c1163xf1deaba4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f93842a = arrayList;
        this.f93843b = null;
        this.f93844c = new java.util.ArrayList();
        this.f93845d = java.util.Collections.unmodifiableList(arrayList);
        this.f93846e = 2;
        this.f93847f = 2;
    }

    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.R(k3Var);
        if (k3Var.m8190x1d788e1f(16384)) {
            k3Var.m8205x52fbaf45(0, 16384);
            n3.l1.l(k3Var.f3639x46306858, null);
        }
        if (z17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93850i;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.a3 a3Var = c1163xf1deaba4.f93436t;
            if (a3Var != null) {
                oj5.r rVar = ((oj5.c) a3Var).f427370a;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) rVar.f427415e.get(java.lang.Integer.valueOf(k3Var.m8183xf806b362()));
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k3Var2, k3Var) || (k3Var2 instanceof oj5.p)) {
                    rVar.f427415e.remove(java.lang.Integer.valueOf(k3Var.m8183xf806b362()));
                }
                android.view.View itemView = k3Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                oj5.r.a(rVar, itemView);
                android.view.View itemView2 = k3Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
                rVar.c(itemView2, true);
                android.view.View itemView3 = k3Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
                rVar.d(itemView3, true);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = c1163xf1deaba4.f93434r;
            if (f2Var != null) {
                f2Var.mo8162x34789575(k3Var);
            }
            if (c1163xf1deaba4.F1 != null) {
                c1163xf1deaba4.f93425i.d(k3Var);
            }
        }
        k3Var.f3647x5256b0ea = null;
        e().d(k3Var);
    }

    public void b(android.view.View view, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93850i;
        if (x07 == null) {
            throw new java.lang.IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + c1163xf1deaba4.i0());
        }
        int f17 = c1163xf1deaba4.f93423g.f(i17, 0);
        if (f17 < 0 || f17 >= c1163xf1deaba4.f93434r.mo1894x7e414b06()) {
            throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i17 + "(offset:" + f17 + ").state:" + c1163xf1deaba4.F1.b() + c1163xf1deaba4.i0());
        }
        l(x07, f17, i17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        android.view.ViewGroup.LayoutParams layoutParams2 = x07.f3639x46306858.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) c1163xf1deaba4.generateDefaultLayoutParams();
            x07.f3639x46306858.setLayoutParams(layoutParams);
        } else if (c1163xf1deaba4.checkLayoutParams(layoutParams2)) {
            layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams2;
        } else {
            layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) c1163xf1deaba4.generateLayoutParams(layoutParams2);
            x07.f3639x46306858.setLayoutParams(layoutParams);
        }
        layoutParams.f93450f = true;
        layoutParams.f93448d = x07;
        layoutParams.f93451g = x07.f3639x46306858.getParent() == null;
    }

    public void c() {
        this.f93842a.clear();
        g();
    }

    public int d(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93850i;
        if (i17 >= 0 && i17 < c1163xf1deaba4.F1.b()) {
            return !c1163xf1deaba4.F1.f93598g ? i17 : c1163xf1deaba4.f93423g.f(i17, 0);
        }
        throw new java.lang.IndexOutOfBoundsException("invalid position " + i17 + ". State item count is " + c1163xf1deaba4.F1.b() + c1163xf1deaba4.i0());
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 e() {
        if (this.f93848g == null) {
            this.f93848g = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y2();
        }
        return this.f93848g;
    }

    public android.view.View f(int i17) {
        return m(i17, false, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697).f3639x46306858;
    }

    public void g() {
        java.util.ArrayList arrayList = this.f93844c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        int[] iArr = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.X1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.p0 p0Var = this.f93850i.E1;
        int[] iArr2 = p0Var.f93720c;
        if (iArr2 != null) {
            java.util.Arrays.fill(iArr2, -1);
        }
        p0Var.f93721d = 0;
    }

    public void h(int i17) {
        java.util.ArrayList arrayList = this.f93844c;
        a((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.get(i17), true);
        arrayList.remove(i17);
    }

    public void i(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
        if (x07.m8197x46e8461f()) {
            this.f93850i.removeDetachedView(view, false);
        }
        if (x07.m8196x7b6bf4c7()) {
            x07.m8212xedae80b8();
        } else if (x07.m8213xd93a794f()) {
            x07.m8179x969a8877();
        }
        j(x07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007b, code lost:
    
        if (r6 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007d, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
    
        if (r5 < 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0081, code lost:
    
        r6 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) r4.get(r5)).f3650x519040b6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
    
        if (r7.f93720c == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008d, code lost:
    
        r8 = r7.f93721d * 2;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
    
        if (r9 >= r8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
    
        if (r7.f93720c[r9] != r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009c, code lost:
    
        r9 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        if (r6 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a2, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009f, code lost:
    
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r12) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.z2.j(androidx.recyclerview.widget.k3):void");
    }

    public void k(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
        boolean m8190x1d788e1f = x07.m8190x1d788e1f(12);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93850i;
        if (!m8190x1d788e1f && x07.m8198xcf782831()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 n2Var = c1163xf1deaba4.S;
            if (!(n2Var == null || n2Var.g(x07, x07.m8189x6729fd1d()))) {
                if (this.f93843b == null) {
                    this.f93843b = new java.util.ArrayList();
                }
                x07.m8207x80b394b2(this, true);
                this.f93843b.add(x07);
                return;
            }
        }
        if (!x07.m8193x5241396d() || x07.m8195x1e855fd6() || c1163xf1deaba4.f93434r.m8145x24a16003()) {
            x07.m8207x80b394b2(this, false);
            this.f93842a.add(x07);
        } else {
            throw new java.lang.IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + c1163xf1deaba4.i0());
        }
    }

    public final boolean l(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18, long j17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93850i;
        k3Var.f3647x5256b0ea = c1163xf1deaba4;
        int m8185xcdaf1228 = k3Var.m8185xcdaf1228();
        long m7954xebd10517 = c1163xf1deaba4.m7954xebd10517();
        if (j17 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            long j18 = this.f93848g.c(m8185xcdaf1228).f93808d;
            if (!(j18 == 0 || j18 + m7954xebd10517 < j17)) {
                return false;
            }
        }
        c1163xf1deaba4.f93434r.m8141xb7153cce(k3Var, i17);
        long m7954xebd105172 = c1163xf1deaba4.m7954xebd10517() - m7954xebd10517;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.x2 c17 = this.f93848g.c(k3Var.m8185xcdaf1228());
        long j19 = c17.f93808d;
        if (j19 != 0) {
            m7954xebd105172 = (m7954xebd105172 / 4) + ((j19 / 4) * 3);
        }
        c17.f93808d = m7954xebd105172;
        android.view.accessibility.AccessibilityManager accessibilityManager = c1163xf1deaba4.G;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            android.view.View view = k3Var.f3639x46306858;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.u0.c(view) == 0) {
                n3.u0.s(view, 1);
            }
            if (!(n3.l1.f(view) != null)) {
                k3Var.m8176xb4f2c266(16384);
                n3.l1.l(view, c1163xf1deaba4.M1.b());
            }
        }
        if (c1163xf1deaba4.F1.f93598g) {
            k3Var.f3651x72565b09 = i18;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x02cb, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m(int r20, boolean r21, long r22) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.z2.m(int, boolean, long):androidx.recyclerview.widget.k3");
    }

    public void n(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (k3Var.f3641x7d3c7c2f) {
            this.f93843b.remove(k3Var);
        } else {
            this.f93842a.remove(k3Var);
        }
        k3Var.f3652xd0d8697d = null;
        k3Var.f3641x7d3c7c2f = false;
        k3Var.m8179x969a8877();
    }

    public void o() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93850i.f93435s;
        this.f93847f = this.f93846e + (layoutManager != null ? layoutManager.f3600x5b55db97 : 0);
        java.util.ArrayList arrayList = this.f93844c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f93847f; size--) {
            h(size);
        }
    }
}
