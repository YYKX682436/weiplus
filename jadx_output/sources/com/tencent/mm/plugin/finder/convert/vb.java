package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vb extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104776d;

    public vb(in5.s0 s0Var) {
        this.f104776d = s0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r8.f133650u == true) goto L12;
     */
    @Override // androidx.recyclerview.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onMediaOperate$1"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.g(r7, r0)
            if (r8 != 0) goto L82
            in5.s0 r7 = r6.f104776d
            android.content.Context r8 = r7.f293121e
            java.lang.String r0 = "getContext(...)"
            kotlin.jvm.internal.o.f(r8, r0)
            pf5.z r0 = pf5.z.f353948a
            boolean r1 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L76
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            pf5.v r8 = r0.a(r8)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC> r0 = com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class
            androidx.lifecycle.c1 r8 = r8.a(r0)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC r8 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) r8
            r0 = 0
            if (r8 == 0) goto L51
            boolean r8 = r8.f133650u
            r1 = 1
            if (r8 != r1) goto L51
            goto L52
        L51:
            r1 = r0
        L52:
            if (r1 == 0) goto L6c
            androidx.recyclerview.widget.RecyclerView r8 = r7.o()
            r1 = 0
            if (r8 == 0) goto L60
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = r8.getLayoutManager()
            goto L61
        L60:
            r8 = r1
        L61:
            boolean r2 = r8 instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager
            if (r2 == 0) goto L68
            r1 = r8
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r1 = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) r1
        L68:
            if (r1 == 0) goto L6c
            r1.C = r0
        L6c:
            androidx.recyclerview.widget.RecyclerView r7 = r7.o()
            if (r7 == 0) goto L82
            r7.V0(r6)
            goto L82
        L76:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L82:
            java.lang.String r7 = "onScrollStateChanged"
            java.lang.String r8 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            java.lang.String r0 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onMediaOperate$1"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            yj0.a.h(r6, r0, r1, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.vb.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onMediaOperate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onMediaOperate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
