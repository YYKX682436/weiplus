package am2;

/* loaded from: classes3.dex */
public final class f3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.g3 f8669d;

    public f3(am2.g3 g3Var) {
        this.f8669d = g3Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.MenuItem f17 = g4Var.f(1, "新背包礼物");
            am2.g3 g3Var = this.f8669d;
            ((db5.h4) f17).f228382z = new am2.y2(g3Var);
            ((db5.h4) g4Var.f(2, "背包礼物快失效")).f228382z = new am2.z2(g3Var);
            ((db5.h4) g4Var.f(3, "一键送礼气泡")).f228382z = new am2.a3(g3Var);
            r45.xn1 xn1Var = new r45.xn1();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.setNickname("测试");
            xn1Var.set(0, finderContact);
            ((db5.h4) g4Var.f(4, "赞直播消息")).f228382z = new am2.b3(g3Var, xn1Var);
            ((db5.h4) g4Var.f(5, "关注直播消息")).f228382z = new am2.c3(g3Var, xn1Var);
            ((db5.h4) g4Var.f(6, "分享直播消息")).f228382z = new am2.d3(g3Var, xn1Var);
            ((db5.h4) g4Var.f(7, "预约直播消息")).f228382z = new am2.e3(g3Var, xn1Var);
        }
    }
}
