package tb1;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f498459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f498460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f498461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tb1.p0 f498462g;

    public q0(tb1.p0 p0Var, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f498462g = p0Var;
        this.f498459d = jSONObject;
        this.f498460e = lVar;
        this.f498461f = i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public void run() {
        char c17;
        tb1.x xVar;
        tb1.p0 p0Var;
        java.lang.ref.WeakReference weakReference;
        final org.json.JSONObject jSONObject = this.f498459d;
        int optInt = jSONObject.optInt("cameraId");
        java.lang.String optString = jSONObject.optString("type");
        boolean z17 = true;
        boolean optBoolean = jSONObject.optBoolean("selfieMirror", true);
        boolean optBoolean2 = jSONObject.optBoolean("muted", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateCamera", "cameraId=%d type=%s muted=%b", java.lang.Integer.valueOf(optInt), optString, java.lang.Boolean.valueOf(optBoolean2));
        tb1.c cVar = tb1.b.f498422a;
        android.util.SparseArray sparseArray = cVar.f498426d;
        final tb1.a0 a0Var = (sparseArray.indexOfKey(optInt) < 0 || (weakReference = (java.lang.ref.WeakReference) sparseArray.get(optInt)) == null) ? null : (tb1.a0) weakReference.get();
        final int i17 = this.f498461f;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f498460e;
        final tb1.p0 p0Var2 = this.f498462g;
        if (a0Var == null) {
            lVar.a(i17, p0Var2.o("fail:no such camera"));
            return;
        }
        a0Var.mo50758xfda7a947(new tb1.r0(this));
        optString.getClass();
        switch (optString.hashCode()) {
            case -2144140699:
                if (optString.equals("closeFrameChange")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -1909077165:
                if (optString.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b)) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case -1391995149:
                if (optString.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l3.f33808x24728b)) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case -374265034:
                if (optString.equals("listenFrameChange")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 1484838379:
                if (optString.equals("takePhoto")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 1985172309:
                if (optString.equals("setZoom")) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        if (c17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var;
            if (c12042x78b65610.C != null && (xVar = c12042x78b65610.P) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = c12042x78b65610.F;
                xVar.f498483c = false;
                if (c16529x1336da53 != null) {
                    c16529x1336da53.c(null, null);
                }
                int i18 = xVar.f498484d;
                if (i18 != Integer.MIN_VALUE) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) xVar.f498482b).a0(i18);
                    xVar.f498484d = Integer.MIN_VALUE;
                }
                c12042x78b65610.P = null;
            }
            lVar.a(i17, p0Var2.o("ok"));
            return;
        }
        if (c17 == 1) {
            if (optBoolean2) {
                p0Var = p0Var2;
            } else {
                p0Var2.getClass();
                si1.e1.a(java.lang.String.valueOf(lVar.mo48798x74292566()), new z2.f() { // from class: tb1.p0$$a
                    @Override // z2.f
                    /* renamed from: onRequestPermissionsResult */
                    public final void mo50562x953457f1(int i19, java.lang.String[] strArr, int[] iArr) {
                        tb1.p0 p0Var3 = tb1.p0.this;
                        p0Var3.getClass();
                        if (i19 == 18) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = lVar;
                            org.json.JSONObject jSONObject2 = jSONObject;
                            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                                java.util.HashMap hashMap = new java.util.HashMap();
                                hashMap.put("cameraId", java.lang.Integer.valueOf(jSONObject2.optInt("cameraId")));
                                tb1.d0 d0Var = new tb1.d0();
                                d0Var.f163907f = new org.json.JSONObject(hashMap).toString();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t E = p0Var3.E(lVar2, null);
                                if (E != null) {
                                    E.i(d0Var, null);
                                }
                                tb1.b.f498422a.f498424b = false;
                                p0Var3.f498452g = null;
                            } else {
                                tb1.b.f498422a.f498424b = true;
                                p0Var3.A(lVar2, jSONObject2, i17);
                            }
                            tb1.b.f498422a.f498425c = false;
                            si1.e1.c(lVar2.mo48798x74292566());
                        }
                    }
                });
                p0Var = p0Var2;
                boolean a17 = nf.t.a((android.app.Activity) lVar.mo50352x76847179(), lVar, "android.permission.RECORD_AUDIO", 18, "", "");
                cVar.f498424b = a17;
                if (a17) {
                    si1.e1.c(lVar.mo48798x74292566());
                } else {
                    cVar.f498425c = true;
                    z17 = false;
                }
                if (!z17) {
                    return;
                }
            }
            tb1.m mVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var).f161705h;
            if (mVar != null) {
                mVar.c(optBoolean, optBoolean2);
            }
            if (p0Var.f498452g != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateCamera", "found stop record runnable");
                p0Var.f498452g.run();
                p0Var.f498452g = null;
                return;
            }
            return;
        }
        if (c17 == 2) {
            p0Var2.f498452g = new java.lang.Runnable() { // from class: tb1.q0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean optBoolean3 = jSONObject.optBoolean("compressed");
                    tb1.a0 a0Var2 = a0Var;
                    a0Var2.mo50752x2bc7e755(optBoolean3);
                    tb1.m mVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var2).f161705h;
                    if (mVar2 != null) {
                        mVar2.b();
                    }
                }
            };
            if (cVar.f498425c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateCamera", "stop record, bug is requesting microphone permission");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateCamera", "stop record immediately");
            p0Var2.f498452g.run();
            p0Var2.f498452g = null;
            return;
        }
        if (c17 != 3) {
            if (c17 == 4) {
                a0Var.mo50763xd80f4a3d(jSONObject.optString("quality", "high"));
                boolean optBoolean3 = jSONObject.optBoolean("captureMetadata", false);
                tb1.m mVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var).f161705h;
                if (mVar2 != null) {
                    mVar2.d(optBoolean, optBoolean3);
                    return;
                }
                return;
            }
            if (c17 != 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOperateCamera", "operateType not supported: %s", optString);
                lVar.a(i17, p0Var2.o("fail:operateType not supported"));
                return;
            }
            float q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var).q((float) jSONObject.optDouble(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb));
            if (q17 < 1.0f) {
                lVar.a(i17, p0Var2.o("fail: zoom multiple not support"));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15537x4680a1cb, java.lang.Float.valueOf(q17));
            lVar.a(i17, p0Var2.p("ok", hashMap));
            return;
        }
        jSONObject.optString("size");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b656102 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "listenFrameChange");
        if (c12042x78b656102.C == null) {
            return;
        }
        if (c12042x78b656102.F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "listenFrameChange recordView null");
            ((tb1.r0) c12042x78b656102.C).a("camera illegal state", -1, -1, -1);
            return;
        }
        if (c12042x78b656102.P == null) {
            c12042x78b656102.P = new tb1.x(lVar);
        }
        tb1.j jVar = new tb1.j(c12042x78b656102);
        if (c12042x78b656102.Q) {
            jVar.run();
            return;
        }
        if (c12042x78b656102.W == null) {
            c12042x78b656102.W = new java.util.ArrayList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "listen frame change before camera init done");
        ((java.util.ArrayList) c12042x78b656102.W).add(jVar);
    }
}
