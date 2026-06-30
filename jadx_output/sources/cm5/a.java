package cm5;

/* loaded from: classes3.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f43422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f43423b;

    public a(q80.d0 d0Var, android.content.Context context) {
        this.f43422a = d0Var;
        this.f43423b = context;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("BlockFunctionUtil", "openLiteApp fail %s.", this.f43422a.f360649a);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        android.content.Context context = this.f43423b;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getResources().getString(com.tencent.mm.R.string.ggb);
        e4Var.c();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("BlockFunctionUtil", "openLiteApp success %s.", this.f43422a.f360649a);
    }
}
