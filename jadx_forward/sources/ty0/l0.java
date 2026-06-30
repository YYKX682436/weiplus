package ty0;

/* loaded from: classes14.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f504403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty0.a1 f504404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uz0.c f504405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f504406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f504407h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f504408i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504409m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f504410n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504411o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j17, ty0.a1 a1Var, uz0.c cVar, e0.f1 f1Var, float f17, n0.v2 v2Var, n0.e5 e5Var, ty0.b1 b1Var, n0.e5 e5Var2) {
        super(2);
        this.f504403d = j17;
        this.f504404e = a1Var;
        this.f504405f = cVar;
        this.f504406g = f1Var;
        this.f504407h = f17;
        this.f504408i = v2Var;
        this.f504409m = e5Var;
        this.f504410n = b1Var;
        this.f504411o = e5Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r2 == n0.n.f415153a) goto L12;
     */
    @Override // yz5.p
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo149xb9724478(java.lang.Object r24, java.lang.Object r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            n0.o r1 = (n0.o) r1
            r2 = r25
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r2 = r2 & 11
            r3 = 2
            if (r2 != r3) goto L22
            r2 = r1
            n0.y0 r2 = (n0.y0) r2
            boolean r4 = r2.v()
            if (r4 != 0) goto L1d
            goto L22
        L1d:
            r2.O()
            goto Lc4
        L22:
            java.lang.Object r2 = n0.e1.f415025a
            long r4 = r0.f504403d
            int r2 = p2.c.h(r4)
            r15 = r1
            n0.y0 r15 = (n0.y0) r15
            r1 = -412133169(0xffffffffe76f58cf, float:-1.1302838E24)
            r15.U(r1)
            boolean r1 = r15.c(r2)
            java.lang.Object r2 = r15.y()
            ty0.a1 r6 = r0.f504404e
            if (r1 != 0) goto L45
            int r1 = n0.o.f415162a
            java.lang.Object r1 = n0.n.f415153a
            if (r2 != r1) goto L5a
        L45:
            int r1 = p2.c.h(r4)
            float r1 = (float) r1
            float r2 = r0.f504407h
            float r1 = r1 / r2
            float r2 = r6.f504315g
            float r4 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 - r2
            p2.h r2 = new p2.h
            r2.<init>(r1)
            r15.g0(r2)
        L5a:
            p2.h r2 = (p2.h) r2
            float r1 = r2.f432913d
            r2 = 0
            r15.o(r2)
            n0.h3 r2 = ty0.z0.f504575a
            p2.h r2 = new p2.h
            r2.<init>(r1)
            n0.v2 r1 = r0.f504408i
            r1.mo148714x53d8522f(r2)
            float r2 = r6.f504315g
            r4 = 0
            r5 = 0
            d0.d2 r2 = d0.a2.b(r2, r4, r3, r5)
            d0.p r7 = d0.p.f306716a
            float r6 = r6.f504316h
            d0.e r13 = r7.g(r6)
            int r6 = z0.t.f550455q1
            z0.p r6 = z0.p.f550454d
            r7 = 1
            z0.t r16 = d0.a3.f(r6, r4, r7, r5)
            r17 = 0
            float r3 = (float) r3
            r4 = 8
            float r4 = (float) r4
            float r18 = r3 * r4
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            z0.t r3 = d0.a2.j(r16, r17, r18, r19, r20, r21, r22)
            uz0.c r6 = r0.f504405f
            r7 = 0
            r8 = 0
            ty0.h0 r9 = ty0.h0.f504377d
            r11 = 3072(0xc00, float:4.305E-42)
            r12 = 6
            r10 = r15
            uz0.n r12 = uz0.q.a(r6, r7, r8, r9, r10, r11, r12)
            e0.f1 r7 = r0.f504406g
            r9 = 0
            r11 = 0
            r4 = 0
            ty0.k0 r14 = new ty0.k0
            n0.e5 r5 = r0.f504411o
            n0.e5 r6 = r0.f504409m
            ty0.b1 r8 = r0.f504410n
            r14.<init>(r6, r8, r1, r5)
            r16 = 6
            r17 = 168(0xa8, float:2.35E-43)
            r6 = r3
            r8 = r2
            r10 = r13
            r13 = r4
            e0.f.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        Lc4:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ty0.l0.mo149xb9724478(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
