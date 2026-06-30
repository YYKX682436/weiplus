package yf0;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final yf0.n f543122a = new yf0.n();

    public final wf0.a2 a(wf0.d2 strategy, zf0.v0 sendVideoTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strategy, "strategy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendVideoTask, "sendVideoTask");
        int ordinal = strategy.ordinal();
        if (ordinal == 0) {
            return new yf0.m(sendVideoTask);
        }
        if (ordinal == 1) {
            return new yf0.f(sendVideoTask);
        }
        throw new jz5.j();
    }

    public final wf0.d2 b(t21.v2 videoInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
        java.lang.String h17 = videoInfo.h();
        if (c01.e2.U(h17) && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20522x28fdca32()) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoSendApiFactory", "talker[" + h17 + "] is plug,use cgi send");
        } else if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20523x3d4af3bc()) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoSendApiFactory", "isAllow2UseCdnWithXLab = false");
        } else {
            boolean Ri = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(2);
            if (Ri || videoInfo.f496556u == 1) {
                return wf0.d2.f527033d;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoMsg.VideoSendApiFactory", " cdn tra not use cdn flag = [" + Ri + "] getCdnInfo:[" + videoInfo.f496556u + ']');
        }
        return wf0.d2.f527034e;
    }
}
