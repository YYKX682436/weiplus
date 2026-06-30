package df2;

/* loaded from: classes3.dex */
public final class gl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311760d;

    /* renamed from: e, reason: collision with root package name */
    public int f311761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.pl f311762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(df2.pl plVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311762f = plVar;
        this.f311763g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.gl(this.f311762f, this.f311763g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.gl) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r26) {
        /*
            r25 = this;
            r6 = r25
            pz5.a r7 = pz5.a.f440719d
            int r0 = r6.f311761e
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L16
            java.lang.Object r0 = r6.f311760d
            df2.pl r0 = (df2.pl) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r26)
            r8 = r0
            r0 = r26
            goto L4f
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r26)
            df2.pl r8 = r6.f311762f
            ce2.i r2 = r8.f312621n
            r0 = 0
            if (r2 == 0) goto L2d
            r45.yi6 r3 = r2.Q0()
            goto L2e
        L2d:
            r3 = r0
        L2e:
            java.lang.String r4 = r6.f311763g
            if (r2 == 0) goto Le2
            if (r3 == 0) goto Le2
            dk2.xf r5 = r8.P6()
            if (r5 == 0) goto L51
            android.content.Context r9 = r8.O6()
            r6.f311760d = r8
            r6.f311761e = r1
            r0 = r5
            dk2.r4 r0 = (dk2.r4) r0
            r1 = r9
            r5 = r25
            java.lang.Object r0 = r0.t0(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L4f
            return r7
        L4f:
            r45.hb2 r0 = (r45.hb2) r0
        L51:
            if (r0 == 0) goto Lcc
            android.view.View r0 = r8.f312624q
            if (r0 == 0) goto L5a
            r0.performClick()
        L5a:
            dk2.ef r0 = dk2.ef.f314905a
            gk2.e r0 = dk2.ef.I
            if (r0 == 0) goto Le2
            ek2.z r1 = new ek2.z
            java.lang.Class<mm2.e1> r2 = mm2.e1.class
            androidx.lifecycle.c1 r3 = r0.a(r2)
            mm2.e1 r3 = (mm2.e1) r3
            r45.nw1 r3 = r3.f410521r
            r4 = 0
            long r10 = r3.m75942xfb822ef2(r4)
            androidx.lifecycle.c1 r3 = r0.a(r2)
            mm2.e1 r3 = (mm2.e1) r3
            long r12 = r3.f410516m
            androidx.lifecycle.c1 r3 = r0.a(r2)
            mm2.e1 r3 = (mm2.e1) r3
            java.lang.String r14 = r3.f410525v
            android.content.Context r3 = r8.O6()
            java.lang.String r15 = xy2.c.e(r3)
            r16 = 0
            androidx.lifecycle.c1 r2 = r0.a(r2)
            mm2.e1 r2 = (mm2.e1) r2
            byte[] r2 = r2.f410518o
            zl2.r4 r3 = zl2.r4.f555483a
            int r18 = r3.b0(r0)
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1792(0x700, float:2.511E-42)
            r24 = 0
            r9 = r1
            r17 = r2
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            pq5.g r0 = r1.l()
            df2.fl r1 = new df2.fl
            r1.<init>(r8)
            r0.K(r1)
            r8.O6()
            android.content.Context r1 = r8.O6()
            boolean r1 = r1 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            if (r1 == 0) goto Le2
            android.content.Context r1 = r8.O6()
            com.tencent.mm.ui.MMActivity r1 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r1
            r0.f(r1)
            goto Le2
        Lcc:
            android.content.Context r0 = r8.O6()
            android.content.Context r1 = r8.O6()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131763791(0x7f10224f, float:1.9158697E38)
            java.lang.String r1 = r1.getString(r2)
            db5.t7.g(r0, r1)
        Le2:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.gl.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
