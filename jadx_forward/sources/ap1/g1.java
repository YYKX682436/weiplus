package ap1;

/* loaded from: classes5.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94198d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ap1.h1 f94200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f94201g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(ap1.h1 h1Var, ap1.p1 p1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94200f = h1Var;
        this.f94201g = p1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ap1.g1 g1Var = new ap1.g1(this.f94200f, this.f94201g, interfaceC29045xdcb5ca57);
        g1Var.f94199e = obj;
        return g1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ap1.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f94198d
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r7.f94199e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r7
            goto L36
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.Object r8 = r7.f94199e
            kotlinx.coroutines.y0 r8 = (p3325xe03a0797.p3326xc267989b.y0) r8
            r1 = r8
            r8 = r7
        L23:
            boolean r3 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            if (r3 == 0) goto L57
            r8.f94199e = r1
            r8.f94198d = r2
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Object r3 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r8)
            if (r3 != r0) goto L36
            return r0
        L36:
            ap1.h1 r3 = r8.f94200f
            java.lang.String r4 = r3.f94207e
            java.lang.String r5 = r3.f94206d
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r4)
            if (r5 != 0) goto L23
            boolean r5 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            if (r5 == 0) goto L57
            r3.f94206d = r4
            ap1.p1 r3 = r8.f94201g
            ap1.i1 r3 = r3.f94255d
            if (r3 == 0) goto L23
            int[] r5 = ap1.p1.f94254h
            r6 = 0
            r3.s(r4, r5, r6)
            goto L23
        L57:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ap1.g1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
