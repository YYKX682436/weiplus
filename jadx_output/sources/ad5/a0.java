package ad5;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3221f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z17, boolean z18, android.content.Context context) {
        super(0);
        this.f3219d = z17;
        this.f3220e = z18;
        this.f3221f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f3219d;
        boolean z18 = this.f3220e;
        android.content.Context context = this.f3221f;
        if (z17) {
            int i17 = z18 ? com.tencent.mm.R.string.ncn : com.tencent.mm.R.string.f491071bs5;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getString(i17);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_done);
            e4Var.c();
        } else {
            db5.e1.y(context, context.getString(z18 ? com.tencent.mm.R.string.pbd : com.tencent.mm.R.string.pbc), "", context.getString(com.tencent.mm.R.string.l_e), null);
        }
        return jz5.f0.f302826a;
    }
}
