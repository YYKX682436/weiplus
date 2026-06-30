package ha3;

/* loaded from: classes15.dex */
public final class i implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f361405d;

    public i(ha3.v vVar) {
        this.f361405d = vVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("complete textureId: ");
        ha3.v vVar = this.f361405d;
        sb6.append(vVar.f361488q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f361489r);
        sb6.append(", state: ");
        sb6.append(vVar.f361479h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "completed");
        vVar.b(hashMap);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener
    /* renamed from: onDetailInfo */
    public void mo100989x8953bfde(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detail info textureId: ");
        ha3.v vVar = this.f361405d;
        sb6.append(vVar.f361488q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f361489r);
        sb6.append(", state: ");
        sb6.append(vVar.f361479h);
        sb6.append(", detailInfo: ");
        sb6.append(c26183xfc0748fc != null ? java.lang.Integer.valueOf(c26183xfc0748fc.f50768x368f3a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error textureId: ");
        ha3.v vVar = this.f361405d;
        sb6.append(vVar.f361488q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f361489r);
        sb6.append(", state: ");
        sb6.append(vVar.f361479h);
        sb6.append(", url: ");
        sb6.append(vVar.f361472a);
        sb6.append(", errorType: ");
        sb6.append(i17);
        sb6.append(", errorCode: ");
        sb6.append(i18);
        sb6.append(", arg1: ");
        sb6.append(j17);
        sb6.append(", arg2: ");
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = "视频加载失败 errorType: " + i17 + ", errorCode: " + i18;
        hashMap.put("errorType", java.lang.Integer.valueOf(i17));
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(i18));
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, str);
        hashMap.put("errorActionDesc", "重试");
        if (vVar.f361484m != null) {
            vVar.a(java.lang.String.valueOf(i18), str, hashMap);
        } else {
            vVar.f361477f = hashMap;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on info textureId: ");
        ha3.v vVar = this.f361405d;
        sb6.append(vVar.f361488q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f361489r);
        sb6.append(", state: ");
        sb6.append(vVar.f361479h);
        sb6.append(", info: ");
        sb6.append(i17);
        sb6.append(", arg1: ");
        sb6.append(j17);
        sb6.append(", arg2: ");
        sb6.append(j18);
        sb6.append(", extra: ");
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        if (i17 == 108) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "first frame textureId: " + vVar.f361488q + ", mediaId: " + vVar.f361489r + ", state: " + vVar.f361479h);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", "firstFrame");
            vVar.b(hashMap);
            return;
        }
        if (i17 == 204) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "video decoder type textureId: " + vVar.f361488q + ", mediaId: " + vVar.f361489r + ", state: " + vVar.f361479h + ", decoder type: " + j17);
            return;
        }
        if (i17 == 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "player type textureId: " + vVar.f361488q + ", mediaId: " + vVar.f361489r + ", state: " + vVar.f361479h + ", player type: " + j17);
            return;
        }
        if (i17 == 1006) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "buffer update textureId: " + vVar.f361488q + ", mediaId: " + vVar.f361489r + ", state: " + vVar.f361479h);
            vVar.l(null);
            return;
        }
        if (i17 == 1009) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "is use proxy textureId: " + vVar.f361488q + ", mediaId: " + vVar.f361489r + ", state: " + vVar.f361479h + ", is use proxy: " + j17);
            return;
        }
        if (i17 == 200) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "buffer start textureId: " + vVar.f361488q + ", mediaId: " + vVar.f361489r + ", state: " + vVar.f361479h);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("event", "bufferingStart");
            vVar.b(hashMap2);
            return;
        }
        if (i17 == 201) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "buffer end textureId: " + vVar.f361488q + ", mediaId: " + vVar.f361489r + ", state: " + vVar.f361479h);
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("event", "bufferingEnd");
            vVar.b(hashMap3);
            return;
        }
        if (i17 == 502) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("media codec info textureId: ");
            sb7.append(vVar.f361488q);
            sb7.append(", mediaId: ");
            sb7.append(vVar.f361489r);
            sb7.append(", state: ");
            sb7.append(vVar.f361479h);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb7.toString());
            return;
        }
        if (i17 != 503) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", "sei info textureId: " + vVar.f361488q + ", mediaId: " + vVar.f361489r + ", state: " + vVar.f361479h);
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
                vVar.b(hashMap4);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoHLSPlayer", e17.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 r11) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ha3.i.mo53283x58d5b73c(com.tencent.thumbplayer.api.ITPPlayer):void");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seek complete textureId: ");
        ha3.v vVar = this.f361405d;
        sb6.append(vVar.f361488q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f361489r);
        sb6.append(", state: ");
        sb6.append(vVar.f361479h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onSeekComplete");
        hashMap.put("position", java.lang.Long.valueOf(vVar.q()));
        vVar.b(hashMap);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state change textureId: ");
        ha3.v vVar = this.f361405d;
        sb6.append(vVar.f361488q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f361489r);
        sb6.append(", state: ");
        sb6.append(vVar.f361479h);
        sb6.append(", preState: ");
        sb6.append(i17);
        sb6.append(", curState: ");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
        vVar.f361479h = i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener
    /* renamed from: onStopAsyncComplete */
    public void mo83876x5a35e2d4(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop complete textureId: ");
        ha3.v vVar = this.f361405d;
        sb6.append(vVar.f361488q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f361489r);
        sb6.append(", state: ");
        sb6.append(vVar.f361479h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video size change textureId: ");
        ha3.v vVar = this.f361405d;
        sb6.append(vVar.f361488q);
        sb6.append(", mediaId: ");
        sb6.append(vVar.f361489r);
        sb6.append(", state: ");
        sb6.append(vVar.f361479h);
        sb6.append(", width: ");
        sb6.append(j17);
        sb6.append(", height: ");
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHLSPlayer", sb6.toString());
    }
}
