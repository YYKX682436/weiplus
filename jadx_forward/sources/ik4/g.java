package ik4;

/* loaded from: classes4.dex */
public final class g extends kk4.f0 {
    public float A;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f373456r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f373457s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashSet f373458t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f373459u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f373460v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashSet f373461w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashSet f373462x;

    /* renamed from: y, reason: collision with root package name */
    public long f373463y;

    /* renamed from: z, reason: collision with root package name */
    public long f373464z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f373457s = new java.util.HashSet();
        this.f373458t = new java.util.HashSet();
        this.f373459u = new java.util.HashSet();
        this.f373460v = new java.util.HashSet();
        this.f373461w = new java.util.HashSet();
        this.f373462x = new java.util.HashSet();
        this.f373463y = -1L;
        this.f373464z = -1L;
        this.A = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ik4.f
            if (r0 == 0) goto L13
            r0 = r7
            ik4.f r0 = (ik4.f) r0
            int r1 = r0.f373455h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f373455h = r1
            goto L18
        L13:
            ik4.f r0 = new ik4.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f373453f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f373455h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f373452e
            java.lang.Object r0 = r0.f373451d
            ik4.g r0 = (ik4.g) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L4f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            long r4 = java.lang.System.currentTimeMillis()
            kotlinx.coroutines.r2 r7 = r6.f373456r
            if (r7 == 0) goto L51
            r0.f373451d = r6
            r0.f373452e = r4
            r0.f373455h = r3
            java.lang.Object r7 = r7.C(r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r0 = r6
            r1 = r4
        L4f:
            r4 = r1
            goto L52
        L51:
            r0 = r6
        L52:
            r7 = 0
            r0.f373456r = r7
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "waitResetFinish cost:"
            r7.<init>(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "MicroMsg.FlexiblePlayer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ik4.g.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kk4.f0, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: release */
    public void mo100933x41012807() {
        super.mo100933x41012807();
        this.f373457s.clear();
        this.f373458t.clear();
        this.f373459u.clear();
        this.f373460v.clear();
    }

    @Override // kk4.f0, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setPlaySpeedRatio */
    public void mo100967xd079f5a(float f17) {
        this.A = f17;
        super.mo100967xd079f5a(f17);
    }

    @Override // kk4.f0, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: stop */
    public void mo100976x360802() {
        super.mo100976x360802();
        this.f373457s.clear();
        this.f373458t.clear();
        this.f373459u.clear();
        this.f373460v.clear();
        this.A = 1.0f;
    }
}
