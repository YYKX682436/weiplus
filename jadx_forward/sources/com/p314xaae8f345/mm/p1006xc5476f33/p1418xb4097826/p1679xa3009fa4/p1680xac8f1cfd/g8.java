package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class g8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f216008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i8 f216009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f216010f;

    public g8(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i8 i8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var) {
        this.f216008d = context;
        this.f216009e = i8Var;
        this.f216010f = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderCreateAccountFullScreenUIC$initDialog$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f216008d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xy2.c.e(context));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i8 i8Var = this.f216009e;
        if (!K0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i8.O6(i8Var, 4);
        } else if (context instanceof android.app.Activity) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_create_scene", i8Var.f216250h);
            intent.putExtra("key_router_to_profile", false);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).qj(context, intent);
        }
        i8Var.f216252m = true;
        this.f216010f.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderCreateAccountFullScreenUIC$initDialog$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
