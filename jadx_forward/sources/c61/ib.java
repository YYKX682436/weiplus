package c61;

/* loaded from: classes8.dex */
public final class ib extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120576d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120577e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f120578f;

    /* renamed from: g, reason: collision with root package name */
    public int f120579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c61.ob f120580h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120581i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f120582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f120583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result f120584o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(c61.ob obVar, int i17, java.util.ArrayList arrayList, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f120580h = obVar;
        this.f120581i = i17;
        this.f120582m = arrayList;
        this.f120583n = f0Var;
        this.f120584o = result;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c61.ib(this.f120580h, this.f120581i, this.f120582m, this.f120583n, this.f120584o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.ib) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
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
            int r1 = r13.f120579g
            r2 = 0
            c61.ob r3 = r13.f120580h
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 != r4) goto L1f
            java.lang.Object r1 = r13.f120578f
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r13.f120577e
            c61.ob r3 = (c61.ob) r3
            java.lang.Object r6 = r13.f120576d
            qc0.m1 r6 = (qc0.m1) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L60
        L1f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L55
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            java.lang.Class<e60.b1> r14 = e60.b1.class
            i95.m r14 = i95.n0.c(r14)
            e60.b1 r14 = (e60.b1) r14
            android.app.Activity r1 = r3.f120746e
            java.lang.String r6 = "null cannot be cast to non-null type androidx.activity.ComponentActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r6)
            r8 = r1
            androidx.activity.ComponentActivity r8 = (p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) r8
            int r9 = r13.f120581i
            java.util.ArrayList r10 = r13.f120582m
            kotlin.jvm.internal.f0 r1 = r13.f120583n
            int r11 = r1.f391649d
            r13.f120579g = r5
            r7 = r14
            o23.i r7 = (o23.i) r7
            r12 = r13
            java.lang.Object r14 = r7.Di(r8, r9, r10, r11, r12)
            if (r14 != r0) goto L55
            return r0
        L55:
            qc0.m1 r14 = (qc0.m1) r14
            java.util.List r1 = r14.f442946d
            if (r1 == 0) goto L8e
            java.util.Iterator r1 = r1.iterator()
            r6 = r14
        L60:
            r14 = r13
        L61:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r1.next()
            qc0.l1 r7 = (qc0.l1) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L61
            kotlinx.coroutines.p0 r7 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r7 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            c61.hb r8 = new c61.hb
            r8.<init>(r3, r2)
            r14.f120576d = r6
            r14.f120577e = r3
            r14.f120578f = r1
            r14.f120579g = r4
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.g(r7, r8, r14)
            if (r7 != r0) goto L61
            return r0
        L8b:
            r0 = r14
            r14 = r6
            goto L8f
        L8e:
            r0 = r13
        L8f:
            java.util.List r14 = r14.f442946d
            if (r14 == 0) goto Lb8
            java.lang.Object r14 = kz5.n0.B0(r14)
            qc0.l1 r14 = (qc0.l1) r14
            if (r14 == 0) goto L9f
            java.lang.String r14 = r14.f442929b
            if (r14 != 0) goto La1
        L9f:
            java.lang.String r14 = ""
        La1:
            int r1 = r14.length()
            if (r1 != 0) goto La8
            goto La9
        La8:
            r5 = 0
        La9:
            io.flutter.plugin.common.MethodChannel$Result r0 = r0.f120584o
            if (r5 == 0) goto Lb5
            java.lang.String r14 = "captureMedia"
            java.lang.String r1 = "capture failed"
            r0.mo65718x5c4d208(r14, r1, r2)
            goto Lb8
        Lb5:
            r0.mo65720x90b54003(r14)
        Lb8:
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.ib.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
