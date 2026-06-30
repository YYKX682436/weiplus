package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask */
/* loaded from: classes7.dex */
public class C11999x85898042 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042> f33843x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.b1();
    public boolean A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public android.os.Bundle F;
    public java.lang.String G;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12005x7bdc009 H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f160862J;
    public int K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public boolean Q;

    /* renamed from: f, reason: collision with root package name */
    public transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 f160863f;

    /* renamed from: g, reason: collision with root package name */
    public transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f160864g;

    /* renamed from: h, reason: collision with root package name */
    public transient com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o f160865h;

    /* renamed from: i, reason: collision with root package name */
    public int f160866i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160867m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f160868n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160869o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160870p;

    /* renamed from: q, reason: collision with root package name */
    public r45.me7 f160871q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160872r;

    /* renamed from: s, reason: collision with root package name */
    public int f160873s;

    /* renamed from: t, reason: collision with root package name */
    public int f160874t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f160875u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f160876v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f160877w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f160878x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f160879y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f160880z;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860 P = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860.f161012f;
    public boolean R = false;

    public C11999x85898042() {
    }

    public static void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x85898042, int i17, java.util.ArrayList arrayList, boolean z17) {
        c11999x85898042.f160869o = "authorizeConfirm";
        c11999x85898042.f160868n = arrayList;
        c11999x85898042.f160874t = i17;
        c11999x85898042.f160875u = z17;
        c11999x85898042.d();
        if (i17 == 2) {
            c11999x85898042.f160863f.F(c11999x85898042.f160864g, c11999x85898042.f160866i, "fail auth deny", c11999x85898042.D());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s0) c11999x85898042.f160865h).a();
        }
    }

    public final void C(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.f160863f.F(this.f160864g, this.f160866i, "fail auth cancel", D());
        } else {
            this.f160863f.F(this.f160864g, this.f160866i, str, D());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s0) this.f160865h).a();
    }

    public final org.json.JSONObject D() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("showedModal", this.R ? 1 : 0);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160867m = parcel.readString();
        this.f160866i = parcel.readInt();
        this.f160870p = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f160871q = new r45.me7();
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            try {
                this.f160871q.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAuthorize", "AuthorizeTask parse wxaPluginAppInfo get exception:%s", e17);
                this.f160871q = null;
            }
        } else {
            this.f160871q = null;
        }
        this.f160872r = parcel.readString();
        this.f160869o = parcel.readString();
        this.f160876v = parcel.readString();
        this.f160877w = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readBundle(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r0.class.getClassLoader());
        this.f160868n = parcel.createStringArrayList();
        this.f160873s = parcel.readInt();
        this.f160874t = parcel.readInt();
        this.I = parcel.readInt();
        this.f160862J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readString();
        this.f160880z = parcel.readString();
        this.f160879y = parcel.readString();
        this.f160878x = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.A = parcel.readInt() == 1;
        this.B = parcel.readString();
        this.G = parcel.readString();
        this.H = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12005x7bdc009) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12005x7bdc009.class.getClassLoader());
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.P = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860.class.getClassLoader());
        this.f160875u = parcel.readInt() == 1;
        this.Q = parcel.readInt() == 1;
        this.R = parcel.readInt() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        byte[] bArr;
        parcel.writeString(this.f160867m);
        parcel.writeInt(this.f160866i);
        parcel.writeString(this.f160870p);
        r45.me7 me7Var = this.f160871q;
        if (me7Var != null) {
            try {
                bArr = me7Var.mo14344x5f01b1f6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAuthorize", "AuthorizeTask writeToParcel wxaPluginAppInfo.toByteArray get exception:%s", e17);
                bArr = new byte[0];
            }
            parcel.writeInt(bArr.length);
            if (bArr.length > 0) {
                parcel.writeByteArray(bArr);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f160872r);
        parcel.writeString(this.f160869o);
        parcel.writeString(this.f160876v);
        parcel.writeString(this.f160877w);
        parcel.writeInt(this.E);
        parcel.writeBundle(this.F);
        parcel.writeStringList(this.f160868n);
        parcel.writeInt(this.f160873s);
        parcel.writeInt(this.f160874t);
        parcel.writeInt(this.I);
        parcel.writeInt(this.f160862J);
        parcel.writeInt(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.f160880z);
        parcel.writeString(this.f160879y);
        parcel.writeString(this.f160878x);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeString(this.B);
        parcel.writeString(this.G);
        parcel.writeParcelable(this.H, i17);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeParcelable(this.P, i17);
        parcel.writeInt(this.f160875u ? 1 : 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeInt(this.R ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        if (!this.f160864g.mo50262x39e05d35()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s0) this.f160865h).a();
            return;
        }
        if (this.f160872r.equals("ok")) {
            if (this.M == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.N) || this.M.equals(this.N)) {
                this.f160863f.F(this.f160864g, this.f160866i, "ok", D());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "targetScope:%s, selectScope:%s", this.M, this.N);
                this.f160863f.F(this.f160864g, this.f160866i, "fail auth deny", D());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s0) this.f160865h).a();
            return;
        }
        if (this.f160872r.equals("fail")) {
            this.f160863f.F(this.f160864g, this.f160866i, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L) ? java.lang.String.format("fail:login error %s", java.lang.Integer.valueOf(this.K)) : java.lang.String.format("fail:%s", this.L), D());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s0) this.f160865h).a();
            return;
        }
        if (this.f160872r.equals("risk_intercepted")) {
            if (this.H != null) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x0(this));
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s0) this.f160865h).a();
            return;
        }
        if (this.f160872r.equals("needConfirm")) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < this.E; i17++) {
                byte[] byteArray = this.F.getByteArray(i17 + "");
                r45.jv5 jv5Var = new r45.jv5();
                try {
                    jv5Var.mo11468x92b714fd(byteArray);
                    linkedList.add(jv5Var);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAuthorize", "IOException %s", e17.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiAuthorize", e17, "", new java.lang.Object[0]);
                    this.f160863f.F(this.f160864g, this.f160866i, "fail:internal error scope error", D());
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s0) this.f160865h).a();
                    return;
                }
            }
            if (linkedList.size() > 0) {
                this.f160864g.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y0(this, linkedList));
            } else {
                this.f160863f.F(this.f160864g, this.f160866i, "fail:internal error scope empty", D());
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s0) this.f160865h).a();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        java.util.LinkedList linkedList;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0(this);
        if (!this.f160869o.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o1.f33860x24728b)) {
            if (this.f160869o.equals("authorizeConfirm")) {
                java.lang.String str = this.f160870p;
                java.util.ArrayList arrayList = this.f160868n;
                int i17 = this.f160873s;
                final int i18 = this.f160874t;
                boolean z17 = this.f160875u;
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
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d1 d1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d1.this;
                        if (i27 != 0 || i28 != 0) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0) d1Var).a(-1, "confirm cgi fail");
                            return;
                        }
                        if (iVar == null || i18 == 2) {
                            return;
                        }
                        r45.f24 f24Var = (r45.f24) ((bl0.b) iVar).f103212d.f152244b.f152233a;
                        r45.j14 j14Var = f24Var.f455474d;
                        int i29 = j14Var.f459024d;
                        java.lang.String str3 = j14Var.f459025e;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "stev NetSceneJSAuthorizeConfirm jsErrcode %d", java.lang.Integer.valueOf(i29));
                        if (i29 != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAuthorize", "onSceneEnd NetSceneJSAuthorizeConfirm ERROR %s", str3);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0) d1Var).a(i29, str3);
                            return;
                        }
                        java.util.LinkedList linkedList3 = f24Var.f455475e;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12005x7bdc009 c12005x7bdc009 = linkedList3 != null && linkedList3.size() > 0 && ((r45.lv5) linkedList3.get(0)).f461392e != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12005x7bdc009(((r45.lv5) linkedList3.get(0)).f461392e) : null;
                        if (c12005x7bdc009 == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x85898042 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0) d1Var).f161291a;
                            c11999x85898042.f160872r = "ok";
                            c11999x85898042.c();
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x858980422 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0) d1Var).f161291a;
                            c11999x858980422.f160872r = "risk_intercepted";
                            c11999x858980422.H = c12005x7bdc009;
                            c11999x858980422.c();
                        }
                    }
                };
                ((j80.e) eVar).getClass();
                bl0.b bVar = new bl0.b(str, linkedList, i17, i18, i19, hVar);
                com.p314xaae8f345.mm.p944x882e457a.o oVar = bVar.f103212d;
                if ((oVar == null ? null : (r45.e24) oVar.f152243a.f152217a).f454461h == null) {
                    (oVar == null ? null : (r45.e24) oVar.f152243a.f152217a).f454461h = new r45.nd7();
                }
                (oVar != null ? (r45.e24) oVar.f152243a.f152217a : null).f454461h.f462830f = this.f160862J;
                r45.e24 e24Var = (r45.e24) oVar.f152243a.f152217a;
                if (e24Var != null) {
                    e24Var.f454462i = z17;
                }
                gm0.j1.d().g(bVar);
                return;
            }
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(new org.json.JSONObject(this.f160867m).optString("scope"));
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            for (int i27 = 0; i27 < jSONArray.length(); i27++) {
                linkedList3.add(jSONArray.optString(i27));
            }
            if (linkedList3.size() > 0) {
                this.M = (java.lang.String) linkedList3.get(0);
            }
            java.lang.String str2 = this.f160870p;
            r45.me7 me7Var = this.f160871q;
            int i28 = this.f160873s;
            boolean z18 = this.Q;
            k80.e eVar2 = (k80.e) i95.n0.c(k80.e.class);
            int i29 = this.I;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c1(this, v0Var);
            ((j80.e) eVar2).getClass();
            bl0.a aVar = new bl0.a(str2, me7Var, linkedList3, i28, i29, z18, c1Var);
            com.p314xaae8f345.mm.p944x882e457a.o oVar2 = aVar.f103209d;
            if ((oVar2 == null ? null : (r45.g24) oVar2.f152243a.f152217a).f456370g == null) {
                (oVar2 == null ? null : (r45.g24) oVar2.f152243a.f152217a).f456370g = new r45.nd7();
            }
            (oVar2 != null ? (r45.g24) oVar2.f152243a.f152217a : null).f456370g.f462830f = this.f160862J;
            gm0.j1.d().g(aVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAuthorize", "Exception %s", e17.getMessage());
            this.f160872r = "fail";
            c();
        }
    }

    public C11999x85898042(android.os.Parcel parcel) {
        v(parcel);
    }
}
