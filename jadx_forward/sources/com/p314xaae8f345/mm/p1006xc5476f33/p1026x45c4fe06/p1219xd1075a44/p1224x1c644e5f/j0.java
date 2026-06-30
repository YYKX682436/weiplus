package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f172710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 f172711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f172712f;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        this.f172710d = o6Var;
        this.f172711e = l0Var;
        this.f172712f = n7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$embedCapsuleView$1$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.appbrand.o6 r7 = r6.f172710d
            java.lang.String r0 = "$runtime"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r0)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r7.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.L1
            java.lang.String r1 = "halfScreenConfig"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            boolean r1 = r0.c()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3d
            k91.x2 r1 = k91.x2.f387350e
            k91.x2 r0 = r0.D
            if (r0 != r1) goto L3d
            r0 = r2
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 == 0) goto L4b
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r7.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.L1
            boolean r0 = r0.P
            if (r0 == 0) goto L4b
            goto L4c
        L4b:
            r2 = r3
        L4c:
            if (r2 == 0) goto L67
            com.tencent.mm.plugin.appbrand.report.h2 r7 = r7.G2
            if (r7 == 0) goto L57
            com.tencent.mm.plugin.appbrand.report.m1 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.m1.f169450e
            r7.b(r0)
        L57:
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 r7 = r6.f172711e
            com.tencent.mm.plugin.appbrand.widget.f0 r0 = r7.f172731d
            if (r0 == 0) goto L91
            com.tencent.mm.plugin.appbrand.widget.c0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172599f
            r2 = 0
            r3 = 0
            r4 = 4
            r5 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0.e0(r0, r1, r2, r3, r4, r5)
            goto L91
        L67:
            ul1.j r7 = new ul1.j
            com.tencent.mm.plugin.appbrand.page.n7 r0 = r6.f172712f
            android.content.Context r1 = r0.getF229340d()
            java.lang.String r2 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r7.<init>(r1, r3)
            android.content.Context r0 = r0.getF229340d()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131756469(0x7f1005b5, float:1.9143846E38)
            java.lang.String r0 = r0.getString(r1)
            r7.a(r0)
            r7.setFocusable(r3)
            r0 = 1500(0x5dc, double:7.41E-321)
            r7.b(r0)
        L91:
            java.lang.String r7 = "com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$trySetupHalfScreenCapsuleBar$embedCapsuleView$1$1"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            yj0.a.h(r6, r7, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.j0.onClick(android.view.View):void");
    }
}
