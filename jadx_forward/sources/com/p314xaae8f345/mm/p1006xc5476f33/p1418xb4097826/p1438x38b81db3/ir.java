package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ir implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f185221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kr f185222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f185223g;

    public ir(in5.s0 s0Var, so2.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kr krVar, int i17) {
        this.f185220d = s0Var;
        this.f185221e = u1Var;
        this.f185222f = krVar;
        this.f185223g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert$setSeeLaterLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f185220d.f374654e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            so2.u1 u1Var = this.f185221e;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            boolean z17 = false;
            if (activity != null && (intent = activity.getIntent()) != null && intent.getIntExtra("key_comment_scene", 0) == 285) {
                z17 = true;
            }
            if (vn2.u0.f519920a.a("FinderNewStyle2BigCardConvert", "click", abstractActivityC21394xb3d2c0cf, u1Var, false, !z17, 0.0f)) {
                this.f185222f.f185388g.g().f192615k.mo56049xa44dd169(this.f185223g, 1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert$setSeeLaterLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
