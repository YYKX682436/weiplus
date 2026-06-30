package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public final class u extends com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f, xq4.d {
    public final kotlinx.coroutines.y0 A;
    public final com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r B;
    public com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public final boolean H;

    public u(android.content.Context context, fw1.d dVar, org.json.JSONObject jSONObject, int i17, int i18) {
        super(context, dVar, jSONObject);
        this.A = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.B = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r(i17, i18);
        this.E = 1;
        this.H = true;
    }

    public final boolean E(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("camera", "back");
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceCameraVideoView", "camera:" + optString);
            if (kotlin.jvm.internal.o.b(optString, "back")) {
                return false;
            }
        }
        return true;
    }

    public final void F() {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g gVar = this.C;
        if (gVar != null) {
            int sameLayerSurfaceWidth = getSameLayerSurfaceWidth();
            int sameLayerSurfaceHeight = getSameLayerSurfaceHeight();
            lf1.j jVar = (lf1.j) gVar;
            if (jVar.f318269o == sameLayerSurfaceWidth && jVar.f318270p == sameLayerSurfaceHeight) {
                return;
            }
            jVar.f318269o = sameLayerSurfaceWidth;
            jVar.f318270p = sameLayerSurfaceHeight;
            jVar.s();
        }
    }

    @Override // xq4.d
    public void e(int i17) {
        if (android.provider.Settings.System.getInt(getContext().getContentResolver(), "accelerometer_rotation", 0) != 0) {
            fw1.i.a(i17, this.B.f464560d);
            this.E = i17;
            F();
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceCameraVideoView", "uint, viewId:" + getViewId() + ", openId:" + getOpenId() + ", memberId:" + getMemberId());
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r rVar = this.B;
        rVar.i();
        rVar.getClass();
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void i(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (this.H) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceCameraVideoView", "update, viewId:" + getViewId() + ", openId:" + getOpenId() + ", memberId:" + getMemberId() + ", data:" + data);
            boolean E = E(data);
            if (E != this.D) {
                this.D = E;
                this.B.a();
            }
        }
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public void k(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceCameraVideoView", "init: " + data);
        this.f95840h = data.optInt("viewId");
        this.D = E(data);
        java.lang.String optString = data.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, "fill");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != 3143043) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && optString.equals("contain")) {
                        this.f95850u = 1;
                    }
                } else if (optString.equals("cover")) {
                    this.f95850u = 2;
                }
            } else if (optString.equals("fill")) {
                this.f95850u = 0;
            }
        }
        this.B.d(this, this.D);
        kotlinx.coroutines.l.d(this.A, null, null, new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t(getMemberId() + "_video", this, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean n(int i17, int i18) {
        return this.B.n(i17, i18);
    }

    public void setSameLayerCallback(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g gVar) {
        this.C = gVar;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r13.f464572s == 90) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        if (r13.f464572s == 90) goto L31;
     */
    @Override // xq4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(byte[] r7, long r8, int r10, int r11, int r12, int r13, double r14) {
        /*
            r6 = this;
            java.lang.String r8 = "pBuffer"
            kotlin.jvm.internal.o.g(r7, r8)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 r8 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y2 r9 = r8.f96019h
            monitor-enter(r9)
            boolean r13 = r9.f96142c     // Catch: java.lang.Throwable -> L53
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L53
            if (r13 != 0) goto L11
            return
        L11:
            int r9 = r6.F
            if (r9 != r10) goto L19
            int r9 = r6.G
            if (r9 == r11) goto L20
        L19:
            r6.F = r10
            r6.G = r11
            r6.F()
        L20:
            int r9 = r6.E
            if (r9 == 0) goto L42
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r r13 = r6.B
            r14 = 1
            r15 = 90
            if (r9 == r14) goto L3a
            r14 = 2
            if (r9 == r14) goto L37
            r14 = 3
            if (r9 == r14) goto L32
            goto L42
        L32:
            int r9 = r13.f464572s
            if (r9 != r15) goto L44
            goto L3f
        L37:
            int r12 = r12 + 512
            goto L3f
        L3a:
            int r9 = r13.f464572s
            if (r9 != r15) goto L3f
            goto L44
        L3f:
            int r12 = r12 + 1024
            goto L44
        L42:
            int r12 = r12 + 512
        L44:
            r2 = r12
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y1 r9 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y1
            r0 = r9
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.n(r9)
            return
        L53:
            r7 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L53
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u.v(byte[], long, int, int, int, int, double):void");
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d
    public boolean z() {
        return false;
    }
}
