package af3;

/* loaded from: classes15.dex */
public final class b implements rh3.g, rh3.h, rh3.m, rh3.e, rh3.l, rh3.j, rh3.i, rh3.f {

    /* renamed from: d, reason: collision with root package name */
    public final xe3.f f4539d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f4540e;

    /* renamed from: f, reason: collision with root package name */
    public long f4541f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4542g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4543h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f4544i;

    public b(xe3.f mbExternalVideoPlayerItem) {
        kotlin.jvm.internal.o.g(mbExternalVideoPlayerItem, "mbExternalVideoPlayerItem");
        this.f4539d = mbExternalVideoPlayerItem;
        this.f4540e = jz5.h.b(af3.a.f4538d);
        this.f4544i = "";
    }

    @Override // rh3.f
    public void a(wh3.b mediaSource, int i17, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onDownloaderFinish " + this.f4539d + " retCode: " + i17 + " result: " + hVar);
        this.f4543h = true;
        mq0.d0 b17 = b();
        if (b17 != null) {
            mq0.d0.Ub(b17, "onDownloaderFinish", this.f4544i, null, 4, null);
        }
    }

    public final mq0.d0 b() {
        return (mq0.d0) ((jz5.n) this.f4540e).getValue();
    }

    @Override // rh3.e
    public void c(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion ");
        xe3.f fVar = this.f4539d;
        sb6.append(fVar);
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", sb6.toString());
        ve3.q.c(fVar, "onVideoEnd", null, 2, null);
        mq0.d0 b17 = b();
        if (b17 != null) {
            mq0.d0.Ub(b17, "onCompletion", this.f4544i, null, 4, null);
        }
    }

    @Override // rh3.l
    public void d(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onSeekComplete " + this.f4539d);
    }

    @Override // rh3.f
    public void e(wh3.b mediaSource, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onDownloaderRequestData " + this.f4539d + " offset: " + i17 + " length: " + i18);
    }

    @Override // rh3.f
    public void f(wh3.b mediaSource, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onDownloaderMoovReady " + this.f4539d + " offset: " + i17 + " total: " + i18 + " first: " + z17);
    }

    @Override // rh3.f
    public void g(wh3.b mediaSource, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onDownloaderDataAvailable " + this.f4539d + " offset: " + i17 + " total: " + i18);
    }

    @Override // rh3.m
    public void h(rh3.o mp6, int i17, int i18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onStateChange " + this.f4539d + ' ' + i17 + " -> " + i18);
        mq0.d0 b17 = b();
        if (b17 != null) {
            switch (i18) {
                case 1:
                    str = "idle";
                    break;
                case 2:
                    str = "initialized";
                    break;
                case 3:
                    str = "preparing";
                    break;
                case 4:
                    str = "prepared";
                    break;
                case 5:
                    str = "start";
                    break;
                case 6:
                    str = "pause";
                    break;
                case 7:
                    str = "complete";
                    break;
                case 8:
                    str = "stopping";
                    break;
                case 9:
                default:
                    str = com.eclipsesource.mmv8.Platform.UNKNOWN;
                    break;
                case 10:
                    str = "error";
                    break;
                case 11:
                    str = "released";
                    break;
            }
            mq0.d0.Ub(b17, str, this.f4544i, null, 4, null);
        }
    }

