package yf0;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f543036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f543037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f543038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f543039g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f543040h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f543041i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f543042m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f543043n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p3325xe03a0797.p3326xc267989b.z zVar, p3325xe03a0797.p3326xc267989b.z zVar2, yf0.k0 k0Var, zf0.v0 v0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543037e = zVar;
        this.f543038f = zVar2;
        this.f543039g = k0Var;
        this.f543040h = v0Var;
        this.f543041i = f0Var;
        this.f543042m = f0Var2;
        this.f543043n = c16564xb55e1d5;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf0.b0(this.f543037e, this.f543038f, this.f543039g, this.f543040h, this.f543041i, this.f543042m, this.f543043n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f543036d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L5d
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L40
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L33
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r9.f543036d = r4
            kotlinx.coroutines.z r10 = r9.f543037e
            kotlinx.coroutines.a0 r10 = (p3325xe03a0797.p3326xc267989b.a0) r10
            java.lang.Object r10 = r10.k(r9)
            if (r10 != r0) goto L33
            return r0
        L33:
            r9.f543036d = r3
            kotlinx.coroutines.z r10 = r9.f543038f
            kotlinx.coroutines.a0 r10 = (p3325xe03a0797.p3326xc267989b.a0) r10
            java.lang.Object r10 = r10.k(r9)
            if (r10 != r0) goto L40
            return r0
        L40:
            yf0.k0 r3 = r9.f543039g
            zf0.v0 r4 = r9.f543040h
            kotlin.jvm.internal.f0 r10 = r9.f543041i
            int r5 = r10.f391649d
            kotlin.jvm.internal.f0 r10 = r9.f543042m
            int r6 = r10.f391649d
            yf0.a0 r7 = new yf0.a0
            com.tencent.mm.plugin.msg.MsgIdTalker r10 = r9.f543043n
            r7.<init>(r10, r4)
            r9.f543036d = r2
            r8 = r9
            java.lang.Object r10 = yf0.k0.T6(r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L5d
            return r0
        L5d:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.b0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
