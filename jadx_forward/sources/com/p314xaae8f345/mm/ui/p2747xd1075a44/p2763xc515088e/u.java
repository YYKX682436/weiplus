package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes3.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f293868d;

    public u(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f293868d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMOptionPicker$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f293868d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 a0Var = c0Var.f293792t;
        if (a0Var != null) {
            a0Var.mo26363x57429edc(false, null, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z zVar = c0Var.f293793u;
        if (zVar != null) {
            zVar.a(false, null, null, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMOptionPicker$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
