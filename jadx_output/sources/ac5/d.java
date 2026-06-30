package ac5;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f3087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f3088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yb5.d dVar, android.app.Activity activity) {
        super(1);
        this.f3087d = dVar;
        this.f3088e = activity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a doAction = (yz5.a) obj;
        kotlin.jvm.internal.o.g(doAction, "doAction");
        android.content.Context g17 = this.f3087d.g();
        if (g17 == null) {
            g17 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(g17);
        u1Var.g(this.f3088e.getString(com.tencent.mm.R.string.ncg));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.ohw);
        u1Var.b(new ac5.c(doAction));
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
