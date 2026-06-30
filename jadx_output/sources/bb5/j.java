package bb5;

/* loaded from: classes14.dex */
public abstract class j {
    public static com.tencent.mm.ui.applet.SecurityImage a(android.content.Context context, int i17, int i18, byte[] bArr, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnCancelListener onCancelListener, android.content.DialogInterface.OnDismissListener onDismissListener, bb5.k kVar) {
        com.tencent.mm.ui.applet.SecurityImage securityImage = (com.tencent.mm.ui.applet.SecurityImage) android.view.View.inflate(context, com.tencent.mm.R.layout.cj7, null);
        securityImage.setNetworkModel(kVar);
        securityImage.f197194g = (android.widget.ProgressBar) securityImage.findViewById(com.tencent.mm.R.id.lrb);
        securityImage.f197195h = (android.widget.ImageView) securityImage.findViewById(com.tencent.mm.R.id.a8e);
        securityImage.f197196i = (android.widget.Button) securityImage.findViewById(com.tencent.mm.R.id.a8c);
        securityImage.f197197m = (android.widget.EditText) securityImage.findViewById(com.tencent.mm.R.id.a8d);
        securityImage.f197196i.setOnClickListener(new bb5.h(securityImage));
        bb5.k kVar2 = securityImage.f197199o;
        if (kVar2 != null) {
            kVar2.b();
        }
        securityImage.b(i18, bArr, str, str2);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = of5.b.a(context).getString(i17);
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f490358sq);
        aVar.E = new bb5.i(securityImage, onClickListener);
        aVar.G = onCancelListener;
        aVar.L = securityImage;
        aVar.A = true;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        securityImage.f197198n = j0Var;
        j0Var.setOnDismissListener(onDismissListener);
        securityImage.f197198n.show();
        return securityImage;
    }
}
