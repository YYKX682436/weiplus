package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class i5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f10601d;

    /* renamed from: e, reason: collision with root package name */
    public int f10602e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.ContentResolver f10604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f10605h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.j5 f10606i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u26.w f10607m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f10608n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(android.content.ContentResolver contentResolver, android.net.Uri uri, androidx.compose.ui.platform.j5 j5Var, u26.w wVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f10604g = contentResolver;
        this.f10605h = uri;
        this.f10606i = j5Var;
        this.f10607m = wVar;
        this.f10608n = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        androidx.compose.ui.platform.i5 i5Var = new androidx.compose.ui.platform.i5(this.f10604g, this.f10605h, this.f10606i, this.f10607m, this.f10608n, continuation);
        i5Var.f10603f = obj;
        return i5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.compose.ui.platform.i5) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:11:0x0047, B:16:0x0059, B:18:0x0061), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0086 -> B:10:0x0047). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f10602e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r9.f10601d
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r9.f10603f
            kotlinx.coroutines.flow.k r4 = (kotlinx.coroutines.flow.k) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L94
            r10 = r4
            goto L46
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f10601d
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r9.f10603f
            kotlinx.coroutines.flow.k r4 = (kotlinx.coroutines.flow.k) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L94
            r5 = r4
            r4 = r9
            goto L59
        L2f:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f10603f
            kotlinx.coroutines.flow.k r10 = (kotlinx.coroutines.flow.k) r10
            r1 = 0
            androidx.compose.ui.platform.j5 r4 = r9.f10606i
            android.content.ContentResolver r5 = r9.f10604g
            android.net.Uri r6 = r9.f10605h
            r5.registerContentObserver(r6, r1, r4)
            u26.w r1 = r9.f10607m     // Catch: java.lang.Throwable -> L94
            u26.y r1 = r1.iterator()     // Catch: java.lang.Throwable -> L94
        L46:
            r4 = r9
        L47:
            r4.f10603f = r10     // Catch: java.lang.Throwable -> L92
            r4.f10601d = r1     // Catch: java.lang.Throwable -> L92
            r4.f10602e = r3     // Catch: java.lang.Throwable -> L92
            u26.a r1 = (u26.a) r1     // Catch: java.lang.Throwable -> L92
            java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L92
            if (r5 != r0) goto L56
            return r0
        L56:
            r8 = r5
            r5 = r10
            r10 = r8
        L59:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L92
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r10 == 0) goto L88
            u26.a r1 = (u26.a) r1     // Catch: java.lang.Throwable -> L92
            r1.b()     // Catch: java.lang.Throwable -> L92
            android.content.Context r10 = r4.f10608n     // Catch: java.lang.Throwable -> L92
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L92
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L92
            java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> L92
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L92
            r4.f10603f = r5     // Catch: java.lang.Throwable -> L92
            r4.f10601d = r1     // Catch: java.lang.Throwable -> L92
            r4.f10602e = r2     // Catch: java.lang.Throwable -> L92
            java.lang.Object r10 = r5.emit(r6, r4)     // Catch: java.lang.Throwable -> L92
            if (r10 != r0) goto L86
            return r0
        L86:
            r10 = r5
            goto L47
        L88:
            android.content.ContentResolver r10 = r4.f10604g
            androidx.compose.ui.platform.j5 r0 = r4.f10606i
            r10.unregisterContentObserver(r0)
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        L92:
            r10 = move-exception
            goto L96
        L94:
            r10 = move-exception
            r4 = r9
        L96:
            android.content.ContentResolver r0 = r4.f10604g
            androidx.compose.ui.platform.j5 r1 = r4.f10606i
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.i5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
