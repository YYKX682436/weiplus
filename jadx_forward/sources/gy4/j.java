package gy4;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f359138d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f359139e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f359140f;

    /* renamed from: g, reason: collision with root package name */
    public int f359141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f359142h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gy4.u f359143i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.util.List list, gy4.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f359142h = list;
        this.f359143i = uVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gy4.j(this.f359142h, this.f359143i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gy4.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:8:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006d -> B:10:0x0073). Please report as a decompilation issue!!! */
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
            int r1 = r11.f359141g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 != r3) goto L21
            java.lang.Object r1 = r11.f359140f
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r11.f359139e
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r11.f359138d
            gy4.u r5 = (gy4.u) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)     // Catch: java.util.concurrent.CancellationException -> L1f
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r11
            goto L65
        L1f:
            r12 = r11
            goto L6d
        L21:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r1 = r11.f359142h
            java.util.Iterator r1 = r1.iterator()
            gy4.u r4 = r11.f359143i
            r5 = r4
            r4 = r12
            r12 = r11
        L3c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            gy4.i r7 = new gy4.i     // Catch: java.util.concurrent.CancellationException -> L6d
            r7.<init>(r5, r6, r2)     // Catch: java.util.concurrent.CancellationException -> L6d
            r12.f359138d = r5     // Catch: java.util.concurrent.CancellationException -> L6d
            r12.f359139e = r4     // Catch: java.util.concurrent.CancellationException -> L6d
            r12.f359140f = r1     // Catch: java.util.concurrent.CancellationException -> L6d
            r12.f359141g = r3     // Catch: java.util.concurrent.CancellationException -> L6d
            r8 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r6 = p3325xe03a0797.p3326xc267989b.a4.c(r8, r7, r12)     // Catch: java.util.concurrent.CancellationException -> L6d
            if (r6 != r0) goto L5e
            return r0
        L5e:
            r10 = r0
            r0 = r12
            r12 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r10
        L65:
            com.tencent.mm.plugin.webview.model.p0 r12 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p0) r12     // Catch: java.util.concurrent.CancellationException -> L68
            goto L73
        L68:
            r12 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
        L6d:
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r12
            r12 = r2
        L73:
            if (r12 == 0) goto L78
            r5.add(r12)
        L78:
            r12 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            goto L3c
        L7e:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gy4.j.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
