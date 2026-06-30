package hy4;

/* loaded from: classes8.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f367629a = new java.util.HashMap();

    public static void a(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.A = false;
        aVar.S = 3;
        aVar.f293242a = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6s);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            aVar.C = true;
            aVar.f293263t = str;
        }
        aVar.f293249f = true;
        aVar.f293247d = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6r);
        aVar.f293265v = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.W = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo);
        aVar.E = onClickListener;
        aVar.f293266w = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("key_webview_menu_haokan");
        if (M.i("show_first_tips", true)) {
            M.G("show_first_tips", false);
            aVar.f293244b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6q);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }
}
