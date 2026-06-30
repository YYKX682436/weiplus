package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class mj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.nj f290679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.hj f290680e;

    public mj(com.p314xaae8f345.mm.ui.nj njVar, com.p314xaae8f345.mm.ui.hj hjVar) {
        this.f290679d = njVar;
        this.f290680e = hjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/TipUseDuplicateGroupItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f290679d.f290960e;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f290680e);
        }
        yj0.a.h(this, "com/tencent/mm/ui/TipUseDuplicateGroupItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
