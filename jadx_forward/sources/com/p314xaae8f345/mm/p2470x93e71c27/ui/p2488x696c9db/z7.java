package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class z7 implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 f273557a;

    public z7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997) {
        this.f273557a = c19748x5c264997;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer mediaPlayer) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997 = this.f273557a;
        c19748x5c264997.f273004h = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c19748x5c264997.f273008o;
        if (a4Var != null) {
            a4Var.mo9757x58d5b73c();
        }
        c19748x5c264997.f273005i = mediaPlayer.getVideoWidth();
        c19748x5c264997.f273006m = mediaPlayer.getVideoHeight();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997.d(c19748x5c264997);
        if (c19748x5c264997.f273005i == 0 || c19748x5c264997.f273006m == 0) {
            if (c19748x5c264997.f273007n) {
                c19748x5c264997.f273003g.start();
                c19748x5c264997.f273007n = false;
                return;
            }
            return;
        }
        if (c19748x5c264997.f273007n) {
            c19748x5c264997.f273003g.start();
            c19748x5c264997.f273007n = false;
        }
    }
}
