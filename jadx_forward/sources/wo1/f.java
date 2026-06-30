package wo1;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f529458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f529459e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f529460f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f529461g;

    /* renamed from: h, reason: collision with root package name */
    public int f529462h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f529463i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f529463i = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wo1.f(this.f529463i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wo1.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:5:0x0067). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f529462h
            r3 = 1
            if (r2 == 0) goto L2b
            if (r2 != r3) goto L23
            java.lang.Object r2 = r0.f529461g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f529460f
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.f529459e
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.f529458d
            oo1.e r6 = (oo1.e) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r20)
            r8 = r20
            r10 = r2
            r2 = r0
            goto L67
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r20)
            oo1.e r2 = new oo1.e
            r5 = 0
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1
            r4 = r2
            r4.<init>(r5, r7, r9)
            oo1.g r4 = oo1.g.f428676a
            java.util.List r4 = r4.c()
            java.util.Iterator r4 = r4.iterator()
            java.util.List r5 = r0.f529463i
            r6 = r2
            r2 = r0
        L49:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L98
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            r2.f529458d = r6
            r2.f529459e = r5
            r2.f529460f = r4
            r2.f529461g = r7
            r2.f529462h = r3
            java.lang.Object r8 = r6.a(r7, r2)
            if (r8 != r1) goto L66
            return r1
        L66:
            r10 = r7
        L67:
            oo1.h r8 = (oo1.h) r8
            r7 = r8
            oo1.b r7 = (oo1.b) r7
            long r11 = r7.f428657c
            oo1.b r8 = (oo1.b) r8
            long r13 = r8.f428658d
            long r13 = r13 + r11
            r11 = 0
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 <= 0) goto L8e
            long r7 = r8.f428659e
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 > 0) goto L80
            goto L8e
        L80:
            wo1.n r18 = new wo1.n
            r15 = 0
            r16 = 8
            r17 = 0
            r9 = r18
            r11 = r7
            r9.<init>(r10, r11, r13, r15, r16, r17)
            goto L90
        L8e:
            r18 = 0
        L90:
            r7 = r18
            if (r7 == 0) goto L49
            r5.add(r7)
            goto L49
        L98:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wo1.f.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
