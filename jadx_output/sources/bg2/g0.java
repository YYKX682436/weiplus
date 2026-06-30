package bg2;

/* loaded from: classes2.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.j0 f20099f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i17, bg2.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20098e = i17;
        this.f20099f = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.g0(this.f20098e, this.f20099f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.kr0 styleInfo;
        r45.qg6 qg6Var;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20097d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = this.f20098e;
            this.f20097d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bg2.j0 j0Var = this.f20099f;
        bg2.u uVar = (bg2.u) j0Var.N6(bg2.u.class);
        int i18 = 0;
        if (uVar != null) {
            com.tencent.mars.xlog.Log.i(uVar.f20534e, "setBarrier false");
            uVar.f20540n = false;
        }
        android.view.ViewGroup viewGroup = j0Var.f20180e;
        if (viewGroup != null && (animate = viewGroup.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(300L)) != null) {
            duration.start();
        }
        if (j0Var.f20186n) {
            j0Var.f20186n = false;
            bg2.y0 y0Var = (bg2.y0) j0Var.N6(bg2.y0.class);
            if (y0Var != null) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j0Var.f417141d.f417148h;
                if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (styleInfo = feedObject.getStyleInfo()) != null && (qg6Var = (r45.qg6) styleInfo.getCustom(3)) != null) {
                    i18 = qg6Var.getInteger(2);
                }
                y0Var.Y6(3L, 1000 * i18, "{comment_msg_cnt:" + j0Var.f20187o + '}');
            }
        }
        return jz5.f0.f302826a;
    }
}
