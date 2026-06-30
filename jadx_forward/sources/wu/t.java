package wu;

/* loaded from: classes9.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f531157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f531158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f531159f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.view.View view, hu.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f531158e = view;
        this.f531159f = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wu.t(this.f531158e, this.f531159f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wu.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00af, code lost:
    
        if (r15 == r0) goto L15;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r14.f531157d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto Lc2
        L10:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.lang.Class<c00.z2> r15 = c00.z2.class
            i95.m r15 = i95.n0.c(r15)
            c00.z2 r15 = (c00.z2) r15
            android.view.View r1 = r14.f531158e
            android.content.Context r5 = r1.getContext()
            java.lang.String r1 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r1)
            hu.b r1 = r14.f531159f
            java.lang.String r8 = r1.f366531f
            bw5.x8 r12 = bw5.x8.ECS_REQ_SCENE_RECORD
            r14.f531157d = r3
            b00.r r15 = (b00.r) r15
            r15.getClass()
            e00.s r4 = new e00.s
            r4.<init>()
            s15.h r15 = r1.f366530e
            s15.j r15 = r15.x()
            if (r15 == 0) goto Lb2
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            bw5.u8 r9 = new bw5.u8
            r9.<init>()
            java.lang.String r1 = r15.F()
            long r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(r1)
            r9.r(r10)
            java.lang.String r1 = r15.m163595x93d5ac12()
            r9.f115306e = r1
            r1 = 2
            boolean[] r10 = r9.f115317p1
            r10[r1] = r3
            java.lang.String r1 = r15.E()
            r9.N = r1
            r1 = 34
            r10[r1] = r3
            java.lang.String r1 = r15.y()
            r9.o(r1)
            java.lang.String r1 = r15.t()
            r9.I = r1
            r1 = 29
            r10[r1] = r3
            java.lang.String r1 = r15.n()
            r9.f115305d = r1
            r10[r3] = r3
            java.lang.String r1 = r15.p()
            r9.f115307f = r1
            r1 = 3
            r10[r1] = r3
            java.lang.String r1 = r15.o()
            r9.f115308g = r1
            r1 = 4
            r10[r1] = r3
            java.lang.String r15 = r15.H()
            r9.K = r15
            r15 = 31
            r10[r15] = r3
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r13 = r14
            java.lang.Object r15 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto Lba
            goto Lbb
        Lb2:
            java.lang.String r15 = "ProductCardJumpDelegate"
            java.lang.String r1 = "open product card from detail, shareObject is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r15, r1)
        Lba:
            r15 = r2
        Lbb:
            if (r15 != r0) goto Lbe
            goto Lbf
        Lbe:
            r15 = r2
        Lbf:
            if (r15 != r0) goto Lc2
            return r0
        Lc2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.t.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
