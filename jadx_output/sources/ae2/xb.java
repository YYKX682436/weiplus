package ae2;

/* loaded from: classes.dex */
public final class xb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.xb f4288d = new ae2.xb();

    public xb() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.u("直播点赞速度缩放");
        u1Var.g("输入整数，越大越快，比如50表示原速度的50%");
        u1Var.f(java.lang.Boolean.TRUE);
        u1Var.o("当前数值：" + gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LIKE_SPEED_INT_SYNC, 100));
        u1Var.b(ae2.wb.f4264a);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
