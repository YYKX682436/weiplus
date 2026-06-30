package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class ja implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.eb f290534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f290535e;

    public ja(com.p314xaae8f345.mm.ui.ga gaVar, com.p314xaae8f345.mm.ui.eb ebVar) {
        this.f290535e = gaVar;
        this.f290534d = ebVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        boolean onLongClick;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (this.f290535e.f290183j) {
            android.view.View.OnLongClickListener onLongClickListener = this.f290534d.f289922o;
            onLongClick = onLongClickListener != null ? onLongClickListener.onLongClick(view) : false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMActivityController", "callMenuCallback screen not enable.");
            onLongClick = true;
        }
        yj0.a.i(onLongClick, this, "com/tencent/mm/ui/MMActivityController$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
