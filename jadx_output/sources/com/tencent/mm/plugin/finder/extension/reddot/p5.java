package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class p5 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f105770d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f105771e;

    public p5(java.lang.ref.WeakReference rHelper) {
        kotlin.jvm.internal.o.g(rHelper, "rHelper");
        this.f105770d = rHelper;
        this.f105771e = new android.graphics.Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0169 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // android.widget.AbsListView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScroll(android.widget.AbsListView r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.p5.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/extension/reddot/FinderRedDotFreqCtrlExpose$ExposeListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/extension/reddot/FinderRedDotFreqCtrlExpose$ExposeListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