    @Override // rh3.h
    public void i(rh3.o mp6) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onFirstFrameRenderStart " + this.f4539d);
        mq0.d0 b17 = b();
        if (b17 != null) {
            mq0.d0.Ub(b17, "onFirstFrameRenderStart", this.f4544i, null, 4, null);
        }
    }

    @Override // rh3.i
    public void j(rh3.o mp6, int i17, long j17, long j18, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        xe3.f fVar = this.f4539d;
        if (i17 == 252) {
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "adaptive switch def end " + fVar + " arg1: " + j17 + ", arg2: " + j18 + ", extra: " + obj);
            return;
        }
        if (i17 == 1006) {
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "download progress update " + fVar + " arg1: " + j17 + ", arg2: " + j18 + ", extra: " + obj);
            return;
        }
        if (i17 == 1016) {
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "detected multi network card low speed " + fVar + " arg1: " + j17 + ", arg2: " + j18);
            java.lang.Object m17 = fVar.f453944d.m();
            com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer = m17 instanceof com.tencent.thumbplayer.tplayer.TPPlayer ? (com.tencent.thumbplayer.tplayer.TPPlayer) m17 : null;
            if (tPPlayer != null) {
                tPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(509, 1L));
            }
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "detected multi network card and low speed,so setup multi network card");
            mq0.d0 b17 = b();
            if (b17 != null) {
                mq0.d0.Ub(b17, "detectedMultiNetworkCardAndLowSpeed", this.f4544i, null, 4, null);
                return;
            }
            return;
        }
        if (i17 != 1017) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "multi network card status change " + fVar + " arg1: " + j17 + ", arg2: " + j18 + ", extra: " + obj);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", obj);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        mq0.d0 b18 = b();
        if (b18 != null) {
            ((mq0.s0) b18).Di("multiNetworkCardStatusChange", this.f4544i, jSONObject2);
        }
    }

    @Override // rh3.f
    public void k(wh3.b mediaSource) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onDownloaderStart " + this.f4539d);
    }

    @Override // rh3.f
    public void l(wh3.b mediaSource, dn.o oVar, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onDownloaderStop " + this.f4539d);
    }

    @Override // rh3.j
    public void n(rh3.o mp6, long j17, long j18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        if (!this.f4542g && j17 >= 1000) {
            mq0.d0 b17 = b();
            if (b17 != null) {
                mq0.d0.Ub(b17, "play1s", this.f4544i, null, 4, null);
            }
            this.f4542g = true;
            try {
                java.lang.String str = this.f4544i;
                java.lang.String str2 = "";
                if (str.length() == 0) {
                    str = "";
                } else {
                    try {
                        java.lang.String optString = new org.json.JSONObject(str).optString("frameSetName", str);
                        kotlin.jvm.internal.o.d(optString);
                        str = optString;
                    } catch (java.lang.Exception unused) {
                    }
                }
                int i17 = mq0.c0.T0;
                if (!(str.length() == 0)) {
                    java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"_"}, false, 0, 6, null);
                    str2 = f07.size() >= 3 ? (java.lang.String) f07.get(1) : str;
                }
                java.lang.String str3 = str2;
                mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
                if (c0Var != null) {
                    mq0.c0.Xa(c0Var, mq0.z.f330635f, "MagicAdMiniProgram", "RewardAd", str3, str, mq0.a0.f330532e, null, null, 192, null);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report ValidExpose failed", e17);
            }
        }
        if (j17 - this.f4541f >= 250) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayProgressMs ");
            xe3.f fVar = this.f4539d;
            sb6.append(fVar);
            sb6.append(' ');
            sb6.append(j17);
            sb6.append(" / ");
            sb6.append(j18);
            com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", sb6.toString());
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("currentMs", j17);
            jSONObject.put("totalMs", j18);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            fVar.b("onVideoPlayProgressMs", jSONObject2);
            this.f4541f = j17;
        }
    }

    @Override // rh3.f
    public void o(wh3.b mediaSource, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_tpp_listener", "onDownloaderProgress " + this.f4539d + " offset: " + i17 + " total: " + i18);
    }

    @Override // rh3.g
    public void r(rh3.o mp6, int i17, int i18) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(mp6, "mp");
        if (i18 == 1000) {
            return;
        }
        if (i17 == 1200) {
            str = "Decoder其他类型错误";
        } else if (i17 == 1300) {
            str = "Renderer其他错误";
        } else if (i17 == 1500) {
            str = "音频后处理其他错误";
        } else if (i17 == 1600) {
            str = "视频后处理其他错误";
        } else if (i17 == 3000) {
            str = "TPPlayer层错误类型";
        } else if (i17 == 4000) {
            str = "下载组件错误类型";
        } else if (i17 == 1210) {
            str = "Decoder音频格式不支持";
        } else if (i17 == 1211) {
            str = "Decoder音频数据错误无法解码";
        } else if (i17 == 1220) {
            str = "Decoder视频格式不支持";
        } else if (i17 == 1221) {
            str = "Decoder视频数据错误无法解码";
        } else if (i17 == 1230) {
            str = "Decoder字幕格式不支持";
        } else if (i17 == 1231) {
            str = "Decoder字幕数据错误无法解码";
        } else if (i17 == 2000) {
            str = "系统播放器其他错误";
        } else if (i17 != 2001) {
            switch (i17) {
                case 999:
                    str = "TPPlayer层错误类型未知";
                    break;
                case 1000:
                    str = "Success";
                    break;
                case 1001:
                    str = "框架层和其他通用模块的错误";
                    break;
                default:
                    switch (i17) {
                        case 1100:
                            str = "Demuxer其他错误";
                            break;
                        case 1101:
                            str = "Demuxer网络错误";
                            break;
                        case 1102:
                            str = "Demuxer解析码流数据错误";
                            break;
                        case 1103:
                            str = "Demuxer缓冲时间超过";
                            break;
                        default:
                            switch (i17) {
                                case com.tencent.thumbplayer.api.TPErrorCode.TP_ERROR_CODE_UNKONW /* 13000101 */:
                                    str = "TPThumbPlayer层未知错误";
                                    break;
                                case com.tencent.thumbplayer.api.TPErrorCode.TP_ERROR_CODE_LOGIC /* 13000102 */:
                                    str = "TPThumbPlayer层逻辑错误";
                                    break;
                                default:
                                    str = "Unknown error code: " + i17;
                                    break;
                            }
                    }
            }
        } else {
            str = "系统播放器网络错误";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", i17);
        jSONObject.put("subErrCode", i18);
        jSONObject.put("errMessage", str + "(subErrCode=" + i18 + ')');
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onError ");
        xe3.f fVar = this.f4539d;
        sb6.append(fVar);
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(i18);
        com.tencent.mars.xlog.Log.e("MB_External_surface_video_tpp_listener", sb6.toString());
        fVar.b("onVideoError", jSONObject2);
        mq0.d0 b17 = b();
        if (b17 != null) {
            ((mq0.s0) b17).Di("onVideoError", this.f4544i, jSONObject2);
        }
    }
}
