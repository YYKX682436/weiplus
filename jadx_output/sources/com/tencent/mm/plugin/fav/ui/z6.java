package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class z6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f101651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f101654g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(com.tencent.mm.plugin.fav.ui.z7 z7Var, java.lang.String str, int i17, boolean z17) {
        super(0);
        this.f101651d = z7Var;
        this.f101652e = str;
        this.f101653f = i17;
        this.f101654g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f101651d;
        z7Var.f101661g.v(new w82.s0(this.f101652e, this.f101653f, this.f101654g));
        if (z7Var.f101662h.getVisibility() != 8) {
            android.view.View view = z7Var.f101662h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$clickPanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopFilter$clickPanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = z7Var.f101656b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$clickPanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavTopFilter$clickPanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z7Var.f101665k.getVisibility() == 0) {
            com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout maxHeightFrameLayout = z7Var.f101667m;
            if (maxHeightFrameLayout == null) {
                kotlin.jvm.internal.o.o("mFlRvContains");
                throw null;
            }
            maxHeightFrameLayout.startAnimation(com.tencent.mm.plugin.fav.ui.z7.b(z7Var));
        }
        return jz5.f0.f302826a;
    }
}
