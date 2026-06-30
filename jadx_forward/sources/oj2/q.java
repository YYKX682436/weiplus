package oj2;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f427314d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f427315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f427316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oj2.s f427317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km2.q f427318h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, oj2.s sVar, km2.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f427316f = f0Var;
        this.f427317g = sVar;
        this.f427318h = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oj2.q qVar = new oj2.q(this.f427316f, this.f427317g, this.f427318h, interfaceC29045xdcb5ca57);
        qVar.f427315e = obj;
        return qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((oj2.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0041 -> B:12:0x0044). Please report as a decompilation issue!!! */
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
            int r1 = r8.f427314d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L97
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            java.lang.Object r1 = r8.f427315e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r9 = r8
            goto L44
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.Object r9 = r8.f427315e
            kotlinx.coroutines.y0 r9 = (p3325xe03a0797.p3326xc267989b.y0) r9
            r1 = r9
            r9 = r8
        L2b:
            kotlin.jvm.internal.f0 r4 = r9.f427316f
            int r4 = r4.f391649d
            if (r4 <= 0) goto L66
            boolean r4 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            if (r4 == 0) goto L66
            r9.f427315e = r1
            r9.f427314d = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r9)
            if (r4 != r0) goto L44
            return r0
        L44:
            kotlin.jvm.internal.f0 r4 = r9.f427316f
            int r5 = r4.f391649d
            int r5 = r5 + (-1)
            r4.f391649d = r5
            oj2.s r5 = r9.f427317g
            java.lang.String r5 = r5.a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "countdown: "
            r6.<init>(r7)
            int r4 = r4.f391649d
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
            goto L2b
        L66:
            km2.q r1 = r9.f427318h
            r1.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "hadCountDownLocationShow: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r1.H
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
            r1.I = r3
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            oj2.p r3 = new oj2.p
            oj2.s r4 = r9.f427317g
            r5 = 0
            r3.<init>(r4, r5)
            r9.f427315e = r5
            r9.f427314d = r2
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r1, r3, r9)
            if (r9 != r0) goto L97
            return r0
        L97:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oj2.q.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
