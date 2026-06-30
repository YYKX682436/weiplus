package b0;

/* loaded from: classes14.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97804d;

    /* renamed from: e, reason: collision with root package name */
    public int f97805e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f97807g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u26.w f97808h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, u26.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97807g = h0Var;
        this.f97808h = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.f1 f1Var = new b0.f1(this.f97807g, this.f97808h, interfaceC29045xdcb5ca57);
        f1Var.f97806f = obj;
        return f1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.f1) mo148xaf65a0fc((b0.d2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:5:0x005c). Please report as a decompilation issue!!! */
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
            int r1 = r9.f97805e
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r9.f97804d
            kotlin.jvm.internal.h0 r1 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r1
            java.lang.Object r3 = r9.f97806f
            b0.d2 r3 = (b0.d2) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L5c
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.f97806f
            b0.d2 r10 = (b0.d2) r10
            r3 = r10
            r10 = r9
        L2a:
            kotlin.jvm.internal.h0 r1 = r10.f97807g
            java.lang.Object r4 = r1.f391656d
            boolean r5 = r4 instanceof b0.v
            if (r5 != 0) goto L62
            boolean r5 = r4 instanceof b0.s
            if (r5 != 0) goto L62
            boolean r5 = r4 instanceof b0.t
            if (r5 == 0) goto L3d
            b0.t r4 = (b0.t) r4
            goto L3e
        L3d:
            r4 = 0
        L3e:
            if (r4 == 0) goto L47
            float r5 = r4.f98055a
            long r6 = r4.f98056b
            r3.b(r5, r6)
        L47:
            r10.f97806f = r3
            r10.f97804d = r1
            r10.f97805e = r2
            u26.w r4 = r10.f97808h
            java.lang.Object r4 = r4.r(r10)
            if (r4 != r0) goto L56
            return r0
        L56:
            r8 = r0
            r0 = r10
            r10 = r4
            r4 = r3
            r3 = r1
            r1 = r8
        L5c:
            r3.f391656d = r10
            r10 = r0
            r0 = r1
            r3 = r4
            goto L2a
        L62:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
