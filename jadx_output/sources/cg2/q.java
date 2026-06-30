package cg2;

/* loaded from: classes5.dex */
public final class q extends wp.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(xp.d danmakuContext) {
        super(danmakuContext);
        kotlin.jvm.internal.o.g(danmakuContext, "danmakuContext");
        this.f448346q = 0;
    }

    @Override // wp.f, wp.a
    public float i() {
        return this.E - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
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
        kotlin.jvm.internal.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.convert.danmaku.LiveFeedCenterDanmakuRender.LiveFeedCenterDanmakuViewHolder");
        cg2.r rVar = (cg2.r) oVar;
        java.lang.Object obj = this.f448354y;
        r45.ai1 ai1Var = obj instanceof r45.ai1 ? (r45.ai1) obj : null;
        com.tencent.mm.plugin.finder.view.StrokeTextView strokeTextView = rVar.f41124f;
        float h17 = (h() - (rVar.f41123e.getMeasuredWidth() + (ai1Var != null ? (int) strokeTextView.getPaint().measureText(java.lang.String.valueOf(ai1Var.getInteger(4))) : strokeTextView.getMeasuredWidth()))) / 2.0f;
        android.view.ViewGroup.LayoutParams layoutParams = rVar.f41123e.getLayoutParams();
        return ((h17 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.leftMargin : 0)) - xp.d.f().f455848e) - rVar.f41122d.getPaddingLeft();
    }
}
