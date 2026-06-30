package c61;

/* loaded from: classes8.dex */
public final class ib extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f39043d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f39044e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f39045f;

    /* renamed from: g, reason: collision with root package name */
    public int f39046g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c61.ob f39047h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f39048i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f39049m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f39050n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel.Result f39051o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(c61.ob obVar, int i17, java.util.ArrayList arrayList, kotlin.jvm.internal.f0 f0Var, io.flutter.plugin.common.MethodChannel.Result result, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39047h = obVar;
        this.f39048i = i17;
        this.f39049m = arrayList;
        this.f39050n = f0Var;
        this.f39051o = result;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.ib(this.f39047h, this.f39048i, this.f39049m, this.f39050n, this.f39051o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.ib) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f39046g
            r2 = 0
            c61.ob r3 = r13.f39047h
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 != r4) goto L1f
            java.lang.Object r1 = r13.f39045f
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r13.f39044e
            c61.ob r3 = (c61.ob) r3
            java.lang.Object r6 = r13.f39043d
            qc0.m1 r6 = (qc0.m1) r6
            kotlin.ResultKt.throwOnFailure(r14)
            goto L60
        L1f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L27:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L55
        L2b:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Class<e60.b1> r14 = e60.b1.class
            i95.m r14 = i95.n0.c(r14)
            e60.b1 r14 = (e60.b1) r14
            android.app.Activity r1 = r3.f39213e
            java.lang.String r6 = "null cannot be cast to non-null type androidx.activity.ComponentActivity"
            kotlin.jvm.internal.o.e(r1, r6)
            r8 = r1
            androidx.activity.ComponentActivity r8 = (androidx.activity.ComponentActivity) r8
            int r9 = r13.f39048i
            java.util.ArrayList r10 = r13.f39049m
            kotlin.jvm.internal.f0 r1 = r13.f39050n
            int r11 = r1.f310116d
            r13.f39046g = r5
            r7 = r14
            o23.i r7 = (o23.i) r7
            r12 = r13
            java.lang.Object r14 = r7.Di(r8, r9, r10, r11, r12)
            if (r14 != r0) goto L55
            return r0
        L55:
            qc0.m1 r14 = (qc0.m1) r14
            java.util.List r1 = r14.f361413d
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
            kotlinx.coroutines.p0 r7 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r7 = kotlinx.coroutines.internal.b0.f310484a
            c61.hb r8 = new c61.hb
            r8.<init>(r3, r2)
            r14.f39043d = r6
            r14.f39044e = r3
            r14.f39045f = r1
            r14.f39046g = r4
            java.lang.Object r7 = kotlinx.coroutines.l.g(r7, r8, r14)
            if (r7 != r0) goto L61
            return r0
        L8b:
            r0 = r14
            r14 = r6
            goto L8f
        L8e:
            r0 = r13
        L8f:
            java.util.List r14 = r14.f361413d
            if (r14 == 0) goto Lb8
            java.lang.Object r14 = kz5.n0.B0(r14)
            qc0.l1 r14 = (qc0.l1) r14
            if (r14 == 0) goto L9f
            java.lang.String r14 = r14.f361396b
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
            io.flutter.plugin.common.MethodChannel$Result r0 = r0.f39051o
            if (r5 == 0) goto Lb5
            java.lang.String r14 = "captureMedia"
            java.lang.String r1 = "capture failed"
            r0.error(r14, r1, r2)
            goto Lb8
        Lb5:
            r0.success(r14)
        Lb8:
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.ib.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
