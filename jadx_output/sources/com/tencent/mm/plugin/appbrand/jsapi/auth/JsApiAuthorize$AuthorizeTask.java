package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiAuthorize$AuthorizeTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.auth.b1();
    public boolean A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public android.os.Bundle F;
    public java.lang.String G;
    public com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f79329J;
    public int K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public boolean Q;

    /* renamed from: f, reason: collision with root package name */
    public transient com.tencent.mm.plugin.appbrand.jsapi.auth.n0 f79330f;

    /* renamed from: g, reason: collision with root package name */
    public transient com.tencent.mm.plugin.appbrand.y f79331g;

    /* renamed from: h, reason: collision with root package name */
    public transient com.tencent.mm.plugin.appbrand.jsapi.auth.o f79332h;

    /* renamed from: i, reason: collision with root package name */
    public int f79333i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f79334m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f79335n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f79336o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f79337p;

    /* renamed from: q, reason: collision with root package name */
    public r45.me7 f79338q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f79339r;

    /* renamed from: s, reason: collision with root package name */
    public int f79340s;

    /* renamed from: t, reason: collision with root package name */
    public int f79341t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f79342u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f79343v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f79344w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f79345x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f79346y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f79347z;
    public com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo P = com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo.f79479f;
    public boolean R = false;

    public JsApiAuthorize$AuthorizeTask() {
    }

    public static void B(com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask, int i17, java.util.ArrayList arrayList, boolean z17) {
        jsApiAuthorize$AuthorizeTask.f79336o = "authorizeConfirm";
        jsApiAuthorize$AuthorizeTask.f79335n = arrayList;
        jsApiAuthorize$AuthorizeTask.f79341t = i17;
        jsApiAuthorize$AuthorizeTask.f79342u = z17;
        jsApiAuthorize$AuthorizeTask.d();
        if (i17 == 2) {
            jsApiAuthorize$AuthorizeTask.f79330f.F(jsApiAuthorize$AuthorizeTask.f79331g, jsApiAuthorize$AuthorizeTask.f79333i, "fail auth deny", jsApiAuthorize$AuthorizeTask.D());
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.s0) jsApiAuthorize$AuthorizeTask.f79332h).a();
        }
    }

    public final void C(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.f79330f.F(this.f79331g, this.f79333i, "fail auth cancel", D());
        } else {
            this.f79330f.F(this.f79331g, this.f79333i, str, D());
        }
        ((com.tencent.mm.plugin.appbrand.jsapi.auth.s0) this.f79332h).a();
    }

    public final org.json.JSONObject D() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("showedModal", this.R ? 1 : 0);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79334m = parcel.readString();
        this.f79333i = parcel.readInt();
        this.f79337p = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f79338q = new r45.me7();
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            try {
                this.f79338q.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "AuthorizeTask parse wxaPluginAppInfo get exception:%s", e17);
                this.f79338q = null;
            }
        } else {
            this.f79338q = null;
        }
        this.f79339r = parcel.readString();
        this.f79336o = parcel.readString();
        this.f79343v = parcel.readString();
        this.f79344w = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readBundle(com.tencent.mm.plugin.appbrand.jsapi.auth.r0.class.getClassLoader());
        this.f79335n = parcel.createStringArrayList();
        this.f79340s = parcel.readInt();
        this.f79341t = parcel.readInt();
        this.I = parcel.readInt();
        this.f79329J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readString();
        this.f79347z = parcel.readString();
        this.f79346y = parcel.readString();
        this.f79345x = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.A = parcel.readInt() == 1;
        this.B = parcel.readString();
        this.G = parcel.readString();
        this.H = (com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo.class.getClassLoader());
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.P = (com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo.class.getClassLoader());
        this.f79342u = parcel.readInt() == 1;
        this.Q = parcel.readInt() == 1;
        this.R = parcel.readInt() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr;
        parcel.writeString(this.f79334m);
        parcel.writeInt(this.f79333i);
        parcel.writeString(this.f79337p);
        r45.me7 me7Var = this.f79338q;
        if (me7Var != null) {
            try {
                bArr = me7Var.toByteArray();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "AuthorizeTask writeToParcel wxaPluginAppInfo.toByteArray get exception:%s", e17);
                bArr = new byte[0];
            }
            parcel.writeInt(bArr.length);
            if (bArr.length > 0) {
                parcel.writeByteArray(bArr);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f79339r);
        parcel.writeString(this.f79336o);
        parcel.writeString(this.f79343v);
        parcel.writeString(this.f79344w);
        parcel.writeInt(this.E);
        parcel.writeBundle(this.F);
        parcel.writeStringList(this.f79335n);
        parcel.writeInt(this.f79340s);
        parcel.writeInt(this.f79341t);
        parcel.writeInt(this.I);
        parcel.writeInt(this.f79329J);
        parcel.writeInt(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.f79347z);
        parcel.writeString(this.f79346y);
        parcel.writeString(this.f79345x);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeString(this.B);
        parcel.writeString(this.G);
        parcel.writeParcelable(this.H, i17);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeParcelable(this.P, i17);
        parcel.writeInt(this.f79342u ? 1 : 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        if (!this.f79331g.isRunning()) {
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.s0) this.f79332h).a();
            return;
        }
        if (this.f79339r.equals("ok")) {
            if (this.M == null || com.tencent.mm.sdk.platformtools.t8.K0(this.N) || this.M.equals(this.N)) {
                this.f79330f.F(this.f79331g, this.f79333i, "ok", D());
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "targetScope:%s, selectScope:%s", this.M, this.N);
                this.f79330f.F(this.f79331g, this.f79333i, "fail auth deny", D());
            }
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.s0) this.f79332h).a();
            return;
        }
        if (this.f79339r.equals("fail")) {
            this.f79330f.F(this.f79331g, this.f79333i, com.tencent.mm.sdk.platformtools.t8.K0(this.L) ? java.lang.String.format("fail:login error %s", java.lang.Integer.valueOf(this.K)) : java.lang.String.format("fail:%s", this.L), D());
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.s0) this.f79332h).a();
            return;
        }
        if (this.f79339r.equals("risk_intercepted")) {
            if (this.H != null) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.jsapi.auth.x0(this));
            }
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.s0) this.f79332h).a();
            return;
        }
        if (this.f79339r.equals("needConfirm")) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < this.E; i17++) {
                byte[] byteArray = this.F.getByteArray(i17 + "");
                r45.jv5 jv5Var = new r45.jv5();
                try {
                    jv5Var.parseFrom(byteArray);
                    linkedList.add(jv5Var);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "IOException %s", e17.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiAuthorize", e17, "", new java.lang.Object[0]);
                    this.f79330f.F(this.f79331g, this.f79333i, "fail:internal error scope error", D());
                    ((com.tencent.mm.plugin.appbrand.jsapi.auth.s0) this.f79332h).a();
                    return;
                }
            }
            if (linkedList.size() > 0) {
                this.f79331g.m(new com.tencent.mm.plugin.appbrand.jsapi.auth.y0(this, linkedList));
            } else {
                this.f79330f.F(this.f79331g, this.f79333i, "fail:internal error scope empty", D());
                ((com.tencent.mm.plugin.appbrand.jsapi.auth.s0) this.f79332h).a();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.util.LinkedList linkedList;
        final com.tencent.mm.plugin.appbrand.jsapi.auth.v0 v0Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.v0(this);
        if (!this.f79336o.equals(com.tencent.mm.plugin.appbrand.jsapi.auth.o1.NAME)) {
            if (this.f79336o.equals("authorizeConfirm")) {
                java.lang.String str = this.f79337p;
                java.util.ArrayList arrayList = this.f79335n;
                int i17 = this.f79340s;
                final int i18 = this.f79341t;
                boolean z17 = this.f79342u;
                k80.e eVar = (k80.e) i95.n0.c(k80.e.class);
                if (arrayList == null) {
                    linkedList = null;
                } else {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList2.addAll(arrayList);
                    linkedList = linkedList2;
                }
                int i19 = this.I;
                k80.h hVar = new k80.h() { // from class: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask$$a
                    @Override // k80.h
                    public final void a(int i27, int i28, java.lang.String str2, k80.i iVar) {
                        com.tencent.mm.plugin.appbrand.jsapi.auth.d1 d1Var = com.tencent.mm.plugin.appbrand.jsapi.auth.d1.this;
                        if (i27 != 0 || i28 != 0) {
                            ((com.tencent.mm.plugin.appbrand.jsapi.auth.v0) d1Var).a(-1, "confirm cgi fail");
                            return;
                        }
                        if (iVar == null || i18 == 2) {
                            return;
                        }
                        r45.f24 f24Var = (r45.f24) ((bl0.b) iVar).f21679d.f70711b.f70700a;
                        r45.j14 j14Var = f24Var.f373941d;
                        int i29 = j14Var.f377491d;
                        java.lang.String str3 = j14Var.f377492e;
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "stev NetSceneJSAuthorizeConfirm jsErrcode %d", java.lang.Integer.valueOf(i29));
                        if (i29 != 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "onSceneEnd NetSceneJSAuthorizeConfirm ERROR %s", str3);
                            ((com.tencent.mm.plugin.appbrand.jsapi.auth.v0) d1Var).a(i29, str3);
                            return;
                        }
                        java.util.LinkedList linkedList3 = f24Var.f373942e;
                        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo mMAuthScopeRiskInfo = linkedList3 != null && linkedList3.size() > 0 && ((r45.lv5) linkedList3.get(0)).f379859e != null ? new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo(((r45.lv5) linkedList3.get(0)).f379859e) : null;
                        if (mMAuthScopeRiskInfo == null) {
                            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask = ((com.tencent.mm.plugin.appbrand.jsapi.auth.v0) d1Var).f79758a;
                            jsApiAuthorize$AuthorizeTask.f79339r = "ok";
                            jsApiAuthorize$AuthorizeTask.c();
                        } else {
                            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask2 = ((com.tencent.mm.plugin.appbrand.jsapi.auth.v0) d1Var).f79758a;
                            jsApiAuthorize$AuthorizeTask2.f79339r = "risk_intercepted";
                            jsApiAuthorize$AuthorizeTask2.H = mMAuthScopeRiskInfo;
                            jsApiAuthorize$AuthorizeTask2.c();
                        }
                    }
                };
                ((j80.e) eVar).getClass();
                bl0.b bVar = new bl0.b(str, linkedList, i17, i18, i19, hVar);
                com.tencent.mm.modelbase.o oVar = bVar.f21679d;
                if ((oVar == null ? null : (r45.e24) oVar.f70710a.f70684a).f372928h == null) {
                    (oVar == null ? null : (r45.e24) oVar.f70710a.f70684a).f372928h = new r45.nd7();
                }
                (oVar != null ? (r45.e24) oVar.f70710a.f70684a : null).f372928h.f381297f = this.f79329J;
                r45.e24 e24Var = (r45.e24) oVar.f70710a.f70684a;
                if (e24Var != null) {
                    e24Var.f372929i = z17;
                }
                gm0.j1.d().g(bVar);
                return;
            }
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(new org.json.JSONObject(this.f79334m).optString("scope"));
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            for (int i27 = 0; i27 < jSONArray.length(); i27++) {
                linkedList3.add(jSONArray.optString(i27));
            }
            if (linkedList3.size() > 0) {
                this.M = (java.lang.String) linkedList3.get(0);
            }
            java.lang.String str2 = this.f79337p;
            r45.me7 me7Var = this.f79338q;
            int i28 = this.f79340s;
            boolean z18 = this.Q;
            k80.e eVar2 = (k80.e) i95.n0.c(k80.e.class);
            int i29 = this.I;
            com.tencent.mm.plugin.appbrand.jsapi.auth.c1 c1Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.c1(this, v0Var);
            ((j80.e) eVar2).getClass();
            bl0.a aVar = new bl0.a(str2, me7Var, linkedList3, i28, i29, z18, c1Var);
            com.tencent.mm.modelbase.o oVar2 = aVar.f21676d;
            if ((oVar2 == null ? null : (r45.g24) oVar2.f70710a.f70684a).f374837g == null) {
                (oVar2 == null ? null : (r45.g24) oVar2.f70710a.f70684a).f374837g = new r45.nd7();
            }
            (oVar2 != null ? (r45.g24) oVar2.f70710a.f70684a : null).f374837g.f381297f = this.f79329J;
            gm0.j1.d().g(aVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "Exception %s", e17.getMessage());
            this.f79339r = "fail";
            c();
        }
    }

    public JsApiAuthorize$AuthorizeTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
