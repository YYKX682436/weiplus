package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 f146871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oy.k f146872e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var, oy.k kVar) {
        super(0);
        this.f146871d = b1Var;
        this.f146872e = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.drawable.AnimationDrawable animationDrawable;
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f fVar = this.f146871d.f146889s;
        if (fVar != null) {
            oy.k state = this.f146872e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = fVar.f146941e;
            if (c12886x91aa2b6d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatRecordsTtsFloatBallHelper", "updatePlaybackState failed, ballInfo is null state=" + state);
            } else {
                c12886x91aa2b6d.f174587o.f174602d = state == oy.k.f431358f;
                fVar.c().V(c12886x91aa2b6d);
                int ordinal = state.ordinal();
                if (ordinal == 2) {
                    android.graphics.drawable.Drawable drawable = c12886x91aa2b6d.f174594v;
                    android.graphics.drawable.AnimationDrawable animationDrawable2 = drawable instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) drawable : null;
                    if (animationDrawable2 != null) {
                        animationDrawable2.start();
                    }
                    android.graphics.drawable.Drawable drawable2 = c12886x91aa2b6d.f174595w;
                    animationDrawable = drawable2 instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) drawable2 : null;
                    if (animationDrawable != null) {
                        animationDrawable.start();
                    }
                } else if (ordinal == 3) {
                    android.graphics.drawable.Drawable drawable3 = c12886x91aa2b6d.f174594v;
                    android.graphics.drawable.AnimationDrawable animationDrawable3 = drawable3 instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) drawable3 : null;
                    if (animationDrawable3 != null) {
                        animationDrawable3.stop();
                        animationDrawable3.selectDrawable(animationDrawable3.getNumberOfFrames() - 1);
                    }
                    android.graphics.drawable.Drawable drawable4 = c12886x91aa2b6d.f174595w;
                    animationDrawable = drawable4 instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) drawable4 : null;
                    if (animationDrawable != null) {
                        animationDrawable.stop();
                        animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
