package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes15.dex */
public class j1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a {
    public boolean A;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d B;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f160752d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.i0 f160753e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.k1 f160754f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160755g;

    /* renamed from: h, reason: collision with root package name */
    public int f160756h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160758m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160759n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160762q;

    /* renamed from: r, reason: collision with root package name */
    public int f160763r;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f160769x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f160770y;

    /* renamed from: z, reason: collision with root package name */
    public int f160771z;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160757i = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f160760o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160761p = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160764s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f160765t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f160766u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f160767v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f160768w = "";

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.k1 k1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.B = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder$OperateRecordTask$1
            {
                this.f39173x3fe91575 = -1109317931;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c5) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5826x579920c5 c5826x579920c52 = c5826x579920c5;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.JsApiOperateRecorder", "mListener callback action : %d", java.lang.Integer.valueOf(c5826x579920c52.f136134g.f89641a));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j1.this;
                java.lang.String str = j1Var.f160758m;
                am.un unVar = c5826x579920c52.f136134g;
                if (!str.equalsIgnoreCase(unVar.f89650j)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.JsApiOperateRecorder", "appId is diff, don't send event");
                    return false;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("state", unVar.f89643c);
                j1Var.f160767v = unVar.f89643c;
                if (unVar.f89641a == 2) {
                    j1Var.f160764s = unVar.f89644d;
                    j1Var.f160766u = unVar.f89642b;
                    j1Var.f160765t = unVar.f89645e;
                    java.lang.String str2 = j1Var.f160758m;
                    java.util.HashMap hashMap2 = (java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.h.f167342a;
                    if (hashMap2.containsKey(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AppBrandRecordClientService", "removeRecordListener,appId:%s", str2);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.h.f167343b.remove(str2);
                        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) hashMap2.remove(str2);
                        if (abstractC20980x9b9ad01d != null) {
                            abstractC20980x9b9ad01d.mo48814x2efc64();
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AppBrandRecordClientService", "appId:%s not exist the appId for listener", str2);
                    }
                }
                if (unVar.f89641a == 4) {
                    hashMap.put("errCode", java.lang.Integer.valueOf(unVar.f89648h));
                    hashMap.put("errMsg", !android.text.TextUtils.isEmpty(unVar.f89649i) ? unVar.f89649i : "");
                }
                if (unVar.f89641a == 5) {
                    byte[] bArr = unVar.f89646f;
                    if (bArr == null || bArr.length <= 819200) {
                        j1Var.f160770y = bArr;
                    } else {
                        java.lang.System.nanoTime();
                        java.io.OutputStream outputStream = null;
                        try {
                            try {
                                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(j1Var.f160769x);
                                if (!r6Var.m()) {
                                    r6Var.k();
                                }
                                outputStream = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                                outputStream.write(unVar.f89646f);
                                outputStream.close();
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.JsApiOperateRecorder", e17, "", new java.lang.Object[0]);
                                }
                            } catch (java.lang.Throwable th6) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (java.io.IOException e18) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.JsApiOperateRecorder", e18, "", new java.lang.Object[0]);
                                    }
                                }
                                throw th6;
                            }
                        } catch (java.io.FileNotFoundException e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.JsApiOperateRecorder", e19, "", new java.lang.Object[0]);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e27) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.JsApiOperateRecorder", e27, "", new java.lang.Object[0]);
                                }
                            }
                        } catch (java.io.IOException e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.JsApiOperateRecorder", e28, "", new java.lang.Object[0]);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e29) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.JsApiOperateRecorder", e29, "", new java.lang.Object[0]);
                                }
                            }
                        }
                        java.lang.System.nanoTime();
                    }
                    byte[] bArr2 = unVar.f89646f;
                    int length = bArr2 != null ? bArr2.length : 0;
                    j1Var.f160771z = length;
                    j1Var.A = unVar.f89647g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.JsApiOperateRecorder", "frameBufferSize:%d", java.lang.Integer.valueOf(length));
                }
                j1Var.f160762q = new org.json.JSONObject(hashMap).toString();
                j1Var.f160763r = unVar.f89641a;
                j1Var.b();
                return true;
            }
        };
        this.f160754f = k1Var;
        this.f160755g = e9Var;
        this.f160756h = i17;
        ik1.b0 b0Var = new ik1.b0();
        if (e9Var.mo50354x59eafec1().mo49624x5d68c543(b0Var) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
            this.f160769x = new com.p314xaae8f345.mm.vfs.r6((java.lang.String) b0Var.f373357a, "frameBuffer").o();
            return;
        }
        this.f160769x = new com.p314xaae8f345.mm.vfs.r6(e9Var.getF229340d().getCacheDir(), "frameBuffer_" + e9Var.mo48798x74292566()).o();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0233  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j1.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        if ("opus".equalsIgnoreCase(r10) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019c, code lost:
    
        if (r6.m() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f4, code lost:
    
        r6.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f2, code lost:
    
        if (r6.m() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d5, code lost:
    
        if (r6.m() != false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.tencent.mm.vfs.r6] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j1.b():void");
    }
}
