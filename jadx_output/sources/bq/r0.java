package bq;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.lang.String str) {
        super(0);
        this.f23522d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context b17 = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(b17);
        e4Var.f211776c = this.f23522d;
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
