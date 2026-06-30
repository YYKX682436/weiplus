package dk2;

/* loaded from: classes.dex */
public final class ue extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f315745d;

    /* renamed from: e, reason: collision with root package name */
    public int f315746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f315747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f315748g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f315749h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, long j17, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315747f = h0Var;
        this.f315748g = j17;
        this.f315749h = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dk2.ue(this.f315747f, this.f315748g, this.f315749h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.ue) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f315746e
            int r2 = r11.f315749h
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r11.f315745d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Le9
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            java.lang.Object r1 = r11.f315745d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Lcd
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Lae
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            r45.l72 r12 = new r45.l72
            r12.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r7 = 16416(0x4020, float:2.3004E-41)
            r45.kv0 r1 = r1.a(r7)
            r12.set(r6, r1)
            kotlin.jvm.internal.h0 r1 = r11.f315747f
            java.lang.Object r1 = r1.f391656d
            r45.qt2 r1 = (r45.qt2) r1
            java.lang.String r1 = xy2.c.f(r1)
            r7 = 4
            r12.set(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r7 = r11.f315748g
            r1.append(r7)
            r9 = 95
            r1.append(r9)
            long r9 = java.lang.System.currentTimeMillis()
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r12.set(r3, r1)
            r1 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.set(r5, r1)
            r1 = 6
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.set(r1, r10)
            r1 = 5
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r12.set(r1, r7)
            r45.oz6 r1 = new r45.oz6
            r1.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r1.set(r9, r7)
            byte[] r1 = r1.mo14344x5f01b1f6()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r5)
            r7 = 7
            r12.set(r7, r1)
            com.tencent.mm.modelbase.i r12 = r12.d()
            r11.f315746e = r6
            java.lang.Object r12 = xg2.g.d(r12, r4, r11, r6, r4)
            if (r12 != r0) goto Lae
            return r0
        Lae:
            r1 = r12
            xg2.h r1 = (xg2.h) r1
            boolean r12 = r1 instanceof xg2.i
            if (r12 == 0) goto Lcd
            oz5.l r12 = r1.f535925a
            if (r12 != 0) goto Lbd
            oz5.l r12 = r11.mo48699x76847179()
        Lbd:
            dk2.te r6 = new dk2.te
            r6.<init>(r1, r4, r2)
            r11.f315745d = r1
            r11.f315746e = r5
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r12, r6, r11)
            if (r12 != r0) goto Lcd
            return r0
        Lcd:
            boolean r12 = r1 instanceof xg2.b
            if (r12 == 0) goto Le9
            oz5.l r12 = r1.f535925a
            if (r12 != 0) goto Ld9
            oz5.l r12 = r11.mo48699x76847179()
        Ld9:
            dk2.se r5 = new dk2.se
            r5.<init>(r1, r4, r2)
            r11.f315745d = r1
            r11.f315746e = r3
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r12, r5, r11)
            if (r12 != r0) goto Le9
            return r0
        Le9:
            jz5.f0 r12 = jz5.f0.f384359a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ue.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
