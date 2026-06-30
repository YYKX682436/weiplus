package pe3;

/* loaded from: classes7.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.o f435200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pe3.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f435200e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pe3.n(this.f435200e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f435199d
            r2 = 3
            r3 = 2
            r4 = 1
            pe3.o r5 = r6.f435200e
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L6c
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L5d
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L37
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            se3.e r7 = r5.f435202e
            r6.f435199d = r4
            java.lang.String r1 = "frames"
            java.lang.String r4 = ""
            java.lang.Object r7 = r7.O6(r1, r4, r6)
            if (r7 != r0) goto L37
            return r0
        L37:
            se3.e r7 = r5.f435202e
            androidx.appcompat.app.AppCompatActivity r1 = r5.m158354x19263085()
            java.lang.String r4 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            pf5.z r4 = pf5.z.f435481a
            pf5.v r1 = r4.a(r1)
            java.lang.Class<pe3.h> r4 = pe3.h.class
            androidx.lifecycle.c1 r1 = r1.a(r4)
            pe3.h r1 = (pe3.h) r1
            java.lang.String r1 = r1.O6()
            r6.f435199d = r3
            java.lang.Object r7 = r7.P6(r1, r6)
            if (r7 != r0) goto L5d
            return r0
        L5d:
            se3.e r7 = r5.f435202e
            com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView r1 = r5.f435201d
            if (r1 == 0) goto L6f
            r6.f435199d = r2
            java.lang.Object r7 = r7.N6(r1, r6)
            if (r7 != r0) goto L6c
            return r0
        L6c:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        L6f:
            java.lang.String r7 = "frameSetView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r7)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pe3.n.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
