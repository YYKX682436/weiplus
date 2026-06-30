package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.a0 f177673a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f177674b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f177675c = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f177676d = true;

    /* renamed from: e, reason: collision with root package name */
    public int f177677e = 640;

    /* renamed from: f, reason: collision with root package name */
    public int f177678f = 480;

    /* renamed from: g, reason: collision with root package name */
    public long f177679g = 0;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.a0 a0Var) {
        this.f177673a = null;
        this.f177673a = a0Var;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d dVar) {
        if (dVar.x()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
            p0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", tb1.f0.f76785x24728b);
            p0Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.q1(p0Var));
            if (dVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.u) {
                p0Var.f177569x0.f((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.u) dVar, dVar.mo54518x552492cb() + "_video");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3 b3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) dVar;
            if (b3Var.t()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.f177569x0.f(b3Var, b3Var.mo54518x552492cb() + "_video");
            } else if (b3Var.z()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.f177569x0.f(b3Var, b3Var.mo54518x552492cb() + "_screen");
            }
        }
        synchronized (this.f177674b) {
            dVar.h();
            ((java.util.HashMap) this.f177674b).remove(java.lang.Integer.valueOf(dVar.mo54526x346a5196()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "del View, viewId:" + dVar.mo54526x346a5196() + " memberId:" + dVar.mo54518x552492cb());
    }

    public fw1.d b(java.lang.String str) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.a0 a0Var = this.f177673a;
        if (a0Var == null || (arrayList = a0Var.f177350a) == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fw1.d dVar = (fw1.d) it.next();
            if (dVar.f348603b.equals(str)) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.tencent.mm.plugin.cloudvoip.cloudvoice.service.v] */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n0] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d c(android.content.Context context, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3 b3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        if (p0Var.f177557o != com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r2.InRoom) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, not in room, data:" + jSONObject.toString());
            return null;
        }
        int optInt = jSONObject.optInt("viewId", 0);
        java.lang.String optString = jSONObject.optString("openId", "");
        synchronized (this.f177674b) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d) ((java.util.HashMap) this.f177674b).get(java.lang.Integer.valueOf(optInt))) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, already create, viewId: %d openId: %s", java.lang.Integer.valueOf(optInt), optString);
                return null;
            }
            fw1.d b17 = b(optString);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, not found member, data:" + jSONObject.toString());
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "new View, mid:" + b17.f348602a + " data:" + jSONObject.toString());
            java.lang.String optString2 = jSONObject.optString("type", "camera");
            if (optString2.equals("camera")) {
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "anlin: isSameLayer: mWidth: " + this.f177677e + ", mHeight: " + this.f177678f);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.u(context, b17, jSONObject, this.f177677e, this.f177678f);
                    p0Var.f177569x0.a(uVar, b17.f348602a + "_video");
                    b3Var = uVar;
                } else if (this.f177676d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "anlin: isUseNewPlayMode: mWidth: " + this.f177677e + ", mHeight: " + this.f177678f);
                    b3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.n0(context, b17, this.f177677e, this.f177678f);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "anlin: mWidth: " + this.f177677e + ", mHeight: " + this.f177678f);
                    b3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.v(context, b17, this.f177677e, this.f177678f);
                }
            } else {
                if (!optString2.equals("video") && !optString2.equals("screen")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "newView failed, type unsupport, data:" + jSONObject.toString());
                    return null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3 b3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3(context, b17, jSONObject);
                if (optString2.equals("video")) {
                    p0Var.f177569x0.a(b3Var2, b17.f348602a + "_video");
                    b3Var = b3Var2;
                } else {
                    p0Var.f177569x0.a(b3Var2, b17.f348602a + "_screen");
                    b3Var = b3Var2;
                }
            }
            if (b3Var.x()) {
                p0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "onCameraStart");
                p0Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p1(p0Var));
            }
            synchronized (this.f177674b) {
                ((java.util.HashMap) this.f177674b).put(java.lang.Integer.valueOf(optInt), b3Var);
            }
            return b3Var;
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "release");
        try {
            synchronized (this) {
                if (this.f177675c) {
                    this.f177675c = false;
                    synchronized (this.f177674b) {
                        ((java.util.HashMap) this.f177674b).clear();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "release error:" + e17.toString());
        }
    }

    public boolean e(int i17, int i18) {
        boolean z17;
        synchronized (this.f177674b) {
            java.util.Iterator it = ((java.util.HashMap) this.f177674b).entrySet().iterator();
            while (true) {
                z17 = false;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d) ((java.util.Map.Entry) it.next()).getValue();
                    if (dVar != null && !dVar.t() && !dVar.z()) {
                        long j17 = this.f177679g + 1;
                        this.f177679g = j17;
                        if (j17 % 10 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "switchPreviewSize viewId: " + dVar.mo54526x346a5196() + " openId: " + dVar.mo54519x28dae7fb() + " mid: [" + dVar.mo54518x552492cb());
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
