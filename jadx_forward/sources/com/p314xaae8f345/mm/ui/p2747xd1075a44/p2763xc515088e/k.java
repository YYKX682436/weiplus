package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes9.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o f293818d;

    public k(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar) {
        this.f293818d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/picker/MMDatePicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = this.f293818d;
        int m82058xfb87f0b3 = oVar.f293839m.m82058xfb87f0b3();
        int m82056x74d1c8ca = oVar.f293839m.m82056x74d1c8ca();
        int m82055xa7d8f7a3 = oVar.f293839m.m82055xa7d8f7a3();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n nVar = oVar.f293840n;
        if (nVar != null) {
            nVar.mo26477x57429edc(true, m82058xfb87f0b3, m82056x74d1c8ca, m82055xa7d8f7a3);
        }
        oVar.b();
        yj0.a.h(this, "com/tencent/mm/ui/widget/picker/MMDatePicker$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
