package ch2;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f41372e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ch2.o2 o2Var, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f41371d = o2Var;
        this.f41372e = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.trtc.TRTCCloud T;
        tn0.w0 Q6 = this.f41371d.Q6();
        if (Q6 == null || (T = Q6.T()) == null) {
            return null;
        }
        ch2.o2 o2Var = this.f41371d;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f41372e;
        return new dh2.x(liveRoomControllerStore, liveRoomControllerStore.getLiveRoomData(), T, liveRoomControllerStore.getLiveRoomData().f272475i, o2Var, dh2.d0.f232437d);
    }
}
