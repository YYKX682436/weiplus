package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes15.dex */
public class q5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225258g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f225259h = false;

    /* renamed from: i, reason: collision with root package name */
    public bw5.fi0 f225260i = bw5.fi0.DOCUMENT;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p947xba6de98f.q0 f225261m = new com.p314xaae8f345.mm.p947xba6de98f.q0() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.q5$$a
        @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
        public final void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q5 q5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q5.this;
            q5Var.getClass();
            int ordinal = n1Var.f152636a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    dn.h hVar = n1Var.f152641f;
                    try {
                        byte[] bArr = hVar.f323314p.f17857xec1029d2;
                        bw5.fi0 fi0Var = bw5.fi0.IMAGE;
                        if ((bArr == null || bArr.length == 0) && q5Var.f225260i != fi0Var) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestPreviewFileInfo", "response empty");
                            q5Var.f224975e.b("response empty");
                            return;
                        }
                        bw5.fi0 fi0Var2 = q5Var.f225260i;
                        if (fi0Var2 == bw5.fi0.DOCUMENT) {
                            bw5.bi0 bi0Var = new bw5.bi0();
                            bi0Var.mo11468x92b714fd(hVar.f323314p.f17857xec1029d2);
                            q5Var.E(bi0Var);
                            return;
                        } else if (fi0Var2 == bw5.fi0.ARCHIVE) {
                            bw5.ai0 ai0Var = new bw5.ai0();
                            ai0Var.mo11468x92b714fd(hVar.f323314p.f17857xec1029d2);
                            q5Var.D(ai0Var);
                            return;
                        } else {
                            if (fi0Var2 == fi0Var) {
                                q5Var.F();
                                return;
                            }
                            return;
                        }
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestPreviewFileInfo", "response io exception. %s", e17.toString());
                        q5Var.f224975e.b(java.lang.String.format("response io exception. %s", e17.toString()));
                        return;
                    }
                }
                if (ordinal != 6 && ordinal != 7 && ordinal != 10) {
                    return;
                }
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(n1Var.f152638c);
            com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = n1Var.f152636a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestPreviewFileInfo", "cnd listener action: %s, code: %s", m1Var, valueOf);
            q5Var.f224975e.b(java.lang.String.format("download error. %s code: %d", m1Var, java.lang.Integer.valueOf(n1Var.f152638c)));
        }
    };

    public static org.json.JSONArray A(java.util.LinkedList linkedList) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            bw5.ci0 ci0Var = (bw5.ci0) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("subType", ci0Var.f107631g[1] ? ci0Var.f107628d : "");
            jSONObject.put("imgWidth", ci0Var.f107629e);
            jSONObject.put("imgHeight", ci0Var.f107630f);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static org.json.JSONArray B(bw5.bi0 bi0Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = bi0Var.f107219n.iterator();
        while (it.hasNext()) {
            bw5.di0 di0Var = (bw5.di0) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("subType", di0Var.f108036g[2] ? di0Var.f108034e : "");
            jSONObject.put(ya.b.f77479x42930b2, di0Var.f108033d);
            jSONObject.put("images", A(di0Var.f108035f));
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static org.json.JSONArray C(bw5.bi0 bi0Var) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = bi0Var.f107220o.iterator();
        while (it.hasNext()) {
            bw5.ij0 ij0Var = (bw5.ij0) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.f77479x42930b2, ij0Var.f110147d);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, ij0Var.f110150g[2] ? ij0Var.f110148e : "");
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator it6 = ij0Var.f110149f.iterator();
            while (it6.hasNext()) {
                bw5.so0 so0Var = (bw5.so0) it6.next();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("subType", so0Var.f114619h[3] ? so0Var.f114617f : "");
                jSONObject2.put("xIndex", so0Var.f114615d);
                jSONObject2.put("yIndex", so0Var.f114616e);
                jSONObject2.put("images", A(so0Var.f114618g));
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("tiles", jSONArray2);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public final void D(bw5.ai0 ai0Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i17 = ai0Var.f106742h;
            boolean[] zArr = ai0Var.f106747p;
            jSONObject.put("progress", i17);
            jSONObject.put("status", (zArr[2] ? ai0Var.f106739e : bw5.io0.PREVIEW_RUNNING).f110190d);
            jSONObject.put("limitReason", (zArr[4] ? ai0Var.f106741g : bw5.f30.PREVIEW_NONE).f108674d);
            jSONObject.put("version", zArr[9] ? ai0Var.f106746o : "");
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList = ai0Var.f106743i;
                if (i18 >= linkedList.size()) {
                    break;
                }
                jSONArray.put(G((bw5.mr0) linkedList.get(i18)));
                i18++;
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("files", jSONArray);
            }
            this.f224975e.f(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestPreviewFileInfo", "preview archive response json exception: %s", e17.toString());
            this.f224975e.b("preview archive response json exception");
        }
    }

    public final void E(bw5.bi0 bi0Var) {
        boolean[] zArr = bi0Var.f107224s;
        boolean z17 = zArr[2];
        bw5.io0 io0Var = bw5.io0.PREVIEW_RUNNING;
        bw5.io0 io0Var2 = z17 ? bi0Var.f107213e : io0Var;
        boolean[] zArr2 = bi0Var.f107224s;
        if (io0Var2 == bw5.io0.PREVIEW_ERROR) {
            this.f224975e.b("download error");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.f225259h) {
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                jd.c cVar = this.f224975e;
                java.lang.String str = cVar.f380558b;
                long j17 = cVar.f380557a;
                java.lang.String str2 = this.f225258g;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
                jSONObject.put(dm.i4.f66867x2a5c95c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65291x71b41ca8(j17, str, str2));
                jSONObject.put("cache", false);
                this.f224975e.f(jSONObject, false);
                return;
            }
            jSONObject.put("imgWidth", bi0Var.f107217i);
            jSONObject.put("imgHeight", bi0Var.f107218m);
            boolean z18 = zArr2[5];
            bw5.vi0 vi0Var = bw5.vi0.PAGES;
            jSONObject.put("type", (z18 ? bi0Var.f107216h : vi0Var).f115909d);
            if (zArr2[2]) {
                io0Var = bi0Var.f107213e;
            }
            jSONObject.put("status", io0Var.f110190d);
            jSONObject.put("limitReason", (zArr[4] ? bi0Var.f107215g : bw5.f30.PREVIEW_NONE).f108674d);
            jSONObject.put("version", zArr[12] ? bi0Var.f107223r : "");
            boolean z19 = zArr2[5];
            if ((z19 ? bi0Var.f107216h : vi0Var) == vi0Var) {
                jSONObject.put("pages", B(bi0Var));
            } else {
                if (z19) {
                    vi0Var = bi0Var.f107216h;
                }
                if (vi0Var != bw5.vi0.SHEETS) {
                    return;
                } else {
                    jSONObject.put("sheets", C(bi0Var));
                }
            }
            this.f224975e.f(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestPreviewFileInfo", "preview response json exception: %s", e17.toString());
            this.f224975e.b("preview response json exception");
        }
    }

    public final void F() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.f225259h) {
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                jd.c cVar = this.f224975e;
                java.lang.String str = cVar.f380558b;
                long j17 = cVar.f380557a;
                java.lang.String str2 = this.f225258g;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
                jSONObject.put(dm.i4.f66867x2a5c95c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65291x71b41ca8(j17, str, str2));
                jSONObject.put("cache", false);
                this.f224975e.f(jSONObject, false);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestPreviewFileInfo", "preview image response json exception: %s", e17.toString());
            this.f224975e.b("preview image response json exception");
        }
    }

    public org.json.JSONObject G(bw5.mr0 mr0Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, mr0Var.f111907o[1] ? mr0Var.f111899d : "");
        boolean[] zArr = mr0Var.f111907o;
        jSONObject.put("type", (zArr[2] ? mr0Var.f111900e : bw5.nr0.FILE).f112336d);
        jSONObject.put("size", mr0Var.f111901f);
        jSONObject.put("mtime", mr0Var.f111902g);
        boolean z17 = zArr[5];
        bw5.f30 f30Var = bw5.f30.PREVIEW_NONE;
        jSONObject.put("limitReason", (z17 ? mr0Var.f111903h : f30Var).f108674d);
        if (zArr[5]) {
            f30Var = mr0Var.f111903h;
        }
        jSONObject.put("limitReason", f30Var.f108674d);
        jSONObject.put("fileId", zArr[7] ? mr0Var.f111905m : "");
        byte[] g17 = (zArr[8] ? mr0Var.f111906n : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).g();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (byte b17 : g17) {
            sb6.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b17)));
        }
        jSONObject.put("md5", sb6.toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        while (true) {
            java.util.LinkedList linkedList = mr0Var.f111904i;
            if (i17 >= linkedList.size()) {
                break;
            }
            jSONArray.put(G((bw5.mr0) linkedList.get(i17)));
            i17++;
        }
        if (jSONArray.length() > 0) {
            jSONObject.put("files", jSONArray);
        }
        return jSONObject;
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean z18;
        java.lang.String optString = jSONObject.optString("fileId");
        java.lang.String optString2 = jSONObject.optString("aesKey");
        java.lang.String optString3 = jSONObject.optString("fileExt");
        long optLong = jSONObject.optLong("fileSize", 0L);
        java.lang.String optString4 = jSONObject.optString("subType");
        java.lang.String optString5 = jSONObject.optString("version");
        java.lang.String optString6 = jSONObject.optString("password");
        int optInt = jSONObject.optInt("previewType", 0);
        this.f225260i = optInt != 0 ? optInt != 1 ? optInt != 2 ? optInt != 3 ? null : bw5.fi0.ARCHIVE : bw5.fi0.VIDEO : bw5.fi0.IMAGE : bw5.fi0.DOCUMENT;
        if (optString.isEmpty() || optString2.isEmpty() || optString3.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestPreviewFileInfo", "requestPreviewFileInfo failed. invalid params. %s", jSONObject.toString());
            this.f224975e.b("invalid params");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RequestPreviewFileInfo", "invoke %s fileId: %s, aesKey: %s, subType: %s", this.f380556d, optString, optString2, optString4);
        this.f225258g = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.g() + uk.k.d(java.lang.String.format("%s_%s_%s", optString, optString4, optString5).getBytes());
        if (optString4.isEmpty()) {
            z18 = false;
        } else {
            this.f225259h = true;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f225258g);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                    jd.c cVar = this.f224975e;
                    java.lang.String str3 = cVar.f380558b;
                    long j17 = cVar.f380557a;
                    java.lang.String str4 = this.f225258g;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
                    jSONObject2.put(dm.i4.f66867x2a5c95c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65291x71b41ca8(j17, str3, str4));
                    jSONObject2.put("cache", true);
                    this.f224975e.f(jSONObject2, false);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestPreviewFileInfo", "preview response json exception: %s", e17.toString());
                    this.f224975e.b("preview response json exception");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RequestPreviewFileInfo", "file already exists.");
                return;
            }
            z18 = false;
        }
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_DownloadPreviewImage";
        mVar.f69580x454032b6 = 8;
        if (optLong / 1048576 > 25) {
            z18 = true;
        }
        mVar.f69592xf1ebe47b = z18 ? 7 : 5;
        mVar.f323322h = 8;
        mVar.f69591xf9dbbe9c = optString;
        mVar.f69601xaca5bdda = java.lang.String.format("preview_%d_%d", java.lang.Long.valueOf(this.f224975e.f380561e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        mVar.f69575xf11df5f5 = optString2;
        mVar.f69595x6d25b0d9 = this.f225258g;
        mVar.f323342y0 = 20;
        bw5.ei0 ei0Var = new bw5.ei0();
        ei0Var.f108458d = optString3;
        boolean[] zArr = ei0Var.f108463i;
        zArr[1] = true;
        ei0Var.f108459e = optString4;
        zArr[2] = true;
        ei0Var.f108460f = optString5;
        zArr[3] = true;
        ei0Var.f108461g = optString6;
        zArr[4] = true;
        ei0Var.f108462h = this.f225260i;
        zArr[5] = true;
        try {
            mVar.P = ei0Var.mo14344x5f01b1f6();
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RequestPreviewFileInfo", "buildRequestTask failed. %s", e18.getMessage());
        }
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(this.f225261m));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
