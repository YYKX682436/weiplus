package bg2;

/* loaded from: classes2.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.j0 f101632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i17, bg2.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101631e = i17;
        this.f101632f = j0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.g0(this.f101631e, this.f101632f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.kr0 m59293x6b032749;
        r45.qg6 qg6Var;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101630d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long j17 = this.f101631e;
            this.f101630d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bg2.j0 j0Var = this.f101632f;
        bg2.u uVar = (bg2.u) j0Var.N6(bg2.u.class);
        int i18 = 0;
        if (uVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f102067e, "setBarrier false");
            uVar.f102073n = false;
        }
        android.view.ViewGroup viewGroup = j0Var.f101713e;
        if (viewGroup != null && (animate = viewGroup.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(300L)) != null) {
            duration.start();
        }
        if (j0Var.f101719n) {
            j0Var.f101719n = false;
            bg2.y0 y0Var = (bg2.y0) j0Var.N6(bg2.y0.class);
            if (y0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j0Var.f498674d.f498681h;
                if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (m59293x6b032749 = feedObject.m59293x6b032749()) != null && (qg6Var = (r45.qg6) m59293x6b032749.m75936x14adae67(3)) != null) {
                    i18 = qg6Var.m75939xb282bd08(2);
                }
                y0Var.Y6(3L, 1000 * i18, "{comment_msg_cnt:" + j0Var.f101720o + '}');
            }
        }
        return jz5.f0.f384359a;
    }
}
