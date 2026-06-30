package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class eh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ih f289934d;

    public eh(com.p314xaae8f345.mm.ui.ih ihVar) {
        this.f289934d = ihVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/SearchBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.hh hhVar = this.f289934d.f290462g;
        if (hhVar != null) {
            hhVar.mo78820x81ab18cc(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/SearchBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
