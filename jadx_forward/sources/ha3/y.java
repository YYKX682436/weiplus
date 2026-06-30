package ha3;

/* loaded from: classes15.dex */
public final class y implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f361493d;

    public y(ha3.d0 d0Var) {
        this.f361493d = d0Var;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("complete textureId: ");
        ha3.d0 d0Var = this.f361493d;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f361358o);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "completed");
        d0Var.b(hashMap);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener
    /* renamed from: onDetailInfo */
    public void mo100989x8953bfde(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detail info textureId: ");
        ha3.d0 d0Var = this.f361493d;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f361358o);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        sb6.append(", detailInfo: ");
        sb6.append(c26183xfc0748fc != null ? java.lang.Integer.valueOf(c26183xfc0748fc.f50768x368f3a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error textureId: ");
        ha3.d0 d0Var = this.f361493d;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f361358o);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        sb6.append(", url: ");
        sb6.append(d0Var.f361349f);
        sb6.append(", errorType: ");
        sb6.append(i17);
        sb6.append(", errorCode: ");
        sb6.append(i18);
        sb6.append(", arg1: ");
        sb6.append(j17);
        sb6.append(", arg2: ");
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = "视频加载失败 errorType: " + i17 + ", errorCode: " + i18;
        hashMap.put("errorType", java.lang.Integer.valueOf(i17));
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(i18));
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, str);
        hashMap.put("errorActionDesc", "重试");
        if (d0Var.f361354k != null) {
            d0Var.a(java.lang.String.valueOf(i18), str, hashMap);
        } else {
            d0Var.f361345b = hashMap;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on info textureId: ");
        ha3.d0 d0Var = this.f361493d;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f361358o);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        sb6.append(", info: ");
        sb6.append(i17);
        sb6.append(", arg1: ");
        sb6.append(j17);
        sb6.append(", arg2: ");
        sb6.append(j18);
        sb6.append(", extra: ");
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        if (i17 == 108) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "first frame textureId: " + d0Var.f361357n + ", mediaId: " + d0Var.f361358o + ", state: " + d0Var.f361347d);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", "firstFrame");
            d0Var.b(hashMap);
            return;
        }
        if (i17 == 204) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "video decoder type textureId: " + d0Var.f361357n + ", mediaId: " + d0Var.f361358o + ", state: " + d0Var.f361347d + ", decoder type: " + j17);
            return;
        }
        if (i17 == 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "player type textureId: " + d0Var.f361357n + ", mediaId: " + d0Var.f361358o + ", state: " + d0Var.f361347d + ", player type: " + j17);
            return;
        }
        if (i17 == 1006) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "buffer update textureId: " + d0Var.f361357n + ", mediaId: " + d0Var.f361358o + ", state: " + d0Var.f361347d);
            d0Var.l(null);
            return;
        }
        if (i17 == 1009) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "is use proxy textureId: " + d0Var.f361357n + ", mediaId: " + d0Var.f361358o + ", state: " + d0Var.f361347d + ", is use proxy: " + j17);
            return;
        }
        if (i17 == 200) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "buffer start textureId: " + d0Var.f361357n + ", mediaId: " + d0Var.f361358o + ", state: " + d0Var.f361347d);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("event", "bufferingStart");
            d0Var.b(hashMap2);
            return;
        }
        if (i17 == 201) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "buffer end textureId: " + d0Var.f361357n + ", mediaId: " + d0Var.f361358o + ", state: " + d0Var.f361347d);
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("event", "bufferingEnd");
            d0Var.b(hashMap3);
            return;
        }
        if (i17 == 502) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("media codec info textureId: ");
            sb7.append(d0Var.f361357n);
            sb7.append(", mediaId: ");
            sb7.append(d0Var.f361358o);
            sb7.append(", state: ");
            sb7.append(d0Var.f361347d);
            sb7.append(", mediaType: ");
            boolean z17 = obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo;
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo tPMediaCodecInfo = z17 ? (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo) obj : null;
            sb7.append(tPMediaCodecInfo != null ? java.lang.Integer.valueOf(tPMediaCodecInfo.f50894x7f94e13e) : null);
            sb7.append(", infoType: ");
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo tPMediaCodecInfo2 = z17 ? (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo) obj : null;
            sb7.append(tPMediaCodecInfo2 != null ? java.lang.Integer.valueOf(tPMediaCodecInfo2.f50893xa9b6108) : null);
            sb7.append(", msg: ");
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo tPMediaCodecInfo3 = z17 ? (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo) obj : null;
            sb7.append(tPMediaCodecInfo3 != null ? tPMediaCodecInfo3.msg : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb7.toString());
            return;
        }
        if (i17 != 503) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "sei info textureId: " + d0Var.f361357n + ", mediaId: " + d0Var.f361358o + ", state: " + d0Var.f361347d);
        if ((obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo ? (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo) obj : null) != null) {
            byte[] bArr = ((com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo) obj).f50907x75ae1ca1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr);
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
            java.lang.String str = new java.lang.String(bArr, UTF_8);
            int P = r26.n0.P(str, "\\0", 0, false, 6, null);
            if (P != -1 && P == str.length() - 2) {
                str = r26.p0.E0(str, P);
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("event", "getMessage");
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                hashMap4.put("msg", jSONObject2);
                d0Var.b(hashMap4);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayer", e17.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on prepared start textureId: ");
        ha3.d0 d0Var = this.f361493d;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f361358o);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        sb6.append(", url: ");
        sb6.append(d0Var.f361349f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        if (d0Var.f361348e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayer", "onPrepared video is null.");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "initialized");
        kk4.c cVar = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        hashMap.put("duration", java.lang.Long.valueOf(((kk4.f0) cVar).mo100917x37a7fa50()));
        kk4.c cVar2 = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
        hashMap.put("width", java.lang.Integer.valueOf(((kk4.f0) cVar2).mo100929x8d5c7601()));
        kk4.c cVar3 = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar3);
        hashMap.put("height", java.lang.Integer.valueOf(((kk4.f0) cVar3).mo100928x463504c()));
        kk4.c cVar4 = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar4);
        hashMap.put("videoRate", java.lang.Long.valueOf(((kk4.f0) cVar4).mo100924x2d67b867(202)));
        kk4.c cVar5 = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar5);
        hashMap.put("audioRate", java.lang.Long.valueOf(((kk4.f0) cVar5).mo100924x2d67b867(101)));
        kk4.c cVar6 = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar6);
        hashMap.put("videoFrameRate", java.lang.Long.valueOf(((kk4.f0) cVar6).mo100924x2d67b867(206)));
        kk4.c cVar7 = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar7);
        java.lang.String mo100925x7e95833c = ((kk4.f0) cVar7).mo100925x7e95833c(0);
        kk4.c cVar8 = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar8);
        long mo100924x2d67b867 = ((kk4.f0) cVar8).mo100924x2d67b867(205);
        if (!d0Var.f361361r) {
            kk4.c cVar9 = d0Var.f361348e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar9);
            int mo100929x8d5c7601 = ((kk4.f0) cVar9).mo100929x8d5c7601();
            kk4.c cVar10 = d0Var.f361348e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar10);
            int mo100928x463504c = ((kk4.f0) cVar10).mo100928x463504c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "onPrepared: delayed init renderController with videoWidth=" + mo100929x8d5c7601 + ", videoHeight=" + mo100928x463504c);
            if (mo100929x8d5c7601 > 0 && mo100928x463504c > 0) {
                io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = d0Var.f361353j;
                if (surfaceProducer != null) {
                    surfaceProducer.mo138098x76500f83(mo100929x8d5c7601, mo100928x463504c);
                }
                ha3.x xVar = new ha3.x(d0Var);
                um5.p pVar = d0Var.f361359p;
                io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = d0Var.f361353j;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceProducer2);
                pVar.e(surfaceProducer2.mo138084xcf572877(), mo100929x8d5c7601, mo100928x463504c);
                d0Var.f361359p.n(xVar);
                d0Var.f361361r = true;
            }
        }
        um5.p pVar2 = d0Var.f361359p;
        kk4.c cVar11 = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar11);
        int mo100929x8d5c76012 = ((kk4.f0) cVar11).mo100929x8d5c7601();
        kk4.c cVar12 = d0Var.f361348e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar12);
        pVar2.m(mo100929x8d5c76012, ((kk4.f0) cVar12).mo100928x463504c(), (int) mo100924x2d67b867);
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("VideoCodec=TP_CODEC_ID_(\\w+)").matcher(mo100925x7e95833c);
        if (matcher.find()) {
            str = matcher.group(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "group(...)");
        } else {
            str = "";
        }
        hashMap.put("videoCodec", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "initializedEvent: " + hashMap);
        if (d0Var.f361354k != null) {
            d0Var.b(hashMap);
        } else {
            d0Var.f361344a = hashMap;
        }
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.e0 b17 = ha3.j0.f361420b.b(d0Var.f361349f);
        if (b17 == null) {
            b17 = new ha3.e0();
        }
        long j17 = b17.f361368c;
        double d17 = 0.0d;
        if (j17 != 0) {
            double d18 = ((b17.f361366a * 100.0d) / j17) * 1.0d;
            if (d18 >= 3.0d) {
                d17 = d18;
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap.put("event", "onHitVideoCache");
        hashMap.put("percent", java.lang.Double.valueOf(d17));
        d0Var.b(hashMap2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seek complete textureId: ");
        ha3.d0 d0Var = this.f361493d;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f361358o);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onSeekComplete");
        hashMap.put("position", java.lang.Long.valueOf(d0Var.q()));
        d0Var.b(hashMap);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state change textureId: ");
        ha3.d0 d0Var = this.f361493d;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f361358o);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        sb6.append(", preState: ");
        sb6.append(i17);
        sb6.append(", curState: ");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        d0Var.f361347d = i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener
    /* renamed from: onStopAsyncComplete */
    public void mo83876x5a35e2d4(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop complete textureId: ");
        ha3.d0 d0Var = this.f361493d;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f361358o);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video size change textureId: ");
        ha3.d0 d0Var = this.f361493d;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(d0Var.f361358o);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        sb6.append(", width: ");
        sb6.append(j17);
        sb6.append(", height: ");
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
    }
}
