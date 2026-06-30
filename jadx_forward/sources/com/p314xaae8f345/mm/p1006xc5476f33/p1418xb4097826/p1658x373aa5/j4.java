package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class j4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f213946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f213947e;

    public j4(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b) {
        this.f213946d = textView;
        this.f213947e = c15260x406bbe1b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f213946d.getText().toString();
        qs2.e eVar = new qs2.e(1, 103, 28);
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = this.f213947e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        w40.e.Df((w40.e) c17, context, eVar, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
