package ej2;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f334823d;

    public b(ej2.j jVar) {
        this.f334823d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget$initSearchLogin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ej2.j jVar = this.f334823d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = jVar.f334839i;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        android.widget.TextView textView = jVar.f334840j;
        if (textView != null) {
            textView.setVisibility(4);
        }
        jVar.f334843m.clear();
        jVar.a().m8146xced61ae5();
        android.widget.EditText editText = jVar.f334835e;
        if (editText != null) {
            editText.setText("");
            editText.clearFocus();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(editText);
        }
        android.view.View view2 = jVar.f334838h;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd(), 0);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new ej2.a(view2));
            ofInt.start();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveMicBaseSearchWidget$initSearchLogin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
