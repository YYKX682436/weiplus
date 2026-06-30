package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e f255833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f255834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255835f;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e, bk4.c2 c2Var, android.content.Context context) {
        this.f255833d = c18612x3f06d82e;
        this.f255834e = c2Var;
        this.f255835f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e = this.f255833d;
        if (!c18612x3f06d82e.b(true)) {
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f255834e.f102962t = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g4 suffixOnClickListener = c18612x3f06d82e.getSuffixOnClickListener();
        if (suffixOnClickListener != null) {
            ((cj4.g0) suffixOnClickListener).f123465a.X();
        }
        qj4.s.m(qj4.s.f445491a, this.f255835f, 81L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
