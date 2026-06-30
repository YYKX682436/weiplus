package yx0;

/* loaded from: classes5.dex */
public final class g4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f548862d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f548863e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f548864f;

    /* renamed from: g, reason: collision with root package name */
    public int f548865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548866h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f548867i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(yx0.b8 b8Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548866h = b8Var;
        this.f548867i = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.g4(this.f548866h, this.f548867i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.g4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006c -> B:5:0x0072). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f548865g
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r13.f548864f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r13.f548863e
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r13.f548862d
            pp0.p0 r4 = (pp0.p0) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            r5 = r1
            r10 = r3
            r11 = r4
            r1 = r0
            r0 = r13
            goto L72
        L1e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            yx0.b8 r14 = r13.f548866h
            pp0.p0 r14 = r14.K
            if (r14 == 0) goto Lb6
            java.util.List r1 = r13.f548867i
            java.util.Iterator r1 = r1.iterator()
            r4 = r14
            r3 = r1
            r14 = r13
        L38:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r3.next()
            jz5.l r1 = (jz5.l) r1
            java.lang.Object r5 = r1.f384366d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.f384367e
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            vx0.a r1 = vx0.a.f522754a
            boolean r6 = r4.n0(r5, r6)
            r1.a(r6, r5, r2)
            com.tencent.maas.camstudio.q r1 = com.p314xaae8f345.p457x3304c6.p461x3a6d265.q.UserCommon
            yx0.f4 r6 = yx0.f4.f548832a
            r14.f548862d = r4
            r14.f548863e = r3
            r14.f548864f = r5
            r14.f548865g = r2
            java.lang.Object r1 = r4.b0(r5, r1, r6, r14)
            if (r1 != r0) goto L6c
            return r0
        L6c:
            r10 = r3
            r11 = r4
            r12 = r0
            r0 = r14
            r14 = r1
            r1 = r12
        L72:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "preloadTemplate >> "
            r3.<init>(r4)
            r3.append(r14)
            r14 = 32
            r3.append(r14)
            r3.append(r5)
            java.lang.String r14 = r3.toString()
            java.lang.String r3 = "MicroMsg.ShootComposingCorePlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r14)
            java.lang.String r14 = "templateID"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r14)
            java.lang.Class<pp0.m0> r14 = pp0.m0.class
            i95.m r14 = i95.n0.c(r14)
            java.lang.String r3 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r14, r3)
            r3 = r14
            pp0.m0 r3 = (pp0.m0) r3
            java.lang.String r4 = "mjpublisher_sc_download_template"
            java.lang.String r6 = "Completed"
            r7 = 0
            r8 = 8
            r9 = 0
            pp0.m0.ee(r3, r4, r5, r6, r7, r8, r9)
            r14 = r0
            r0 = r1
            r3 = r10
            r4 = r11
            goto L38
        Lb6:
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.g4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
