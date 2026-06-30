package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes9.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.p0 f293819d;

    public k0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.p0 p0Var) {
        this.f293819d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MultiPicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.p0 p0Var = this.f293819d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o0 o0Var = p0Var.f293856o;
        if (o0Var != null) {
            o0Var.a(false, null);
        }
        y9.i iVar = p0Var.f293842a;
        if (iVar != null) {
            iVar.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MultiPicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
