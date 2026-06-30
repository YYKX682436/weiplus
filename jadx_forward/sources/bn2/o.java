package bn2;

/* loaded from: classes14.dex */
public final class o implements bn2.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f104410a;

    /* renamed from: b, reason: collision with root package name */
    public final wm2.a f104411b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f104412c;

    /* renamed from: d, reason: collision with root package name */
    public final an2.i f104413d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f104414e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f104415f;

    /* renamed from: g, reason: collision with root package name */
    public xm2.a f104416g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f104417h;

    /* renamed from: i, reason: collision with root package name */
    public final xm2.t f104418i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f104419j;

    public o(android.view.ViewGroup containerView, wm2.a packages, android.view.ViewGroup navigatorContainerView, an2.i navigatorWidget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packages, "packages");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigatorContainerView, "navigatorContainerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigatorWidget, "navigatorWidget");
        this.f104410a = containerView;
        this.f104411b = packages;
        this.f104412c = navigatorContainerView;
        this.f104413d = navigatorWidget;
        android.view.View inflate = android.view.LayoutInflater.from(containerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8x, containerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f104414e = viewGroup;
        this.f104415f = navigatorWidget.f90388a;
        bn2.n nVar = new bn2.n(this);
        this.f104417h = new bn2.l(this);
        bn2.m mVar = new bn2.m(this);
        lo0.t tVar = packages.f528760a;
        this.f104418i = new xm2.t(viewGroup, tVar.f401609a, tVar.f401613e, new ym2.b(), nVar, mVar);
    }

    @Override // bn2.p
    public android.view.ViewGroup a() {
        return this.f104415f;
    }

    @Override // bn2.p
    public void d() {
        i(bn2.j.f104401e);
    }

    @Override // bn2.p
    public android.view.ViewGroup e() {
        return this.f104414e;
    }

    @Override // bn2.p
    public void f() {
        this.f104413d.f90390c = new bn2.k(this);
        this.f104418i.a();
    }

    @Override // bn2.p
    public void g(xm2.a aVar) {
        this.f104416g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r0.h() == true) goto L20;
     */
    @Override // bn2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r9 = this;
            dk2.d r0 = dk2.d.f314834a
            wm2.a r1 = r9.f104411b
            lo0.t r2 = r1.f528760a
            java.lang.String r3 = "beautyPackage"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            boolean r3 = r2.f401611c
            if (r3 != 0) goto L10
            goto L49
        L10:
            lo0.a0 r3 = r2.f401613e
            java.lang.String r3 = r3.f401483a
            com.tencent.mm.sdk.platformtools.o4 r0 = r0.b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "MMKV_KEY_LIVE_BEAUTY_ACTIVE_SUITE_ID_"
            r4.<init>(r5)
            gm0.m r5 = gm0.j1.b()
            int r5 = r5.h()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.putString(r4, r3)
            java.util.List r0 = r2.f401609a
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.next()
            lo0.a0 r2 = (lo0.a0) r2
            dk2.d r3 = dk2.d.f314834a
            r3.h(r2)
            goto L37
        L49:
            tn0.w0 r0 = dk2.ef.f314911d
            if (r0 == 0) goto L50
            hn0.f r0 = r0.f502306t
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 == 0) goto L63
            hn0.p r0 = (hn0.p) r0
            kn0.p r0 = r0.c()
            if (r0 == 0) goto L63
            boolean r0 = r0.h()
            r2 = 1
            if (r0 != r2) goto L63
            goto L64
        L63:
            r2 = 0
        L64:
            if (r2 != 0) goto L67
            goto Lc2
        L67:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            lo0.t r1 = r1.f528760a
            lo0.a0 r2 = r1.f401613e
            java.util.List r2 = r2.f401487e
            java.util.Iterator r2 = r2.iterator()
        L76:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L95
            java.lang.Object r3 = r2.next()
            lo0.k r3 = (lo0.k) r3
            java.lang.String r4 = r3.f401551a
            double r5 = r3.f401565o
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 * r7
            int r3 = a06.d.a(r5)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r4, r3)
            goto L76
        L95:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            lo0.a0 r1 = r1.f401613e
            java.lang.String r1 = r1.f401483a
            java.lang.String r3 = "type"
            r2.put(r3, r1)
            java.lang.String r1 = "result"
            r2.put(r1, r0)
            java.lang.Class<ml2.j0> r0 = ml2.j0.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r3 = r0
            zy2.zb r3 = (zy2.zb) r3
            ml2.z4 r4 = ml2.z4.I
            java.lang.String r5 = r2.toString()
            r6 = 0
            r7 = 4
            r8 = 0
            zy2.zb.y6(r3, r4, r5, r6, r7, r8)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.o.h():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r10.h() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(bn2.j r10) {
        /*
            r9 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r10 = r10.f104405d
            java.lang.String r1 = "type"
            r0.put(r1, r10)
            tn0.w0 r10 = dk2.ef.f314911d
            if (r10 == 0) goto L13
            hn0.f r10 = r10.f502306t
            goto L14
        L13:
            r10 = 0
        L14:
            if (r10 == 0) goto L26
            hn0.p r10 = (hn0.p) r10
            kn0.p r10 = r10.c()
            if (r10 == 0) goto L26
            boolean r10 = r10.h()
            r1 = 1
            if (r10 != r1) goto L26
            goto L27
        L26:
            r1 = 0
        L27:
            java.lang.String r10 = "getService(...)"
            java.lang.Class<ml2.j0> r2 = ml2.j0.class
            if (r1 == 0) goto L44
            i95.m r1 = i95.n0.c(r2)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r10)
            r2 = r1
            zy2.zb r2 = (zy2.zb) r2
            ml2.z4 r3 = ml2.z4.f409911t
            java.lang.String r4 = r0.toString()
            r5 = 0
            r6 = 4
            r7 = 0
            zy2.zb.y6(r2, r3, r4, r5, r6, r7)
            goto L5c
        L44:
            i95.m r1 = i95.n0.c(r2)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r10)
            r2 = r1
            zy2.zb r2 = (zy2.zb) r2
            ml2.c1 r10 = ml2.c1.f408858e
            r3 = 23
            java.lang.String r5 = r0.toString()
            r6 = 0
            r7 = 4
            r8 = 0
            zy2.zb.j5(r2, r3, r5, r6, r7, r8)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.o.i(bn2.j):void");
    }
}
