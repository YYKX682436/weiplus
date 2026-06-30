package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class v1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 f269474d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 y1Var) {
        this.f269474d = y1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/webcompt/WebComptTagJsApiHandler$debugListener$2$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 y1Var = this.f269474d;
        boolean z17 = !r26.n0.N(y1Var.f269486d);
        if (z17) {
            android.content.Context context = view.getContext();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[webCompts]\n            ");
            java.util.Collection values = y1Var.f269487e.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            sb6.append(kz5.n0.g0(values, "\n\n", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.u1.f269469d, 30, null));
            sb6.append("\n\n            ");
            sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e.f());
            sb6.append("\n            ");
            db5.e1.s(context, r26.b0.b(sb6.toString()), "");
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/webview/webcompt/WebComptTagJsApiHandler$debugListener$2$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
