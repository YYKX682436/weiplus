package ly;

/* loaded from: classes14.dex */
public final class d extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f403702e;

    /* renamed from: f, reason: collision with root package name */
    public int f403703f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f403704g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f403705h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f403706i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yz5.a aVar, yz5.a aVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403705h = aVar;
        this.f403706i = aVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ly.d dVar = new ly.d(this.f403705h, this.f403706i, interfaceC29045xdcb5ca57);
        dVar.f403704g = obj;
        return dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ly.d) mo148xaf65a0fc((p1.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:6:0x005c). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f403703f
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L24
            if (r1 != r2) goto L1c
            int r1 = r10.f403702e
            java.lang.Object r6 = r10.f403704g
            p1.c r6 = (p1.c) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r10
            goto L5c
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            java.lang.Object r1 = r10.f403704g
            p1.c r1 = (p1.c) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L3f
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.Object r11 = r10.f403704g
            r1 = r11
            p1.c r1 = (p1.c) r1
            r10.f403704g = r1
            r10.f403703f = r5
            java.lang.Object r11 = b0.d4.b(r1, r4, r10, r5, r3)
            if (r11 != r0) goto L3f
            return r0
        L3f:
            yz5.a r11 = r10.f403705h
            r11.mo152xb9724478()
            r11 = r10
            r6 = r1
            r1 = r4
        L47:
            if (r1 != 0) goto L93
            r11.f403704g = r6
            r11.f403702e = r1
            r11.f403703f = r2
            java.lang.Object r7 = p1.b.a(r6, r3, r11, r5, r3)
            if (r7 != r0) goto L56
            return r0
        L56:
            r9 = r0
            r0 = r11
            r11 = r7
            r7 = r6
            r6 = r1
            r1 = r9
        L5c:
            p1.l r11 = (p1.l) r11
            java.util.List r11 = r11.f432375a
            boolean r8 = r11 instanceof java.util.Collection
            if (r8 == 0) goto L6c
            boolean r8 = r11.isEmpty()
            if (r8 == 0) goto L6c
        L6a:
            r11 = r5
            goto L83
        L6c:
            java.util.Iterator r11 = r11.iterator()
        L70:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r11.next()
            p1.s r8 = (p1.s) r8
            boolean r8 = p1.m.b(r8)
            if (r8 != 0) goto L70
            r11 = r4
        L83:
            if (r11 == 0) goto L8e
            yz5.a r11 = r0.f403706i
            r11.mo152xb9724478()
            r11 = r0
            r0 = r1
            r1 = r5
            goto L91
        L8e:
            r11 = r0
            r0 = r1
            r1 = r6
        L91:
            r6 = r7
            goto L47
        L93:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.d.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
