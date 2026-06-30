package a42;

/* loaded from: classes.dex */
public final class d implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1201a;

    public d(android.content.Context context) {
        this.f1201a = context;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("SportUtils", "OpenLiteApp fail");
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        android.content.Context context = this.f1201a;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getText(com.tencent.mm.R.string.ggb);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("SportUtils", "OpenLiteApp success");
    }
}
