package bn2;

/* loaded from: classes14.dex */
public final class x implements bn2.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f22901a;

    /* renamed from: b, reason: collision with root package name */
    public final wm2.a f22902b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f22903c;

    /* renamed from: d, reason: collision with root package name */
    public final an2.i f22904d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f22905e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f22906f;

    /* renamed from: g, reason: collision with root package name */
    public xm2.a f22907g;

    /* renamed from: h, reason: collision with root package name */
    public final xm2.t f22908h;

    public x(android.view.ViewGroup containerView, wm2.a packages, android.view.ViewGroup navigatorContainerView, an2.i navigatorWidget) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(packages, "packages");
        kotlin.jvm.internal.o.g(navigatorContainerView, "navigatorContainerView");
        kotlin.jvm.internal.o.g(navigatorWidget, "navigatorWidget");
        this.f22901a = containerView;
        this.f22902b = packages;
        this.f22903c = navigatorContainerView;
        this.f22904d = navigatorWidget;
        android.view.View inflate = android.view.LayoutInflater.from(containerView.getContext()).inflate(com.tencent.mm.R.layout.e8x, containerView, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f22905e = viewGroup;
        this.f22906f = navigatorWidget.f8855a;
        bn2.w wVar = new bn2.w(this);
        bn2.v vVar = new bn2.v(this);
        lo0.p0 p0Var = packages.f447229c;
        this.f22908h = new xm2.t(viewGroup, p0Var.f320061b, p0Var.f320063d, new ym2.e(), wVar, vVar);
    }

    @Override // bn2.p
    public android.view.ViewGroup a() {
        return this.f22906f;
    }

    @Override // bn2.p
    public android.view.ViewGroup e() {
        return this.f22905e;
    }

    @Override // bn2.p
    public void f() {
        this.f22904d.f8857c = new bn2.u(this);
        this.f22908h.a();
    }

    @Override // bn2.p
    public void g(xm2.a aVar) {
        this.f22907g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if (r0.h() == true) goto L23;
     */
    @Override // bn2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r10 = this;
            dk2.ug r0 = dk2.ug.f234218a
            wm2.a r1 = r10.f22902b
            lo0.p0 r2 = r1.f447229c
            java.lang.String r3 = "makeupPackage"
            kotlin.jvm.internal.o.g(r2, r3)
            boolean r3 = r2.f320060a
            if (r3 != 0) goto L10
            goto L2f
        L10:
            lo0.k0 r3 = r2.f320063d
            java.lang.String r3 = r3.f320035a
            r0.g(r3)
            java.util.List r0 = r2.f320061b
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            lo0.k0 r2 = (lo0.k0) r2
            dk2.ug r3 = dk2.ug.f234218a
            r3.f(r2)
            goto L1d
        L2f:
            ko0.c0 r0 = ko0.c0.f309825a
            lo0.g0 r2 = r1.f447231e
            r0.h(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            lo0.p0 r1 = r1.f447229c
            lo0.k0 r1 = r1.f320063d
            java.util.List r2 = r1.f320040f
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L72
            java.lang.Object r3 = r2.next()
            lo0.h0 r3 = (lo0.h0) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.f319997a
            r4.append(r5)
            r5 = 58
            r4.append(r5)
            double r5 = r3.f320006j
            r4.append(r5)
            r3 = 35
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.append(r3)
            goto L45
        L72:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "type"
            java.lang.String r4 = "1"
            r2.put(r3, r4)
            java.lang.String r3 = "model_type"
            java.lang.String r1 = r1.f320035a
            r2.put(r3, r1)
            java.lang.String r1 = "detail_set_list"
            java.lang.String r0 = r0.toString()
            r2.put(r1, r0)
            tn0.w0 r0 = dk2.ef.f233378d
            if (r0 == 0) goto La6
            hn0.f r0 = r0.f420773t
            if (r0 == 0) goto La6
            hn0.p r0 = (hn0.p) r0
            kn0.p r0 = r0.c()
            if (r0 == 0) goto La6
            boolean r0 = r0.h()
            r1 = 1
            if (r0 != r1) goto La6
            goto La7
        La6:
            r1 = 0
        La7:
            java.lang.String r0 = "getService(...)"
            java.lang.Class<ml2.j0> r3 = ml2.j0.class
            if (r1 == 0) goto Lc4
            i95.m r1 = i95.n0.c(r3)
            kotlin.jvm.internal.o.f(r1, r0)
            r3 = r1
            zy2.zb r3 = (zy2.zb) r3
            ml2.z4 r4 = ml2.z4.U
            java.lang.String r5 = r2.toString()
            r6 = 0
            r7 = 4
            r8 = 0
            zy2.zb.y6(r3, r4, r5, r6, r7, r8)
            goto Ldc
        Lc4:
            i95.m r1 = i95.n0.c(r3)
            kotlin.jvm.internal.o.f(r1, r0)
            r3 = r1
            zy2.zb r3 = (zy2.zb) r3
            ml2.c1 r0 = ml2.c1.f327325e
            r4 = 28
            java.lang.String r6 = r2.toString()
            r7 = 0
            r8 = 4
            r9 = 0
            zy2.zb.j5(r3, r4, r6, r7, r8, r9)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.x.h():void");
    }
}
