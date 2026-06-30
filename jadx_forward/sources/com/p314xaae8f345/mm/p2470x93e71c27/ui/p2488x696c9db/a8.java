package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class a8 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 f273048a;

    public a8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997) {
        this.f273048a = c19748x5c264997;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997 = this.f273048a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c19748x5c264997.f273008o;
        if (a4Var != null) {
            a4Var.q(c19748x5c264997.f273003g.getCurrentPosition(), c19748x5c264997.f273003g.getDuration());
            c19748x5c264997.f273008o.mo9755xa6db431b();
        }
    }
}
