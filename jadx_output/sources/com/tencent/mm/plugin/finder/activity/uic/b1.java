package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class b1 implements com.tencent.mm.ui.widget.picker.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f101836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jz5.l f101838c;

    public b1(com.tencent.mm.ui.widget.picker.c0 c0Var, com.tencent.mm.plugin.finder.activity.uic.c1 c1Var, jz5.l lVar) {
        this.f101836a = c0Var;
        this.f101837b = c1Var;
        this.f101838c = lVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.z
    public final void a(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f101836a.d();
        if (z17) {
            jz5.l lVar = this.f101838c;
            java.util.List list = (java.util.List) lVar.f302833d;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            int c07 = kz5.n0.c0(list, (java.lang.CharSequence) obj);
            com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101837b;
            c1Var.f101860y = c07;
            java.lang.Object obj4 = ((java.util.ArrayList) lVar.f302834e).get(c1Var.f101860y);
            kotlin.jvm.internal.o.f(obj4, "get(...)");
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            c1Var.f101861z = ((java.util.List) obj4).indexOf((java.lang.CharSequence) obj2);
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
            java.util.Date date = new java.util.Date(zl2.r4.f473950a.M0());
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(5, calendar.get(5) + c1Var.f101860y);
            calendar.set(11, (24 - ((java.util.List) ((java.util.ArrayList) lVar.f302834e).get(c1Var.f101860y)).size()) + c1Var.f101861z);
            calendar.set(12, 0);
            calendar.set(13, 0);
            com.tencent.mars.xlog.Log.i("FinderActivityPostUIC", "chosen time:" + calendar.getTime() + ",timeInMills:" + calendar.getTimeInMillis());
            c1Var.f101858w = calendar.getTimeInMillis() / ((long) 1000);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(obj);
            sb6.append(' ');
            sb6.append(obj2);
            c1Var.f101859x = sb6.toString();
            android.widget.TextView textView = c1Var.f101849n;
            if (textView != null) {
                textView.setText(c1Var.f101859x);
            } else {
                kotlin.jvm.internal.o.o("selectTimeText");
                throw null;
            }
        }
    }
}
