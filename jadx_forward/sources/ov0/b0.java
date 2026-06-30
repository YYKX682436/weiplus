package ov0;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.i0 f430648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ov0.t f430649e;

    public b0(ov0.i0 i0Var, ov0.t tVar) {
        this.f430648d = i0Var;
        this.f430649e = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f430648d.q7("");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 editText = this.f430649e.m157199xdb574fcd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
        editText.setInputType(1);
        editText.setCursorVisible(true);
        editText.setFocusableInTouchMode(true);
        editText.setSelection(editText.getText().length());
        editText.requestFocus();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
