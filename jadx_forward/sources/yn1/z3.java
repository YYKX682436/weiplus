package yn1;

/* loaded from: classes11.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f545492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.lang.String str, yn1.a4 a4Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545490d = str;
        this.f545491e = a4Var;
        this.f545492f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.z3(this.f545490d, this.f545491e, this.f545492f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.z3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            java.lang.Class<mv.v> r14 = mv.v.class
            i95.m r14 = i95.n0.c(r14)
            mv.v r14 = (mv.v) r14
            yn1.s r14 = (yn1.s) r14
            java.lang.String r0 = r13.f545490d
            r45.ol4 r14 = r14.Ai(r0)
            jz5.f0 r1 = jz5.f0.f384359a
            long r2 = r13.f545492f
            r4 = 0
            yn1.a4 r5 = r13.f545491e
            if (r14 != 0) goto L39
            java.lang.String r14 = r5.f545139a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[VerifyUserDB] failed to get account info for hash="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r14, r0)
            com.tencent.wechat.aff.migration.a r14 = r5.f545142d
            if (r14 == 0) goto L38
            r14.Q0(r2, r4)
        L38:
            return r1
        L39:
            r6 = 0
            gm0.b0 r7 = gm0.j1.u()     // Catch: java.lang.Exception -> L47
            l75.k0 r7 = r7.f354686f     // Catch: java.lang.Exception -> L47
            if (r7 == 0) goto L5b
            java.lang.String r6 = r7.mo70515xfb83cc9b()     // Catch: java.lang.Exception -> L47
            goto L5b
        L47:
            r7 = move-exception
            java.lang.String r8 = r5.f545139a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[VerifyUserDB] get current db path error: "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r7)
        L5b:
            int r7 = r14.f463878e
            java.lang.String r7 = gm0.b0.e(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "/EnMicroMsg.db"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.content.Context r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r8 = r8.getPackageName()
            if (r6 == 0) goto L9d
            if (r7 == 0) goto L9d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            boolean r9 = r26.n0.B(r6, r8, r4)
            if (r9 == 0) goto L9d
            boolean r4 = r26.n0.B(r7, r8, r4)
            if (r4 == 0) goto L9d
            java.lang.String r4 = r26.n0.m0(r6, r8, r6)
            java.lang.String r8 = r26.n0.m0(r7, r8, r7)
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r8)
            goto La1
        L9d:
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r7)
        La1:
            java.lang.String r8 = ", expectedUsername="
            java.lang.String r9 = ", hash="
            if (r4 != 0) goto Ld1
            java.lang.String r10 = r5.f545139a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "[VerifyUserDB] path mismatch. current="
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r6 = ", expected="
            r11.append(r6)
            r11.append(r7)
            r11.append(r9)
            r11.append(r0)
            r11.append(r8)
            java.lang.String r14 = r14.f463877d
            r11.append(r14)
            java.lang.String r14 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r10, r14)
            goto Lf2
        Ld1:
            java.lang.String r7 = r5.f545139a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "[VerifyUserDB] passed. path="
            r10.<init>(r11)
            r10.append(r6)
            r10.append(r9)
            r10.append(r0)
            r10.append(r8)
            java.lang.String r14 = r14.f463877d
            r10.append(r14)
            java.lang.String r14 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r14)
        Lf2:
            com.tencent.wechat.aff.migration.a r14 = r5.f545142d
            if (r14 == 0) goto Lf9
            r14.Q0(r2, r4)
        Lf9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.z3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
