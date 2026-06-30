package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class k8 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 f273287a;

    public k8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05) {
        this.f273287a = c19749xff44b05;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "video on completion");
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05 = this.f273287a;
        c19749xff44b05.f273030y = i17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c19749xff44b05.f273024s;
        if (a4Var != null) {
            a4Var.mo9755xa6db431b();
        }
    }
}
