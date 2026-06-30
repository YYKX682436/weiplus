package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class b0 implements org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f165329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f165330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0 f165331c;

    public b0(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0 e0Var) {
        this.f165329a = z17;
        this.f165330b = i17;
        this.f165331c = e0Var;
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv
    /* renamed from: doOnDrawFrameWithEGL */
    public boolean mo51485x25b69285(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db eglBase, org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer drawer, org.p3371xd0ce3e8d.C29906x8db8d563 c29906x8db8d563, android.graphics.Matrix matrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglBase, "eglBase");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawer, "drawer");
        boolean z17 = this.f165329a;
        int i17 = this.f165330b;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0.f165339v.put(java.lang.Integer.valueOf(i17), 0);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0 e0Var = this.f165331c;
        if (((java.lang.Boolean) ((jz5.n) e0Var.f165344n).mo141623x754a37bb()).booleanValue() && ((java.lang.Boolean) ((jz5.n) e0Var.f165345o).mo141623x754a37bb()).booleanValue()) {
            if (c29904x150215d2 != null && c29906x8db8d563 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0.f165338u;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | beigin set size");
                int m156546xdcea9b53 = c29904x150215d2.m156546xdcea9b53();
                int m156545xa699d53a = c29904x150215d2.m156545xa699d53a();
                org.p3371xd0ce3e8d.C29783x806035d7 c29783x806035d7 = e0Var.f165350t;
                c29783x806035d7.m155560x76500f83(m156546xdcea9b53, m156545xa699d53a);
                android.opengl.GLES20.glBindFramebuffer(36160, c29783x806035d7.m155555xc8be9a52());
                android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, c29783x806035d7.m155557xc2ca74e0(), 0);
                android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                android.opengl.GLES20.glClear(16384);
                c29906x8db8d563.m156560x75e3689(c29904x150215d2, drawer, matrix, 0, 0, c29904x150215d2.m156546xdcea9b53(), c29904x150215d2.m156545xa699d53a());
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glActiveTexture(33984);
                jz5.g gVar = e0Var.f165342i;
                android.opengl.GLES20.glBindTexture(3553, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | beigin run sr");
                e0Var.f165340g = (c29904x150215d2.m156546xdcea9b53() * 3) / 2;
                int m156545xa699d53a2 = (c29904x150215d2.m156545xa699d53a() * 3) / 2;
                e0Var.f165341h = m156545xa699d53a2;
                int i18 = e0Var.f165340g;
                int i19 = i18 % 8;
                if (i19 != 0) {
                    e0Var.f165340g = i18 - i19;
                }
                int i27 = m156545xa699d53a2 % 8;
                if (i27 != 0) {
                    e0Var.f165341h = m156545xa699d53a2 - i27;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh out width : " + e0Var.f165340g + "height: " + e0Var.f165341h);
                e0Var.f165346p = ((com.p314xaae8f345.mm.p817x5682e1b2.C10822x82ca71b4) ((jz5.n) e0Var.f165343m).mo141623x754a37bb()).a(c29783x806035d7.m155557xc2ca74e0(), c29904x150215d2.m156546xdcea9b53(), c29904x150215d2.m156545xa699d53a(), ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), e0Var.f165340g, e0Var.f165341h);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("johnjh jsapiwc postUpdateview | after runsr, return :");
                sb6.append(e0Var.f165346p);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", sb6.toString());
                if (e0Var.f165346p) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0.f165339v.put(java.lang.Integer.valueOf(i17), 1);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0.f165339v.put(java.lang.Integer.valueOf(i17), -1);
                }
                drawer.mo155540x7205dce9(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), e0Var.f165349s, c29904x150215d2.m156546xdcea9b53(), c29904x150215d2.m156545xa699d53a(), 0, 0, eglBase.mo155419xdffb3519(), eglBase.mo155418x59c7434());
                return e0Var.f165346p;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.w wVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.e0.f165338u;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateWebRTCRendererViewWC", "johnjh jsapiwc postUpdateview | frame or framedrawer is null");
        }
        return false;
    }
}
