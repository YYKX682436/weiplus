package bn2;

/* loaded from: classes14.dex */
public final class x implements bn2.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f104434a;

    /* renamed from: b, reason: collision with root package name */
    public final wm2.a f104435b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f104436c;

    /* renamed from: d, reason: collision with root package name */
    public final an2.i f104437d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f104438e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f104439f;

    /* renamed from: g, reason: collision with root package name */
    public xm2.a f104440g;

    /* renamed from: h, reason: collision with root package name */
    public final xm2.t f104441h;

    public x(android.view.ViewGroup containerView, wm2.a packages, android.view.ViewGroup navigatorContainerView, an2.i navigatorWidget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packages, "packages");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigatorContainerView, "navigatorContainerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigatorWidget, "navigatorWidget");
        this.f104434a = containerView;
        this.f104435b = packages;
        this.f104436c = navigatorContainerView;
        this.f104437d = navigatorWidget;
        android.view.View inflate = android.view.LayoutInflater.from(containerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8x, containerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f104438e = viewGroup;
        this.f104439f = navigatorWidget.f90388a;
        bn2.w wVar = new bn2.w(this);
        bn2.v vVar = new bn2.v(this);
        lo0.p0 p0Var = packages.f528762c;
        this.f104441h = new xm2.t(viewGroup, p0Var.f401594b, p0Var.f401596d, new ym2.e(), wVar, vVar);
    }

    @Override // bn2.p
    public android.view.ViewGroup a() {
        return this.f104439f;
    }

    @Override // bn2.p
    public android.view.ViewGroup e() {
        return this.f104438e;
    }

    @Override // bn2.p
    public void f() {
        this.f104437d.f90390c = new bn2.u(this);
        this.f104441h.a();
    }

    @Override // bn2.p
    public void g(xm2.a aVar) {
        this.f104440g = aVar;
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
            dk2.ug r0 = dk2.ug.f315751a
            wm2.a r1 = r10.f104435b
            lo0.p0 r2 = r1.f528762c
            java.lang.String r3 = "makeupPackage"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            boolean r3 = r2.f401593a
            if (r3 != 0) goto L10
            goto L2f
        L10:
            lo0.k0 r3 = r2.f401596d
            java.lang.String r3 = r3.f401568a
            r0.g(r3)
            java.util.List r0 = r2.f401594b
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            lo0.k0 r2 = (lo0.k0) r2
            dk2.ug r3 = dk2.ug.f315751a
            r3.f(r2)
            goto L1d
        L2f:
            ko0.c0 r0 = ko0.c0.f391358a
            lo0.g0 r2 = r1.f528764e
            r0.h(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            lo0.p0 r1 = r1.f528762c
            lo0.k0 r1 = r1.f401596d
            java.util.List r2 = r1.f401573f
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L72
            java.lang.Object r3 = r2.next()
            lo0.h0 r3 = (lo0.h0) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.f401530a
            r4.append(r5)
            r5 = 58
            r4.append(r5)
            double r5 = r3.f401539j
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
            java.lang.String r1 = r1.f401568a
            r2.put(r3, r1)
            java.lang.String r1 = "detail_set_list"
            java.lang.String r0 = r0.toString()
            r2.put(r1, r0)
            tn0.w0 r0 = dk2.ef.f314911d
            if (r0 == 0) goto La6
            hn0.f r0 = r0.f502306t
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r0)
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r0)
            r3 = r1
            zy2.zb r3 = (zy2.zb) r3
            ml2.c1 r0 = ml2.c1.f408858e
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
