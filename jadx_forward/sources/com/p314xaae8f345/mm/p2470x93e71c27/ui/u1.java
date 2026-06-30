package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes5.dex */
public class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.z1 f273560d;

    public u1(com.p314xaae8f345.mm.p2470x93e71c27.ui.z1 z1Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030) {
        this.f273560d = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f273560d.f273637e;
        java.lang.String str = (java.lang.String) view.getTag();
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030.f271316x;
        c19642xb279030.g(str, true, true);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
