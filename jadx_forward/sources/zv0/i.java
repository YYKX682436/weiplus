package zv0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f557717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f557718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.j0 f557720g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f557721h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rv0.n1 n1Var, java.lang.String str, ex0.j0 j0Var, zv0.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f557718e = n1Var;
        this.f557719f = str;
        this.f557720g = j0Var;
        this.f557721h = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zv0.i(this.f557718e, this.f557719f, this.f557720g, this.f557721h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zv0.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r5) {
        /*
            r4 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r4.f557717d
            rv0.n1 r2 = r4.f557718e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L2f
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            jz5.g r5 = r2.f481669x
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.mo141623x754a37bb()
            zv0.y r5 = (zv0.y) r5
            r4.f557717d = r3
            java.lang.String r1 = r4.f557719f
            java.lang.Object r5 = r5.c(r1, r4)
            if (r5 != r0) goto L2f
            return r0
        L2f:
            ex0.j0 r5 = r4.f557720g
            java.lang.String r5 = r5.r()
            if (r5 == 0) goto L73
            jz5.g r0 = r2.f481669x
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            zv0.y r0 = (zv0.y) r0
            r0.getClass()
            androidx.lifecycle.g0 r0 = r0.f557781c
            java.lang.Object r0 = r0.mo3195x754a37bb()
            zv0.h0 r0 = (zv0.h0) r0
            r1 = 0
            if (r0 == 0) goto L71
            java.util.List r0 = r0.f557714a
            if (r0 == 0) goto L71
            java.util.Iterator r0 = r0.iterator()
        L57:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r0.next()
            r3 = r2
            zv0.r r3 = (zv0.r) r3
            com.tencent.maas.material.MJMaterialInfo r3 = r3.f557754a
            java.lang.String r3 = r3.f129757b
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r5)
            if (r3 == 0) goto L57
            r1 = r2
        L6f:
            zv0.r r1 = (zv0.r) r1
        L71:
            if (r1 != 0) goto L75
        L73:
            zv0.r r1 = zv0.r.f557753d
        L75:
            zv0.f0 r5 = r4.f557721h
            r5.m179698x7c6f8cd5(r1)
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zv0.i.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
