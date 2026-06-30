package j00;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f378466d;

    /* renamed from: e, reason: collision with root package name */
    public int f378467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f378469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f378470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f378471i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String str, java.util.Map map, android.content.Context context, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f378468f = str;
        this.f378469g = map;
        this.f378470h = context;
        this.f378471i = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j00.x(this.f378468f, this.f378469g, this.f378470h, this.f378471i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00bb  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r25) {
        /*
            r24 = this;
            r6 = r24
            pz5.a r7 = pz5.a.f440719d
            int r0 = r6.f378467e
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r25)
            goto Lb5
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1b:
            java.lang.Object r0 = r6.f378466d
            pi0.l1 r0 = (pi0.l1) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r25)
            goto L53
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r25)
            java.lang.Class<f50.y> r0 = f50.y.class
            i95.m r0 = i95.n0.c(r0)
            f50.y r0 = (f50.y) r0
            e50.z0 r0 = (e50.z0) r0
            pi0.q r9 = r0.Ui()
            pi0.l1 r0 = new pi0.l1
            java.lang.String r10 = "ecs"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 28
            r15 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.f436182h = r2
            r6.f378466d = r0
            r6.f378467e = r2
            java.lang.String r3 = r6.f378468f
            java.util.Map r4 = r6.f378469g
            java.lang.Object r3 = r0.o(r3, r4, r6)
            if (r3 != r7) goto L53
            return r7
        L53:
            io.flutter.embedding.engine.plugins.FlutterPlugin[] r3 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f[r1]
            j00.d0 r4 = new j00.d0
            r4.<init>()
            r5 = 0
            r3[r5] = r4
            java.lang.Class<s03.g> r4 = s03.g.class
            i95.m r4 = i95.n0.c(r4)
            s03.g r4 = (s03.g) r4
            r03.e r4 = (r03.e) r4
            r8 = 0
            io.flutter.embedding.engine.plugins.FlutterPlugin r4 = r4.wi(r8)
            r3[r2] = r4
            java.util.List r3 = kz5.c0.i(r3)
            r0.a(r3)
            com.tencent.mm.flutter.ui.FlutterPageStyle r3 = new com.tencent.mm.flutter.ui.FlutterPageStyle
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 4095(0xfff, float:5.738E-42)
            r23 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.f149658o = r5
            r3.f149650d = r2
            r2 = -1
            r3.f149651e = r2
            android.content.Context r2 = r6.f378470h
            if (r2 != 0) goto L9e
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
        L9e:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            java.lang.Class<com.tencent.mm.feature.ecs.ui.EcsGiftFlutterUI> r4 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.ui.ActivityC10566xacd95eeb.class
            r5 = 0
            r6.f378466d = r8
            r6.f378467e = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r24
            java.lang.Object r0 = r0.s(r1, r2, r3, r4, r5)
            if (r0 != r7) goto Lb5
            return r7
        Lb5:
            j00.y r0 = j00.y.f378479a
            yz5.a r0 = r6.f378471i
            if (r0 == 0) goto Lbe
            r0.mo152xb9724478()
        Lbe:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.x.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
