package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask */
/* loaded from: classes7.dex */
public class C11986x4eded589 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589> f33767x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589.a();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f160595f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160596g;

    /* renamed from: h, reason: collision with root package name */
    public int f160597h;

    /* renamed from: i, reason: collision with root package name */
    public int f160598i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160599m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160600n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160601o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160602p;

    /* renamed from: q, reason: collision with root package name */
    public int f160603q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f160604r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f160605s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f160606t = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask$MainProcessMusicPlayerEventListener */
    /* loaded from: classes7.dex */
    public final class MainProcessMusicPlayerEventListener extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4> {
        public MainProcessMusicPlayerEventListener() {
            super(com.p314xaae8f345.mm.app.a0.f134821d);
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "musicPlayerListener callback action : %d", java.lang.Integer.valueOf(c5722xb16ab0f4.f136045g.f88569b));
            java.util.HashMap hashMap = new java.util.HashMap();
            am.jk jkVar = c5722xb16ab0f4.f136045g;
            java.lang.String str = jkVar.f88573f;
            int i17 = jkVar.f88569b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589 c11986x4eded589 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589.this;
            if (i17 == 10) {
                java.lang.String str2 = jkVar.f88577j;
                if (str2.equals(c11986x4eded589.f160601o)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "appId is same, don't send ON_PREEMPTED event");
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "send ON_PREEMPTED event, sender appId:%s,  receive appId:%s", str2, c11986x4eded589.f160601o);
                hashMap.put("state", str);
                c11986x4eded589.f160602p = new org.json.JSONObject(hashMap).toString();
                c11986x4eded589.f160603q = jkVar.f88569b;
                c11986x4eded589.c();
                return true;
            }
            b21.r rVar = jkVar.f88570c;
            if (rVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.SetBackgroundAudioListenerTask", "wrapper is null");
                return false;
            }
            if (!jkVar.f88574g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.SetBackgroundAudioListenerTask", "is not from QQMusicPlayer, don't callback!");
                return false;
            }
            if (i17 == 2 && jkVar.f88576i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.SetBackgroundAudioListenerTask", "isSwitchMusicIng, don't callback!");
                return false;
            }
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a.f167294a;
            if (!c11986x4eded589.f160601o.equals(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "appId is not equals preAppId, don't send any event, appId:%s, preAppId:%s", c11986x4eded589.f160601o, str3);
                return false;
            }
            hashMap.put("src", rVar.f98885n);
            hashMap.put("state", str);
            hashMap.put("errCode", java.lang.Integer.valueOf(jkVar.f88578k));
            hashMap.put("errMsg", !android.text.TextUtils.isEmpty(jkVar.f88579l) ? jkVar.f88579l : "");
            c11986x4eded589.f160602p = new org.json.JSONObject(hashMap).toString();
            c11986x4eded589.f160603q = jkVar.f88569b;
            c11986x4eded589.c();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask$a */
    /* loaded from: classes7.dex */
    public class a implements android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589[] newArray(int i17) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589[i17];
        }
    }

    public C11986x4eded589(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f160596g = lVar;
        this.f160597h = i17;
    }

    public void E(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160601o = parcel.readString();
        this.f160602p = parcel.readString();
        this.f160603q = parcel.readInt();
        this.f160598i = parcel.readInt();
        this.f160599m = parcel.readString();
        this.f160600n = parcel.readString();
        this.f160604r = parcel.readInt() == 1;
        this.f160605s = parcel.readInt();
        this.f160606t = parcel.readByte() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160601o);
        parcel.writeString(this.f160602p);
        parcel.writeInt(this.f160603q);
        parcel.writeInt(this.f160598i);
        parcel.writeString(this.f160599m);
        parcel.writeString(this.f160600n);
        parcel.writeInt(this.f160604r ? 1 : 0);
        parcel.writeInt(this.f160605s);
        parcel.writeByte(this.f160606t ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        if (this.f160596g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.SetBackgroundAudioListenerTask", "service is null, don't callback");
            return;
        }
        E(this.f160603q);
        int i17 = this.f160603q;
        boolean z17 = true;
        if (i17 == 0 || i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(this.f160601o, this.f160595f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.d.f167290c.f167292b = this.f160601o;
        } else if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(this.f160601o, this.f160595f);
        } else {
            if (i17 == 13) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160596g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.m0.f160782i;
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.m0.class) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onBackgroundAudioPrev");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.m0 m0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.m0.f160782i;
                    m0Var2.p(lVar);
                    m0Var2.m();
                }
                return;
            }
            if (i17 == 14) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = this.f160596g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l0 l0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l0.f160781i;
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l0.class) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onBackgroundAudioNext");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l0 l0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.l0.f160781i;
                    l0Var2.p(lVar2);
                    l0Var2.m();
                }
                return;
            }
        }
        int i18 = this.f160603q;
        if (1 == i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.d.f167290c.b(i18);
        } else {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "runInClientProcess callback action:%d, retJson:%s", java.lang.Integer.valueOf(this.f160603q), this.f160602p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.n0();
        n0Var.p(this.f160596g);
        n0Var.r(this.f160602p);
        n0Var.m();
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.d.f167290c.b(this.f160603q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "runInMainProcess");
        if (this.f160606t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a;
            java.lang.String str = this.f160601o;
            int i17 = this.f160605s;
            java.util.HashMap hashMap = hVar.f167302i;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) hashMap.get(str);
            if (abstractC20980x9b9ad01d == null || i17 != abstractC20980x9b9ad01d.hashCode()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMusicPlayerManager", "remove listener for appid: %s, hash: %d", str, java.lang.Integer.valueOf(i17));
            hashMap.remove(str);
            abstractC20980x9b9ad01d.mo48814x2efc64();
            return;
        }
        if (this.f160604r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "send Preempted Event");
            this.f160604r = false;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
            am.jk jkVar = c5722xb16ab0f4.f136045g;
            jkVar.f88569b = 10;
            jkVar.f88573f = "preempted";
            jkVar.f88577j = this.f160601o;
            jkVar.f88574g = true;
            c5722xb16ab0f4.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.h hVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a;
        java.lang.String str2 = hVar2.f167294a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "remove listener preAppid is %s, appid is %s", str2, this.f160601o);
            hVar2.d(str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589.MainProcessMusicPlayerEventListener mainProcessMusicPlayerEventListener = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11986x4eded589.MainProcessMusicPlayerEventListener();
        this.f160605s = mainProcessMusicPlayerEventListener.hashCode();
        hVar2.a(mainProcessMusicPlayerEventListener, this.f160601o);
        java.lang.String str3 = this.f160601o;
        int i18 = this.f160598i;
        java.lang.String str4 = this.f160599m;
        java.lang.String str5 = this.f160600n;
        hVar2.f167294a = str3;
        hVar2.f167299f = i18;
        hVar2.f167300g = str4;
        hVar2.f167301h = str5;
    }

    public C11986x4eded589(android.os.Parcel parcel) {
        v(parcel);
    }
}
