package ad5;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yc5.a f3304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3306f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yc5.a aVar, boolean z17, android.content.Context context) {
        super(0);
        this.f3304d = aVar;
        this.f3305e = z17;
        this.f3306f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yc5.a aVar = this.f3304d;
        boolean z17 = aVar.f460886b;
        android.content.Context context = this.f3306f;
        if (z17 || aVar.f460887c) {
            db5.e1.y(context, context.getString(this.f3305e ? com.tencent.mm.R.string.pbh : com.tencent.mm.R.string.pbg), "", context.getString(com.tencent.mm.R.string.l_e), null);
        } else {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.f490548y7);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_done);
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
