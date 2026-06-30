package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class d3 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f159094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf.w f159095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f159096f;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, android.view.View view, nf.w wVar) {
        this.f159096f = c11510xdd90c2f2;
        this.f159094d = view;
        this.f159095e = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (r7.f156343s.getChildAt(r0 - 1) == r3) goto L11;
     */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onChildViewAdded(android.view.View r7, android.view.View r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/AppBrandRuntime$9"
            java.lang.String r1 = "android/view/ViewGroup$OnHierarchyChangeListener"
            java.lang.String r2 = "onChildViewAdded"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            r4.add(r8)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r6.f159096f
            boolean r0 = r7.f156345u
            r1 = 0
            nf.w r2 = r6.f159095e
            if (r0 == 0) goto L4a
            com.tencent.mm.plugin.appbrand.widget.q r0 = r7.f156343s
            int r0 = r0.getChildCount()
            android.view.View r3 = r6.f159094d
            if (r0 > 0) goto L32
            goto L3d
        L32:
            r4 = 1
            int r0 = r0 - r4
            com.tencent.mm.plugin.appbrand.widget.q r5 = r7.f156343s
            android.view.View r0 = r5.getChildAt(r0)
            if (r0 != r3) goto L3d
            goto L3e
        L3d:
            r4 = r1
        L3e:
            if (r4 == 0) goto L4a
            r2.run()
            if (r8 == r3) goto L55
            r7 = 4
            r8.setImportantForAccessibility(r7)
            goto L55
        L4a:
            boolean[] r8 = r2.f418147d
            r8[r1] = r1
            com.tencent.mm.plugin.appbrand.widget.q r7 = r7.f156343s
            r7.f173385g = r1
            r8 = 0
            r7.f173386h = r8
        L55:
            java.lang.String r7 = "com/tencent/mm/plugin/appbrand/AppBrandRuntime$9"
            java.lang.String r8 = "android/view/ViewGroup$OnHierarchyChangeListener"
            java.lang.String r0 = "onChildViewAdded"
            java.lang.String r1 = "(Landroid/view/View;Landroid/view/View;)V"
            yj0.a.h(r6, r7, r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d3.onChildViewAdded(android.view.View, android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r7.f156343s.getChildAt(r0 - 1) == r1) goto L11;
     */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onChildViewRemoved(android.view.View r7, android.view.View r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/AppBrandRuntime$9"
            java.lang.String r1 = "android/view/ViewGroup$OnHierarchyChangeListener"
            java.lang.String r2 = "onChildViewRemoved"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            r4.add(r8)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r6.f159096f
            boolean r0 = r7.f156345u
            android.view.View r1 = r6.f159094d
            r2 = 0
            if (r0 == 0) goto L41
            com.tencent.mm.plugin.appbrand.widget.q r0 = r7.f156343s
            int r0 = r0.getChildCount()
            if (r0 > 0) goto L30
            goto L3b
        L30:
            com.tencent.mm.plugin.appbrand.widget.q r3 = r7.f156343s
            r4 = 1
            int r0 = r0 - r4
            android.view.View r0 = r3.getChildAt(r0)
            if (r0 != r1) goto L3b
            goto L3c
        L3b:
            r4 = r2
        L3c:
            if (r4 == 0) goto L41
            r8.setImportantForAccessibility(r2)
        L41:
            if (r8 != r1) goto L78
            r7.f156345u = r2
            com.tencent.mm.plugin.appbrand.widget.q r8 = r7.f156343s
            r8.f173385g = r2
            r0 = 0
            r8.f173386h = r0
            r0 = r2
        L4d:
            int r1 = r8.getChildCount()
            if (r0 >= r1) goto L5d
            android.view.View r1 = r8.getChildAt(r0)
            r1.setImportantForAccessibility(r2)
            int r0 = r0 + 1
            goto L4d
        L5d:
            boolean r8 = r7.L0()
            if (r8 != 0) goto L78
            com.tencent.mm.plugin.appbrand.c3 r8 = new com.tencent.mm.plugin.appbrand.c3
            r8.<init>(r6)
            r7.u1()
            com.tencent.mm.plugin.appbrand.page.i3 r0 = r7.x0()
            if (r0 != 0) goto L75
            r7.I1(r8)
            goto L78
        L75:
            r8.run()
        L78:
            java.lang.String r7 = "com/tencent/mm/plugin/appbrand/AppBrandRuntime$9"
            java.lang.String r8 = "android/view/ViewGroup$OnHierarchyChangeListener"
            java.lang.String r0 = "onChildViewRemoved"
            java.lang.String r1 = "(Landroid/view/View;Landroid/view/View;)V"
            yj0.a.h(r6, r7, r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d3.onChildViewRemoved(android.view.View, android.view.View):void");
    }
}
