package ku1;

/* loaded from: classes15.dex */
public class o extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393666b;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393666b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f393666b == null) {
            this.f393666b = ((android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.b9m)).inflate();
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).E.d()) {
            this.f393666b.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562651l8);
        }
        this.f393666b.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
        r45.de0 de0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).E.s0().M;
        if (android.text.TextUtils.isEmpty(de0Var.f453877h)) {
            android.view.View b17 = b(com.p314xaae8f345.mm.R.id.b9h);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) b(com.p314xaae8f345.mm.R.id.b9g)).setText(de0Var.f453877h);
            android.view.View b18 = b(com.p314xaae8f345.mm.R.id.b9h);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b18, "com/tencent/mm/plugin/card/ui/view/CardDetailFieldView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) b(com.p314xaae8f345.mm.R.id.b9l);
        java.util.LinkedList linkedList = de0Var.f453876g;
        if (linkedList == null || linkedList.size() <= 0 || android.text.TextUtils.isEmpty((java.lang.CharSequence) de0Var.f453876g.get(0))) {
            imageView.setVisibility(8);
            return;
        }
        java.lang.String str = (java.lang.String) de0Var.f453876g.get(0);
        imageView.setVisibility(0);
        o11.f fVar = new o11.f();
        fVar.f423616g = lp0.b.D();
        fVar.f423615f = xt1.q.m(str);
        fVar.f423611b = true;
        fVar.f423629t = false;
        fVar.f423610a = true;
        n11.a.b().h(str, imageView, fVar.a());
    }
}
