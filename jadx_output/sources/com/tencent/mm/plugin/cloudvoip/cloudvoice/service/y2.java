package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 f96140a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f96141b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f96142c = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f96143d = true;

    /* renamed from: e, reason: collision with root package name */
    public int f96144e = 640;

    /* renamed from: f, reason: collision with root package name */
    public int f96145f = 480;

    /* renamed from: g, reason: collision with root package name */
    public long f96146g = 0;

    public y2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 a0Var) {
        this.f96140a = null;
        this.f96140a = a0Var;
    }

    public void a(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d dVar) {
        if (dVar.x()) {
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
            p0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", tb1.f0.NAME);
            p0Var.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.q1(p0Var));
            if (dVar instanceof com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u) {
                p0Var.f96036x0.f((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u) dVar, dVar.getMemberId() + "_video");
            }
        } else {
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 b3Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) dVar;
            if (b3Var.t()) {
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.f96036x0.f(b3Var, b3Var.getMemberId() + "_video");
            } else if (b3Var.z()) {
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.f96036x0.f(b3Var, b3Var.getMemberId() + "_screen");
            }
        }
        synchronized (this.f96141b) {
            dVar.h();
            ((java.util.HashMap) this.f96141b).remove(java.lang.Integer.valueOf(dVar.getViewId()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "del View, viewId:" + dVar.getViewId() + " memberId:" + dVar.getMemberId());
    }

    public fw1.d b(java.lang.String str) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 a0Var = this.f96140a;
        if (a0Var == null || (arrayList = a0Var.f95817a) == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fw1.d dVar = (fw1.d) it.next();
            if (dVar.f267070b.equals(str)) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.tencent.mm.plugin.cloudvoip.cloudvoice.service.v] */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n0] */
    public com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d c(android.content.Context context, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 b3Var;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        if (p0Var.f96024o != com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, not in room, data:" + jSONObject.toString());
            return null;
        }
        int optInt = jSONObject.optInt("viewId", 0);
        java.lang.String optString = jSONObject.optString("openId", "");
        synchronized (this.f96141b) {
            if (((com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d) ((java.util.HashMap) this.f96141b).get(java.lang.Integer.valueOf(optInt))) != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, already create, viewId: %d openId: %s", java.lang.Integer.valueOf(optInt), optString);
                return null;
            }
            fw1.d b17 = b(optString);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, not found member, data:" + jSONObject.toString());
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "new View, mid:" + b17.f267069a + " data:" + jSONObject.toString());
            java.lang.String optString2 = jSONObject.optString("type", "camera");
            if (optString2.equals("camera")) {
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "anlin: isSameLayer: mWidth: " + this.f96144e + ", mHeight: " + this.f96145f);
                    com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u uVar = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u(context, b17, jSONObject, this.f96144e, this.f96145f);
                    p0Var.f96036x0.a(uVar, b17.f267069a + "_video");
                    b3Var = uVar;
                } else if (this.f96143d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "anlin: isUseNewPlayMode: mWidth: " + this.f96144e + ", mHeight: " + this.f96145f);
                    b3Var = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n0(context, b17, this.f96144e, this.f96145f);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "anlin: mWidth: " + this.f96144e + ", mHeight: " + this.f96145f);
                    b3Var = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.v(context, b17, this.f96144e, this.f96145f);
                }
            } else {
                if (!optString2.equals("video") && !optString2.equals("screen")) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, type unsupport, data:" + jSONObject.toString());
                    return null;
                }
                com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 b3Var2 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3(context, b17, jSONObject);
                if (optString2.equals("video")) {
                    p0Var.f96036x0.a(b3Var2, b17.f267069a + "_video");
                    b3Var = b3Var2;
                } else {
                    p0Var.f96036x0.a(b3Var2, b17.f267069a + "_screen");
                    b3Var = b3Var2;
                }
            }
            if (b3Var.x()) {
                p0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "onCameraStart");
                p0Var.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p1(p0Var));
            }
            synchronized (this.f96141b) {
                ((java.util.HashMap) this.f96141b).put(java.lang.Integer.valueOf(optInt), b3Var);
            }
            return b3Var;
        }
    }

    public void d() {
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "release");
        try {
            synchronized (this) {
                if (this.f96142c) {
                    this.f96142c = false;
                    synchronized (this.f96141b) {
                        ((java.util.HashMap) this.f96141b).clear();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "release error:" + e17.toString());
        }
    }

    public boolean e(int i17, int i18) {
        boolean z17;
        synchronized (this.f96141b) {
            java.util.Iterator it = ((java.util.HashMap) this.f96141b).entrySet().iterator();
            while (true) {
                z17 = false;
                while (it.hasNext()) {
                    com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d dVar = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d) ((java.util.Map.Entry) it.next()).getValue();
                    if (dVar != null && !dVar.t() && !dVar.z()) {
                        long j17 = this.f96146g + 1;
                        this.f96146g = j17;
                        if (j17 % 10 == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "switchPreviewSize viewId: " + dVar.getViewId() + " openId: " + dVar.getOpenId() + " mid: [" + dVar.getMemberId());
                        }
                        if (z17 || dVar.n(i17, i18)) {
                            z17 = true;
                        }
                    }
                }
            }
        }
        return z17;
    }
}
