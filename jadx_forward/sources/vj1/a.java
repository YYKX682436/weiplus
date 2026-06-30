package vj1;

/* loaded from: classes7.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context cxt, android.content.DialogInterface.OnClickListener onPositiveClick, android.content.DialogInterface.OnClickListener onNegativeCLick, android.content.DialogInterface.OnCancelListener onCancelCLick, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cxt, "cxt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPositiveClick, "onPositiveClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onNegativeCLick, "onNegativeCLick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCancelCLick, "onCancelCLick");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293262s = cxt.getString(k01.j.f384572a.b(null, str) ? com.p314xaae8f345.mm.R.C30867xcad56011.mgi : com.p314xaae8f345.mm.R.C30867xcad56011.f571576jb);
        aVar.f293265v = cxt.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571575ja);
        aVar.E = onPositiveClick;
        aVar.f293266w = cxt.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.F = onNegativeCLick;
        aVar.G = onCancelCLick;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(cxt, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.setCanceledOnTouchOutside(false);
        j0Var.show();
    }
}
