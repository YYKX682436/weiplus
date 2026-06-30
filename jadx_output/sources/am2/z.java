package am2;

/* loaded from: classes3.dex */
public final class z implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.z f8778d = new am2.z();

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.f(1023, "观众组队battle胜");
            g4Var.f(1024, "观众组队battle平");
            g4Var.f(1025, "观众独立battle胜");
            g4Var.f(1026, "观众独立battle平");
            g4Var.f(1016, "组队battle胜");
            g4Var.f(1017, "组队battle平");
            g4Var.f(1018, "独立battle胜");
            g4Var.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT, "独立battle平");
            g4Var.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST, "PK暴击-送礼人数");
            g4Var.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER, "PK暴击-PK值");
            g4Var.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, "PK暴击-送礼数量");
        }
    }
}
