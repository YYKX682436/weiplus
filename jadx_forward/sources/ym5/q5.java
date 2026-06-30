package ym5;

/* loaded from: classes10.dex */
public final class q5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f545015d;

    public q5(ym5.y5 y5Var) {
        this.f545015d = y5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/StickerDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.y5 y5Var = this.f545015d;
        android.view.animation.Animation animation = y5Var.mo177319xb073c692().getAnimation();
        if (animation == null || !animation.hasStarted() || y5Var.mo177319xb073c692().getAnimation().hasEnded()) {
            android.text.Editable text = y5Var.f544890t.getText();
            java.lang.String obj = text != null ? text.toString() : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                y5Var.f();
            } else {
                y5Var.mo177319xb073c692().clearFocus();
                y5Var.j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("textEditView: finish click, visible=");
                boolean z17 = true;
                sb6.append(y5Var.mo177319xb073c692().getVisibility() == 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y5Var.f545114x, sb6.toString());
                if (y5Var.mo177319xb073c692().getVisibility() == 0) {
                    ((l45.n) y5Var.m177317xc879b3f2()).t(obj, y5Var.f544890t.getCurrentTextColor(), y5Var.f544891u.getCurMode() == 3 ? y5Var.f544890t.m82624x9b8ff2fb() : 0, "", y5Var.f544891u.getCurMode() == 2, y5Var.f545115y, false, true, Integer.MAX_VALUE);
                    if (y5Var.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        if (obj != null && obj.length() != 0) {
                            z17 = false;
                        }
                        if (!z17) {
                            android.content.Context context = y5Var.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
                        }
                    }
                } else {
                    qk.i6 i6Var = ((l45.n) y5Var.m177317xc879b3f2()).f397997e;
                    if (i6Var != null) {
                        i6Var.mo60944x42fe6352();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/StickerDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
