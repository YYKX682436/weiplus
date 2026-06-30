package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class fh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ih f290124d;

    public fh(com.p314xaae8f345.mm.ui.ih ihVar) {
        this.f290124d = ihVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/SearchBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.ih ihVar = this.f290124d;
        ihVar.f290459d.setText("");
        ihVar.f290459d.setHint(ihVar.f290461f);
        ihVar.f290460e.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/ui/SearchBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
