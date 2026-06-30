package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29;

/* loaded from: classes15.dex */
public class o implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.p f243969a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.p pVar) {
        this.f243969a = pVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayController", "on error: play %s ERROR!! %d %d", this.f243969a.f243973g.f243980c, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f243969a.f243973g.c();
        if (this.f243969a.f243973g.F == null) {
            return true;
        }
        this.f243969a.f243973g.F.a(this.f243969a.f243973g, -1);
        return true;
    }
}
