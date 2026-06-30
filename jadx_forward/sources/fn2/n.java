package fn2;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn2.s f345866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(fn2.s sVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f345866e = sVar;
        this.f345867f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fn2.n(this.f345866e, this.f345867f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fn2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f345865d
            java.lang.String r2 = r8.f345867f
            r3 = 2
            r4 = 1
            fn2.s r5 = r8.f345866e
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L39
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L2e
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r8.f345865d = r4
            r6 = 600(0x258, double:2.964E-321)
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.k1.b(r6, r8)
            if (r9 != r0) goto L2e
            return r0
        L2e:
            sf2.d3 r9 = r5.f345903f
            r8.f345865d = r3
            java.lang.Object r9 = r9.u7(r2, r8)
            if (r9 != r0) goto L39
            return r0
        L39:
            r45.wx1 r9 = (r45.wx1) r9
            if (r9 == 0) goto L40
            java.util.LinkedList r9 = r9.f471085d
            goto L41
        L40:
            r9 = 0
        L41:
            if (r9 != 0) goto L45
            kz5.p0 r9 = kz5.p0.f395529d
        L45:
            bm2.n7 r0 = r5.f345909o
            r0.getClass()
            java.lang.String r1 = "searchKey"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r1)
            r0.f103699f = r2
            java.util.List r1 = r0.f103697d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            r1.addAll(r9)
            r0.m8146xced61ae5()
            com.tencent.mm.plugin.finder.live.widget.dv r0 = r5.f345913s
            if (r0 == 0) goto L65
            r0.b()
        L65:
            com.tencent.mm.plugin.finder.live.widget.dv r0 = r5.f345912r
            if (r0 == 0) goto L81
            android.content.Context r1 = r5.c()
            java.lang.String r2 = "<get-context>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r2 = 2131763030(0x7f101f56, float:1.9157154E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r0.c(r9, r1)
        L81:
            fn2.s.b(r5)
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.n.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
