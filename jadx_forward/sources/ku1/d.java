package ku1;

/* loaded from: classes15.dex */
public class d extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393603b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f393604c;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393603b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f393603b == null) {
            android.view.View inflate = ((android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.b7n)).inflate();
            this.f393603b = inflate;
            this.f393604c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b7o);
        }
        android.view.View view = this.f393603b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdTitleView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f393603b.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
        tt1.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).E;
        if (android.text.TextUtils.isEmpty(jVar.s0().M.f453878i)) {
            this.f393604c.setText(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).h(com.p314xaae8f345.mm.R.C30867xcad56011.au6));
        } else {
            this.f393604c.setText(jVar.s0().M.f453878i);
        }
    }
}
