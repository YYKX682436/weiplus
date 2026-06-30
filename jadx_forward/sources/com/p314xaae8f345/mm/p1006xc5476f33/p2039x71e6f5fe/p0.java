package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes3.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 f240654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f240655e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 c17262x2289077, java.util.ArrayList arrayList) {
        this.f240654d = c17262x2289077;
        this.f240655e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/MultiCodeMaskView$setCancelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 c17262x2289077 = this.f240654d;
        c17262x2289077.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.f0 mMultiCodeMaskViewListener = c17262x2289077.getMMultiCodeMaskViewListener();
        if (mMultiCodeMaskViewListener != null) {
            mMultiCodeMaskViewListener.b(this.f240655e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/MultiCodeMaskView$setCancelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
