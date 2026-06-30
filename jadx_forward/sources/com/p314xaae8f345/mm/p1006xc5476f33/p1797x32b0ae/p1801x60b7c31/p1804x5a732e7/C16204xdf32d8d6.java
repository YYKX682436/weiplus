package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV */
/* loaded from: classes.dex */
public class C16204xdf32d8d6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static long f225023g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f225024h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f225025i;

    static {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f225024h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV.1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                if (c5675xda3892c3.f136001g.f89350a != 3) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16204xdf32d8d6.f225023g = 0L;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16204xdf32d8d6.f225025i.mo48814x2efc64();
                mo48814x2efc64();
                return false;
            }
        };
        f225025i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV.2
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f42 = c5722xb16ab0f4;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16204xdf32d8d6.f225023g == 0) {
                    return false;
                }
                java.lang.String str = c5722xb16ab0f42.f136045g.f88573f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "backgroundAudioListener callback in, state:%s", str);
                am.jk jkVar = c5722xb16ab0f42.f136045g;
                boolean z17 = jkVar.f88574g;
                int i17 = (int) (jkVar.f88572e / 1000);
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", "is not from QQMusicPlayer, don't callback!");
                    return false;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("state", str);
                    jSONObject.put("duration", i17);
                    b21.r rVar = jkVar.f88570c;
                    if (rVar != null) {
                        jSONObject.put("src", rVar.f98885n);
                        jSONObject.put("srcId", jkVar.f88570c.E);
                    }
                    jSONObject.put("errCode", jkVar.f88578k);
                    jSONObject.put("errMsg", android.text.TextUtils.isEmpty(jkVar.f88579l) ? "" : jkVar.f88579l);
                    b21.r b17 = b21.m.b();
                    if (b17 != null) {
                        java.lang.String wi6 = ((yg0.m4) ((zg0.m3) i95.n0.c(zg0.m3.class))).wi(b17.f98879e);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
                            jSONObject.put("audioId", wi6);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.C16204xdf32d8d6.f225023g, "onBackgroundAudioStateChange", jSONObject);
                    return false;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", e17.getMessage());
                    return false;
                }
            }
        };
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (jSONObject == null) {
            this.f224976f.a("param is null");
            return;
        }
        f225023g = this.f224975e.f380557a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "appUuid: " + f225023g);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = f225025i;
        abstractC20980x9b9ad01d.mo48814x2efc64();
        abstractC20980x9b9ad01d.mo48813x58998cd();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = f225024h;
        abstractC20980x9b9ad01d2.mo48814x2efc64();
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        java.lang.String optString = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            str2 = null;
        } else {
            ((yg0.s3) ((zg0.b3) i95.n0.c(zg0.b3.class))).getClass();
            str2 = xw4.b.c(optString);
        }
        java.lang.String optString2 = jSONObject.optString("src");
        java.lang.String optString3 = jSONObject.optString("lowbandSrc");
        java.lang.String optString4 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString5 = jSONObject.optString("epname");
        java.lang.String optString6 = jSONObject.optString("singer");
        java.lang.String optString7 = jSONObject.optString("coverImgUrl");
        java.lang.String optString8 = jSONObject.optString("webUrl");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("startTime"), 0);
        java.lang.String optString9 = jSONObject.optString("srcId");
        java.lang.String optString10 = jSONObject.optString("protocol");
        java.lang.String optString11 = jSONObject.optString("musicbar_url");
        java.lang.String optString12 = jSONObject.optString("songLyric");
        java.lang.String optString13 = jSONObject.optString("src_username");
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("needStartMusicUI"), 0);
        double d17 = 1.0d;
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("playbackRate"), 1.0d);
        double F2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject.optString("volume"), 1.0d);
        if (F >= 0.5d && F <= 2.0d) {
            d17 = F;
        }
        if (android.text.TextUtils.isEmpty(optString12)) {
            str3 = optString9;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", "songLyric is empty");
            str4 = optString5;
        } else {
            str3 = optString9;
            str4 = optString5;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "songLyric: %s", optString12);
        }
        java.lang.String str5 = optString7 == null ? "" : optString7;
        java.lang.String optString14 = jSONObject.optString("mid");
        java.lang.String optString15 = jSONObject.optString("mvMusicGenre");
        java.lang.String optString16 = jSONObject.optString("mvIdentification");
        java.lang.String str6 = str2;
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(jSONObject.optString("mvIssueDate"), 0L);
        long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(jSONObject.optString("mvDuration"), 0L);
        java.lang.String optString17 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96);
        java.lang.String optString18 = jSONObject.optString("mvObjectId");
        java.lang.String optString19 = jSONObject.optString("mvNonceId");
        java.lang.String optString20 = jSONObject.optString("mvCoverUrl");
        java.lang.String optString21 = jSONObject.optString("mvMakerFinderNickname");
        java.lang.String optString22 = jSONObject.optString("musicOperationUrl");
        java.lang.String optString23 = jSONObject.optString("sceneNote");
        java.lang.String optString24 = jSONObject.optString("musicAppId");
        double d18 = d17;
        java.lang.String str7 = str3;
        java.lang.String str8 = str5;
        java.lang.String str9 = str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "src : %s, title : %s, singer : %s, coverImgUrl : %s, webUrl : %s, startTime:%d, protocol:%s, musicbar_url:%s, playbackRate:%f, volume:%f", optString2, optString4, optString6, str5, optString8, java.lang.Integer.valueOf(P), optString10, optString11, java.lang.Double.valueOf(d17), java.lang.Double.valueOf(F2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "genre:%s, identification:%s, issueDate:%d, duration:%d, extraInfo:%s, mvObjectId:%s, mvNonceId:%s, mvCoverUrl:%s, mvMakerFinderNickname:%s, sceneNote:%s, musicAppId:%s", optString15, optString16, java.lang.Long.valueOf(V), java.lang.Long.valueOf(V2), optString17, optString18, optString19, optString20, optString21, optString23, optString24);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", "setBackgroundAudioStateMv fail, src or title is null");
            this.f224976f.a("setBackgroundAudioStateMv:fail, src or title is null");
            return;
        }
        if (optString12 != null && optString12.length() > 32768) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApidoSetBackgroundAudioStateMV", "setBackgroundAudioState fail, songLyric is too long");
            this.f224976f.a("setBackgroundAudioStateMv:fail, songLyric is too long");
            return;
        }
        java.lang.String str10 = "" + optString2.hashCode();
        b21.r a17 = b21.s.a(10, str8, optString4, optString6, optString8, optString3, optString2, "" + optString2.hashCode(), lp0.b.D(), g83.a.a() + str8.hashCode(), str9, str);
        a17.C = str6;
        a17.D = P * 1000;
        a17.E = str7;
        a17.F = optString10;
        a17.H = optString11;
        a17.f98888q = optString12;
        a17.I = optString13;
        a17.K = d18;
        a17.L = (float) F2;
        a17.P = optString14;
        r45.xs4 xs4Var = new r45.xs4();
        xs4Var.set(0, optString18);
        xs4Var.set(1, optString19);
        xs4Var.set(2, optString20);
        xs4Var.set(3, optString21);
        xs4Var.set(14, optString4);
        xs4Var.set(4, optString6);
        xs4Var.set(16, str8);
        xs4Var.set(5, str9);
        xs4Var.set(8, java.lang.Long.valueOf(V));
        int i17 = (int) V2;
        xs4Var.set(10, java.lang.Integer.valueOf(i17));
        xs4Var.set(9, optString16);
        xs4Var.set(6, optString17);
        xs4Var.set(15, optString12);
        xs4Var.set(7, optString15);
        xs4Var.set(11, optString14);
        xs4Var.set(13, str8);
        b21.t a18 = b21.t.a(str10, xs4Var);
        ((s90.e) ((t90.e) i95.n0.c(t90.e.class))).getClass();
        b21.u.d(a17, a18);
        boolean z18 = a17.b(b21.m.b()) && b21.m.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "needStartMusicUI :%d", java.lang.Integer.valueOf(P2));
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "The same music is playing");
            b21.m.k(a17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "play the music");
            b21.m.i(a17);
            if (P2 == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_scene", 8);
                j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "music", ".ui.MusicMainUI", intent, null);
            } else if (P2 == 2) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_mv_song_name", optString4);
                intent2.putExtra("key_mv_song_lyric", optString12);
                intent2.putExtra("key_mv_album_cover_url", str8);
                intent2.putExtra("key_mv_feed_id", optString18);
                intent2.putExtra("key_mv_nonce_id", optString19);
                intent2.putExtra("key_mv_cover_url", optString20);
                intent2.putExtra("key_mv_poster", optString21);
                intent2.putExtra("key_mv_singer_name", optString6);
                intent2.putExtra("key_mv_album_name", str9);
                intent2.putExtra("key_mv_music_genre", optString15);
                intent2.putExtra("key_mv_issue_date", V + "");
                intent2.putExtra("key_mv_identification", optString16);
                intent2.putExtra("key_mv_extra_info", optString17);
                intent2.putExtra("key_mv_music_duration", i17);
                intent2.putExtra("key_mv_music_operation_url", optString22);
                intent2.putExtra("key_mv_song_mid", optString14);
                intent2.putExtra("key_mv_scene_note", optString23);
                intent2.setFlags(268435456);
                j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "mv", ".ui.MusicMvMainUI", intent2, null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApidoSetBackgroundAudioStateMV", "setBackgroundAudioStateMV ok");
        this.f224976f.d(false);
    }
}
