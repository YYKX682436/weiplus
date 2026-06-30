package cy3;

/* loaded from: classes10.dex */
public final class a0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f306282f;

    /* renamed from: h, reason: collision with root package name */
    public cy3.v f306284h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f306285i;

    /* renamed from: j, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f306286j;

    /* renamed from: g, reason: collision with root package name */
    public int f306283g = -1;

    /* renamed from: k, reason: collision with root package name */
    public final cy3.z f306287k = new cy3.z(this);

    /* renamed from: l, reason: collision with root package name */
    public final cy3.y f306288l = new cy3.y(this);

    public a0(int i17) {
        this.f306282f = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        super.b(c1163xf1deaba4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f306286j;
        cy3.z zVar = this.f306287k;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.V0(zVar);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f306286j;
        cy3.y yVar = this.f306288l;
        if (c1163xf1deaba43 != null && (mo7946xf939df192 = c1163xf1deaba43.mo7946xf939df19()) != null) {
            mo7946xf939df192.mo8165x48eac7b3(yVar);
        }
        this.f306286j = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.i(zVar);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f306286j;
        if (c1163xf1deaba44 == null || (mo7946xf939df19 = c1163xf1deaba44.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.mo8163xed962dec(yVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View targetView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        int[] iArr = new int[2];
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 m17 = m(layoutManager);
        int e17 = m17.e(targetView);
        int k17 = m17.k();
        if (this.f306283g > 0) {
            k17 += this.f306282f;
        }
        iArr[1] = e17 - k17;
        return iArr;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        return e(layoutManager);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        android.view.View n17 = n(layoutManager, m(layoutManager));
        android.view.ViewGroup.LayoutParams layoutParams = n17 != null ? n17.getLayoutParams() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams : null;
        int a17 = layoutParams2 != null ? layoutParams2.a() : -1;
        int i17 = this.f306283g;
        if (i17 == 0 && a17 == 1) {
            return null;
        }
        if (i17 != a17) {
            this.f306283g = a17;
            cy3.v vVar = this.f306284h;
            if (vVar != null) {
                vVar.mo63123x510f45c9(a17);
            }
        }
        return n17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r8 = "layoutManager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r8)
            int r8 = r7.m8020x7e414b06()
            r0 = -1
            if (r8 != 0) goto Ld
            return r0
        Ld:
            androidx.recyclerview.widget.w1 r1 = r6.m(r7)
            android.view.View r1 = r6.n(r7, r1)
            if (r1 != 0) goto L18
            return r0
        L18:
            int r1 = r7.m8032xa86cd69f(r1)
            if (r1 != r0) goto L1f
            return r0
        L1f:
            r2 = 0
            r3 = 1
            if (r9 <= 0) goto L25
            r9 = r3
            goto L26
        L25:
            r9 = r2
        L26:
            boolean r4 = r7 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3
            if (r4 == 0) goto L43
            androidx.recyclerview.widget.f3 r7 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) r7
            int r4 = r8 + (-1)
            android.graphics.PointF r7 = r7.a(r4)
            if (r7 == 0) goto L43
            float r4 = r7.x
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L41
            float r7 = r7.y
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L43
        L41:
            r7 = r3
            goto L44
        L43:
            r7 = r2
        L44:
            int r4 = r6.f306283g
            if (r1 == r4) goto L49
            goto L55
        L49:
            if (r7 == 0) goto L4e
            if (r9 == 0) goto L50
            goto L53
        L4e:
            if (r9 == 0) goto L53
        L50:
            int r1 = r1 + 1
            goto L55
        L53:
            int r1 = r1 + (-1)
        L55:
            if (r4 == r0) goto L63
            int r4 = r4 + r3
            int r7 = java.lang.Math.min(r1, r4)
            int r1 = r6.f306283g
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r7, r1)
        L63:
            int r7 = r6.f306282f
            if (r7 <= 0) goto L72
            if (r9 != 0) goto L72
            if (r1 != r3) goto L72
            int r7 = r6.f306283g
            if (r7 == r0) goto L71
            if (r7 != 0) goto L72
        L71:
            r1 = r2
        L72:
            if (r1 >= 0) goto L75
            goto L76
        L75:
            r2 = r1
        L76:
            if (r2 < r8) goto L7a
            int r2 = r8 + (-1)
        L7a:
            int r7 = r6.f306283g
            if (r2 == r7) goto L87
            r6.f306283g = r2
            cy3.v r7 = r6.f306284h
            if (r7 == 0) goto L87
            r7.mo63123x510f45c9(r2)
        L87:
            int r7 = r6.f306283g
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cy3.a0.g(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.f93792a != r2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 m(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager r2) {
        /*
            r1 = this;
            androidx.recyclerview.widget.w1 r0 = r1.f306285i
            if (r0 == 0) goto Lb
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.f93792a
            if (r0 == r2) goto L12
        Lb:
            androidx.recyclerview.widget.v1 r0 = new androidx.recyclerview.widget.v1
            r0.<init>(r2)
            r1.f306285i = r0
        L12:
            androidx.recyclerview.widget.w1 r2 = r1.f306285i
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cy3.a0.m(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.w1");
    }

    public final android.view.View n(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var) {
        int m8008x3d79f549;
        int abs;
        android.view.View view = null;
        if (layoutManager == null || (m8008x3d79f549 = layoutManager.m8008x3d79f549()) == 0) {
            return null;
        }
        int k17 = w1Var.k();
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
            android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i18);
            if (m8007x6a486239 != null && layoutManager.m8032xa86cd69f(m8007x6a486239) != 0 && (abs = java.lang.Math.abs(w1Var.e(m8007x6a486239) - k17)) < i17) {
                view = m8007x6a486239;
                i17 = abs;
            }
        }
        return view;
    }
}
