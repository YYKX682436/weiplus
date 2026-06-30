package z21;

/* loaded from: classes12.dex */
public final class d0 implements e70.c0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f551096a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z21.j0 f551097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f551098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.b f551099d;

    public d0(z21.j0 j0Var, int i17, z21.b bVar) {
        this.f551097b = j0Var;
        this.f551098c = i17;
        this.f551099d = bVar;
    }

    @Override // e70.c0
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("iLinkVoiceController.onStreamReportNotify() clientStreamId: ");
        sb6.append(data.f298857v[3] ? data.f298844f : "");
        sb6.append(", voiceId: ");
        sb6.append(this.f551097b.f551168r);
        sb6.append(", wifi: ");
        sb6.append(data.f298855t);
        sb6.append(", mobile: ");
        sb6.append(data.f298854s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", sb6.toString());
        b31.l lVar = b31.l.f99146a;
        java.lang.String voiceId = this.f551097b.f551168r;
        long j17 = data.f298855t;
        long j18 = data.f298854s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
        if (r26.n0.N(voiceId)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputReporter", "fillStreamReport voiceId:%s, wifi:%s, cellular:%s", voiceId, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        b31.e eVar = (b31.e) b31.l.f99147b.remove(voiceId);
        if (eVar == null) {
            b31.l.f99148c.put(voiceId, new long[]{j17, j18});
        } else {
            ((ku5.t0) ku5.t0.f394148d).A("VoiceInputReporter.pendingStop#".concat(voiceId));
            lVar.d(eVar, j17, j18);
        }
    }

    @Override // e70.c0
    public void d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.a abortInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abortInfo, "abortInfo");
        z21.j0 j0Var = this.f551097b;
        j0Var.m();
        j0Var.g();
        j0Var.n(-1, 400, "IlinkStreamStateServerAbort", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceInputController", "iLinkVoiceController.onAbort()");
    }

    @Override // e70.c0
    public void e(java.util.List data) {
        java.lang.Long l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "iLinkVoiceController onReceive");
        data.size();
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) it.next();
            boolean z17 = this.f551096a;
            z21.j0 j0Var = this.f551097b;
            if (z17) {
                z21.d dVar = j0Var.f551156f;
                if (dVar != null) {
                    ((k23.t0) dVar).a(j0Var.f551168r);
                }
                this.f551096a = false;
            }
            if (gVar != null) {
                r45.q17 q17Var = new r45.q17();
                q17Var.mo11468x92b714fd(gVar.g());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "iLinkVoiceController onReceive resp.seq = " + q17Var.f465107e + ", resultLastSeq = " + j0Var.A);
                java.lang.String str = q17Var.f465106d;
                if (str == null || str.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "voiceInput ilinkEnd voice_id is null, ignore!");
                    return;
                }
                if (q17Var.f465112m != null) {
                    int i17 = this.f551098c;
                    if (i17 == 15) {
                        r45.m17 m17Var = new r45.m17();
                        m17Var.mo11468x92b714fd(q17Var.f465112m.g());
                        boolean z18 = m17Var.f461608d;
                        z21.b bVar = this.f551099d;
                        if (z18) {
                            d75.b.g(new z21.b0(bVar, q17Var, j0Var));
                        } else {
                            d75.b.g(new z21.c0(bVar, q17Var));
                        }
                    } else if (i17 == 20) {
                        new r45.t17().mo11468x92b714fd(q17Var.f465112m.g());
                    }
                }
                java.util.Objects.toString(q17Var.f465112m);
                j0Var.f551164n = q17Var.f465109g;
                z21.a0 a0Var = j0Var.f551153c;
                if (((a0Var != null ? a0Var.g() : false) && j0Var.f551166p) || j0Var.f551164n != 0) {
                    j0Var.f551173w = false;
                    j0Var.m();
                    j0Var.g();
                }
                int i18 = q17Var.f465107e;
                if (i18 > j0Var.A || j0Var.f551164n == 100002) {
                    j0Var.A = i18;
                    java.lang.String str2 = q17Var.f465108f;
                    if (str2 != null) {
                        j0Var.f551163m = str2;
                        if (j0Var.f551170t && str2.length() > 0) {
                            j0Var.f551170t = false;
                            java.lang.String voice_id = q17Var.f465106d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(voice_id, "voice_id");
                            java.util.HashMap hashMap = j0Var.f551171u;
                            int i19 = j0Var.f551158h;
                            if (i19 == 15 || i19 == 17) {
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                if (hashMap == null || (l17 = (java.lang.Long) hashMap.get(1)) == null) {
                                    l17 = 0L;
                                }
                                long longValue = l17.longValue();
                                long j17 = longValue > 0 ? currentTimeMillis - longValue : 0L;
                                b31.l lVar = b31.l.f99146a;
                                long j18 = j0Var.f551172v;
                                java.lang.String streamId = j0Var.f551150J;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamId, "streamId");
                                java.lang.Long valueOf = java.lang.Long.valueOf(j18);
                                java.lang.Long valueOf2 = java.lang.Long.valueOf(currentTimeMillis);
                                java.lang.Long valueOf3 = java.lang.Long.valueOf(j17);
                                int i27 = j0Var.f551159i;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputReporter", "reportIlinkDownStream, voiceId:%s,  streamId:%s, clickTime:%s, returnTime:%s, totalCostTime:%s, startScene:%s", voice_id, streamId, valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i27));
                                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                linkedHashMap.put("voiceid", voice_id);
                                linkedHashMap.put("ilink_client_streamid", streamId);
                                linkedHashMap.put("stt_req_return_ts", java.lang.Long.valueOf(currentTimeMillis));
                                linkedHashMap.put("stt_click_ts", java.lang.Long.valueOf(j18));
                                linkedHashMap.put("stt_total_cost_time", java.lang.Long.valueOf(j17));
                                linkedHashMap.put("stt_trig_scenes", java.lang.Integer.valueOf(i27));
                                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_req_return_downlink", linkedHashMap, 35963);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "voiceInput ilinkEnd firstText Count = " + j0Var.f551163m.length());
                            java.lang.Long l18 = (java.lang.Long) hashMap.get(1);
                            if (l18 != null) {
                                l18.longValue();
                            }
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "voiceInput ilinkEnd voiceId = %s, seq = %s, time = %s, resultLastSeq:%s, interval:%s, endFlag:%s", q17Var.f465106d, java.lang.Integer.valueOf(q17Var.f465107e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(j0Var.A), java.lang.Integer.valueOf(q17Var.f465110h), java.lang.Integer.valueOf(j0Var.f551164n));
                j0Var.n(0, 0, "", 0);
                int i28 = q17Var.f465111i;
                if (i28 <= 0) {
                    i28 = j0Var.f551161k;
                }
                j0Var.f551161k = i28;
                int i29 = q17Var.f465110h;
                if (i29 < 1) {
                    i29 = 80;
                }
                j0Var.f551162l = i29;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "voiceInput ilinkEnd max_send_byte_per_pack = " + j0Var.f551161k + ", interval = " + j0Var.f551162l);
            }
        }
    }

    @Override // e70.c0
    public void g(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        z21.j0 j0Var = this.f551097b;
        j0Var.m();
        j0Var.g();
        j0Var.n(-1, error.ordinal(), error.name(), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceInputController", "iLinkVoiceController.onError(): " + error.name() + '(' + error.ordinal() + ')');
    }

    @Override // e70.c0
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "iLinkVoiceController.onDownStreamEnd()");
        z21.j0 j0Var = this.f551097b;
        j0Var.f551164n = 1;
        j0Var.n(0, 0, "", 0);
    }

    @Override // e70.c0
    /* renamed from: onTimeout */
    public void mo123670x1554e82() {
        z21.j0 j0Var = this.f551097b;
        j0Var.m();
        j0Var.g();
        j0Var.n(-1, 10, "timeOut", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceInputController", "iLinkVoiceController.onTimeout()");
    }
}
