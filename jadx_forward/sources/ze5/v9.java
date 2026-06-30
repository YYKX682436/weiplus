package ze5;

/* loaded from: classes9.dex */
public class v9 implements com.p314xaae8f345.mm.p2621x8fb0427b.a9, ze5.ma {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f553796d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f553797e;

    /* renamed from: f, reason: collision with root package name */
    public final int f553798f;

    /* renamed from: g, reason: collision with root package name */
    public final float f553799g;

    /* renamed from: h, reason: collision with root package name */
    public final wd5.b f553800h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e f553801i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f553802m;

    public v9(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.q qVar, yb5.a aVar) {
        r15.i iVar = null;
        this.f553796d = null;
        this.f553797e = false;
        this.f553798f = 0;
        this.f553799g = 0.0f;
        wd5.b bVar = new wd5.b();
        this.f553800h = bVar;
        this.f553802m = false;
        try {
            sb5.p2 p2Var = (sb5.p2) aVar.f542236a.f542241c.a(sb5.p2.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (f9Var.M2()) {
                ot0.q v17 = ot0.q.v(f9Var.U1());
                if (v17 != null && !android.text.TextUtils.isEmpty(v17.f430267z)) {
                    java.lang.String b17 = tv.a.b(v17.f430267z);
                    if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo) p2Var).f280848f) {
                        this.f553797e = com.p314xaae8f345.mm.vfs.w6.j(b17);
                    } else {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        this.f553796d = new java.lang.ref.WeakReference(m11.b1.Di().b3(b17, i65.a.g(context), context, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt));
                    }
                }
            } else {
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo) p2Var).f280848f) {
                    this.f553797e = com.p314xaae8f345.mm.vfs.w6.j(tj6);
                } else {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    this.f553796d = new java.lang.ref.WeakReference(m11.b1.Di().b3(tj6, i65.a.g(context), context, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt));
                }
            }
            java.lang.String str = qVar.f542275a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str = str == null ? "" : str;
            t21.v2 h17 = t21.d3.h(f9Var.z0());
            if (f9Var.mo78013xfb85f7b0() == 43 && h17 != null) {
                this.f553798f = h17.f496544i;
            }
            bVar.f526627r = wd5.a.f526613g;
            r15.b bVar2 = new r15.b();
            if (h17 != null && h17.g() != null) {
                bVar2.m126728xdc93280d(h17.g());
                r15.i n17 = bVar2.n();
                if (n17 != null && n17.l() > 0) {
                    iVar = bVar2.n();
                }
            }
            if (iVar != null) {
                bVar.k(iVar);
            }
            this.f553801i = lf5.g.c(bVar, str);
            this.f553802m = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4) ((sb5.b0) aVar.f542236a.f542241c.a(sb5.b0.class))).o0(f9Var);
            if (f9Var.A0() == 1 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20551x1009539b()) == 1) {
                if (((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).aj(f9Var.z0())) {
                    this.f553799g = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).cj(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0()));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemVideoMvvm", th6, "parse videoThumb err", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r2 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002b, code lost:
    
        if (r2.get() != r3.get()) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(java.lang.Object r6) {
        /*
            r5 = this;
            ze5.v9 r6 = (ze5.v9) r6
            r0 = 0
            r1 = 1
            java.lang.ref.WeakReference r2 = r5.f553796d
            if (r2 != 0) goto Ld
            java.lang.ref.WeakReference r3 = r6.f553796d
            if (r3 != 0) goto Ld
            goto L2d
        Ld:
            if (r2 == 0) goto L2f
            java.lang.ref.WeakReference r3 = r6.f553796d
            if (r3 != 0) goto L14
            goto L2f
        L14:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L2f
            java.lang.ref.WeakReference r3 = r6.f553796d
            java.lang.Object r4 = r3.get()
            if (r4 != 0) goto L23
            goto L2f
        L23:
            java.lang.Object r2 = r2.get()
            java.lang.Object r3 = r3.get()
            if (r2 != r3) goto L2f
        L2d:
            r2 = r1
            goto L30
        L2f:
            r2 = r0
        L30:
            if (r2 == 0) goto La2
            boolean r2 = r6.f553797e
            boolean r3 = r5.f553797e
            if (r3 != r2) goto L3a
            r2 = r1
            goto L3b
        L3a:
            r2 = r0
        L3b:
            if (r2 == 0) goto La2
            int r2 = r5.f553798f
            int r3 = r6.f553798f
            if (r2 != r3) goto La2
            boolean r2 = r5.f553802m
            boolean r3 = r6.f553802m
            if (r2 != r3) goto La2
            wd5.b r2 = r5.f553800h
            r15.i r3 = r2.j()
            wd5.b r4 = r6.f553800h
            if (r3 != 0) goto L5a
            r15.i r3 = r4.j()
            if (r3 != 0) goto L5a
            goto L8d
        L5a:
            r15.i r3 = r2.j()
            if (r3 == 0) goto L8f
            r15.i r3 = r4.j()
            if (r3 != 0) goto L67
            goto L8f
        L67:
            r15.i r3 = r2.j()
            if (r3 == 0) goto L80
            r15.i r3 = r4.j()
            if (r3 == 0) goto L80
            r15.i r2 = r2.j()
            r15.i r3 = r4.j()
            boolean r2 = r2.mo516x5c5a33d4(r3)
            goto L81
        L80:
            r2 = r0
        L81:
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r3 = r5.f553801i
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r4 = r6.f553801i
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L8f
            if (r2 == 0) goto L8f
        L8d:
            r2 = r1
            goto L90
        L8f:
            r2 = r0
        L90:
            if (r2 == 0) goto La2
            float r2 = r5.f553799g
            float r6 = r6.f553799g
            float r2 = r2 - r6
            float r6 = java.lang.Math.abs(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto La2
            r0 = r1
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.v9.U(java.lang.Object):boolean");
    }

    @Override // ze5.ma
    public wd5.b a() {
        return this.f553800h;
    }

    @Override // ze5.ma
    public com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e b() {
        return this.f553801i;
    }
}
