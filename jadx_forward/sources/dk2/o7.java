package dk2;

/* loaded from: classes3.dex */
public final class o7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f315371d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f315372e;

    /* renamed from: f, reason: collision with root package name */
    public int f315373f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315374g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ce2.i f315375h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315376i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(ce2.i iVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f315375h = iVar;
        this.f315376i = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.String r9, yz5.l r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            boolean r0 = r11 instanceof dk2.n7
            if (r0 == 0) goto L13
            r0 = r11
            dk2.n7 r0 = (dk2.n7) r0
            int r1 = r0.f315335f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315335f = r1
            goto L18
        L13:
            dk2.n7 r0 = new dk2.n7
            r0.<init>(r11)
        L18:
            r4 = r0
            java.lang.Object r11 = r4.f315334e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r4.f315335f
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L36
            if (r1 != r8) goto L2e
            java.lang.Object r9 = r4.f315333d
            r10 = r9
            yz5.l r10 = (yz5.l) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L74
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            dk2.u7 r11 = dk2.u7.f315714a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "syncGiftResourceFromMsg download "
            r11.<init>(r1)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r1 = "Finder.FinderLiveGiftLoader"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r11)
            if (r9 == 0) goto L59
            int r11 = r9.length()
            if (r11 != 0) goto L57
            goto L59
        L57:
            r11 = r7
            goto L5a
        L59:
            r11 = r8
        L5a:
            if (r11 == 0) goto L5f
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L5f:
            nn2.d r11 = nn2.d.f420204a
            rj.j r1 = r11.c()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f315333d = r10
            r4.f315335f = r8
            r2 = r9
            java.lang.Object r11 = rj.j.c(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L74
            return r0
        L74:
            org.libpag.PAGFile r11 = (org.p3363xbe4143f1.C29690xfae77312) r11
            if (r11 == 0) goto L7d
            if (r10 == 0) goto L7d
            r10.mo146xb9724478(r11)
        L7d:
            if (r11 == 0) goto L80
            r7 = r8
        L80:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.o7.a(java.lang.String, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object f(java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        return a(str, lVar, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        dk2.o7 o7Var = new dk2.o7(this.f315375h, this.f315376i, interfaceC29045xdcb5ca57);
        o7Var.f315374g = obj;
        return o7Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.o7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00e0 -> B:5:0x00e4). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.o7.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
