package cg2;

/* loaded from: classes5.dex */
public final class q extends wp.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(xp.d danmakuContext) {
        super(danmakuContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmakuContext, "danmakuContext");
        this.f529879q = 0;
    }

    @Override // wp.f, wp.a
    public float i() {
        return this.E - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
    }

    @Override // wp.i, wp.a
    public int j() {
        return -2147483646;
    }

    @Override // wp.i, wp.a
    public zp.d r(zp.m mVar) {
        super.r(mVar);
        return new zp.d(-1);
    }

    @Override // wp.f
    public float y(long j17) {
        yp.o oVar = this.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.convert.danmaku.LiveFeedCenterDanmakuRender.LiveFeedCenterDanmakuViewHolder");
        cg2.r rVar = (cg2.r) oVar;
        java.lang.Object obj = this.f529887y;
        r45.ai1 ai1Var = obj instanceof r45.ai1 ? (r45.ai1) obj : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15381xac4783ea c15381xac4783ea = rVar.f122657f;
        float h17 = (h() - (rVar.f122656e.getMeasuredWidth() + (ai1Var != null ? (int) c15381xac4783ea.getPaint().measureText(java.lang.String.valueOf(ai1Var.m75939xb282bd08(4))) : c15381xac4783ea.getMeasuredWidth()))) / 2.0f;
        android.view.ViewGroup.LayoutParams layoutParams = rVar.f122656e.getLayoutParams();
        return ((h17 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.leftMargin : 0)) - xp.d.f().f537381e) - rVar.f122655d.getPaddingLeft();
    }
}
