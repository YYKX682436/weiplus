package mr;

/* loaded from: classes10.dex */
public class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 {

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f412351f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f412352g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f412353h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f412355j;

    /* renamed from: n, reason: collision with root package name */
    public mr.a f412359n;

    /* renamed from: o, reason: collision with root package name */
    public mr.b f412360o;

    /* renamed from: p, reason: collision with root package name */
    public mr.c f412361p;

    /* renamed from: i, reason: collision with root package name */
    public float f412354i = 50.0f;

    /* renamed from: k, reason: collision with root package name */
    public final mr.h f412356k = new mr.h(this);

    /* renamed from: l, reason: collision with root package name */
    public final mr.g f412357l = new mr.g(this);

    /* renamed from: m, reason: collision with root package name */
    public int f412358m = -1;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        super.b(c1163xf1deaba4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f412353h;
        mr.h hVar = this.f412356k;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.V0(hVar);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f412353h;
        mr.g gVar = this.f412357l;
        if (c1163xf1deaba43 != null && (mo7946xf939df192 = c1163xf1deaba43.mo7946xf939df19()) != null) {
            mo7946xf939df192.mo8165x48eac7b3(gVar);
        }
        this.f412353h = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.i(hVar);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f412353h;
        if (c1163xf1deaba44 != null && (mo7946xf939df19 = c1163xf1deaba44.mo7946xf939df19()) != null) {
            mo7946xf939df19.mo8163xed962dec(gVar);
        }
        n();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3)) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f412353h;
        return new mr.d(this, layoutManager, c1163xf1deaba4 != null ? c1163xf1deaba4.getContext() : null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        android.view.View o17 = o(layoutManager);
        android.view.ViewGroup.LayoutParams layoutParams = o17 != null ? o17.getLayoutParams() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams : null;
        int a17 = layoutParams2 != null ? layoutParams2.a() : -1;
        if (this.f412358m != a17) {
            this.f412358m = a17;
            mr.a aVar = this.f412359n;
            if (aVar != null) {
                aVar.mo71861x510f45c9(a17);
            }
        }
        return o17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17, int i18) {
        int i19;
        int i27;
        android.graphics.PointF a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        int m8020x7e414b06 = layoutManager.m8020x7e414b06();
        if (m8020x7e414b06 == 0) {
            return -1;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 m17 = layoutManager.getF204840r() ? m(layoutManager) : l(layoutManager);
        android.view.View j17 = j(layoutManager, m17);
        if (j17 == null) {
            return -1;
        }
        int m8032xa86cd69f = layoutManager.m8032xa86cd69f(j17);
        if (m17.e(j17) < m17.k()) {
            i27 = m8032xa86cd69f + 1;
            i19 = m8032xa86cd69f;
        } else {
            i19 = m8032xa86cd69f - 1;
            i27 = m8032xa86cd69f;
        }
        if (m8032xa86cd69f == -1) {
            return -1;
        }
        boolean z17 = !layoutManager.mo2416xc6ea780e() ? i18 <= 0 : i17 <= 0;
        if (!((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) && (a17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) layoutManager).a(m8020x7e414b06 + (-1))) != null && (a17.x < 0.0f || a17.y < 0.0f)) ? z17 : !z17) {
            i19 = i27;
        }
        int i28 = i19 >= 0 ? i19 : 0;
        if (i28 >= m8020x7e414b06) {
            i28 = m8020x7e414b06 - 1;
        }
        if (i28 != this.f412358m) {
            this.f412358m = i28;
            mr.a aVar = this.f412359n;
            if (aVar != null) {
                aVar.mo71861x510f45c9(i28);
            }
        }
        return this.f412358m;
    }

    public final android.view.View j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 helper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        android.view.View view = null;
        if (m8008x3d79f549 == 0) {
            return null;
        }
        int k17 = layoutManager.m8009xf2b87f0() ? helper.k() + (helper.l() / 2) : helper.f() / 2;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
            android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i18);
            int abs = java.lang.Math.abs((helper.e(m8007x6a486239) + (helper.c(m8007x6a486239) / 2)) - k17);
            if (p(m8007x6a486239, layoutManager, helper)) {
                return m8007x6a486239;
            }
            if (abs < i17) {
                view = m8007x6a486239;
                i17 = abs;
            }
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0.f93792a != r2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 l(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager r2) {
        /*
            r1 = this;
            java.lang.String r0 = "layoutManager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            androidx.recyclerview.widget.w1 r0 = r1.f412352g
            if (r0 == 0) goto L10
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.f93792a
            if (r0 == r2) goto L17
        L10:
            androidx.recyclerview.widget.u1 r0 = new androidx.recyclerview.widget.u1
            r0.<init>(r2)
            r1.f412352g = r0
        L17:
            androidx.recyclerview.widget.w1 r2 = r1.f412352g
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.i.l(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.w1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0.f93792a != r2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 m(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager r2) {
        /*
            r1 = this;
            java.lang.String r0 = "layoutManager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            androidx.recyclerview.widget.w1 r0 = r1.f412351f
            if (r0 == 0) goto L10
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.f93792a
            if (r0 == r2) goto L17
        L10:
            androidx.recyclerview.widget.v1 r0 = new androidx.recyclerview.widget.v1
            r0.<init>(r2)
            r1.f412351f = r0
        L17:
            androidx.recyclerview.widget.w1 r2 = r1.f412351f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.i.m(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.w1");
    }

    public final void n() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d;
        android.view.View f17;
        mr.b bVar;
        if (this.f412360o == null || (c1163xf1deaba4 = this.f412353h) == null || (mo7951xfd37656d = c1163xf1deaba4.mo7951xfd37656d()) == null || (f17 = f(mo7951xfd37656d)) == null) {
            return;
        }
        int[] c17 = c(mo7951xfd37656d, f17);
        if ((c17[0] == 0 || c17[1] == 0) && (bVar = this.f412360o) != null) {
            bVar.a(this.f412358m);
        }
    }

    public android.view.View o(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        return super.f(layoutManager);
    }

    public boolean p(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 helper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        return false;
    }
}
