package com.tencent.mm.plugin.facedetect;

/* loaded from: classes3.dex */
public final /* synthetic */ class e$$a implements yz5.l {
    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context context = (android.content.Context) obj;
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = of5.b.a(context).getString(com.tencent.mm.R.string.c7m);
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.c7p);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        return j0Var;
    }
}
