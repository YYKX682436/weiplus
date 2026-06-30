package ae2;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.u f4204d = new ae2.u();

    public u() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.u("直播评论动画速度");
        u1Var.g("输入数字越大越慢，非法输入无效");
        u1Var.f(java.lang.Boolean.TRUE);
        u1Var.o("输入整数，当前数值：" + gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_MSG_SPEED_INT_SYNC, 0));
        u1Var.b(ae2.t.f4181a);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
