package com.tencent.mm.app;

/* loaded from: classes7.dex */
public class i7 extends com.tencent.mm.sdk.platformtools.d9 {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f53460i;

    @Override // com.tencent.mm.sdk.platformtools.d9
    public void a(android.content.Context context) {
        android.content.Context context2;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f53460i;
        if (j0Var != null && j0Var.isShowing() && (context2 = this.f53460i.getContext()) != null) {
            if (context2 == context) {
                return;
            }
            if ((context2 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context2).getBaseContext() == context) {
                return;
            }
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = this.f192537a;
        aVar.f211729s = this.f192538b;
        aVar.f211732v = this.f192539c;
        aVar.E = this.f192541e;
        aVar.f211733w = this.f192540d;
        aVar.A = true;
        aVar.B = false;
        aVar.F = this.f192542f;
        aVar.G = new com.tencent.mm.app.h7(this);
        aVar.H = new com.tencent.mm.app.g7(this);
        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var2.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var2.f211837r);
        }
        this.f53460i = j0Var2;
        j0Var2.show();
    }
}
