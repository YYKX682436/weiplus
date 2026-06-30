package ch2;

/* loaded from: classes10.dex */
public final class x1 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41491b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(ch2.o2 o2Var, java.lang.Class cls) {
        super(cls);
        this.f41491b = o2Var;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "startKTVSync: onPollingFail, =" + errMsg + " ret: " + i17);
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.hc2 result = (r45.hc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "onPollingSuccess first_song_version: " + result.f376035d + " song_list_version: " + result.f376036e + " self_wait_song_size: " + result.f376039h + " stay_trtc_room_time_after_stop_singing: " + result.f376040i + " all_wait_song_size: " + result.f376041m);
        ch2.o2 o2Var = this.f41491b;
        if (o2Var.q7().f346314u < result.f376035d) {
            om2.g q76 = o2Var.q7();
            java.util.LinkedList song_info_list = result.f376037f;
            kotlin.jvm.internal.o.f(song_info_list, "song_info_list");
            q76.V6("syncRequest", song_info_list, result.f376035d);
        }
        if (o2Var.q7().f346315v < result.f376036e) {
            o2Var.q7().X6("syncRequest", result.f376038g);
            o2Var.q7().W6("syncRequest", result.f376036e);
        }
        o2Var.q7().U6(result.f376040i);
        ((om2.g) o2Var.business(om2.g.class)).Y6("syncRequest", result.f376039h, result.f376041m);
        dk2.ef.f233392k.h(37, o2Var.g7());
    }
}
