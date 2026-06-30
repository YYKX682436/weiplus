package gl5;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354589d;

    public p0(gl5.d1 d1Var) {
        this.f354589d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$btnSmileyOrKeyboard$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gl5.d1 d1Var = this.f354589d;
        android.view.View view2 = d1Var.f354460d;
        if (view2 != null) {
            view2.performClick();
        }
        boolean z17 = !d1Var.f354463g;
        d1Var.f354463g = z17;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageButton");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) view).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageButton");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) view).setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
            gl5.d1.a(d1Var);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$btnSmileyOrKeyboard$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
