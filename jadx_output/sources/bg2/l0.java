package bg2;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f20261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(bg2.x0 x0Var, android.content.Context context) {
        super(2);
        this.f20261d = x0Var;
        this.f20262e = context;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ix0 ret = (r45.ix0) obj2;
        kotlin.jvm.internal.o.g((r45.g33) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(ret, "ret");
        bg2.x0 x0Var = this.f20261d;
        com.tencent.mars.xlog.Log.i(x0Var.f20613e, "[closeDanmaku] live feed danmaku close ret:" + ret);
        int integer = ret.getInteger(1);
        android.content.Context context = this.f20262e;
        if (integer == 0) {
            x0Var.c7(java.lang.Boolean.FALSE, null);
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.d(com.tencent.mm.R.string.cvn);
            e4Var.c();
        } else {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_error);
            e4Var2.d(com.tencent.mm.R.string.eqz);
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
