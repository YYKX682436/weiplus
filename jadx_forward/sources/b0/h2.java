package b0;

/* loaded from: classes14.dex */
public final class h2 implements b0.f2, p2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.f f97861d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f97862e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f97863f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f97864g;

    public h2(p2.f density) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        this.f97861d = density;
        this.f97864g = new p3325xe03a0797.p3326xc267989b.p3332x361a9b.k(false);
    }

    @Override // p2.f
    public int G(float f17) {
        return this.f97861d.G(f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return this.f97861d.H(j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return this.f97861d.R(f17);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b0.g2
            if (r0 == 0) goto L13
            r0 = r5
            b0.g2 r0 = (b0.g2) r0
            int r1 = r0.f97831g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97831g = r1
            goto L18
        L13:
            b0.g2 r0 = new b0.g2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f97829e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f97831g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f97828d
            b0.h2 r0 = (b0.h2) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            boolean r5 = r4.f97862e
            if (r5 != 0) goto L4c
            boolean r5 = r4.f97863f
            if (r5 != 0) goto L4c
            kotlinx.coroutines.sync.d r5 = r4.f97864g
            r0.f97828d = r4
            r0.f97831g = r3
            r2 = 0
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
        L4d:
            boolean r5 = r0.f97862e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.h2.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p2.f
    public long e(long j17) {
        return this.f97861d.e(j17);
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return this.f97861d.mo7005x9a59d0b2();
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return this.f97861d.mo7006xa2f3d785();
    }

    @Override // p2.f
    public float n(int i17) {
        return this.f97861d.n(i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return this.f97861d.o(f17);
    }

    @Override // p2.f
    public long t(long j17) {
        return this.f97861d.t(j17);
    }

    @Override // p2.f
    public long z(float f17) {
        return this.f97861d.z(f17);
    }
}
