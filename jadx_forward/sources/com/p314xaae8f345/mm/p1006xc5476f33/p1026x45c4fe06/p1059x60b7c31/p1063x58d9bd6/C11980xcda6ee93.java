package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer */
/* loaded from: classes11.dex */
public class C11980xcda6ee93 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93> f33764x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d1();

    /* renamed from: f, reason: collision with root package name */
    public c01.l2 f160571f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f160572g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160573h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160574i;

    /* renamed from: m, reason: collision with root package name */
    public final int f160575m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160576n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160577o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160579q;

    /* renamed from: r, reason: collision with root package name */
    public int f160580r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160581s;

    /* renamed from: p, reason: collision with root package name */
    public boolean f160578p = false;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f160582t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer$OperateMusicPlayer.6
        {
            this.f39173x3fe91575 = -1155728636;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f42 = c5722xb16ab0f4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "callback in(action : %s)", java.lang.Integer.valueOf(c5722xb16ab0f42.f136045g.f88569b));
            am.jk jkVar = c5722xb16ab0f42.f136045g;
            b21.r rVar = jkVar.f88570c;
            if (rVar == null) {
                return false;
            }
            java.lang.String str = rVar.f98885n;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("dataUrl", str);
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93 c11980xcda6ee93 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11980xcda6ee93.this;
            c11980xcda6ee93.f160579q = jSONObject;
            c11980xcda6ee93.f160580r = jkVar.f88569b;
            c11980xcda6ee93.c();
            return false;
        }
    };

    public C11980xcda6ee93(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f160573h = k0Var;
        this.f160574i = e9Var;
        this.f160575m = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160576n = parcel.readString();
        this.f160577o = parcel.readString();
        this.f160578p = parcel.readByte() != 0;
        this.f160579q = parcel.readString();
        this.f160580r = parcel.readInt();
        this.f160581s = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160576n);
        parcel.writeString(this.f160577o);
        parcel.writeByte(this.f160578p ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f160579q);
        parcel.writeInt(this.f160580r);
        parcel.writeString(this.f160581s);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "runInClientProcess(action : %s)", java.lang.Integer.valueOf(this.f160580r));
        if (this.f160578p) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail");
            if (android.text.TextUtils.isEmpty(this.f160581s)) {
                str2 = "";
            } else {
                str2 = ":" + this.f160581s;
            }
            sb6.append(str2);
            str = sb6.toString();
        } else {
            str = "ok";
        }
        java.lang.String o17 = this.f160573h.o(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160574i;
        e9Var.a(this.f160575m, o17);
        int i17 = this.f160580r;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPlay in");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.x0(null);
            x0Var.u(e9Var);
            x0Var.f163907f = this.f160579q;
            x0Var.m();
            this.f160571f.i("Music#isPlaying", java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(e9Var.mo48798x74292566(), this.f160572g);
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicResume in");
            this.f160571f.i("Music#isPlaying", java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(e9Var.mo48798x74292566(), this.f160572g);
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicStop in");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.v0(null);
            v0Var.u(e9Var);
            v0Var.f163907f = this.f160579q;
            v0Var.m();
        } else {
            if (i17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPause in");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.w0 w0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.w0(null);
                w0Var.u(e9Var);
                w0Var.f163907f = this.f160579q;
                w0Var.m();
                this.f160571f.i("Music#isPlaying", java.lang.Boolean.FALSE);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(e9Var.mo48798x74292566(), this.f160572g);
                return;
            }
            if (i17 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicError in");
                e9Var.g("onMusicError", this.f160579q);
                this.f160571f.i("Music#isPlaying", java.lang.Boolean.FALSE);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(e9Var.mo48798x74292566(), this.f160572g);
                return;
            }
            if (i17 != 7) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicEnd in");
        this.f160571f.i("Music#isPlaying", java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(e9Var.mo48798x74292566(), this.f160572g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f160576n);
            java.lang.String optString = jSONObject.optString("operationType");
            java.lang.String optString2 = jSONObject.optString("dataUrl");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                this.f160580r = -1;
                this.f160578p = true;
                this.f160581s = "operationType is null or nil";
                c();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a;
            if (!hVar.b(this.f160577o, optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "appid not match cannot operate");
                this.f160580r = -1;
                this.f160578p = true;
                this.f160581s = "appid not match cannot operate";
                c();
                return;
            }
            if (b21.m.d() && !b21.m.c() && optString.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
                b21.r b17 = b21.m.b();
                if (b17 == null || !(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) || optString2.equals(b17.f98885n))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "data url has changed ,restart play");
                } else if (hVar.b(this.f160577o, "resume")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "same appid %s, change play to resume", this.f160577o);
                    optString = "resume";
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "not same not same appid ,restart play");
                }
            }
            if (optString.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
                java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                java.lang.String optString4 = jSONObject.optString("singer");
                java.lang.String optString5 = jSONObject.optString("epname");
                java.lang.String optString6 = jSONObject.optString("coverImgUrl");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                    this.f160580r = -1;
                    this.f160578p = true;
                    this.f160581s = "dataUrl is null or nil";
                    c();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "title : %s, singer : %s, epName : %s, coverImgUrl : %s, dataUrl : %s, lowbandUrl : %s, webUrl : %s", optString3, optString4, optString5, optString6, optString2, optString2, optString2);
                b21.m.j();
                java.lang.String str = hVar.f167294a;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", str, this.f160577o);
                    hVar.d(str);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.y0(this, optString2, optString6, optString3, optString4, optString2, optString2, optString5), 500L);
                return;
            }
            if (optString.equalsIgnoreCase("resume")) {
                java.lang.String str2 = hVar.f167294a;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", str2, this.f160577o);
                    hVar.d(str2);
                }
                hVar.a(this.f160582t, this.f160577o);
                hVar.f167294a = this.f160577o;
                b21.r b18 = b21.m.b();
                if (b18 != null) {
                    hVar.f167295b = b18.f98879e;
                }
                if (b21.n.c()) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.z0(this), 500L);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "resume fail");
                this.f160580r = -1;
                this.f160578p = true;
                this.f160581s = "resume play fail";
                c();
                return;
            }
            if (optString.equalsIgnoreCase("pause")) {
                if (b21.n.b()) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a1(this), 500L);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "pause fail");
                this.f160580r = -1;
                this.f160578p = true;
                this.f160581s = "pause play fail";
                c();
                return;
            }
            if (optString.equalsIgnoreCase("seek")) {
                if (b21.m.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f1(jSONObject.optString("position")), -1) * 1000)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b1(this), 500L);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "seek fail");
                this.f160580r = -1;
                this.f160578p = true;
                this.f160581s = "seek fail";
                c();
                return;
            }
            if (!optString.equalsIgnoreCase("stop")) {
                this.f160580r = -1;
                this.f160578p = true;
                c();
            } else {
                if (b21.n.d()) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c1(this), 500L);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateMusicPlayer", "stop fail");
                this.f160580r = -1;
                this.f160578p = false;
                this.f160581s = "stop play fail";
                c();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOperateMusicPlayer", e17.toString());
            this.f160580r = -1;
            this.f160578p = true;
            this.f160581s = "data is null";
            c();
        }
    }

    public C11980xcda6ee93(android.os.Parcel parcel) {
        v(parcel);
    }
}
