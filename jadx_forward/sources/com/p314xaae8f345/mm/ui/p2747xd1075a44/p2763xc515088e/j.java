package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes9.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o f293816d;

    public j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar) {
        this.f293816d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = this.f293816d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n nVar = oVar.f293840n;
        if (nVar != null) {
            nVar.mo26477x57429edc(false, 0, 0, 0);
        }
        oVar.b();
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMDatePicker$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
