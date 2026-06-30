package ch2;

/* loaded from: classes10.dex */
public final class x1 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f123024b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(ch2.o2 o2Var, java.lang.Class cls) {
        super(cls);
        this.f123024b = o2Var;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", "startKTVSync: onPollingFail, =" + errMsg + " ret: " + i17);
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.hc2 result = (r45.hc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", "onPollingSuccess first_song_version: " + result.f457568d + " song_list_version: " + result.f457569e + " self_wait_song_size: " + result.f457572h + " stay_trtc_room_time_after_stop_singing: " + result.f457573i + " all_wait_song_size: " + result.f457574m);
        ch2.o2 o2Var = this.f123024b;
        if (o2Var.q7().f427847u < result.f457568d) {
            om2.g q76 = o2Var.q7();
            java.util.LinkedList song_info_list = result.f457570f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_info_list, "song_info_list");
            q76.V6("syncRequest", song_info_list, result.f457568d);
        }
        if (o2Var.q7().f427848v < result.f457569e) {
            o2Var.q7().X6("syncRequest", result.f457571g);
            o2Var.q7().W6("syncRequest", result.f457569e);
        }
        o2Var.q7().U6(result.f457573i);
        ((om2.g) o2Var.m56788xbba4bfc0(om2.g.class)).Y6("syncRequest", result.f457572h, result.f457574m);
        dk2.ef.f314925k.h(37, o2Var.g7());
    }
}
