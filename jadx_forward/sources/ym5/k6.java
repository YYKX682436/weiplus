package ym5;

/* loaded from: classes10.dex */
public final class k6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f544954d;

    public k6(ym5.n6 n6Var) {
        this.f544954d = n6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.n6 n6Var = this.f544954d;
        n6Var.mo177319xb073c692().clearFocus();
        if (n6Var.mo177319xb073c692().getVisibility() == 0) {
            ((l45.n) n6Var.m177317xc879b3f2()).o();
            if (n6Var.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                android.content.Context context = n6Var.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
            }
        } else {
            qk.i6 i6Var = ((l45.n) n6Var.m177317xc879b3f2()).f397997e;
            if (i6Var != null) {
                i6Var.m5();
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
