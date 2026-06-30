package uu;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512730d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f512731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uu.d f512732f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym3.c f512733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f512734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uu.d dVar, ym3.c cVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512732f = dVar;
        this.f512733g = cVar;
        this.f512734h = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        uu.c cVar = new uu.c(this.f512732f, this.f512733g, this.f512734h, interfaceC29045xdcb5ca57);
        cVar.f512731e = obj;
        return cVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((uu.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f512730d
            jz5.f0 r3 = jz5.f0.f384359a
            kotlinx.coroutines.flow.i2 r4 = r0.f512734h
            ym3.c r5 = r0.f512733g
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L29
            if (r2 == r8) goto L21
            if (r2 != r7) goto L19
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            goto L9d
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.Object r2 = r0.f512731e
            kotlinx.coroutines.y0 r2 = (p3325xe03a0797.p3326xc267989b.y0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            goto L86
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            java.lang.Object r2 = r0.f512731e
            kotlinx.coroutines.y0 r2 = (p3325xe03a0797.p3326xc267989b.y0) r2
            uu.d r9 = r0.f512732f
            s15.w r10 = r9.f512735d
            if (r10 == 0) goto L88
            java.util.LinkedList r11 = r10.j()
            int r11 = r11.size()
            uu.b r12 = new uu.b
            r12.<init>(r10, r9, r2)
            java.lang.String r9 = "request"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r9)
            ym3.d r9 = new ym3.d
            r9.<init>(r5)
            r10 = 0
            int r13 = r5.f544677b
            if (r11 <= r13) goto L79
            r14 = r10
        L54:
            java.util.ArrayList r15 = r9.f544682c
            int r7 = r5.f544678c
            if (r14 >= r7) goto L6f
            int r7 = r13 + r14
            int r6 = r13 + r14
            if (r6 >= r11) goto L6b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r12.mo146xb9724478(r6)
            r15.add(r6)
        L6b:
            int r14 = r14 + 1
            r7 = 2
            goto L54
        L6f:
            int r6 = r15.size()
            if (r6 < r7) goto L76
            r10 = r8
        L76:
            r9.f544681b = r10
            goto L7b
        L79:
            r9.f544681b = r10
        L7b:
            r0.f512731e = r2
            r0.f512730d = r8
            java.lang.Object r2 = r4.mo771x2f8fd3(r9, r0)
            if (r2 != r1) goto L86
            return r1
        L86:
            r2 = r3
            goto L89
        L88:
            r2 = 0
        L89:
            if (r2 != 0) goto L9d
            ym3.d r2 = new ym3.d
            r2.<init>(r5)
            r5 = 0
            r0.f512731e = r5
            r5 = 2
            r0.f512730d = r5
            java.lang.Object r2 = r4.mo771x2f8fd3(r2, r0)
            if (r2 != r1) goto L9d
            return r1
        L9d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uu.c.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
