package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes14.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 f241511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f241512e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f241511d = t0Var;
        this.f241512e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s0(this.f241511d, this.f241512e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(r0 != null ? java.lang.Float.valueOf(r0.getAlpha()) : null, 0.0f) != false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            com.tencent.mm.plugin.scanner.view.t0 r12 = r11.f241511d
            android.widget.TextView r0 = r12.f241524u
            java.lang.String r1 = r11.f241512e
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1d
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L1d
            boolean r0 = r0.equals(r1)
            if (r0 != r2) goto L1d
            r0 = r2
            goto L1e
        L1d:
            r0 = r3
        L1e:
            jz5.f0 r4 = jz5.f0.f384359a
            if (r0 == 0) goto L23
            return r4
        L23:
            android.widget.TextView r0 = r12.f241524u
            com.tencent.mm.plugin.scanner.view.t r5 = r12.f241517l1
            float r6 = r12.getAlpha()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L32
            r6 = r2
            goto L33
        L32:
            r6 = r3
        L33:
            r8 = 0
            if (r6 == 0) goto L4a
            if (r0 == 0) goto L41
            float r6 = r0.getAlpha()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L42
        L41:
            r6 = r8
        L42:
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.a(r6, r7)
            if (r6 == 0) goto L4a
            goto Lbd
        L4a:
            r6 = 2
            float[] r6 = new float[r6]
            if (r0 == 0) goto L54
            float r9 = r0.getAlpha()
            goto L55
        L54:
            r9 = r7
        L55:
            r6[r3] = r9
            r6[r2] = r7
            java.lang.String r7 = "alpha"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r0, r7, r6)
            r9 = 500(0x1f4, double:2.47E-321)
            r6.setDuration(r9)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            android.animation.Animator[] r9 = new android.animation.Animator[r2]
            r9[r3] = r6
            r7.playTogether(r9)
            com.tencent.mm.plugin.scanner.view.x r3 = new com.tencent.mm.plugin.scanner.view.x
            r3.<init>(r0, r12, r5)
            r3.f241538d = r1
            r7.addListener(r3)
            boolean r1 = r5.f241513a
            if (r1 == 0) goto La9
            java.util.Map r0 = r12.f241521r
            if (r0 == 0) goto L8b
            java.lang.String r1 = "personal_passport"
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L8b:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r0 != 0) goto L92
            goto L9d
        L92:
            android.content.Context r12 = r12.getContext()
            r0 = 2131780332(0x7f1062ec, float:1.9192246E38)
            java.lang.String r8 = r12.getString(r0)
        L9d:
            java.lang.String r12 = r3.f241538d
            boolean r12 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r12)
            if (r12 == 0) goto La6
            goto Lbd
        La6:
            r5.f241514b = r7
            goto Lbd
        La9:
            if (r0 == 0) goto Laf
            java.lang.CharSequence r8 = r0.getText()
        Laf:
            java.lang.String r12 = r3.f241538d
            boolean r12 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r12)
            if (r12 == 0) goto Lb8
            goto Lbd
        Lb8:
            r5.f241513a = r2
            r7.start()
        Lbd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
