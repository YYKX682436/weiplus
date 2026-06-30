package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class yl implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f211604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cm f211605e;

    public yl(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cm cmVar) {
        this.f211604d = s0Var;
        this.f211605e = cmVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.s0 s0Var = this.f211604d;
        lb2.j jVar = (lb2.j) s0Var.f374658i;
        java.util.Set stringSet = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("finder_debug_settings_fav").getStringSet("fav_1", kz5.r0.f395535d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringSet);
        java.util.HashSet hashSet = new java.util.HashSet(stringSet);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cm cmVar = this.f211605e;
        java.lang.String str = (cmVar.f210535e.f210798p == 2 || hashSet.contains(jVar.f399282d)) ? "取消收藏" : "收藏";
        android.content.Context context = s0Var.f374654e;
        java.util.List i17 = kz5.c0.i(str, "关闭");
        java.lang.Integer[] numArr = new java.lang.Integer[2];
        numArr[0] = java.lang.Integer.valueOf((cmVar.f210535e.f210798p == 2 || hashSet.contains(jVar.f399282d)) ? -1 : 1);
        numArr[1] = 0;
        db5.e1.b(context, "", i17, kz5.c0.i(numArr), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.xl(hashSet, jVar, s0Var));
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
