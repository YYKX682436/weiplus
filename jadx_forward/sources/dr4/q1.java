package dr4;

/* loaded from: classes14.dex */
public class q1 extends os0.a {
    public cr4.c C;
    public is0.c D;
    public is0.c E;
    public int F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f324267J;
    public boolean K;

    public q1(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        this.F = -1;
        vq4.b0.i();
    }

    @Override // os0.a
    public void n() {
        ar4.d dVar;
        super.n();
        cr4.c cVar = this.C;
        if (cVar != null && (dVar = cVar.f303523a) != null) {
            dVar.a();
        }
        ar4.c cVar2 = ar4.c.f94934a;
        ar4.c.f94935b = null;
        ar4.c.f94936c = false;
    }

    @Override // os0.a
    public void p() {
        int i17;
        is0.c cVar;
        ar4.c cVar2 = ar4.c.f94934a;
        if (!ar4.c.f94936c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VirtualBackgroundFilter", "initRenderProc");
            ar4.c.f94936c = true;
            ar4.c.f94937d = new org.json.JSONArray();
        }
        is0.c cVar3 = this.D;
        boolean z17 = false;
        if ((cVar3 != null && cVar3.f375927d) || (i17 = this.F) < 0 || !android.opengl.GLES20.glIsTexture(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipRenderProcExternalTexture", "render error externalTexture already released");
            return;
        }
        is0.c cVar4 = this.D;
        if (cVar4 == null || (cVar = this.f429533i) == null) {
            return;
        }
        if (!this.K) {
            if (this.G) {
                cr4.c cVar5 = this.C;
                if (cVar5 != null && cVar5.a(cVar4.f375928e, cVar, true)) {
                    z17 = true;
                }
                if (z17) {
                    cr4.c cVar6 = this.C;
                    if (cVar6 != null) {
                        int i18 = this.f429527c;
                        int i19 = this.f429528d;
                        int i27 = cVar4.f375928e;
                        int i28 = this.H;
                        int i29 = this.I;
                        boolean z18 = this.f324267J;
                        ar4.d dVar = cVar6.f303523a;
                        if (dVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YTFaceBeautyProgram", "error init filterProcessTex process and try refresh");
                        } else {
                            dVar.d(i18, i19);
                            dVar.f94938a = i27;
                            dVar.b(i28, i29, z18);
                        }
                    }
                    cVar4 = cVar;
                } else {
                    this.K = true;
                }
            } else {
                if (ar4.c.f94935b != null) {
                    if (this.C == null) {
                        this.C = new cr4.c();
                    }
                    cr4.c cVar7 = this.C;
                    if (cVar7 != null && cVar7.a(cVar4.f375928e, cVar, false)) {
                        z17 = true;
                    }
                    if (z17) {
                        cr4.c cVar8 = this.C;
                        if (cVar8 != null) {
                            int i37 = this.f429527c;
                            int i38 = this.f429528d;
                            int i39 = cVar4.f375928e;
                            int i47 = this.H;
                            int i48 = this.I;
                            boolean z19 = this.f324267J;
                            ar4.d dVar2 = cVar8.f303523a;
                            if (dVar2 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YTFaceBeautyProgram", "error init filterProcessTex process and try refresh");
                            } else {
                                dVar2.d(i37, i38);
                                dVar2.f94938a = i39;
                                dVar2.b(i47, i48, z19);
                            }
                        }
                        cVar4 = cVar;
                    } else {
                        this.K = true;
                    }
                }
            }
        }
        this.E = cVar4;
    }

    public void x(is0.c texture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(texture, "texture");
        this.D = texture;
        this.F = texture.f375928e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderProcExternalTexture", "externalGLTextureID:" + this.F);
    }
}
