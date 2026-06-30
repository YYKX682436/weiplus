package z21;

/* loaded from: classes12.dex */
public final class j0 {
    public int A;
    public boolean B;
    public int C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f551150J;
    public boolean K;

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f551151a;

    /* renamed from: b, reason: collision with root package name */
    public final e70.a0 f551152b;

    /* renamed from: c, reason: collision with root package name */
    public final z21.a0 f551153c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f551154d;

    /* renamed from: e, reason: collision with root package name */
    public final z21.b f551155e;

    /* renamed from: f, reason: collision with root package name */
    public z21.d f551156f;

    /* renamed from: g, reason: collision with root package name */
    public int f551157g;

    /* renamed from: h, reason: collision with root package name */
    public final int f551158h;

    /* renamed from: i, reason: collision with root package name */
    public final int f551159i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f551160j;

    /* renamed from: k, reason: collision with root package name */
    public int f551161k;

    /* renamed from: l, reason: collision with root package name */
    public int f551162l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f551163m;

    /* renamed from: n, reason: collision with root package name */
    public int f551164n;

    /* renamed from: o, reason: collision with root package name */
    public volatile long f551165o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f551166p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f551167q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f551168r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f551169s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f551170t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f551171u;

    /* renamed from: v, reason: collision with root package name */
    public long f551172v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f551173w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f551174x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f551175y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f551176z;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0183, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(p012xc85e97e9.p093xedfae76a.y r20, z21.b r21, java.lang.String r22, z21.a0 r23, e70.a0 r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z21.j0.<init>(androidx.lifecycle.y, z21.b, java.lang.String, z21.a0, e70.a0, int, int):void");
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g a() {
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20693x8caf9c71());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "[VoiceASR] GlobalSearch exptArg=" + c17);
        if (c17 == 0) {
            return null;
        }
        r45.k17 k17Var = new r45.k17();
        k17Var.f459848d = c17;
        return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(k17Var.mo14344x5f01b1f6());
    }

    public final void b(int i17) {
        fp.k.c();
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        z21.a0 a0Var = this.f551153c;
        if (a0Var != null) {
            a0Var.c(i17);
        }
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "doLastScene isAllStop:%s, isForceStop:%s", java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(this.f551169s));
        z21.d dVar = this.f551156f;
        if (dVar != null) {
            java.lang.String voiceId = this.f551168r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
            k23.v0.x(((k23.t0) dVar).f385227a, 41, "{\"voiceId\":\"" + voiceId + "\"}", null, 4, null);
        }
        if (this.I || this.f551169s) {
            return;
        }
        this.I = true;
        m();
        z21.a0 a0Var = this.f551153c;
        z21.z h17 = a0Var != null ? a0Var.h(this.G) : null;
        if (h17 != null) {
            this.H = 0;
            if (!this.D) {
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                if (c20976x6ba6452a != null) {
                    v65.i.b(c20976x6ba6452a, null, new z21.e0(h17, this, null), 1, null);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "real doLastScene  isIlink voiceId:" + h17.f551235a + ", voiceFileMarkEnd:" + h17.f551238d);
            j();
            if (this.f551173w) {
                return;
            }
            g();
        }
    }

    public final boolean d() {
        z21.a0 a0Var = this.f551153c;
        return (a0Var != null ? a0Var.g() : false) || this.f551164n != 0;
    }

    public final boolean e() {
        ((ku5.t0) ku5.t0.f394148d).A("upload_voice");
        if ((d() && this.f551166p) || this.f551169s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "preDoScene return");
            return false;
        }
        z21.a0 a0Var = this.f551153c;
        z21.z h17 = a0Var != null ? a0Var.h(this.G) : null;
        if (h17 == null) {
            f(this.f551162l * 2);
            return true;
        }
        long min = (long) java.lang.Math.min(com.p314xaae8f345.mm.vfs.w6.k(this.f551160j), h17.f551238d);
        if (min <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceInputController", "preDoScene nowMarkLen <= 0 read failed :%s", this.f551160j);
            fp.k.a();
            this.H = 0;
            c();
            n(3, -1, "ReadFileLengthError", 0);
            return false;
        }
        int i17 = (int) (min - this.G);
        this.H = i17;
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "preDoScene canReadLen < 0 length:%s ", java.lang.Integer.valueOf(i17));
            fp.k.a();
            f(this.f551162l * 2);
            return false;
        }
        if (this.H >= 500 || h17.f551239e <= 5 || this.D) {
            f(this.f551162l);
        } else {
            f(this.f551162l * 2);
        }
        return true;
    }

    public final void f(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "pushVoiceInput");
        pm0.v.Q("upload_voice", false, new z21.f0(this), j17, 2, null);
    }

    public final void g() {
        e70.a0 a0Var;
        if (!this.D || (a0Var = this.f551152b) == null) {
            return;
        }
        ((d83.t0) a0Var).e(this.f551150J);
    }

    public final void h() {
        java.lang.String str;
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a()) || (str = this.f551160j) == null || this.B) {
            return;
        }
        this.B = true;
        java.lang.String str2 = "voice_to_txt/" + this.f551168r;
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0(str2);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(h07, this.f551168r + (this.E ? ".opus" : ".silk"));
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(h07, this.f551168r + ".txt");
        r6Var.o();
        long d17 = com.p314xaae8f345.mm.vfs.w6.d(str, r6Var.o(), false);
        java.lang.String str3 = this.f551163m;
        if (str3 != null && str3.length() > 0) {
            java.lang.String o17 = r6Var2.o();
            java.lang.String str4 = this.f551163m;
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
            byte[] bytes = str4.getBytes(UTF_8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            com.p314xaae8f345.mm.vfs.w6.S(o17, bytes, 0, bytes.length);
        }
        if (d17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceInputController", "saveVoiceFile failed ret = %s", java.lang.Long.valueOf(d17));
        }
    }

    public final void i(int i17) {
        this.C = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "setEncodeType type:" + i17);
    }

    public final void j() {
        int i17;
        java.lang.Long l17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g a17;
        r45.o17 o17Var = new r45.o17();
        o17Var.f463361d = o45.wf.f424562g;
        o17Var.f463362e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.a(wo.q.f529313a, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        o17Var.f463364g = this.f551158h;
        z21.a0 a0Var = this.f551153c;
        jz5.f0 f0Var = null;
        z21.z h17 = a0Var != null ? a0Var.h(this.G) : null;
        if (h17 == null || this.f551167q) {
            o17Var.f463363f = this.f551173w ? this.f551168r : "0";
            o17Var.f463365h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
            o17Var.f463366i = this.C;
            o17Var.f463367m = true;
            o17Var.f463368n = 0;
            this.f551171u.put(0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "send empty isSendEmpty:" + this.f551167q + ", isResultContinue:" + this.f551173w + ", voiceId:" + o17Var.f463363f);
        } else {
            h17.f551236b = true;
            if (this.I) {
                h17.f551237c = true;
                o17Var.f463365h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "send last packet");
            } else {
                int i18 = this.H;
                int i19 = this.f551161k;
                if (i18 > i19) {
                    this.H = i19;
                    h17.f551237c = false;
                } else if (i18 <= i19 && (h17.f551238d != Integer.MAX_VALUE || this.f551166p || this.f551173w)) {
                    h17.f551237c = true;
                }
                o17Var.f463365h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.vfs.w6.N(this.f551160j, this.G, this.H));
            }
            o17Var.f463363f = h17.f551235a;
            o17Var.f463367m = h17.f551237c;
            o17Var.f463366i = this.C;
            int i27 = h17.f551239e + 1;
            h17.f551239e = i27;
            o17Var.f463368n = i27;
            int i28 = this.f551158h;
            if (i28 == 20) {
                r45.s17 s17Var = new r45.s17();
                java.lang.String str = this.f551174x;
                if (str != null) {
                    s17Var.f466936d = str;
                }
                o17Var.f463369o = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(s17Var.mo14344x5f01b1f6());
            } else if (i28 == 15) {
                r45.l17 l17Var = new r45.l17();
                java.lang.String str2 = this.f551174x;
                if (str2 != null) {
                    l17Var.f460611d = str2;
                }
                l17Var.f460613f = this.F;
                l17Var.f460614g = this.f551175y;
                l17Var.f460615h = this.f551176z;
                o17Var.f463369o = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(l17Var.mo14344x5f01b1f6());
            } else if (i28 == 33) {
                r45.j17 j17Var = new r45.j17();
                java.lang.String str3 = this.f551174x;
                if (str3 != null) {
                    j17Var.f459036d = str3;
                }
                o17Var.f463369o = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(j17Var.mo14344x5f01b1f6());
            } else if (i28 == 39) {
                r45.n17 n17Var = new r45.n17();
                java.lang.String str4 = this.f551174x;
                if (str4 != null) {
                    n17Var.f462531d = str4;
                }
                o17Var.f463369o = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(n17Var.mo14344x5f01b1f6());
            } else if (i28 == 23 && (a17 = a()) != null) {
                o17Var.f463369o = a17;
            }
            java.lang.String voice_id = o17Var.f463363f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(voice_id, "voice_id");
            this.f551168r = voice_id;
            this.f551171u.put(java.lang.Integer.valueOf(o17Var.f463368n), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", " goNewIlink voice_id: %s, is_end:%s, seq:%s", o17Var.f463363f, java.lang.Boolean.valueOf(o17Var.f463367m), java.lang.Integer.valueOf(o17Var.f463368n));
            int length = this.G + o17Var.f463365h.f273689a.length;
            this.G = length;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "clientId %s oldReadOffset %s", h17.f551235a, java.lang.Integer.valueOf(length));
            if (h17.f551239e == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "time flee send seq 1 time = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            java.lang.System.currentTimeMillis();
        }
        boolean z17 = o17Var.f463367m;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(o17Var.mo14344x5f01b1f6());
        e70.a0 a0Var2 = this.f551152b;
        if (a0Var2 != null) {
            java.lang.String streamId = this.f551150J;
            d83.t0 t0Var = (d83.t0) a0Var2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamId, "streamId");
            t0Var.c();
            d83.h0 h0Var = (d83.h0) t0Var.f308556c.get(streamId);
            if (h0Var != null) {
                h0Var.a(true);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.a0 a0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.a0();
                a0Var3.f298751d = streamId;
                boolean[] zArr = a0Var3.f298755h;
                zArr[1] = true;
                a0Var3.f298752e = h0Var.f308503a;
                zArr[2] = true;
                a0Var3.f298754g = z17;
                zArr[4] = true;
                a0Var3.f298753f = b17;
                zArr[3] = true;
                int length2 = b17.f273689a.length;
                if (t0Var.f308555b == null) {
                    synchronized (t0Var) {
                        if (t0Var.f308555b == null) {
                            t0Var.f308555b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.p.f298827b.d(t0Var.f308554a);
                            t0Var.f308560g.set(false);
                        }
                    }
                }
                d83.t0.a(t0Var);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.o oVar = t0Var.f308555b;
                if (oVar != null) {
                    oVar.d(a0Var3);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkStreamController", "unreachable! " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
                }
            }
        }
        int i29 = this.f551158h;
        if ((i29 == 15 || i29 == 17) && (i17 = o17Var.f463368n) > 0) {
            java.util.HashMap hashMap = this.f551171u;
            if (hashMap == null || (l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(i17))) == null) {
                l17 = 0L;
            }
            long longValue = l17.longValue();
            b31.l lVar = b31.l.f99146a;
            long j17 = i17;
            java.lang.String voice_id2 = o17Var.f463363f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(voice_id2, "voice_id");
            long j18 = this.f551172v;
            java.lang.String streamId2 = this.f551150J;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamId2, "streamId");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("stt_req", java.lang.Long.valueOf(j17));
            linkedHashMap.put("voiceid", voice_id2);
            linkedHashMap.put("ilink_client_streamid", streamId2);
            linkedHashMap.put("stt_req_send_ts", java.lang.Long.valueOf(longValue));
            linkedHashMap.put("stt_click_ts", java.lang.Long.valueOf(j18));
            linkedHashMap.put("stt_trig_scenes", java.lang.Integer.valueOf(this.f551159i));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_req_return_upward", linkedHashMap, 35963);
        }
    }

    public final void k() {
        if (this.D) {
            j();
            return;
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f551154d;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new z21.g0(this, null), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z21.j0.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", fp.k.c());
        ((ku5.t0) ku5.t0.f394148d).A("upload_voice");
        this.f551169s = true;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = this.f551154d;
        if (c20976x6ba6452a != null) {
            c20976x6ba6452a.m77667xac79a11b();
        }
    }

    public final void n(int i17, int i18, java.lang.String str, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceInputController", "updateVoiceInputResult errorType = %s, errorCode = %s, errMsg = %s, ret = %s, isBackendEndFlag():%s, endFlag:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(d()), java.lang.Integer.valueOf(this.f551164n));
        if (i17 == 0 && i18 == 0 && d()) {
            this.f551165o = android.os.SystemClock.elapsedRealtime();
        }
        d75.b.g(new z21.i0(i17, i18, this, str, i19));
    }
}
