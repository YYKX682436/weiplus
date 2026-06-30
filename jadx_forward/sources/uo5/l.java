package uo5;

/* loaded from: classes14.dex */
public final class l extends android.media.MediaCodec.Callback implements uo5.q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f511257a;

    /* renamed from: b, reason: collision with root package name */
    public final uo5.b f511258b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f511259c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f511260d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f511261e;

    /* renamed from: f, reason: collision with root package name */
    public uo5.r f511262f;

    /* renamed from: g, reason: collision with root package name */
    public int f511263g;

    /* renamed from: h, reason: collision with root package name */
    public final wo5.a f511264h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f511265i;

    /* renamed from: j, reason: collision with root package name */
    public android.util.Size f511266j;

    /* renamed from: k, reason: collision with root package name */
    public android.util.Size f511267k;

    /* renamed from: l, reason: collision with root package name */
    public int f511268l;

    /* renamed from: m, reason: collision with root package name */
    public int f511269m;

    public l(boolean z17, uo5.b codecContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codecContext, "codecContext");
        this.f511257a = z17;
        this.f511258b = codecContext;
        this.f511259c = "MicroMsg.HW.HWCodecImpl-enc" + z17 + '-' + hashCode();
        this.f511260d = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(uo5.f.f511251a);
        this.f511263g = 8;
        this.f511264h = new wo5.a();
        this.f511265i = true;
        this.f511266j = new android.util.Size(0, 0);
        this.f511267k = new android.util.Size(0, 0);
    }

    public final void a() {
        java.lang.Object m143895xf1229813;
        java.lang.String str = this.f511259c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "releaseCodec");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            uo5.r rVar = this.f511262f;
            if (rVar != null) {
                if (this.f511257a) {
                    this.f511261e = null;
                }
                ((uo5.s) rVar).f511272a.stop();
                ((uo5.s) rVar).f511272a.release();
            }
            this.f511262f = null;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, m143898xd4a2fc34, "codec call error", new java.lang.Object[0]);
            java.lang.String message = m143898xd4a2fc34.getMessage();
            c(message != null ? message : "codec call error");
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
    }

    public void b(int i17) {
        if (!this.f511257a) {
            throw new java.lang.IllegalStateException("encode use only");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f511259c, "setDynFpsNum() called with: fps = " + i17);
        this.f511268l = i17;
    }

    public final void c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f511259c, "setErrorState: " + str);
        e(new uo5.e(str));
    }

    public void d(android.os.Bundle bundle) {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            uo5.r rVar = this.f511262f;
            if (rVar != null) {
                ((uo5.s) rVar).f511272a.setParameters(bundle);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f511259c, m143898xd4a2fc34, "codec call error", new java.lang.Object[0]);
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
    }

    public final void e(uo5.j jVar) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f511260d;
        uo5.j jVar2 = (uo5.j) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb();
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(jVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f511259c, "setState: set state from " + jVar2 + " to " + jVar + " success true");
    }

    public void f() {
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        java.lang.Object m143895xf12298133;
        java.lang.String str = this.f511259c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startWorking: ");
        uo5.b bVar = this.f511258b;
        uo5.a a17 = bVar.f511248b.a(this.f511265i);
        if (a17 == null) {
            c("startWorking: get initial config error");
            return;
        }
        android.media.MediaFormat mediaFormat = a17.f511246c;
        this.f511263g = this.f511265i ? 8 : 1;
        a();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            uo5.r a18 = ((uo5.c) bVar.f511247a).a(a17);
            jz5.f0 f0Var = jz5.f0.f384359a;
            if (a18 == null) {
                c("startWorking: create codec error");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startWorking: create codec successful");
                ((uo5.s) a18).f511272a.setCallback(this, bVar.f511248b.b());
                java.lang.Object obj = null;
                ((uo5.s) a18).f511272a.configure(mediaFormat, this.f511261e, (android.media.MediaCrypto) null, bVar.f511248b.c());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startWorking: codec configured surface " + this.f511261e);
                if (this.f511257a) {
                    try {
                        android.view.Surface createInputSurface = ((uo5.s) a18).f511272a.createInputSurface();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createInputSurface, "createInputSurface(...)");
                        m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(createInputSurface);
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                    java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298132);
                    if (m143898xd4a2fc34 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, m143898xd4a2fc34, "codec call error", new java.lang.Object[0]);
                        java.lang.String message = m143898xd4a2fc34.getMessage();
                        if (message == null) {
                            message = "codec call error";
                        }
                        c(message);
                    }
                    if (!p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf12298132)) {
                        obj = m143895xf12298132;
                    }
                    this.f511261e = (android.view.Surface) obj;
                    if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                        int integer = mediaFormat.getInteger("width");
                        int integer2 = mediaFormat.getInteger("height");
                        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right")) {
                            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
                        }
                        if (mediaFormat.containsKey("crop-top") && mediaFormat.containsKey("crop-bottom")) {
                            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
                        }
                        this.f511267k = new android.util.Size(integer, integer2);
                        this.f511266j = new android.util.Size(integer, integer2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startWorking: set encoder width " + integer + " height " + integer2);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startWorking: encode surface created");
                }
                e(new uo5.d(a17));
                this.f511262f = a18;
                try {
                    ((uo5.s) a18).f511272a.start();
                    m143895xf12298133 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
                } catch (java.lang.Throwable th7) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf12298133 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
                }
                java.lang.Throwable m143898xd4a2fc342 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298133);
                if (m143898xd4a2fc342 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, m143898xd4a2fc342, "codec call error", new java.lang.Object[0]);
                    java.lang.String message2 = m143898xd4a2fc342.getMessage();
                    if (message2 == null) {
                        message2 = "codec call error";
                    }
                    c(message2);
                }
                p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf12298133);
                uo5.j jVar = (uo5.j) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f511260d).mo144003x754a37bb();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startWorking: codec start working, curState " + jVar);
                if (jVar instanceof uo5.d) {
                    e(uo5.i.f511254a);
                } else {
                    c(jVar + " not allow to start");
                }
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th8) {
            p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th8));
        }
        java.lang.Throwable m143898xd4a2fc343 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc343 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, m143898xd4a2fc343, "codec call error", new java.lang.Object[0]);
            java.lang.String message3 = m143898xd4a2fc343.getMessage();
            c(message3 != null ? message3 : "codec call error");
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.String message = e17.getMessage();
        if (message == null) {
            message = "on codec error";
        }
        c(message);
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        java.lang.Object m143895xf1229813;
        java.lang.String str = this.f511259c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (i17 >= 0) {
                java.nio.ByteBuffer inputBuffer = codec.getInputBuffer(i17);
                if (inputBuffer == null) {
                    return;
                } else {
                    this.f511258b.f511249c.b(inputBuffer, new uo5.k(codec, i17));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "input buffer error");
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, m143898xd4a2fc34, "codec call error", new java.lang.Object[0]);
            java.lang.String message = m143898xd4a2fc34.getMessage();
            c(message != null ? message : "codec call error");
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo info) {
        java.lang.Object m143895xf1229813;
        java.lang.String str = this.f511259c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (i17 >= 0) {
                uo5.b bVar = this.f511258b;
                boolean z17 = this.f511257a;
                if (z17) {
                    java.nio.ByteBuffer outputBuffer = codec.getOutputBuffer(i17);
                    if (outputBuffer == null) {
                        return;
                    }
                    bVar.f511249c.a(outputBuffer, info);
                    codec.releaseOutputBuffer(i17, info.presentationTimeUs);
                    int i18 = this.f511268l;
                    if (i18 > 0) {
                        this.f511269m++;
                        if (info.flags == 1) {
                            this.f511269m = 0;
                        }
                        int i19 = this.f511269m - i18;
                        if (i19 > 0 && i19 % (i18 / 10) == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onOutputBufferAvailable: reqI, cur " + this.f511269m + ", dynFps " + this.f511268l);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requestIFrame");
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putInt("request-sync", 0);
                            d(bundle);
                        }
                    }
                } else {
                    java.nio.ByteBuffer outputBuffer2 = codec.getOutputBuffer(i17);
                    if (outputBuffer2 == null) {
                        return;
                    }
                    if (z17 && this.f511263g != 1) {
                        byte[] bArr = new byte[info.size];
                        outputBuffer2.get(bArr);
                        if (this.f511264h.a(bArr)) {
                            this.f511265i = false;
                            e(uo5.h.f511253a);
                        }
                    }
                    bVar.f511249c.a(outputBuffer2, info);
                    codec.releaseOutputBuffer(i17, true);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "onOutputBufferAvailable " + i17);
                codec.releaseOutputBuffer(i17, false);
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, m143898xd4a2fc34, "codec call error", new java.lang.Object[0]);
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        int integer;
        int integer2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.String str = this.f511259c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onOutputFormatChanged " + format);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            int integer3 = format.getInteger("width");
            int integer4 = format.getInteger("height");
            this.f511267k = new android.util.Size(integer3, integer4);
            this.f511258b.f511249c.c(integer3, integer4);
            if (format.containsKey("crop-left") && format.containsKey("crop-right") && (integer2 = (format.getInteger("crop-right") + 1) - format.getInteger("crop-left")) > 0 && integer2 <= integer3) {
                integer3 = integer2;
            }
            if (format.containsKey("crop-top") && format.containsKey("crop-bottom") && (integer = (format.getInteger("crop-bottom") + 1) - format.getInteger("crop-top")) > 0 && integer <= integer4) {
                integer4 = integer;
            }
            this.f511266j = new android.util.Size(integer3, integer4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onOutputFormatChanged: buffer size " + this.f511267k + ", real size " + this.f511266j);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }
}
