package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class o6 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f86953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86954e;

    public o6(com.tencent.mm.plugin.appbrand.page.v5 v5Var, android.content.Context context) {
        this.f86954e = v5Var;
        this.f86953d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.page.d7 Q1 = this.f86954e.Q1();
        android.content.Context context = this.f86953d;
        android.view.View f17 = Q1.f(android.view.LayoutInflater.from(context));
        if (f17 == null) {
            return new android.widget.FrameLayout(context);
        }
        if (f17 instanceof android.widget.FrameLayout) {
            return f17;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.addView(f17, new android.view.ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }
}
