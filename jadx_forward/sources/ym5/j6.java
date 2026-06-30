package ym5;

/* loaded from: classes10.dex */
public final class j6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f544943d;

    public j6(ym5.n6 n6Var) {
        this.f544943d = n6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.n6 n6Var = this.f544943d;
        android.view.animation.Animation animation = n6Var.mo177319xb073c692().getAnimation();
        if (animation != null && animation.hasStarted() && !n6Var.mo177319xb073c692().getAnimation().hasEnded()) {
            yj0.a.h(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        n6Var.mo177319xb073c692().clearFocus();
        if (n6Var.mo177319xb073c692().getVisibility() == 0) {
            android.text.Editable text = n6Var.f544890t.getText();
            java.lang.String obj = text != null ? text.toString() : null;
            l45.q m177317xc879b3f2 = n6Var.m177317xc879b3f2();
            int currentTextColor = n6Var.f544890t.getCurrentTextColor();
            if (n6Var.f544891u.getCurMode() == 3) {
                java.lang.Object tag = n6Var.f544891u.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
                i17 = ((java.lang.Integer) tag).intValue();
            } else {
                i17 = 0;
            }
            ((l45.n) m177317xc879b3f2).t(obj, currentTextColor, i17, "", n6Var.f544891u.getCurMode() == 2, n6Var.f544982x, false, false, ((l45.n) n6Var.m177317xc879b3f2()).f397994b.f445769f.width());
            if (n6Var.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                if (!(obj == null || obj.length() == 0)) {
                    android.content.Context context = n6Var.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
                }
            }
        } else {
            qk.i6 i6Var = ((l45.n) n6Var.m177317xc879b3f2()).f397997e;
            if (i6Var != null) {
                i6Var.mo60944x42fe6352();
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
