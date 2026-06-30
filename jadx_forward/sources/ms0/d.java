package ms0;

/* loaded from: classes10.dex */
public class d extends ms0.c {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f412497t;

    public d(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        this.f412497t = "MicroMsg.MixRenderer";
    }

    @Override // ms0.c
    public os0.a f() {
        os0.b bVar = new os0.b(this.f412478a, this.f412479b, this.f412480c, this.f412481d, this.f412482e, this.f412483f);
        bVar.f429541q = null;
        return bVar;
    }

    @Override // ms0.c
    public is0.c g() {
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            return aVar.f429533i;
        }
        return null;
    }

    @Override // ms0.c
    public void p() {
        android.graphics.SurfaceTexture surfaceTexture = this.f412486i;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
        is0.c cVar = this.f412487j;
        int i17 = cVar != null ? cVar.f375928e : -1;
        this.f412490m = i17;
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            aVar.r(i17);
        }
        super.p();
    }

    public final void v(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        float f17;
        float f18;
        float f19;
        java.lang.String str = this.f412497t;
        if (bitmap != null) {
            os0.a aVar = this.f412484g;
            if (aVar instanceof os0.b) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.media.render.proc.GLTextureRenderProcBlend");
                os0.b.x((os0.b) aVar, bitmap, false, 2, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "setBlendBitmap data don't match textureRender ");
            }
        }
        if (bitmap2 != null) {
            os0.a aVar2 = this.f412484g;
            if (aVar2 instanceof os0.b) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar2, "null cannot be cast to non-null type com.tencent.mm.media.render.proc.GLTextureRenderProcBlend");
                ((os0.b) aVar2).G = bitmap2;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "setBlurBgBitmap data don't match textureRender ");
            }
            if (this.f412484g instanceof os0.b) {
                float f27 = this.f412480c;
                float f28 = this.f412478a;
                float f29 = f27 / f28;
                float f37 = this.f412481d;
                float f38 = this.f412479b;
                float f39 = f37 / f38;
                if (f39 < f29) {
                    float f47 = f28 * f39;
                    f19 = (f27 - f47) / 2.0f;
                    f18 = f47 + f19;
                    f17 = 0.0f;
                } else {
                    float f48 = f38 * f29;
                    float f49 = (f37 - f48) / 2.0f;
                    f17 = f49;
                    f37 = f49 + f48;
                    f18 = f27;
                    f19 = 0.0f;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "calcCenterLocation drawWidth:" + this.f412480c + " drawHeight:" + this.f412481d + " textureWidth:" + this.f412478a + " textureHeight:" + this.f412479b + " top:" + f37 + " bottom:" + f17 + " left:" + f19 + " right:" + f18);
                os0.a aVar3 = this.f412484g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar3, "null cannot be cast to non-null type com.tencent.mm.media.render.proc.GLTextureRenderProcBlend");
                float[] fArr = ((os0.b) aVar3).I;
                fArr[0] = f37;
                fArr[1] = f17;
                fArr[2] = f19;
                fArr[3] = f18;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "calcCenterLocation data don't match textureRender ");
            }
            if (this.f412484g instanceof os0.b) {
                float f57 = this.f412480c;
                float f58 = this.f412478a;
                float f59 = f57 / f58;
                float f66 = this.f412481d;
                float f67 = this.f412479b;
                float f68 = f66 / f67;
                float[] fArr2 = new float[8];
                if (f59 < f68) {
                    float f69 = f67 * f59;
                    float f76 = ((f66 - f69) / f69) / 2.0f;
                    float f77 = 1 + f76;
                    float f78 = 0 - f76;
                    fArr2[0] = 0.0f;
                    fArr2[1] = f77;
                    fArr2[2] = 1.0f;
                    fArr2[3] = f77;
                    fArr2[4] = 0.0f;
                    fArr2[5] = f78;
                    fArr2[6] = 1.0f;
                    fArr2[7] = f78;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "calcBlurBgTextureCoord :[0.0, " + f77 + " \n 1.0, " + f77 + " \n 0.0, " + f78 + " \n 1.0, " + f78 + ']');
                } else {
                    float f79 = f58 * f68;
                    float f86 = ((f57 - f79) / f79) / 2.0f;
                    float f87 = 0.0f - f86;
                    float f88 = f86 + 1.0f;
                    fArr2[0] = f87;
                    fArr2[1] = 1.0f;
                    fArr2[2] = f88;
                    fArr2[3] = 1.0f;
                    fArr2[4] = f87;
                    fArr2[5] = 0.0f;
                    fArr2[6] = f88;
                    fArr2[7] = 0.0f;
                }
                os0.a aVar4 = this.f412484g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar4, "null cannot be cast to non-null type com.tencent.mm.media.render.proc.GLTextureRenderProcBlend");
                java.nio.FloatBuffer floatBuffer = ((os0.b) aVar4).Y;
                floatBuffer.position(0);
                floatBuffer.put(fArr2);
                floatBuffer.position(0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "calcBlurBgTextureCoord data don't match textureRender ");
            }
        }
        p();
    }
}
