package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class h4 extends android.view.animation.ScaleAnimation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f291986e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var, float f17, float f18, float f19, float f27, android.view.View view, com.p314xaae8f345.mm.ui.p2740x696c9db.l4 l4Var) {
        super(f17, f18, f19, f27);
        this.f291986e = s4Var;
        this.f291985d = view;
    }

    @Override // android.view.animation.ScaleAnimation, android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f291986e;
        if (s4Var.f292232f != 0 && s4Var.f292233g != 0 && s4Var.f292240n == 1.0f) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.View view = this.f291985d;
            view.getGlobalVisibleRect(rect);
            int i17 = rect.right;
            int i18 = rect.left;
            int i19 = rect.bottom;
            int i27 = rect.top;
            int i28 = s4Var.f292244r;
            int i29 = ((i19 - i27) + i28) / 2;
            int i37 = s4Var.f292232f;
            int i38 = s4Var.f292230d;
            float f18 = 1.0f - f17;
            float f19 = s4Var.f292238l;
            int i39 = (int) ((((i37 - i38) * f18) + i38) / (1.0f - ((1.0f - f19) * f17)));
            int i47 = s4Var.f292233g;
            int i48 = s4Var.f292231e;
            int i49 = (i17 - i18) / 2;
            int i57 = (int) ((((i47 - i48) * f18) + i48) / (1.0f - ((1.0f - f19) * f17)));
            float f27 = s4Var.f292240n;
            if (f27 != 1.0f) {
                float f28 = s4Var.f292239m / f27;
                s4Var.f292238l = f28;
                i29 = (s4Var.f292242p - i27) + ((int) (i47 / 2.0f));
                i39 = (int) ((((i37 - i38) * f18) + i38) / (1.0f - ((1.0f - f28) * f17)));
                i57 = (int) ((((i47 - i48) * f18) + i48) / (1.0f - ((1.0f - f28) * f17)));
                i49 = (i17 + i18) / 2;
            }
            int i58 = i39 / 2;
            float f29 = s4Var.f292238l;
            int i59 = i57 / 2;
            view.setClipBounds(new android.graphics.Rect((int) ((i49 - i58) + ((s4Var.f292245s * f17) / (1.0f - ((1.0f - f29) * f17)))), (int) (((i29 - i59) - ((i28 * f18) / 2.0f)) + ((s4Var.f292247u * f17) / (1.0f - ((1.0f - f29) * f17)))), (int) ((i49 + i58) - ((s4Var.f292246t * f17) / (1.0f - ((1.0f - f29) * f17)))), (int) ((i29 + i59) - ((s4Var.f292248v * f17) / (1.0f - ((1.0f - f29) * f17))))));
        }
        super.applyTransformation(f17, transformation);
    }
}
