package sc2;

/* loaded from: classes.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f487567d;

    /* renamed from: e, reason: collision with root package name */
    public int f487568e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f487569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f487570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f487570g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        sc2.l0 l0Var = new sc2.l0(this.f487570g, interfaceC29045xdcb5ca57);
        l0Var.f487569f = obj;
        return l0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f487568e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            long r4 = r8.f487567d
            java.lang.Object r1 = r8.f487569f
            kotlinx.coroutines.flow.k r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r9 = r1
            r1 = r8
            goto L62
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            long r4 = r8.f487567d
            java.lang.Object r1 = r8.f487569f
            kotlinx.coroutines.flow.k r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r9 = r1
            r1 = r8
            goto L53
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.Object r9 = r8.f487569f
            kotlinx.coroutines.flow.k r9 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r9
            r1 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r1
            long r6 = r8.f487570g
            long r6 = r6 / r4
            r1 = r8
        L3a:
            r4 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L66
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r6)
            r1.f487569f = r9
            r1.f487567d = r6
            r1.f487568e = r3
            java.lang.Object r4 = r9.mo771x2f8fd3(r4, r1)
            if (r4 != r0) goto L52
            return r0
        L52:
            r4 = r6
        L53:
            r1.f487569f = r9
            r1.f487567d = r4
            r1.f487568e = r2
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = p3325xe03a0797.p3326xc267989b.k1.b(r6, r1)
            if (r6 != r0) goto L62
            return r0
        L62:
            r6 = -1
            long r6 = r6 + r4
            goto L3a
        L66:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.l0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
