package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class i4 extends android.view.animation.AlphaAnimation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.n4 f292013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var, float f17, float f18, com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var) {
        super(f17, f18);
        this.f292013d = n4Var;
    }

    @Override // android.view.animation.AlphaAnimation, android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var = this.f292013d;
        if (n4Var instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.o4) {
            ((com.p314xaae8f345.mm.ui.p2740x696c9db.o4) n4Var).b(f17);
        }
        super.applyTransformation(f17, transformation);
    }
}
