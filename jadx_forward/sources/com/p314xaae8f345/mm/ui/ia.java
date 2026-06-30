package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class ia implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f290447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.eb f290448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f290449f;

    public ia(com.p314xaae8f345.mm.ui.ga gaVar, android.view.MenuItem menuItem, com.p314xaae8f345.mm.ui.eb ebVar) {
        this.f290449f = gaVar;
        this.f290447d = menuItem;
        this.f290448e = ebVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f290449f.l(this.f290447d, this.f290448e);
        yj0.a.h(this, "com/tencent/mm/ui/MMActivityController$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
