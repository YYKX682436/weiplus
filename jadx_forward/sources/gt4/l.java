package gt4;

/* loaded from: classes8.dex */
public abstract class l {
    public static void a(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("launch_from_remittance", true);
        intent.putExtra("enter_scene_address", 4);
        j45.l.o(context, "address", ".ui.WalletSelectAddrUI", intent, 6, false);
        if (j0Var != null) {
            j0Var.dismiss();
        }
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, db5.a1 a1Var, android.content.DialogInterface.OnClickListener onClickListener) {
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.A = false;
        aVar.B = true;
        aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.F = onClickListener;
        aVar.f293242a = str;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571141d53, null);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.d98);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = editText.getTextSize();
            ((ke0.e) xVar).getClass();
            editText.append(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize));
        }
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5)).setVisibility(8);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            editText.setHint(str3);
        }
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
        aVar.E = new gt4.b(a1Var, editText, context);
        aVar.Z = false;
        if (i17 > 0) {
            ck5.f b17 = ck5.f.b(editText);
            b17.f124094f = 0;
            b17.f124093e = i17;
            b17.d(null);
        }
        aVar.L = inflate;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        boolean z18 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        if (z18) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo53058xe5d1a549(j0Var);
        }
        if (z18) {
            inflate.postDelayed(new gt4.c(z17, editText, context), 200L);
        }
        return j0Var;
    }
}
