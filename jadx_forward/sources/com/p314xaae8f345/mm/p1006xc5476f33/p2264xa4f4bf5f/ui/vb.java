package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class vb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18643x9527e50f f255905d;

    public vb(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18643x9527e50f c18643x9527e50f) {
        this.f255905d = c18643x9527e50f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18643x9527e50f.G;
        this.f255905d.getBackToRecordPlugin().onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
