package bg2;

/* loaded from: classes3.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kr0 f20403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f20404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u4.j0 f20405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f20406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20407i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u4.j0 f20408m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(r45.kr0 kr0Var, android.view.ViewGroup viewGroup, u4.j0 j0Var, android.view.ViewGroup viewGroup2, bg2.z3 z3Var, u4.j0 j0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20403e = kr0Var;
        this.f20404f = viewGroup;
        this.f20405g = j0Var;
        this.f20406h = viewGroup2;
        this.f20407i = z3Var;
        this.f20408m = j0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.q3(this.f20403e, this.f20404f, this.f20405g, this.f20406h, this.f20407i, this.f20408m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.q3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0095  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f20402d
            r2 = 1000(0x3e8, double:4.94E-321)
            r45.kr0 r4 = r10.f20403e
            r5 = 1
            r6 = 2
            r7 = 0
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r6) goto L15
            kotlin.ResultKt.throwOnFailure(r11)
            goto L72
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L46
        L21:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = "LiveConvertShoppingPromoteController"
            java.lang.String r1 = "start job"
            com.tencent.mars.xlog.Log.i(r11, r1)
            if (r4 == 0) goto L3a
            com.tencent.mm.protobuf.f r11 = r4.getCustom(r6)
            r45.bh6 r11 = (r45.bh6) r11
            if (r11 == 0) goto L3a
            int r11 = r11.getInteger(r5)
            goto L3b
        L3a:
            r11 = r7
        L3b:
            long r8 = (long) r11
            long r8 = r8 * r2
            r10.f20402d = r5
            java.lang.Object r11 = kotlinx.coroutines.k1.b(r8, r10)
            if (r11 != r0) goto L46
            return r0
        L46:
            android.view.ViewGroup r11 = r10.f20404f
            r11.setVisibility(r7)
            u4.j0 r11 = r10.f20405g
            if (r11 == 0) goto L57
            androidx.transition.AutoTransition r1 = new androidx.transition.AutoTransition
            r1.<init>()
            u4.g1.c(r11, r1)
        L57:
            if (r4 == 0) goto L66
            com.tencent.mm.protobuf.f r11 = r4.getCustom(r6)
            r45.bh6 r11 = (r45.bh6) r11
            if (r11 == 0) goto L66
            int r11 = r11.getInteger(r7)
            goto L67
        L66:
            r11 = r7
        L67:
            long r4 = (long) r11
            long r4 = r4 * r2
            r10.f20402d = r6
            java.lang.Object r11 = kotlinx.coroutines.k1.b(r4, r10)
            if (r11 != r0) goto L72
            return r0
        L72:
            android.view.ViewGroup r11 = r10.f20406h
            r11.setVisibility(r7)
            bg2.z3 r0 = r10.f20407i
            r0.getClass()
            androidx.transition.AutoTransition r1 = new androidx.transition.AutoTransition
            r1.<init>()
            r1.b0(r7)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.Z(r2)
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.a0(r2)
            u4.j0 r2 = r10.f20408m
            if (r2 == 0) goto Lb3
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r3 = r0.f20691i
            if (r3 == 0) goto La0
            com.tencent.mm.view.MMPAGView r3 = r3.f131204i
            if (r3 == 0) goto La0
            r3.n()
        La0:
            r3 = 2131317647(0x7f09538f, float:1.825381E38)
            android.view.View r11 = r11.findViewById(r3)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r11 = (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) r11
            r0.f20691i = r11
            if (r11 == 0) goto Lb0
            r11.c()
        Lb0:
            u4.g1.c(r2, r1)
        Lb3:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.q3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
