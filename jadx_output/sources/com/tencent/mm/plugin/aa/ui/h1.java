package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.g1 f72668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f72669e;

    public h1(com.tencent.mm.plugin.aa.ui.i1 i1Var, com.tencent.mm.plugin.aa.ui.g1 g1Var, android.content.Context context) {
        this.f72668d = g1Var;
        this.f72669e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.g1 g1Var = this.f72668d;
        int top = g1Var.f72654f.getTop() - g1Var.f72652d.getBottom();
        android.content.Context context = this.f72669e;
        int b17 = top - i65.a.b(context, 4);
        if (b17 < 0) {
            b17 = 0;
        }
        if (g1Var.f72654f.getTop() - g1Var.f72652d.getBottom() == i65.a.b(context, 4)) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) g1Var.f72654f.getLayoutParams();
        layoutParams.topMargin = -b17;
        g1Var.f72654f.setLayoutParams(layoutParams);
    }
}
