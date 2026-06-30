package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class nb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18642xe8073446 f255659d;

    public nb(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18642xe8073446 c18642xe8073446) {
        this.f255659d = c18642xe8073446;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout$loadCurrentPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18642xe8073446.H;
        this.f255659d.getEditFinishPlugin().onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout$loadCurrentPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
