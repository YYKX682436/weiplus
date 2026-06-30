package ku1;

/* loaded from: classes5.dex */
public class i0 extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393636b;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393636b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardThirdFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardThirdFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f393636b == null) {
            this.f393636b = ((android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.bc_)).inflate();
        }
        r45.w50 w50Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).E.i0().f466728u;
        android.view.View view = this.f393636b;
        if (view != null) {
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o5x)).setText(w50Var.f470411d);
            ((android.widget.TextView) this.f393636b.findViewById(com.p314xaae8f345.mm.R.id.o5w)).setText(w50Var.f470412e);
            if ((((hu1.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).f176470f).w() && ((hu1.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).f176470f).v()) ? false : true) {
                ((android.widget.LinearLayout.LayoutParams) ((android.widget.LinearLayout) this.f393636b).getLayoutParams()).bottomMargin = 0;
            } else {
                ((android.widget.LinearLayout.LayoutParams) ((android.widget.LinearLayout) this.f393636b).getLayoutParams()).bottomMargin = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).f176469e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.it);
            }
        }
    }
}
