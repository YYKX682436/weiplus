package v22;

/* loaded from: classes10.dex */
public final class b extends wu3.v1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String videoPath, zv3.b emojiFrameRetriever, int i17) {
        super(videoPath, emojiFrameRetriever);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiFrameRetriever, "emojiFrameRetriever");
        int i18 = i17 * 20;
        this.f531353k = i18;
        if (i18 > 30) {
            this.f531353k = 30;
        }
        float f17 = this.f531354l / i17;
        this.f531354l = f17;
        float f18 = 1000.0f / this.f531353k;
        this.f531355m = f18;
        if (f18 < f17) {
            this.f531355m = f17;
        }
        this.f531351i = (int) ((this.f531347e / i17) / this.f531355m);
        this.f531352j = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMixFrameSyncMgr", "init MixFrameSyncMgr,videoPath:" + videoPath + ", videoPlayRate:" + i17 + ", fps:" + this.f531346d + ", duration:" + this.f531347e + ", frameCount:" + this.f531345c + ", frameDuration:" + this.f531354l + ", targetFrameRate:" + this.f531353k + ", targetFrameCount:" + this.f531351i + ", targetFrameDuration:" + this.f531355m);
    }
}
