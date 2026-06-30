package cn2;

/* loaded from: classes3.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f125158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cn2.c0 f125159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f125160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cn2.k f125161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(cn2.c0 c0Var, android.view.View view, cn2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f125159e = c0Var;
        this.f125160f = view;
        this.f125161g = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cn2.w(this.f125159e, this.f125160f, this.f125161g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cn2.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f125158d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L9f
        Le:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            cn2.k r13 = r12.f125161g
            cn2.h r13 = r13.f125095f
            long r3 = r13.f125058d
            r12.f125158d = r2
            cn2.c0 r13 = r12.f125159e
            r13.getClass()
            oz5.n r13 = new oz5.n
            kotlin.coroutines.Continuation r1 = pz5.f.b(r12)
            r13.<init>(r1)
            kotlin.jvm.internal.c0 r1 = new kotlin.jvm.internal.c0
            r1.<init>()
            android.view.View r5 = r12.f125160f
            float r6 = r5.getScaleX()
            r7 = 1066695393(0x3f947ae1, float:1.16)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            r8 = 0
            if (r6 != 0) goto L44
            r6 = r2
            goto L45
        L44:
            r6 = r8
        L45:
            if (r6 == 0) goto L95
            float r6 = r5.getScaleY()
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L51
            r6 = r2
            goto L52
        L51:
            r6 = r8
        L52:
            if (r6 != 0) goto L55
            goto L95
        L55:
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            r7 = 0
            r5.setPivotX(r7)
            r5.setPivotY(r7)
            r9 = 250(0xfa, double:1.235E-321)
            r6.setDuration(r9)
            r7 = 2
            android.animation.Animator[] r9 = new android.animation.Animator[r7]
            float[] r10 = new float[r7]
            r10 = {x00a0: FILL_ARRAY_DATA , data: [1066695393, 1065353216} // fill-array
            java.lang.String r11 = "scaleX"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r5, r11, r10)
            r9[r8] = r10
            float[] r7 = new float[r7]
            r7 = {x00a8: FILL_ARRAY_DATA , data: [1066695393, 1065353216} // fill-array
            java.lang.String r8 = "scaleY"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r8, r7)
            r9[r2] = r5
            r6.playTogether(r9)
            r6.setDuration(r3)
            cn2.t r2 = new cn2.t
            r2.<init>(r1, r13)
            r6.addListener(r2)
            r6.start()
            goto L98
        L95:
            cn2.c0.k(r1, r13, r8)
        L98:
            java.lang.Object r13 = r13.a()
            if (r13 != r0) goto L9f
            return r0
        L9f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: cn2.w.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
