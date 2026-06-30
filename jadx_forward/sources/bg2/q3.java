package bg2;

/* loaded from: classes3.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kr0 f101936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f101937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u4.j0 f101938g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f101939h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f101940i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u4.j0 f101941m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(r45.kr0 kr0Var, android.view.ViewGroup viewGroup, u4.j0 j0Var, android.view.ViewGroup viewGroup2, bg2.z3 z3Var, u4.j0 j0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101936e = kr0Var;
        this.f101937f = viewGroup;
        this.f101938g = j0Var;
        this.f101939h = viewGroup2;
        this.f101940i = z3Var;
        this.f101941m = j0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.q3(this.f101936e, this.f101937f, this.f101938g, this.f101939h, this.f101940i, this.f101941m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.q3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0095  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f101935d
            r2 = 1000(0x3e8, double:4.94E-321)
            r45.kr0 r4 = r10.f101936e
            r5 = 1
            r6 = 2
            r7 = 0
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r6) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L72
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L46
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.String r11 = "LiveConvertShoppingPromoteController"
            java.lang.String r1 = "start job"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r1)
            if (r4 == 0) goto L3a
            com.tencent.mm.protobuf.f r11 = r4.m75936x14adae67(r6)
            r45.bh6 r11 = (r45.bh6) r11
            if (r11 == 0) goto L3a
            int r11 = r11.m75939xb282bd08(r5)
            goto L3b
        L3a:
            r11 = r7
        L3b:
            long r8 = (long) r11
            long r8 = r8 * r2
            r10.f101935d = r5
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.k1.b(r8, r10)
            if (r11 != r0) goto L46
            return r0
        L46:
            android.view.ViewGroup r11 = r10.f101937f
            r11.setVisibility(r7)
            u4.j0 r11 = r10.f101938g
            if (r11 == 0) goto L57
            androidx.transition.AutoTransition r1 = new androidx.transition.AutoTransition
            r1.<init>()
            u4.g1.c(r11, r1)
        L57:
            if (r4 == 0) goto L66
            com.tencent.mm.protobuf.f r11 = r4.m75936x14adae67(r6)
            r45.bh6 r11 = (r45.bh6) r11
            if (r11 == 0) goto L66
            int r11 = r11.m75939xb282bd08(r7)
            goto L67
        L66:
            r11 = r7
        L67:
            long r4 = (long) r11
            long r4 = r4 * r2
            r10.f101935d = r6
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r10)
            if (r11 != r0) goto L72
            return r0
        L72:
            android.view.ViewGroup r11 = r10.f101939h
            r11.setVisibility(r7)
            bg2.z3 r0 = r10.f101940i
            r0.getClass()
            androidx.transition.AutoTransition r1 = new androidx.transition.AutoTransition
            r1.<init>()
            r1.b0(r7)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.Z(r2)
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r1.a0(r2)
            u4.j0 r2 = r10.f101941m
            if (r2 == 0) goto Lb3
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r3 = r0.f102224i
            if (r3 == 0) goto La0
            com.tencent.mm.view.MMPAGView r3 = r3.f212737i
            if (r3 == 0) goto La0
            r3.n()
        La0:
            r3 = 2131317647(0x7f09538f, float:1.825381E38)
            android.view.View r11 = r11.findViewById(r3)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) r11
            r0.f102224i = r11
            if (r11 == 0) goto Lb0
            r11.c()
        Lb0:
            u4.g1.c(r2, r1)
        Lb3:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.q3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
