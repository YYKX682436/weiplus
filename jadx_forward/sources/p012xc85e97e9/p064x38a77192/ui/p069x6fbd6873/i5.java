package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class i5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f92134d;

    /* renamed from: e, reason: collision with root package name */
    public int f92135e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f92136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.ContentResolver f92137g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f92138h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.j5 f92139i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u26.w f92140m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f92141n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(android.content.ContentResolver contentResolver, android.net.Uri uri, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.j5 j5Var, u26.w wVar, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f92137g = contentResolver;
        this.f92138h = uri;
        this.f92139i = j5Var;
        this.f92140m = wVar;
        this.f92141n = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i5 i5Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i5(this.f92137g, this.f92138h, this.f92139i, this.f92140m, this.f92141n, interfaceC29045xdcb5ca57);
        i5Var.f92136f = obj;
        return i5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:11:0x0047, B:16:0x0059, B:18:0x0061), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0086 -> B:10:0x0047). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f92135e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r9.f92134d
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r9.f92136f
            kotlinx.coroutines.flow.k r4 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L94
            r10 = r4
            goto L46
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f92134d
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r9.f92136f
            kotlinx.coroutines.flow.k r4 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L94
            r5 = r4
            r4 = r9
            goto L59
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.f92136f
            kotlinx.coroutines.flow.k r10 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r10
            r1 = 0
            androidx.compose.ui.platform.j5 r4 = r9.f92139i
            android.content.ContentResolver r5 = r9.f92137g
            android.net.Uri r6 = r9.f92138h
            r5.registerContentObserver(r6, r1, r4)
            u26.w r1 = r9.f92140m     // Catch: java.lang.Throwable -> L94
            u26.y r1 = r1.mo167478x467c086e()     // Catch: java.lang.Throwable -> L94
        L46:
            r4 = r9
        L47:
            r4.f92136f = r10     // Catch: java.lang.Throwable -> L92
            r4.f92134d = r1     // Catch: java.lang.Throwable -> L92
            r4.f92135e = r3     // Catch: java.lang.Throwable -> L92
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
            android.content.Context r10 = r4.f92141n     // Catch: java.lang.Throwable -> L92
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L92
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L92
            java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> L92
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L92
            r4.f92136f = r5     // Catch: java.lang.Throwable -> L92
            r4.f92134d = r1     // Catch: java.lang.Throwable -> L92
            r4.f92135e = r2     // Catch: java.lang.Throwable -> L92
            java.lang.Object r10 = r5.mo771x2f8fd3(r6, r4)     // Catch: java.lang.Throwable -> L92
            if (r10 != r0) goto L86
            return r0
        L86:
            r10 = r5
            goto L47
        L88:
            android.content.ContentResolver r10 = r4.f92137g
            androidx.compose.ui.platform.j5 r0 = r4.f92139i
            r10.unregisterContentObserver(r0)
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        L92:
            r10 = move-exception
            goto L96
        L94:
            r10 = move-exception
            r4 = r9
        L96:
            android.content.ContentResolver r0 = r4.f92137g
            androidx.compose.ui.platform.j5 r1 = r4.f92139i
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i5.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
