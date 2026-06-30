package am2;

/* loaded from: classes3.dex */
public final class w2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.x2 f8766d;

    public w2(am2.x2 x2Var) {
        this.f8766d = x2Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.MenuItem f17 = g4Var.f(1, "礼物外露显示");
            am2.x2 x2Var = this.f8766d;
            ((db5.h4) f17).f228382z = new am2.n2(x2Var);
            ((db5.h4) g4Var.f(2, "礼物外露消失")).f228382z = new am2.o2(x2Var);
            ((db5.h4) g4Var.f(3, "假随机连麦气泡")).f228382z = new am2.p2(x2Var);
            ((db5.h4) g4Var.f(4, "假插引导创建下一个预告气泡")).f228382z = new am2.q2(x2Var);
            ((db5.h4) g4Var.f(5, "邀请观众上麦假气泡")).f228382z = new am2.r2(x2Var);
            ((db5.h4) g4Var.f(6, "直播点赞教育半屏-源自气泡")).f228382z = am2.s2.f8748d;
            ((db5.h4) g4Var.f(7, "直播点赞教育半屏-源自菜单")).f228382z = am2.t2.f8751d;
            ((db5.h4) g4Var.f(8, "直播点赞引导气泡")).f228382z = am2.u2.f8757d;
            ((db5.h4) g4Var.f(9, "直播预告引导气泡")).f228382z = am2.v2.f8762d;
            ((db5.h4) g4Var.f(10, "假插点赞消息")).f228382z = am2.h2.f8680d;
            ((db5.h4) g4Var.f(11, "假插首次仅自己可见进场")).f228382z = am2.i2.f8696d;
            ((db5.h4) g4Var.f(12, "礼物掉落效果测试（仅主播端）")).f228382z = am2.k2.f8708d;
            ((db5.h4) g4Var.f(13, "假插观众分享引导气泡")).f228382z = am2.l2.f8712d;
            ((db5.h4) g4Var.f(14, "ktv送花显示")).f228382z = new am2.m2(x2Var);
        }
    }
}
