package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f92343d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f92344e;

    /* renamed from: f, reason: collision with root package name */
    public int f92345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u26.w f92346g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(u26.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f92346g = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.x2(this.f92346g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.x2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:9:0x003d, B:11:0x0045, B:12:0x0050, B:20:0x0067, B:22:0x006a, B:33:0x0071, B:34:0x0072, B:14:0x0051, B:16:0x005d), top: B:8:0x003d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0038 -> B:8:0x003d). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f92345f
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r7.f92344e
            u26.y r1 = (u26.y) r1
            java.lang.Object r3 = r7.f92343d
            u26.t0 r3 = (u26.t0) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)     // Catch: java.lang.Throwable -> L7d
            r4 = r3
            r3 = r7
            goto L3d
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            u26.w r3 = r7.f92346g
            u26.y r8 = r3.mo167478x467c086e()     // Catch: java.lang.Throwable -> L7d
            r1 = r7
        L29:
            r1.f92343d = r3     // Catch: java.lang.Throwable -> L7d
            r1.f92344e = r8     // Catch: java.lang.Throwable -> L7d
            r1.f92345f = r2     // Catch: java.lang.Throwable -> L7d
            u26.a r8 = (u26.a) r8     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r4 = r8.a(r1)     // Catch: java.lang.Throwable -> L7d
            if (r4 != r0) goto L38
            return r0
        L38:
            r6 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r6
        L3d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L7a
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L7a
            if (r8 == 0) goto L73
            r8 = r1
            u26.a r8 = (u26.a) r8     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r8.b()     // Catch: java.lang.Throwable -> L7a
            jz5.f0 r1 = (jz5.f0) r1     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = x0.z.f532496b     // Catch: java.lang.Throwable -> L7a
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.atomic.AtomicReference r5 = x0.z.f532502h     // Catch: java.lang.Throwable -> L70
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L70
            x0.d r5 = (x0.d) r5     // Catch: java.lang.Throwable -> L70
            java.util.Set r5 = r5.f532410h     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L66
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L70
            r5 = r5 ^ r2
            if (r5 != r2) goto L66
            r5 = r2
            goto L67
        L66:
            r5 = 0
        L67:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L6d
            x0.z.a()     // Catch: java.lang.Throwable -> L7a
        L6d:
            r1 = r3
            r3 = r4
            goto L29
        L70:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
            throw r8     // Catch: java.lang.Throwable -> L7a
        L73:
            r8 = 0
            u26.d0.a(r4, r8)
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        L7a:
            r8 = move-exception
            r3 = r4
            goto L7e
        L7d:
            r8 = move-exception
        L7e:
            throw r8     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            u26.d0.a(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.x2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
