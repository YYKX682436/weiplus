package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public class z5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI f90364d;

    public z5(com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI appBrandOpenWeRunSettingUI) {
        this.f90364d = appBrandOpenWeRunSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandOpenWeRunSettingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ve4.g.a(13);
        com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI appBrandOpenWeRunSettingUI = this.f90364d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(appBrandOpenWeRunSettingUI, appBrandOpenWeRunSettingUI.getString(com.tencent.mm.R.string.f490573yv), appBrandOpenWeRunSettingUI.getString(com.tencent.mm.R.string.iwq), true, true, null);
        appBrandOpenWeRunSettingUI.f89376m = Q;
        Q.show();
        gm0.j1.n().f273288b.a(30, appBrandOpenWeRunSettingUI);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("gh_43f2581f6fd6");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(1);
        gm0.j1.n().f273288b.g((com.tencent.mm.modelbase.m1) ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).wi(1, linkedList, linkedList2, "", ""));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandOpenWeRunSettingUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
