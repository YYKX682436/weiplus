package km2;

/* loaded from: classes3.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f390658d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f390659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.m0 f390660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(km2.m0 m0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f390660f = m0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        km2.l0 l0Var = new km2.l0(this.f390660f, interfaceC29045xdcb5ca57);
        l0Var.f390659e = obj;
        return l0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((km2.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0063 -> B:7:0x002f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f390658d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r10.f390659e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r11 = r1
            goto L2e
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            java.lang.Object r1 = r10.f390659e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r4 = r1
            r1 = r10
            goto L48
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.Object r11 = r10.f390659e
            kotlinx.coroutines.y0 r11 = (p3325xe03a0797.p3326xc267989b.y0) r11
        L2e:
            r1 = r10
        L2f:
            boolean r4 = p3325xe03a0797.p3326xc267989b.z0.h(r11)
            if (r4 != 0) goto L36
            goto L65
        L36:
            km2.m0 r4 = r1.f390660f
            km2.k0 r4 = r4.f390676a
            r1.f390659e = r11
            r1.f390658d = r3
            java.lang.Object r4 = r4.c(r1)
            if (r4 != r0) goto L45
            return r0
        L45:
            r9 = r4
            r4 = r11
            r11 = r9
        L48:
            km2.j0 r11 = (km2.j0) r11
            boolean r5 = r11.f390645a
            if (r5 == 0) goto L65
            km2.m0 r5 = r1.f390660f
            long r5 = r5.f390678c
            long r7 = r11.f390646b
            long r5 = java.lang.Math.max(r7, r5)
            r1.f390659e = r4
            r1.f390658d = r2
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.k1.b(r5, r1)
            if (r11 != r0) goto L63
            return r0
        L63:
            r11 = r4
            goto L2f
        L65:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: km2.l0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
