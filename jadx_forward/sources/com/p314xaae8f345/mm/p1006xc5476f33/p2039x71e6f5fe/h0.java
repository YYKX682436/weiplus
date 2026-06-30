package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 f240262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f240263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 f240264f;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 c17262x2289077, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357) {
        this.f240262d = c17262x2289077;
        this.f240263e = arrayList;
        this.f240264f = c17261xe88a6357;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/MultiCodeMaskView$initData$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 c17262x2289077 = this.f240262d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.f0 mMultiCodeMaskViewListener = c17262x2289077.getMMultiCodeMaskViewListener();
        if (mMultiCodeMaskViewListener != null) {
            mMultiCodeMaskViewListener.a(this.f240263e, this.f240264f, false);
        }
        c17262x2289077.a();
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/MultiCodeMaskView$initData$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
