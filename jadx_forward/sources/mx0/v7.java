package mx0;

/* loaded from: classes5.dex */
public final class v7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(java.lang.String str, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413933d = str;
        this.f413934e = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.v7(this.f413933d, this.f413934e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.v7 v7Var = (mx0.v7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if ((r0.length() == 0) != false) goto L20;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "onTemplateStartDownload templateId:"
            r8.<init>(r0)
            java.lang.String r0 = r7.f413933d
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "MicroMsg.ShootComposingPluginLayout"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r8)
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout r8 = r7.f413934e
            mx0.ja r1 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced.g0(r8)
            r1.getClass()
            java.lang.String r2 = "templateId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r2)
            java.util.ArrayList r3 = r1.f413614m
            boolean r4 = r3 instanceof java.util.Collection
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L37
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L37
            goto L51
        L37:
            java.util.Iterator r3 = r3.iterator()
        L3b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L51
            java.lang.Object r4 = r3.next()
            vt3.p r4 = (vt3.p) r4
            java.lang.String r4 = r4.f521553b
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r0)
            if (r4 == 0) goto L3b
            r3 = r6
            goto L52
        L51:
            r3 = r5
        L52:
            if (r3 != 0) goto L5e
            int r3 = r0.length()
            if (r3 != 0) goto L5b
            goto L5c
        L5b:
            r6 = r5
        L5c:
            if (r6 == 0) goto L63
        L5e:
            mx0.t9 r1 = r1.f413613i
            r1.N(r0)
        L63:
            xx0.n r8 = r8.K1
            if (r8 == 0) goto Ld8
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r2)
            xx0.c r8 = r8.a()
            if (r8 == 0) goto Ld8
            xx0.f0 r8 = r8.f539397g
            if (r8 == 0) goto Ld8
            java.util.Map r8 = r8.f539432h
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.util.Collection r8 = r8.values()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L82:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Ld8
            java.lang.Object r1 = r8.next()
            xx0.e0 r1 = (xx0.e0) r1
            xx0.d0 r1 = r1.f539421a
            r1.getClass()
            xx0.t r1 = r1.f539414i
            r1.getClass()
            xx0.u r2 = r1.f539475h
            if (r2 == 0) goto La1
            java.lang.String r2 = r2.f539478a
            r1.y(r2)
        La1:
            xx0.u r2 = new xx0.u
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.<init>(r0, r3)
            r1.f539475h = r2
            java.util.List r2 = r1.f539474g
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = r5
        Lb5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r2.next()
            vt3.p r4 = (vt3.p) r4
            java.lang.String r4 = r4.f521553b
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r0)
            if (r4 == 0) goto Lca
            goto Lce
        Lca:
            int r3 = r3 + 1
            goto Lb5
        Lcd:
            r3 = -1
        Lce:
            if (r3 < 0) goto L82
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1.m8148xed6e4d18(r3, r2)
            goto L82
        Ld8:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.v7.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
