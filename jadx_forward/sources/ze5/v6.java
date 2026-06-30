package ze5;

/* loaded from: classes9.dex */
public class v6 implements com.p314xaae8f345.mm.p2621x8fb0427b.a9, ze5.ma {

    /* renamed from: d, reason: collision with root package name */
    public final int f553786d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.l f553787e;

    /* renamed from: f, reason: collision with root package name */
    public final wd5.b f553788f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f553789g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e f553790h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f553791i;

    public v6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.q qVar, yb5.a aVar) {
        long j17;
        int i17;
        wd5.b bVar = new wd5.b();
        this.f553788f = bVar;
        boolean z17 = false;
        this.f553789g = false;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(f9Var);
        if (S1 != null) {
            java.lang.Float f17 = (java.lang.Float) ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).ij().get(java.lang.String.format("%s_%s", f9Var.Q0(), java.lang.Long.valueOf(f9Var.m124847x74d37ac6())));
            if (f17 != null) {
                i17 = java.lang.Math.round(f17.floatValue());
            } else {
                int i18 = S1.f404169d;
                int i19 = S1.f404168c;
                long j18 = S1.f404166a;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = m11.w0.f404339a;
                if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j18))) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(concurrentHashMap.get(java.lang.Long.valueOf(S1.f404166a)));
                    throw null;
                }
                if (S1.j()) {
                    m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(S1.f404182q));
                    if (concurrentHashMap.containsKey(java.lang.Long.valueOf(S1.f404182q))) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(concurrentHashMap.get(java.lang.Long.valueOf(S1.f404182q)));
                        throw null;
                    }
                    int i27 = C1.f404169d;
                    i19 = C1.f404168c;
                    i18 = i27;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoLogic", "getUploadPercentage, %s, %s, %s", java.lang.Long.valueOf(S1.f404166a), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
                if (i18 > 0) {
                    j17 = 100;
                    if (i19 < i18) {
                        j17 = (i19 * 100) / i18;
                    }
                } else {
                    j17 = 0;
                }
                i17 = (int) j17;
            }
            this.f553786d = i17;
        }
        this.f553787e = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(f9Var);
        bVar.f526627r = wd5.a.f526612f;
        r15.b bVar2 = new r15.b();
        if (f9Var.U1() != null) {
            bVar2.m126728xdc93280d(f9Var.U1());
            r15.i n17 = bVar2.n();
            if (n17 != null && n17.l() > 0) {
                z17 = true;
            }
            if (z17) {
                bVar.k(bVar2.n());
            }
        }
        this.f553789g = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).mj(f9Var, S1 != null ? S1.f404172g : null);
        java.lang.String str = qVar.f542275a;
        this.f553790h = lf5.g.c(bVar, str == null ? "" : str);
        this.f553791i = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4) ((sb5.b0) aVar.f542236a.f542241c.a(sb5.b0.class))).o0(f9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r0 != false) goto L27;
     */
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(java.lang.Object r6) {
        /*
            r5 = this;
            ze5.v6 r6 = (ze5.v6) r6
            boolean r0 = r6.f553789g
            boolean r1 = r5.f553789g
            r2 = 0
            if (r1 != r0) goto L70
            int r0 = r5.f553786d
            int r1 = r6.f553786d
            if (r0 != r1) goto L70
            jz5.l r0 = r5.f553787e
            java.lang.Object r0 = r0.f384366d
            java.lang.Integer r0 = (java.lang.Integer) r0
            jz5.l r1 = r6.f553787e
            java.lang.Object r1 = r1.f384366d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L70
            wd5.b r0 = r5.f553788f
            r15.i r1 = r0.j()
            r3 = 1
            wd5.b r4 = r6.f553788f
            if (r1 != 0) goto L31
            r15.i r1 = r4.j()
            if (r1 != 0) goto L31
            goto L64
        L31:
            r15.i r1 = r0.j()
            if (r1 == 0) goto L66
            r15.i r1 = r4.j()
            if (r1 != 0) goto L3e
            goto L66
        L3e:
            r15.i r1 = r0.j()
            if (r1 == 0) goto L57
            r15.i r1 = r4.j()
            if (r1 == 0) goto L57
            r15.i r0 = r0.j()
            r15.i r1 = r4.j()
            boolean r0 = r0.mo516x5c5a33d4(r1)
            goto L58
        L57:
            r0 = r2
        L58:
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r1 = r5.f553790h
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r4 = r6.f553790h
            boolean r1 = r1.a(r4)
            if (r1 == 0) goto L66
            if (r0 == 0) goto L66
        L64:
            r0 = r3
            goto L67
        L66:
            r0 = r2
        L67:
            if (r0 == 0) goto L70
            boolean r0 = r5.f553791i
            boolean r6 = r6.f553791i
            if (r0 != r6) goto L70
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.v6.U(java.lang.Object):boolean");
    }

    @Override // ze5.ma
    public wd5.b a() {
        return this.f553788f;
    }

    @Override // ze5.ma
    public com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e b() {
        return this.f553790h;
    }
}
