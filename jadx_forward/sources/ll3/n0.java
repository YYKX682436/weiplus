package ll3;

/* loaded from: classes10.dex */
public final class n0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.j5 {
    public void b(int i17) {
        if (gm0.j1.h() && gm0.j1.a()) {
            if (b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.READ_PHONE_STATE") != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GlobalMusicFloatBallManager", "initPhoneStatusWatcher not have read_phone_state perm");
                return;
            }
            if (i17 == 1 || i17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicFloatBallManager", "onPhoneCall, removeCurrentBall, state:%s", java.lang.Integer.valueOf(i17));
                ((ku5.t0) ku5.t0.f394148d).B(ll3.m0.f400725d);
            }
        }
    }
}
