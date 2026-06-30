package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class j8 implements android.media.MediaPlayer.OnInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 f273273a;

    public j8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05) {
        this.f273273a = c19749xff44b05;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var = this.f273273a.f273027v;
        if (b4Var == null) {
            return false;
        }
        b4Var.k(i17, i18);
        return false;
    }
}
