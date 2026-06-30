package jg0;

/* loaded from: classes12.dex */
public final class x extends qi3.c {

    /* renamed from: o, reason: collision with root package name */
    public static volatile java.util.concurrent.ConcurrentHashMap f381167o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public static volatile java.util.concurrent.ConcurrentHashMap f381168p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public static volatile java.util.concurrent.ConcurrentHashMap f381169q = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f381170r = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final cg0.d f381171i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f381172m;

    /* renamed from: n, reason: collision with root package name */
    public final jg0.v f381173n;

    public x(cg0.d params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f381171i = params;
        this.f381172m = jz5.h.b(new jg0.w(this));
        this.f381173n = new jg0.v(this);
    }

    public static final int E(jg0.x xVar, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.g1 g1Var;
        xVar.getClass();
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f381170r.get(str);
        if (weakReference == null || (g1Var = (com.p314xaae8f345.mm.p944x882e457a.g1) weakReference.get()) == null) {
            return -1;
        }
        return (int) g1Var.c();
    }

    public static final void G(jg0.x xVar, oi3.g gVar, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMsgSendFail, Set error failed file:");
        cg0.d dVar = xVar.f381171i;
        sb6.append(dVar.f122582b);
        sb6.append(", msgId:");
        sb6.append(gVar.m75942xfb822ef2(gVar.f427150d + 0));
        sb6.append(", talker: ");
        int i18 = gVar.f427150d;
        int i19 = i18 + 3;
        sb6.append(gVar.m75945x2fec8307(i19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", sb6.toString());
        ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
        java.lang.String str = dVar.f122582b;
        w21.w0 j17 = w21.x0.j(str);
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", "Set error failed file:" + str);
            return;
        }
        switch (i17) {
            case -530032:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", "setError retCode: " + i17 + ", file: " + str + " msgId: " + j17.f524029m + " old stat: " + j17.f524025i);
                return;
            case -530031:
                if (j17.f524025i == 3) {
                    pt0.e0 e0Var = pt0.f0.f439742b1;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(j17.f524019c, j17.f524029m);
                    if (k17 != null) {
                        z15.b bVar = dVar.f122585e;
                        if (bVar != null) {
                            bVar.t(false);
                        }
                        z15.b bVar2 = dVar.f122585e;
                        k17.d1(bVar2 != null ? bVar2.m126747x696739c() : null);
                        k17.r1(2);
                        e0Var.s(j17.f524019c, k17.m124847x74d37ac6(), k17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "onMsgSendFail, msg is null");
                    }
                }
                j17.f524025i = 97;
                j17.f524027k = java.lang.System.currentTimeMillis() / 1000;
                j17.f524017a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
                ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(str, j17);
                return;
            case -510001:
                xVar.x();
                return;
            default:
                j17.f524025i = 98;
                j17.f524027k = java.lang.System.currentTimeMillis() / 1000;
                j17.f524017a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", "setError ret: " + ((bv.p0) ((cv.i1) i95.n0.c(cv.i1.class))).Ui(str, j17) + ", file: " + str + " msgId: " + j17.f524029m + " old stat: " + j17.f524025i);
                pt0.e0 e0Var2 = pt0.f0.f439742b1;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = e0Var2.k(gVar.m75945x2fec8307(i19), gVar.m75942xfb822ef2(i18 + 0));
                if (k18 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "onMsgSendFail, msg is null");
                    return;
                }
                k18.m124849x5361953a(j17.f524029m);
                k18.q3(dVar.f122589i);
                k18.r1(5);
                k18.u1(j17.f524019c);
                z15.b bVar3 = dVar.f122585e;
                if (bVar3 != null) {
                    bVar3.t(true);
                }
                z15.b bVar4 = dVar.f122585e;
                k18.d1(bVar4 != null ? bVar4.m126747x696739c() : null);
                k18.l1(k18.F & (-8193));
                e0Var2.s(j17.f524019c, k18.m124847x74d37ac6(), k18);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90 c6220x84bdfe90 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90();
                long m124847x74d37ac6 = k18.m124847x74d37ac6();
                am.p00 p00Var = c6220x84bdfe90.f136469g;
                p00Var.f89123a = m124847x74d37ac6;
                p00Var.f89124b = false;
                p00Var.f89125c = j17.c();
                c6220x84bdfe90.b(android.os.Looper.getMainLooper());
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(jg0.x r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof jg0.k
            if (r0 == 0) goto L16
            r0 = r7
            jg0.k r0 = (jg0.k) r0
            int r1 = r0.f381116g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f381116g = r1
            goto L1b
        L16:
            jg0.k r0 = new jg0.k
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f381114e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f381116g
            java.lang.String r3 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r6 = r0.f381113d
            jg0.x r6 = (jg0.x) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L84
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.f381113d
            jg0.x r6 = (jg0.x) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L54
        L43:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r6.p()
            r0.f381113d = r6
            r0.f381116g = r5
            java.lang.Object r7 = r6.l(r0)
            if (r7 != r1) goto L54
            goto La8
        L54:
            qi3.d0 r7 = (qi3.d0) r7
            r6.f1()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r6.i()
            r2.append(r5)
            java.lang.String r5 = " rerunSendCgi, send cgi retCode:"
            r2.append(r5)
            int r7 = r7.f445216a
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r7)
            r6.s()
            r0.f381113d = r6
            r0.f381116g = r4
            java.lang.Object r7 = r6.B(r0)
            if (r7 != r1) goto L84
            goto La8
        L84:
            qi3.k0 r7 = (qi3.k0) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.i()
            r0.append(r1)
            java.lang.String r1 = " rerunSendCgi, updateMsg retCode:"
            r0.append(r1)
            int r7 = r7.f445272a
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r7)
            r6.f1()
            jz5.f0 r1 = jz5.f0.f384359a
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.H(jg0.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(jg0.x r11, w21.w0 r12, z15.b r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.u(jg0.x, w21.w0, z15.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(jg0.x r22, qi3.d0 r23, w21.w0 r24, int r25, int r26, w21.t r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 1313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.w(jg0.x, qi3.d0, w21.w0, int, int, w21.t, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.b0
    public java.lang.Object A(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17;
        java.lang.String str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        cg0.d dVar = this.f381171i;
        java.util.Map map = dVar.f122593m;
        java.lang.String str2 = dVar.f122592l;
        linkedHashMap.putAll(map);
        qi3.f0 f0Var = dVar.f122597q;
        java.lang.String str3 = "PrepareError";
        if (f0Var != null) {
            str = "Success";
            i17 = 0;
        } else {
            i17 = -520009;
            str = "PrepareError";
        }
        if (f0Var != null) {
            linkedHashMap.putAll(f0Var.f445234b);
            int i18 = f0Var.f445233a;
            if (i18 != 0) {
                i17 = i18;
            } else {
                str3 = str;
            }
            str = str3;
        }
        qi3.i0 i0Var = dVar.f122598r;
        if (i0Var != null) {
            linkedHashMap.putAll(i0Var.f445259b);
            int i19 = i0Var.f445258a;
            if (i19 != 0) {
                str = "UploadError";
                i17 = i19;
            }
        }
        qi3.d0 d0Var = dVar.f122599s;
        if (d0Var != null) {
            linkedHashMap.putAll(d0Var.f445217b);
            int i27 = d0Var.f445216a;
            if (i27 != 0) {
                str = "SendCgiError";
                i17 = i27;
            }
        }
        qi3.k0 k0Var = dVar.f122600t;
        if (k0Var != null) {
            linkedHashMap.putAll(k0Var.f445273b);
            int i28 = k0Var.f445272a;
            if (i28 != 0) {
                str = "UpdateMsgError";
                i17 = i28;
            }
        }
        if (i17 == -520007) {
            t65.f Zi = ((k04.h) ((t65.e) i95.n0.c(t65.e.class))).Zi();
            linkedHashMap.put("send_from_last_screen", new java.lang.Integer(Zi.p()));
            linkedHashMap.put("send_network_tick_rate", new java.lang.Float(Zi.t()));
            linkedHashMap.put("send_from_last_network_min", new java.lang.Integer(Zi.n()));
            linkedHashMap.put("send_process_status", new java.lang.Integer(Zi.u()));
        }
        linkedHashMap.put("send_result_ret_code", new java.lang.Integer(i17));
        linkedHashMap.put("send_failback_to_cgi", new java.lang.Integer(dVar.f122594n ? 1 : 0));
        linkedHashMap.put("send_use_cdn_upload", new java.lang.Integer(L() ? 1 : 0));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        oi3.g gVar = dVar.f122591k;
        sb6.append(gVar != null ? new java.lang.Long(gVar.m75942xfb822ef2(gVar.f427150d + 1)) : null);
        sb6.append('_');
        oi3.g gVar2 = dVar.f122591k;
        sb6.append(gVar2 != null ? new java.lang.Long(gVar2.m75942xfb822ef2(gVar2.f427150d + 0)) : null);
        sb6.append('_');
        oi3.g gVar3 = dVar.f122591k;
        sb6.append(gVar3 != null ? new java.lang.Integer(gVar3.m75939xb282bd08(gVar3.f427150d + 4)) : null);
        linkedHashMap.put("send_msg_quote_svrid_msgid", sb6.toString());
        linkedHashMap.put("send_result_type", str);
        linkedHashMap.put("send_total_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - this.f445209e));
        linkedHashMap.put("inner_version", new java.lang.Integer(1));
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7009x9ec98c72 c7009x9ec98c72 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7009x9ec98c72();
            c7009x9ec98c72.f143229k = c7009x9ec98c72.b("EventId", str2, true);
            c7009x9ec98c72.f143231m = c7009x9ec98c72.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(linkedHashMap)), ",", ";", false), true);
            c7009x9ec98c72.k();
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "report26956: " + str2 + ' ' + linkedHashMap);
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof jg0.r
            if (r0 == 0) goto L13
            r0 = r6
            jg0.r r0 = (jg0.r) r0
            int r1 = r0.f381143g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f381143g = r1
            goto L18
        L13:
            jg0.r r0 = new jg0.r
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f381141e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f381143g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f381140d
            qi3.k0 r0 = (qi3.k0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L6c
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = r5.i()
            r6.append(r2)
            java.lang.String r2 = " start to updateMsg"
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            qi3.k0 r6 = new qi3.k0
            r2 = 0
            r6.<init>(r2)
            cg0.d r2 = r5.f381171i
            r2.f122600t = r6
            jg0.s r2 = new jg0.s
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f381140d = r6
            r0.f381143g = r3
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r0 = r6
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.B(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.b0
    public qi3.h0 C() {
        return qi3.h0.f445250e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(yz5.l r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.D(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r10, w21.w0 r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.I(com.tencent.mm.storage.f9, w21.w0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.J(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean L() {
        return ((java.lang.Boolean) ((jz5.n) this.f381172m).mo141623x754a37bb()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof jg0.f
            if (r0 == 0) goto L13
            r0 = r8
            jg0.f r0 = (jg0.f) r0
            int r1 = r0.f381100h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f381100h = r1
            goto L18
        L13:
            jg0.f r0 = new jg0.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f381098f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f381100h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f381096d
            java.lang.Object r0 = r0.f381097e
            qi3.f0 r0 = (qi3.f0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L8b
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = r7.i()
            r8.append(r2)
            java.lang.String r2 = " start to initVoice"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r8 = r7.f381171i
            java.lang.String r2 = r8.f122581a
            boolean r2 = r26.n0.N(r2)
            if (r2 == 0) goto L69
            qi3.f0 r8 = new qi3.f0
            r0 = -520012(0xfffffffffff810b4, float:NaN)
            r8.<init>(r0)
            return r8
        L69:
            qi3.f0 r2 = new qi3.f0
            r6 = 0
            r2.<init>(r6)
            r8.f122597q = r2
            boolean r8 = r8.f122586f
            if (r8 == 0) goto L76
            return r2
        L76:
            jg0.g r8 = new jg0.g
            r6 = 0
            r8.<init>(r7, r2, r6)
            r0.f381097e = r2
            r0.f381096d = r4
            r0.f381100h = r3
            java.lang.Object r8 = r8.mo146xb9724478(r0)
            if (r8 != r1) goto L89
            return r1
        L89:
            r0 = r2
            r1 = r4
        L8b:
            java.util.Map r8 = r0.f445234b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "init_cost"
            r8.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.M(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof jg0.p
            if (r0 == 0) goto L13
            r0 = r9
            jg0.p r0 = (jg0.p) r0
            int r1 = r0.f381137h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f381137h = r1
            goto L18
        L13:
            jg0.p r0 = new jg0.p
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f381135f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f381137h
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r1 = r0.f381133d
            java.lang.Object r0 = r0.f381134e
            qi3.f0 r0 = (qi3.f0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto Lad
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.i()
            r9.append(r2)
            java.lang.String r2 = " start to beginVoice"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r9 = r8.f381171i
            r6 = 0
            r9.f122587g = r6
            java.lang.String r7 = r9.f122581a
            boolean r7 = r26.n0.N(r7)
            if (r7 == 0) goto L6d
            qi3.f0 r9 = new qi3.f0
            r0 = -520012(0xfffffffffff810b4, float:NaN)
            r9.<init>(r0)
            return r9
        L6d:
            qi3.f0 r7 = new qi3.f0
            r7.<init>(r6)
            r9.f122597q = r7
            boolean r9 = r9.f122586f
            if (r9 == 0) goto L79
            return r7
        L79:
            boolean r9 = r8.L()
            if (r9 == 0) goto L98
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r8.i()
            r9.append(r0)
            java.lang.String r0 = " useCdnUpload = true, skip to beginVoice"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            return r7
        L98:
            jg0.q r9 = new jg0.q
            r2 = 0
            r9.<init>(r8, r7, r2)
            r0.f381134e = r7
            r0.f381133d = r4
            r0.f381137h = r3
            java.lang.Object r9 = r9.mo146xb9724478(r0)
            if (r9 != r1) goto Lab
            return r1
        Lab:
            r1 = r4
            r0 = r7
        Lad:
            java.util.Map r9 = r0.f445234b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "start_cost"
            r9.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.N(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.c
    public java.lang.Integer d(boolean z17) {
        java.lang.Integer d17 = super.d(z17);
        if (d17 != null) {
            return d17;
        }
        cg0.d dVar = this.f381171i;
        oi3.g gVar = dVar.f122584d;
        if (gVar == null) {
            return dVar.f122587g ? null : -520009;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = gVar.f427150d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(gVar.m75945x2fec8307(i17 + 3), gVar.m75942xfb822ef2(i17 + 0));
        if (k17 != null) {
            return (k17.W2() || k17.V2()) ? -520023 : null;
        }
        return -520002;
    }

    @Override // qi3.c
    public qi3.e0 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5;
        qi3.e0 e0Var = new qi3.e0(this.f445210f, this);
        cg0.d dVar = this.f381171i;
        oi3.g gVar = dVar.f122584d;
        if (gVar != null) {
            int i17 = gVar.f427150d;
            c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(gVar.m75942xfb822ef2(i17 + 0), gVar.m75945x2fec8307(i17 + 3));
        } else {
            c16564xb55e1d5 = null;
        }
        e0Var.f445230g = c16564xb55e1d5;
        e0Var.f445226c = dVar.f122597q;
        e0Var.f445227d = dVar.f122598r;
        e0Var.f445228e = dVar.f122599s;
        e0Var.f445229f = dVar.f122600t;
        return e0Var;
    }

    @Override // qi3.c
    public boolean j() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(this.f381171i.f122581a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof jg0.l
            if (r0 == 0) goto L13
            r0 = r9
            jg0.l r0 = (jg0.l) r0
            int r1 = r0.f381121h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f381121h = r1
            goto L18
        L13:
            jg0.l r0 = new jg0.l
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f381119f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f381121h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f381117d
            java.lang.Object r0 = r0.f381118e
            qi3.d0 r0 = (qi3.d0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L9b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.i()
            r9.append(r2)
            java.lang.String r2 = " start to sendBypCgi"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r9 = r8.f381171i
            int r6 = r9.f122596p
            r7 = 0
            if (r6 != r3) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.i()
            r0.append(r1)
            java.lang.String r1 = " sendBypCgi end, because endFlag = 1"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            qi3.d0 r9 = r9.f122599s
            if (r9 != 0) goto L7e
            qi3.d0 r9 = new qi3.d0
            r9.<init>(r7)
        L7e:
            return r9
        L7f:
            qi3.d0 r2 = new qi3.d0
            r2.<init>(r7)
            r9.f122599s = r2
            jg0.m r9 = new jg0.m
            r6 = 0
            r9.<init>(r8, r2, r6)
            r0.f381118e = r2
            r0.f381117d = r4
            r0.f381121h = r3
            java.lang.Object r9 = r9.mo146xb9724478(r0)
            if (r9 != r1) goto L99
            return r1
        L99:
            r0 = r2
            r1 = r4
        L9b:
            java.util.Map r9 = r0.f445217b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "send_cgi_cost"
            r9.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof jg0.n
            if (r0 == 0) goto L13
            r0 = r9
            jg0.n r0 = (jg0.n) r0
            int r1 = r0.f381129h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f381129h = r1
            goto L18
        L13:
            jg0.n r0 = new jg0.n
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f381127f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f381129h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f381125d
            java.lang.Object r0 = r0.f381126e
            qi3.d0 r0 = (qi3.d0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L9b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.i()
            r9.append(r2)
            java.lang.String r2 = " start to sendCgi"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r9 = r8.f381171i
            int r6 = r9.f122596p
            r7 = 0
            if (r6 != r3) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.i()
            r0.append(r1)
            java.lang.String r1 = " sendCgi end, because endFlag = 1"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            qi3.d0 r9 = r9.f122599s
            if (r9 != 0) goto L7e
            qi3.d0 r9 = new qi3.d0
            r9.<init>(r7)
        L7e:
            return r9
        L7f:
            qi3.d0 r2 = new qi3.d0
            r2.<init>(r7)
            r9.f122599s = r2
            jg0.o r9 = new jg0.o
            r6 = 0
            r9.<init>(r8, r2, r6)
            r0.f381126e = r2
            r0.f381125d = r4
            r0.f381129h = r3
            java.lang.Object r9 = r9.mo146xb9724478(r0)
            if (r9 != r1) goto L99
            return r1
        L99:
            r0 = r2
            r1 = r4
        L9b:
            java.util.Map r9 = r0.f445217b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "send_cgi_cost"
            r9.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.c, qi3.b0
    public void x() {
        super.x();
        cv.h1 h1Var = (cv.h1) i95.n0.c(cv.h1.class);
        cg0.d dVar = this.f381171i;
        java.lang.String str = dVar.f122582b;
        ((bv.p0) h1Var).getClass();
        w21.w0 j17 = w21.x0.j(str);
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsg.VoiceMsgSendTask", "setCancel, Get info Failed fileName:" + dVar.f122582b);
            return;
        }
        long j18 = j17.f524029m;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = j18 != 0 ? pt0.f0.f439742b1.k(j17.f524019c, j18) : null;
        cv.h1 h1Var2 = (cv.h1) i95.n0.c(cv.h1.class);
        java.lang.String str2 = j17.f524018b;
        ((bv.p0) h1Var2).getClass();
        boolean e17 = w21.x0.e(k17, str2);
        long j19 = j17.f524029m;
        if (j19 != 0) {
            pt0.f0.f439742b1.b(j17.f524019c, j19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", "cancel record: delete msg ret:" + e17 + dVar.f122582b + " msgLocalId:" + j17.f524029m);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof jg0.t
            if (r0 == 0) goto L13
            r0 = r8
            jg0.t r0 = (jg0.t) r0
            int r1 = r0.f381159h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f381159h = r1
            goto L18
        L13:
            jg0.t r0 = new jg0.t
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f381157f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f381159h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f381155d
            java.lang.Object r0 = r0.f381156e
            qi3.i0 r0 = (qi3.i0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L79
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = r7.i()
            r8.append(r2)
            java.lang.String r2 = " start to uploadAttach"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.VoiceMsg.VoiceMsgSendTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            long r4 = android.os.SystemClock.elapsedRealtime()
            cg0.d r8 = r7.f381171i
            qi3.i0 r2 = r8.f122598r
            if (r2 != 0) goto L64
            qi3.i0 r2 = new qi3.i0
            r6 = 0
            r2.<init>(r6)
            r8.f122598r = r2
        L64:
            jg0.u r8 = new jg0.u
            r6 = 0
            r8.<init>(r7, r2, r6)
            r0.f381156e = r2
            r0.f381155d = r4
            r0.f381159h = r3
            java.lang.Object r8 = r8.mo146xb9724478(r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            r0 = r2
            r1 = r4
        L79:
            java.util.Map r8 = r0.f445259b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "upload_cost"
            r8.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.x.y(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
