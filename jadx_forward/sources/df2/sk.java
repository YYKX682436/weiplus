package df2;

/* loaded from: classes3.dex */
public final class sk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312877d;

    /* renamed from: e, reason: collision with root package name */
    public int f312878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.pl f312879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(df2.pl plVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312879f = plVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.sk(this.f312879f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.sk) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f312878e
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L15
            java.lang.Object r1 = r0.f312877d
            df2.pl r1 = (df2.pl) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r21)
            r3 = r21
            goto L49
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r21)
            df2.pl r2 = r0.f312879f
            ce2.i r4 = r2.f312621n
            r5 = 0
            if (r4 == 0) goto L2c
            r45.yi6 r6 = r4.Q0()
            goto L2d
        L2c:
            r6 = r5
        L2d:
            if (r4 == 0) goto Lef
            if (r6 == 0) goto Lef
            dk2.xf r7 = r2.P6()
            if (r7 == 0) goto L4d
            android.content.Context r5 = r2.O6()
            r0.f312877d = r2
            r0.f312878e = r3
            dk2.r4 r7 = (dk2.r4) r7
            java.lang.Object r3 = r7.o(r5, r4, r6, r0)
            if (r3 != r1) goto L48
            return r1
        L48:
            r1 = r2
        L49:
            r5 = r3
            r45.hb2 r5 = (r45.hb2) r5
            r2 = r1
        L4d:
            if (r5 == 0) goto Ld9
            android.view.View r1 = r2.f312624q
            if (r1 == 0) goto L56
            r1.performClick()
        L56:
            android.content.Context r1 = r2.O6()
            android.content.Context r3 = r2.O6()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131763795(0x7f102253, float:1.9158705E38)
            java.lang.String r3 = r3.getString(r4)
            db5.t7.h(r1, r3)
            dk2.ef r1 = dk2.ef.f314905a
            gk2.e r1 = dk2.ef.I
            if (r1 == 0) goto Lef
            ek2.z r19 = new ek2.z
            java.lang.Class<mm2.e1> r3 = mm2.e1.class
            androidx.lifecycle.c1 r4 = r1.a(r3)
            mm2.e1 r4 = (mm2.e1) r4
            r45.nw1 r4 = r4.f410521r
            r5 = 0
            long r4 = r4.m75942xfb822ef2(r5)
            androidx.lifecycle.c1 r6 = r1.a(r3)
            mm2.e1 r6 = (mm2.e1) r6
            long r6 = r6.f410516m
            androidx.lifecycle.c1 r8 = r1.a(r3)
            mm2.e1 r8 = (mm2.e1) r8
            java.lang.String r8 = r8.f410525v
            android.content.Context r9 = r2.O6()
            java.lang.String r9 = xy2.c.e(r9)
            r10 = 0
            androidx.lifecycle.c1 r3 = r1.a(r3)
            mm2.e1 r3 = (mm2.e1) r3
            byte[] r11 = r3.f410518o
            zl2.r4 r3 = zl2.r4.f555483a
            int r12 = r3.b0(r1)
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 1792(0x700, float:2.511E-42)
            r18 = 0
            r3 = r19
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            pq5.g r1 = r19.l()
            df2.rk r3 = new df2.rk
            r3.<init>(r2)
            r1.K(r3)
            r2.O6()
            android.content.Context r3 = r2.O6()
            boolean r3 = r3 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            if (r3 == 0) goto Lef
            android.content.Context r2 = r2.O6()
            com.tencent.mm.ui.MMActivity r2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r2
            r1.f(r2)
            goto Lef
        Ld9:
            android.content.Context r1 = r2.O6()
            android.content.Context r2 = r2.O6()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131763794(0x7f102252, float:1.9158703E38)
            java.lang.String r2 = r2.getString(r3)
            db5.t7.g(r1, r2)
        Lef:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.sk.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
