package p1;

/* loaded from: classes11.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f432383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.o0 f432384f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(long j17, p1.o0 o0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f432383e = j17;
        this.f432384f = o0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p1.m0(this.f432383e, this.f432384f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p1.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
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
            int r1 = r10.f432382d
            r2 = 1
            long r4 = r10.f432383e
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L2e
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            long r8 = r4 - r2
            r10.f432382d = r7
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.k1.b(r8, r10)
            if (r11 != r0) goto L2e
            return r0
        L2e:
            r10.f432382d = r6
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.k1.b(r2, r10)
            if (r11 != r0) goto L37
            return r0
        L37:
            p1.o0 r11 = r10.f432384f
            kotlinx.coroutines.q r11 = r11.f432394f
            if (r11 == 0) goto L4f
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            p1.o r0 = new p1.o
            r0.<init>(r4)
            java.lang.Object r0 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r0)
            java.lang.Object r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)
            r11.mo48700xdecd0e93(r0)
        L4f:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.m0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
