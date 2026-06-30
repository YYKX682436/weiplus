package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f198425d;

    /* renamed from: e, reason: collision with root package name */
    public int f198426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 f198427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f198428g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 m3Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198427f = m3Var;
        this.f198428g = activityC0065xcd7aa112;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a3(this.f198427f, this.f198428g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r2 == null) goto L22;
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
            int r1 = r7.f198426e
            r2 = 0
            r3 = 0
            androidx.appcompat.app.AppCompatActivity r4 = r7.f198428g
            com.tencent.mm.plugin.finder.live.viewmodel.m3 r5 = r7.f198427f
            r6 = 1
            if (r1 == 0) goto L1f
            if (r1 != r6) goto L17
            java.lang.Object r0 = r7.f198425d
            com.tencent.mm.ui.widget.dialog.u3 r0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L3e
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            android.app.Activity r8 = r5.m80379x76847179()
            r1 = 2131770609(0x7f103cf1, float:1.9172526E38)
            java.lang.String r1 = r4.getString(r1)
            com.tencent.mm.ui.widget.dialog.u3 r8 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(r8, r1, r6, r3, r2)
            r7.f198425d = r8
            r7.f198426e = r6
            java.lang.Object r1 = r5.T6(r7)
            if (r1 != r0) goto L3c
            return r0
        L3c:
            r0 = r8
            r8 = r1
        L3e:
            jz5.l r8 = (jz5.l) r8
            java.lang.Object r1 = r8.f384366d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L6b
            java.lang.Object r8 = r8.f384367e
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L5c
            int r1 = r8.length()
            if (r1 <= 0) goto L57
            r3 = r6
        L57:
            if (r3 == 0) goto L5a
            r2 = r8
        L5a:
            if (r2 != 0) goto L68
        L5c:
            r8 = 2131780989(0x7f10657d, float:1.9193579E38)
            java.lang.String r2 = r4.getString(r8)
            java.lang.String r8 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r8)
        L68:
            r5.V6(r2)
        L6b:
            r0.dismiss()
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
