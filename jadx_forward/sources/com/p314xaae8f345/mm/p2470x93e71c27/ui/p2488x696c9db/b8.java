package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class b8 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 f273065a;

    public b8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997) {
        this.f273065a = c19748x5c264997;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f273065a.f273008o;
        if (a4Var == null) {
            return true;
        }
        a4Var.mo9756xaf8aa769(i17, i18);
        return true;
    }
}
