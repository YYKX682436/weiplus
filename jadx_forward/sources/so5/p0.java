package so5;

/* loaded from: classes14.dex */
public final class p0 extends zo5.i {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f492429c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f492432f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f492433g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f492434h;

    /* renamed from: i, reason: collision with root package name */
    public p05.l4 f492435i;

    /* renamed from: j, reason: collision with root package name */
    public is0.c f492436j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f492437k;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f492430d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_virtual_background_use_gpu, false);

    /* renamed from: e, reason: collision with root package name */
    public final zo5.i f492431e = new zo5.i();

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab f492438l = vq4.b0.l();

    public p0(boolean z17) {
        this.f492429c = z17;
    }

    @Override // zo5.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WevisionRenderLogic", "release() called " + this.f492432f);
        this.f492437k = false;
        is0.c cVar = this.f492436j;
        if (cVar != null) {
            cVar.close();
        }
        this.f492431e.a();
        if (this.f492432f) {
            this.f492432f = false;
            p05.l4 l4Var = this.f492435i;
            if (l4Var != null) {
                l4Var.o();
            }
        }
    }

    @Override // zo5.i
    public java.lang.Object b(zo5.f params) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (this.f492435i == null && this.f492433g) {
            this.f492435i = new p05.l4(1, false, this.f492429c, true, this.f492430d, true, rh0.z.f477144e, null, false, 386, null);
            c();
        }
        boolean z17 = this.f492437k;
        zo5.i iVar = this.f492431e;
        if (!z17) {
            iVar.b(params);
            return null;
        }
        boolean z18 = this.f492434h;
        boolean z19 = this.f492433g;
        if (z18 != z19) {
            this.f492434h = z19;
            if (z19) {
                p05.l4 l4Var = this.f492435i;
                if (l4Var != null) {
                    l4Var.I(z19, 1.0f, rh0.b0.f477114e);
                }
            } else {
                p05.l4 l4Var2 = this.f492435i;
                if (l4Var2 != null) {
                    l4Var2.I(z19, 1.0f, rh0.b0.f477113d);
                }
            }
        }
        if (this.f492436j == null) {
            this.f492436j = is0.b.b(true, 23L);
        }
        is0.c cVar = this.f492436j;
        zo5.e renderInfo = params.f556421c;
        if (cVar != null) {
            is0.c.b(cVar, renderInfo.f556413a, renderInfo.f556414b, 0, null, 0, 0, 60, null);
        }
        p05.l4 l4Var3 = this.f492435i;
        if (l4Var3 != null) {
            l4Var3.J(renderInfo.f556413a, renderInfo.f556414b);
        }
        p05.l4 l4Var4 = this.f492435i;
        if (l4Var4 != null) {
            l4Var4.q(params.f556420b, false, renderInfo.f556415c, renderInfo.f556416d);
        }
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        p05.l4 l4Var5 = this.f492435i;
        if (l4Var5 != null) {
            int i18 = params.f556420b;
            is0.c cVar2 = this.f492436j;
            int i19 = cVar2 != null ? cVar2.f375928e : -1;
            int i27 = renderInfo.f556415c;
            l4Var5.v(i18, i19, 0L, 360 - i27, i27, true, false, renderInfo.f556416d, l4Var5.f432128h, l4Var5.f432127g);
            i17 = 36160;
        } else {
            i17 = 36160;
        }
        android.opengl.GLES20.glBindFramebuffer(i17, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        is0.c cVar3 = this.f492436j;
        if (cVar3 == null) {
            return null;
        }
        int i28 = cVar3.f375928e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
        android.util.Size drawSize = params.f556422d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
        iVar.b(new zo5.f(false, i28, renderInfo, drawSize));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r7 = this;
            p05.l4 r0 = r7.f492435i
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L15
            long r3 = r0.f432126f
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L10
            r3 = r1
            goto L11
        L10:
            r3 = r2
        L11:
            if (r3 != r1) goto L15
            r3 = r1
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 != 0) goto L22
            r7.f492437k = r2
            java.lang.String r0 = "MicroMsg.WevisionRenderLogic"
            java.lang.String r1 = "init: wevision init fail, skip render"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)
            return
        L22:
            if (r0 == 0) goto L27
            r0.H(r2)
        L27:
            p05.l4 r0 = r7.f492435i
            if (r0 == 0) goto L2e
            com.tencent.mm.autogen.mmdata.rpt.WeVisionBaseDataStruct r0 = r0.F
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 != 0) goto L32
            goto L35
        L32:
            r2 = 4
            r0.f144457d = r2
        L35:
            r7.f492432f = r1
            r7.f492437k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: so5.p0.c():void");
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WevisionRenderLogic", "switchVirtualBackground() called with: enable = " + z17 + ", nowVbEnable = " + this.f492433g + ", nowAppliedVBEnable = " + this.f492434h);
        this.f492433g = z17;
    }
}
