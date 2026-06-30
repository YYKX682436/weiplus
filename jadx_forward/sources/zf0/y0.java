package zf0;

/* loaded from: classes10.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f554129d;

    /* renamed from: e, reason: collision with root package name */
    public int f554130e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f554131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zf0.a f554132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d11.d f554133h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f554134i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(zf0.a aVar, d11.d dVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554132g = aVar;
        this.f554133h = dVar;
        this.f554134i = atomicBoolean;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        zf0.y0 y0Var = new zf0.y0(this.f554132g, this.f554133h, this.f554134i, interfaceC29045xdcb5ca57);
        y0Var.f554131f = obj;
        return y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zf0.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0039 -> B:5:0x003c). Please report as a decompilation issue!!! */
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
            int r1 = r7.f554130e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            int r1 = r7.f554129d
            java.lang.Object r4 = r7.f554131f
            kotlinx.coroutines.y0 r4 = (p3325xe03a0797.p3326xc267989b.y0) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r7
            goto L3c
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.Object r8 = r7.f554131f
            kotlinx.coroutines.y0 r8 = (p3325xe03a0797.p3326xc267989b.y0) r8
            r4 = r8
            r1 = r2
            r8 = r7
        L27:
            boolean r5 = p3325xe03a0797.p3326xc267989b.z0.h(r4)
            if (r5 == 0) goto L59
            r8.f554131f = r4
            r8.f554129d = r1
            r8.f554130e = r3
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.k1.b(r5, r8)
            if (r5 != r0) goto L3c
            return r0
        L3c:
            int r1 = r1 + r3
            zf0.a r5 = r8.f554132g
            if (r5 == 0) goto L49
            boolean r5 = r5.a(r1)
            if (r5 != r3) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            if (r5 == 0) goto L27
            d11.d r5 = r8.f554133h
            j3.h r5 = r5.f307190b
            r5.a()
            java.util.concurrent.atomic.AtomicBoolean r5 = r8.f554134i
            r5.set(r3)
            goto L27
        L59:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.y0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
