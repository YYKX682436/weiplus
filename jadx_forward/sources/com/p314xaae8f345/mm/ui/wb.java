package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public final class wb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21398x34296d3b f292752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f292753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f292754f;

    public wb(com.p314xaae8f345.mm.ui.C21398x34296d3b c21398x34296d3b, yz5.l lVar, android.widget.Button button) {
        this.f292752d = c21398x34296d3b;
        this.f292753e = lVar;
        this.f292754f = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMBottomButtonList$addBottomButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f292752d.f278431q) {
            yj0.a.h(this, "com/tencent/mm/ui/MMBottomButtonList$addBottomButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            this.f292753e.mo146xb9724478(this.f292754f);
            yj0.a.h(this, "com/tencent/mm/ui/MMBottomButtonList$addBottomButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
