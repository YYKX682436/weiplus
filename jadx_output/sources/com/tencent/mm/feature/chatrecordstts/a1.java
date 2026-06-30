package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oy.k f65339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.feature.chatrecordstts.b1 b1Var, oy.k kVar) {
        super(0);
        this.f65338d = b1Var;
        this.f65339e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.AnimationDrawable animationDrawable;
        com.tencent.mm.feature.chatrecordstts.f fVar = this.f65338d.f65356s;
        if (fVar != null) {
            oy.k state = this.f65339e;
            kotlin.jvm.internal.o.g(state, "state");
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = fVar.f65408e;
            if (ballInfo == null) {
                com.tencent.mars.xlog.Log.e("ChatRecordsTtsFloatBallHelper", "updatePlaybackState failed, ballInfo is null state=" + state);
            } else {
                ballInfo.f93054o.f93069d = state == oy.k.f349825f;
                fVar.c().V(ballInfo);
                int ordinal = state.ordinal();
                if (ordinal == 2) {
                    android.graphics.drawable.Drawable drawable = ballInfo.f93061v;
                    android.graphics.drawable.AnimationDrawable animationDrawable2 = drawable instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) drawable : null;
                    if (animationDrawable2 != null) {
                        animationDrawable2.start();
                    }
                    android.graphics.drawable.Drawable drawable2 = ballInfo.f93062w;
                    animationDrawable = drawable2 instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) drawable2 : null;
                    if (animationDrawable != null) {
                        animationDrawable.start();
                    }
                } else if (ordinal == 3) {
                    android.graphics.drawable.Drawable drawable3 = ballInfo.f93061v;
                    android.graphics.drawable.AnimationDrawable animationDrawable3 = drawable3 instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) drawable3 : null;
                    if (animationDrawable3 != null) {
                        animationDrawable3.stop();
                        animationDrawable3.selectDrawable(animationDrawable3.getNumberOfFrames() - 1);
                    }
                    android.graphics.drawable.Drawable drawable4 = ballInfo.f93062w;
                    animationDrawable = drawable4 instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) drawable4 : null;
                    if (animationDrawable != null) {
                        animationDrawable.stop();
                        animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
