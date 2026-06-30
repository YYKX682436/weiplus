package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes11.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.h0 f293800d;

    public d0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.h0 h0Var) {
        this.f293800d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String format;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMTimePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.h0 h0Var = this.f293800d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22708x9193a5d4 c22708x9193a5d4 = h0Var.f293812m;
        if (c22708x9193a5d4 == null) {
            format = null;
        } else {
            c22708x9193a5d4.f293756e.f();
            format = java.lang.String.format(java.util.Locale.US, "%02d:%02d", java.lang.Integer.valueOf(c22708x9193a5d4.f293764p), java.lang.Integer.valueOf(c22708x9193a5d4.f293765q));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.h0.a(h0Var, true, format);
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMTimePicker$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
