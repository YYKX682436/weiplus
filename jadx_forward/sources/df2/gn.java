package df2;

/* loaded from: classes10.dex */
public final class gn extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ln f311767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(df2.ln lnVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311767e = lnVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.gn(this.f311767e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.gn) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
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
            int r1 = r6.f311766d
            r2 = 1
            df2.ln r3 = r6.f311767e
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L49
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            android.widget.FrameLayout r7 = r3.f312215s
            r1 = 0
            r4 = -1
            if (r7 == 0) goto L29
            com.tencent.mm.view.MMPAGView r5 = r3.f312216t
            int r7 = r7.indexOfChild(r5)
            if (r7 != r4) goto L29
            r1 = r2
        L29:
            if (r1 == 0) goto L5a
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r4, r4)
            com.tencent.mm.view.MMPAGView r1 = r3.f312216t
            if (r1 != 0) goto L35
            goto L38
        L35:
            r1.setLayoutParams(r7)
        L38:
            com.tencent.mm.view.MMPAGView r7 = r3.f312216t
            if (r7 == 0) goto L49
            vl2.s r1 = vl2.s.f519401a
            vl2.h r4 = vl2.h.f519363r
            r6.f311766d = r2
            java.lang.Object r7 = r1.d(r4, r7, r6)
            if (r7 != r0) goto L49
            return r0
        L49:
            android.widget.FrameLayout r7 = r3.f312215s
            if (r7 == 0) goto L52
            com.tencent.mm.view.MMPAGView r0 = r3.f312216t
            r7.addView(r0)
        L52:
            android.widget.FrameLayout r7 = r3.f312215s
            if (r7 != 0) goto L57
            goto L5a
        L57:
            r7.setClickable(r2)
        L5a:
            com.tencent.mm.view.MMPAGView r7 = r3.f312216t
            if (r7 != 0) goto L5f
            goto L64
        L5f:
            r0 = 0
            r7.m82582x3ae760af(r0)
        L64:
            com.tencent.mm.view.MMPAGView r7 = r3.f312216t
            if (r7 == 0) goto L6b
            r7.d()
        L6b:
            com.tencent.mm.view.MMPAGView r7 = r3.f312216t
            if (r7 == 0) goto L72
            r7.g()
        L72:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.gn.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
