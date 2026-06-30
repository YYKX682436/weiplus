package bb5;

/* loaded from: classes14.dex */
public abstract class j {
    public static com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db a(android.content.Context context, int i17, int i18, byte[] bArr, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnCancelListener onCancelListener, android.content.DialogInterface.OnDismissListener onDismissListener, bb5.k kVar) {
        com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db c21463x46cf9db = (com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cj7, null);
        c21463x46cf9db.m78857x95126b1d(kVar);
        c21463x46cf9db.f278727g = (android.widget.ProgressBar) c21463x46cf9db.findViewById(com.p314xaae8f345.mm.R.id.lrb);
        c21463x46cf9db.f278728h = (android.widget.ImageView) c21463x46cf9db.findViewById(com.p314xaae8f345.mm.R.id.a8e);
        c21463x46cf9db.f278729i = (android.widget.Button) c21463x46cf9db.findViewById(com.p314xaae8f345.mm.R.id.a8c);
        c21463x46cf9db.f278730m = (android.widget.EditText) c21463x46cf9db.findViewById(com.p314xaae8f345.mm.R.id.a8d);
        c21463x46cf9db.f278729i.setOnClickListener(new bb5.h(c21463x46cf9db));
        bb5.k kVar2 = c21463x46cf9db.f278732o;
        if (kVar2 != null) {
            kVar2.b();
        }
        c21463x46cf9db.b(i18, bArr, str, str2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = of5.b.a(context).getString(i17);
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq);
        aVar.E = new bb5.i(c21463x46cf9db, onClickListener);
        aVar.G = onCancelListener;
        aVar.L = c21463x46cf9db;
        aVar.A = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        c21463x46cf9db.f278731n = j0Var;
        j0Var.setOnDismissListener(onDismissListener);
        c21463x46cf9db.f278731n.show();
        return c21463x46cf9db;
    }
}
