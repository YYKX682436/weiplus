package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class q2 extends com.tencent.mm.network.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f70748d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.l0 f70749e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f70750f;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.m1 f70752h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f70753i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.network.s f70754m;

    /* renamed from: g, reason: collision with root package name */
    public boolean f70751g = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f70755n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f70756o = new com.tencent.mm.modelbase.o2(this);

    public q2(com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 onGYNetEnd, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.modelbase.u0 u0Var, com.tencent.mm.network.s sVar) {
        this.f70748d = v0Var;
        synchronized (m1Var) {
            if (u0Var instanceof q01.x) {
                q01.x xVar = (q01.x) u0Var;
                xVar.getClass();
                kotlin.jvm.internal.o.g(onGYNetEnd, "onGYNetEnd");
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueueTracker", "#wrapOnGYNetEnd: " + xVar.e());
                xVar.f359347g = onGYNetEnd;
                onGYNetEnd = xVar;
            }
        }
        this.f70749e = onGYNetEnd;
        this.f70752h = m1Var;
        this.f70753i = u0Var;
        this.f70750f = android.os.Looper.myLooper() == null ? new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()) : new com.tencent.mm.sdk.platformtools.n3();
        this.f70754m = sVar;
    }

    public static boolean d(com.tencent.mm.modelbase.q2 q2Var, byte[] bArr) {
        q2Var.getClass();
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            java.lang.String l17 = bm5.o1.f22719a.l(new com.tencent.mm.repairer.config.cgi.RepairerConfigFakeCgiResult());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(l17);
                    int optInt = jSONObject.optInt("cgiType", 0);
                    int optInt2 = jSONObject.optInt("netId", 0);
                    int optInt3 = jSONObject.optInt("errType", 0);
                    int optInt4 = jSONObject.optInt("errCode", 0);
                    java.lang.String optString = jSONObject.optString("errMsg", "");
                    if (optInt == q2Var.f70752h.getType()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteOnGYNetEnd", "check use fake cgi resp");
                        q2Var.f70749e.onGYNetEnd(optInt2, optInt3, optInt4, optString, q2Var.f70748d, bArr);
                        return true;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.network.o0
    public void j4(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.z0 z0Var, byte[] bArr, int i27, int i28) {
        int i29;
        int type = this.f70752h.getType();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, type:%s, errType:%d, errCode:%d, isCancel:%b, hash[%d,%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(type), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(this.f70751g), java.lang.Integer.valueOf(this.f70752h.hashCode()), java.lang.Integer.valueOf(this.f70748d.hashCode()));
        if (this.f70752h.isCgiProfilerEnable()) {
            q01.o0 trackState = this.f70752h.trackState();
            r45.xw profile = trackState.f359316a.getReqResp().getRespObj().getProfile();
            if (profile != null && trackState.c()) {
                synchronized (trackState.e()) {
                    if (!trackState.f359319d) {
                        java.util.List e17 = trackState.e();
                        java.util.ListIterator listIterator = e17.listIterator(e17.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i29 = -1;
                                break;
                            } else {
                                if (((q01.h0) listIterator.previous()).f359290a < 250) {
                                    i29 = listIterator.nextIndex();
                                    break;
                                }
                            }
                        }
                        int i37 = i29 + 1;
                        java.util.List e18 = trackState.e();
                        trackState.a(e18, i37, 260, profile.f390554x, profile);
                        trackState.a(e18, i37, com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE, profile.f390546p, profile);
                        trackState.a(e18, i37, 258, profile.f390545o, profile);
                        trackState.a(e18, i37, 257, profile.f390544n, profile);
                        trackState.a(e18, i37, 256, profile.f390543m, profile);
                        trackState.a(e18, i37, 255, profile.f390542i, profile);
                        trackState.a(e18, i37, 254, profile.f390541h, profile);
                        trackState.a(e18, i37, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, profile.f390540g, profile);
                        trackState.a(e18, i37, 252, profile.f390539f, profile);
                        trackState.a(e18, i37, 251, profile.f390538e, profile);
                        trackState.a(e18, i37, 250, profile.f390537d, profile);
                        trackState.f359319d = true;
                    }
                }
            }
        }
        q01.a1.f359259a.d(this.f70752h);
        this.f70752h.updateDispatchIdNew(-1);
        if (this.f70751g || this.f70755n) {
            return;
        }
        this.f70755n = true;
        this.f70750f.removeCallbacks(this.f70756o);
        this.f70750f.post(new com.tencent.mm.modelbase.p2(this, i17, i18, i19, type, bArr, str));
    }
}
