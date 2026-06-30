package ha3;

/* loaded from: classes15.dex */
public final class d implements m8.z, m8.h0, z8.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f361339d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f361340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ha3.g f361341f;

    public d(ha3.g gVar) {
        this.f361341f = gVar;
    }

    @Override // m8.z
    public void A() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onPositionDiscontinuity");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onSeekComplete");
        ha3.g gVar = this.f361341f;
        hashMap.put("position", java.lang.Long.valueOf(gVar.q()));
        gVar.b(hashMap);
    }

    @Override // m8.z
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onLoadingChanged loading: " + z17);
        ha3.g gVar = this.f361341f;
        if (z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", "bufferingStart");
            gVar.b(hashMap);
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("event", "bufferingEnd");
            gVar.b(hashMap2);
        }
    }

    @Override // m8.z
    public void d(m8.e eVar) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoHDRPlayer", "onPlayerError exception: " + eVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("视频加载失败 errorType: ");
        sb6.append(eVar != null ? eVar.toString() : null);
        sb6.append(", errorCode: ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f406088d) : null);
        java.lang.String sb7 = sb6.toString();
        if (eVar == null || (str = eVar.toString()) == null) {
            str = "";
        }
        hashMap.put("errorType", str);
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(eVar != null ? eVar.f406088d : -1));
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, sb7);
        hashMap.put("errorActionDesc", "重试");
        ha3.g gVar = this.f361341f;
        if (gVar.f361394l != null) {
            gVar.a(java.lang.String.valueOf(eVar != null ? eVar.f406088d : -1), sb7, hashMap);
        } else {
            gVar.f361384b = hashMap;
        }
    }

    @Override // m8.z
    public void e(d9.l0 l0Var, q9.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onTracksChanged trackGroupArray: " + l0Var + ", trackSelectionArray: " + nVar);
    }

    @Override // z8.f
    public void p(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f c1603xe907df4f) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onMetadata metadata: " + c1603xe907df4f);
    }

    @Override // m8.z
    public void t(m8.m0 m0Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onTimelineChanged timeline: " + m0Var + ", args: " + obj);
    }

    @Override // m8.z
    public void u(m8.y yVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onPlaybackParametersChanged param: " + yVar);
    }

    @Override // m8.z
    public void y(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onPlayerStateChanged playWhenReady: " + z17 + ", state: " + i17);
        ha3.g gVar = this.f361341f;
        if (i17 == gVar.f361388f) {
            gVar.f361388f = z17 ? 5 : 6;
            return;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("event", "completed");
                gVar.b(hashMap);
            }
        } else {
            if (this.f361340e) {
                return;
            }
            this.f361340e = true;
            m8.i0 i0Var = gVar.f361390h;
            if (i0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoHDRPlayer", "onPrepared video is null!");
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var);
            int i18 = i0Var.f406100h.f125620s;
            m8.i0 i0Var2 = gVar.f361390h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var2);
            int i19 = i0Var2.f406100h.f125617p;
            m8.i0 i0Var3 = gVar.f361390h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var3);
            int i27 = i0Var3.f406100h.f125618q;
            if (i18 == -270 || i18 == -90 || i18 == 90 || i18 == 270) {
                m8.i0 i0Var4 = gVar.f361390h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var4);
                i19 = i0Var4.f406100h.f125618q;
                m8.i0 i0Var5 = gVar.f361390h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var5);
                i27 = i0Var5.f406100h.f125617p;
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("event", "initialized");
            m8.i0 i0Var6 = gVar.f361390h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var6);
            hashMap2.put("duration", java.lang.Long.valueOf(i0Var6.mo146926x51e8b0a()));
            hashMap2.put("width", java.lang.Integer.valueOf(i19));
            hashMap2.put("height", java.lang.Integer.valueOf(i27));
            m8.i0 i0Var7 = gVar.f361390h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var7);
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = i0Var7.f406100h;
            hashMap2.put("videoRate", java.lang.Integer.valueOf(c1601x7dc4e417 != null ? c1601x7dc4e417.f125609e : 0));
            m8.i0 i0Var8 = gVar.f361390h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var8);
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e4172 = i0Var8.f406101i;
            hashMap2.put("audioRate", java.lang.Integer.valueOf(c1601x7dc4e4172 != null ? c1601x7dc4e4172.f125609e : 0));
            m8.i0 i0Var9 = gVar.f361390h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var9);
            hashMap2.put("videoFrameRate", java.lang.Long.valueOf(i0Var9.f406100h != null ? r2.f125619r : 0L));
            m8.i0 i0Var10 = gVar.f361390h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i0Var10);
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e4173 = i0Var10.f406100h;
            java.lang.String str = c1601x7dc4e4173 != null ? c1601x7dc4e4173.f125610f : null;
            if (str == null) {
                str = "";
            }
            hashMap2.put("videoCodec", str);
            if (!gVar.f361399q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onPrepared: delayed init renderController with videoWidth=" + i19 + ", videoHeight=" + i27);
                if (i19 > 0 && i27 > 0) {
                    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = gVar.f361393k;
                    if (surfaceProducer != null) {
                        surfaceProducer.mo138098x76500f83(i19, i27);
                    }
                    ha3.c cVar = new ha3.c(gVar);
                    um5.p pVar = gVar.f361397o;
                    io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = gVar.f361393k;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceProducer2);
                    pVar.e(surfaceProducer2.mo138084xcf572877(), i19, i27);
                    gVar.f361397o.n(cVar);
                    gVar.f361399q = true;
                }
            }
            gVar.f361397o.m(i19, i27, i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "initializedEvent: " + hashMap2);
            if (gVar.f361394l != null) {
                gVar.b(hashMap2);
            } else {
                gVar.f361383a = hashMap2;
            }
        }
        gVar.f361388f = i17;
    }

    @Override // m8.z
    public void z(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onRepeatModeChanged repeatMode: " + i17);
    }
}
