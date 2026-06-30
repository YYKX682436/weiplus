package mx3;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f414147d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f414148e;

    /* renamed from: f, reason: collision with root package name */
    public int f414149f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414150g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f414151h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572) {
        super(2, interfaceC29045xdcb5ca572);
        this.f414151h = interfaceC29045xdcb5ca57;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mx3.r rVar = new mx3.r(this.f414151h, interfaceC29045xdcb5ca57);
        rVar.f414150g = obj;
        return rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx3.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006b  */
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
            int r1 = r10.f414149f
            kotlin.coroutines.Continuation r2 = r10.f414151h
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r10.f414148e
            kotlin.coroutines.Continuation r0 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) r0
            java.lang.Object r1 = r10.f414147d
            vx3.i r1 = (vx3.i) r1
            java.lang.Object r3 = r10.f414150g
            kotlinx.coroutines.y0 r3 = (p3325xe03a0797.p3326xc267989b.y0) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L56
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.Object r11 = r10.f414150g
            kotlinx.coroutines.y0 r11 = (p3325xe03a0797.p3326xc267989b.y0) r11
            mx3.f0 r1 = mx3.f0.f414081a
            androidx.lifecycle.j0 r1 = mx3.f0.f414084d
            java.lang.Object r1 = r1.mo3195x754a37bb()
            vx3.i r1 = (vx3.i) r1
            if (r1 == 0) goto L68
            mx3.s r4 = mx3.u.f414153f
            r10.f414150g = r11
            r10.f414147d = r1
            r10.f414148e = r2
            r10.f414149f = r3
            java.lang.String r6 = c01.z1.r()
            java.lang.String r11 = "getUsernameFromUserInfo(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r11)
            r7 = 0
            java.lang.String r8 = ""
            r5 = r1
            r9 = r10
            java.lang.Object r11 = r4.e(r5, r6, r7, r8, r9)
            if (r11 != r0) goto L55
            return r0
        L55:
            r0 = r2
        L56:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r11 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)
            r0.mo48700xdecd0e93(r11)
            goto L69
        L68:
            r1 = 0
        L69:
            if (r1 != 0) goto L76
            kotlin.Result$Companion r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Object r11 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)
            r2.mo48700xdecd0e93(r11)
        L76:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mx3.r.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
