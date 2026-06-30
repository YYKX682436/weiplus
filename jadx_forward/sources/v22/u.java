package v22;

/* loaded from: classes10.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f514397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v22.z zVar) {
        super(0);
        this.f514397d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zv3.a a17;
        v22.z zVar = this.f514397d;
        int i17 = zVar.f514412j + 1;
        zVar.f514412j = i17;
        d32.j jVar = zVar.f514411i;
        if (jVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mixPixelBuffer");
            throw null;
        }
        wu3.v1 v1Var = zVar.f514413k;
        if (v1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncMgr");
            throw null;
        }
        java.lang.String str = "after syncMixNextFrame, framePass " + i17 + ", videoPassFrame:" + v1Var.f531348f + ", targetPassFrame:" + v1Var.f531352j + ", emojiPassDuration: " + v1Var.f531350h;
        java.lang.String str2 = v1Var.f531344b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        int i18 = i17 - 1;
        if (i18 > 0 && v1Var.f531348f < i18) {
            v1Var.f531348f = i18;
        }
        v1Var.f531356n = v1Var.f531355m * v1Var.f531352j;
        while (v1Var.f531356n >= v1Var.f531350h && (a17 = v1Var.f531343a.a()) != null) {
            long j17 = a17.f557961b;
            if (j17 <= 0) {
                break;
            }
            v1Var.f531350h += (float) j17;
            v1Var.f531349g = a17.f557960a;
        }
        android.graphics.Bitmap bitmap = v1Var.f531349g;
        float f17 = v1Var.f531354l * v1Var.f531348f;
        float f18 = v1Var.f531355m;
        int i19 = v1Var.f531352j;
        boolean z17 = f17 < f18 * ((float) i19);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "syncMixNextFrame, skip frame");
        } else {
            v1Var.f531352j = i19 + 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "syncMixNextFrame pass frame: " + v1Var.f531352j);
        }
        v1Var.f531348f++;
        v22.t tVar = new v22.t(zVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureEGLPixelBuffer", "mixVideoAndEmojiFrame, skip: " + java.lang.Boolean.valueOf(z17));
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, bool)) {
            d32.k kVar = jVar.f307689i;
            if (kVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderer");
                throw null;
            }
            kVar.f307699e = bitmap;
            javax.microedition.khronos.opengles.GL10 gl10 = jVar.f307688h;
            if (gl10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gl");
                throw null;
            }
            kVar.onDrawFrame(gl10);
            tVar.mo146xb9724478(bool);
        } else {
            d32.k kVar2 = jVar.f307689i;
            if (kVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderer");
                throw null;
            }
            android.graphics.SurfaceTexture surfaceTexture = kVar2.f307701g;
            if (surfaceTexture == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoDecodeSurfaceTexture");
                throw null;
            }
            surfaceTexture.updateTexImage();
            tVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
