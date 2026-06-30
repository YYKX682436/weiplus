package pk2;

/* loaded from: classes3.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437432d;

    /* renamed from: e, reason: collision with root package name */
    public int f437433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.l2 f437434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437435g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(pk2.l2 l2Var, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437434f = l2Var;
        this.f437435g = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pk2.k2(this.f437434f, this.f437435g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.k2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
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
            int r1 = r8.f437433e
            pk2.o9 r2 = r8.f437435g
            pk2.i2 r3 = pk2.l2.f437471m
            r4 = 2
            r5 = 0
            r6 = 1
            pk2.l2 r7 = r8.f437434f
            if (r1 == 0) goto L27
            if (r1 == r6) goto L23
            if (r1 != r4) goto L1b
            java.lang.Object r0 = r8.f437432d
            pk2.l2 r0 = (pk2.l2) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L5f
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L45
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            kotlinx.coroutines.r2 r9 = r7.f437474i
            r1 = 0
            if (r9 == 0) goto L36
            boolean r9 = r9.a()
            if (r9 != r6) goto L36
            r1 = r6
        L36:
            if (r1 == 0) goto L47
            kotlinx.coroutines.r2 r9 = r7.f437474i
            if (r9 == 0) goto L45
            r8.f437433e = r6
            java.lang.Object r9 = r9.C(r8)
            if (r9 != r0) goto L45
            return r0
        L45:
            r7.f437474i = r5
        L47:
            r45.v71 r9 = r7.f437473h
            if (r9 != 0) goto L63
            com.tencent.mm.ui.MMActivity r9 = r2.f437611d
            java.lang.String r1 = xy2.c.e(r9)
            r8.f437432d = r7
            r8.f437433e = r4
            java.lang.String r4 = "onItemClicked"
            java.lang.Object r9 = r3.b(r9, r4, r1, r8)
            if (r9 != r0) goto L5e
            return r0
        L5e:
            r0 = r7
        L5f:
            r45.v71 r9 = (r45.v71) r9
            r0.f437473h = r9
        L63:
            com.tencent.mm.ui.MMActivity r9 = r2.f437611d
            r45.v71 r0 = r7.f437473h
            if (r0 == 0) goto L71
            r1 = 4
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            r45.j32 r0 = (r45.j32) r0
            goto L72
        L71:
            r0 = r5
        L72:
            boolean r1 = r7.n()
            r3.e(r9, r0, r5, r1)
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.k2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
