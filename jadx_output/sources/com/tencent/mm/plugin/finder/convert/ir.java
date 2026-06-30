package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ir implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f103688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.kr f103689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103690g;

    public ir(in5.s0 s0Var, so2.u1 u1Var, com.tencent.mm.plugin.finder.convert.kr krVar, int i17) {
        this.f103687d = s0Var;
        this.f103688e = u1Var;
        this.f103689f = krVar;
        this.f103690g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert$setSeeLaterLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f103687d.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            so2.u1 u1Var = this.f103688e;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            boolean z17 = false;
            if (activity != null && (intent = activity.getIntent()) != null && intent.getIntExtra("key_comment_scene", 0) == 285) {
                z17 = true;
            }
            if (vn2.u0.f438387a.a("FinderNewStyle2BigCardConvert", "click", mMActivity, u1Var, false, !z17, 0.0f)) {
                this.f103689f.f103855g.g().f111082k.onItemRangeChanged(this.f103690g, 1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert$setSeeLaterLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
