package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class z6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 f183184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183186f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f183187g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var, java.lang.String str, int i17, boolean z17) {
        super(0);
        this.f183184d = z7Var;
        this.f183185e = str;
        this.f183186f = i17;
        this.f183187g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.f183184d;
        z7Var.f183194g.v(new w82.s0(this.f183185e, this.f183186f, this.f183187g));
        if (z7Var.f183195h.getVisibility() != 8) {
            android.view.View view = z7Var.f183195h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$clickPanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopFilter$clickPanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = z7Var.f183189b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter$clickPanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavTopFilter$clickPanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z7Var.f183198k.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13582xd706766c c13582xd706766c = z7Var.f183200m;
            if (c13582xd706766c == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFlRvContains");
                throw null;
            }
            c13582xd706766c.startAnimation(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.b(z7Var));
        }
        return jz5.f0.f384359a;
    }
}
