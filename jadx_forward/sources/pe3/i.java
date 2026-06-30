package pe3;

/* loaded from: classes7.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.o f435193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(pe3.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f435193e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pe3.i(this.f435193e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pe3.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
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
            int r1 = r7.f435192d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 3
            r4 = 2
            r5 = 1
            pe3.o r6 = r7.f435193e
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L7b
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L5f
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L39
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            se3.e r8 = r6.f435202e
            r7.f435192d = r5
            java.lang.String r1 = "frames"
            java.lang.String r5 = ""
            java.lang.Object r8 = r8.O6(r1, r5, r7)
            if (r8 != r0) goto L39
            return r0
        L39:
            se3.e r8 = r6.f435202e
            androidx.appcompat.app.AppCompatActivity r1 = r6.m158354x19263085()
            java.lang.String r5 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r5)
            pf5.z r5 = pf5.z.f435481a
            pf5.v r1 = r5.a(r1)
            java.lang.Class<pe3.h> r5 = pe3.h.class
            androidx.lifecycle.c1 r1 = r1.a(r5)
            pe3.h r1 = (pe3.h) r1
            java.lang.String r1 = r1.O6()
            r7.f435192d = r4
            java.lang.Object r8 = r8.P6(r1, r7)
            if (r8 != r0) goto L5f
            return r0
        L5f:
            se3.e r8 = r6.f435202e
            com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView r1 = r6.f435201d
            if (r1 == 0) goto L7c
            r7.f435192d = r3
            kotlinx.coroutines.flow.i2 r8 = r8.f488447d
            se3.c r3 = new se3.c
            r3.<init>(r1)
            kotlinx.coroutines.flow.q2 r8 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) r8
            java.lang.Object r8 = r8.mo771x2f8fd3(r3, r7)
            if (r8 != r0) goto L77
            goto L78
        L77:
            r8 = r2
        L78:
            if (r8 != r0) goto L7b
            return r0
        L7b:
            return r2
        L7c:
            java.lang.String r8 = "frameSetView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pe3.i.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
