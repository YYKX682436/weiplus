package df2;

/* loaded from: classes3.dex */
public final class cl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f311422d;

    public cl(df2.pl plVar) {
        this.f311422d = plVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.pl plVar = this.f311422d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = plVar.f312623p;
        if (c22613xe7040d9c != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15222x82447cec c15222x82447cec = plVar.f312633z;
        if (c15222x82447cec != null) {
            if (c15222x82447cec != null) {
                c15222x82447cec.clearFocus();
            }
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c15222x82447cec.getContext().getSystemService("input_method");
            if (plVar.G && inputMethodManager != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15222x82447cec c15222x82447cec2 = plVar.f312633z;
                inputMethodManager.hideSoftInputFromWindow(c15222x82447cec2 != null ? c15222x82447cec2.getWindowToken() : null, 0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
