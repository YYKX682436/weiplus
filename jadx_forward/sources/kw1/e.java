package kw1;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394359d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw1.k f394361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qw1.f f394362g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kw1.k kVar, qw1.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f394361f = kVar;
        this.f394362g = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        kw1.e eVar = new kw1.e(this.f394361f, this.f394362g, interfaceC29045xdcb5ca57);
        eVar.f394360e = obj;
        return eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.e) mo148xaf65a0fc((mw1.b) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f394359d
            r3 = 1
            if (r2 == 0) goto L19
            if (r2 != r3) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            r2 = r18
            goto L71
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            java.lang.Object r2 = r0.f394360e
            mw1.b r2 = (mw1.b) r2
            mw1.c r2 = r2.a()
            if (r2 == 0) goto L75
            kw1.k r5 = r0.f394361f
            qw1.f r6 = r0.f394362g
            nw1.d r5 = r5.f394390g
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) r2
            android.util.Size r2 = r2.m54521x356c92ad()
            java.lang.String r7 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r7)
            java.lang.String r7 = "drawSize"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r7)
            nw1.e r7 = new nw1.e
            pw1.g r15 = new pw1.g
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 24
            r16 = 0
            r8 = r15
            r4 = r15
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            boolean r8 = r6.f448624c
            if (r8 == 0) goto L5d
            qw1.d r6 = r6.f448623b
            boolean r8 = r6.f448614b
            if (r8 == 0) goto L5d
            is0.c r6 = r6.f448613a
            goto L5e
        L5d:
            r6 = 0
        L5e:
            r8 = 0
            if (r6 == 0) goto L64
            int r6 = r6.f375928e
            goto L65
        L64:
            r6 = r8
        L65:
            r7.<init>(r4, r2, r6, r8)
            r0.f394359d = r3
            java.lang.Object r2 = r5.c(r7, r0)
            if (r2 != r1) goto L71
            return r1
        L71:
            r4 = r2
            nw1.f r4 = (nw1.f) r4
            goto L76
        L75:
            r4 = 0
        L76:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kw1.e.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
