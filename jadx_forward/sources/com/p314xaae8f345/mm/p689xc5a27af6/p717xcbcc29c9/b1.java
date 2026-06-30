package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

@j95.b
/* loaded from: classes12.dex */
public final class b1 extends jm0.o implements oy.i {
    public p3325xe03a0797.p3326xc267989b.p3332x361a9b.d A;
    public final com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10510x8a2fd1a4 C;
    public final com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10509x7d3fde9f D;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.j f146887q;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f f146889s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f146890t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e f146891u;

    /* renamed from: v, reason: collision with root package name */
    public f25.m0 f146892v;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f1 f146894x;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i f146896z;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f146883m = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.d0.f146917d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f146884n = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.x.f147089d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f146885o = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b0.f146882d);

    /* renamed from: p, reason: collision with root package name */
    public oy.k f146886p = oy.k.f431356d;

    /* renamed from: r, reason: collision with root package name */
    public final kz5.q f146888r = new kz5.q();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f146893w = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f146895y = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);
    public final jz5.g B = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.e0.f146928d);

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$revokeMsgListener$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$deleteMsgListener$1] */
    public b1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.C = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f>(a0Var) { // from class: com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$revokeMsgListener$1
            {
                this.f39173x3fe91575 = 675629679;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f c5945xdd67bc5f) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f event = c5945xdd67bc5f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                long j17 = event.f136246g.f87927a;
                com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1.this;
                com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.j jVar = b1Var.f146887q;
                if (jVar == null || (f9Var = jVar.f147000a) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "revokeMsgListener current message not found");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "revokeMsgListener callback revokedMsgId=" + j17 + " currentMsgId=" + f9Var.m124847x74d37ac6() + " state=" + b1Var.f146886p);
                    if (b1Var.f146886p == oy.k.f431356d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "revokeMsgListener idle");
                    } else if (f9Var.m124847x74d37ac6() != j17) {
                        kz5.q qVar = b1Var.f146888r;
                        java.util.Iterator it = qVar.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i17 = -1;
                                break;
                            }
                            if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).m124847x74d37ac6() == j17) {
                                break;
                            }
                            i17++;
                        }
                        if (i17 >= 0 && i17 < qVar.d()) {
                            b1Var.nj();
                            qVar.subList(i17, qVar.d()).clear();
                            b1Var.pj();
                        }
                    } else if (p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.b(b1Var.f146895y, null, 1, null)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "revokeMsgListener current message revoked, handling");
                        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e = b1Var.f146891u;
                        if (c10511xc2ae2c6e != null) {
                            v65.i.b(c10511xc2ae2c6e, null, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.r0(b1Var, event, null), 1, null);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "revokeMsgListener already handling revoke");
                    }
                }
                return false;
            }
        };
        this.D = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84>(a0Var) { // from class: com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$deleteMsgListener$1
            {
                this.f39173x3fe91575 = 1188678804;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84 c5297xfbfc3e84) {
                java.lang.String Q0;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84 event = c5297xfbfc3e84;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1.this;
                if (b1Var.f146886p == oy.k.f431356d) {
                    return false;
                }
                com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.j jVar = b1Var.f146887q;
                oy.l lVar = (jVar == null || (Q0 = jVar.f147000a.Q0()) == null) ? null : new oy.l(Q0, jVar.f147000a.m124847x74d37ac6());
                if (lVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "deleteMsgListener playingInfo is null, state=" + b1Var.f146886p);
                    return false;
                }
                am.y3 y3Var = event.f135619g;
                java.lang.String str = y3Var != null ? y3Var.f89960c : null;
                if (str == null || y3Var == null) {
                    return false;
                }
                long j17 = y3Var.f89958a;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, lVar.f431361a) || j17 == -1) {
                    return false;
                }
                if (j17 == Long.MIN_VALUE) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "deleteMsgListener bulk deletion for talker: " + str + ", stopping playback");
                    b1Var.tj();
                    com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i iVar = b1Var.f146896z;
                    if (iVar == null) {
                        return false;
                    }
                    iVar.b(3);
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "deleteMsgListener single message deleted: msgId=" + j17 + ", talker=" + str);
                com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e = b1Var.f146891u;
                if (c10511xc2ae2c6e == null) {
                    return false;
                }
                v65.i.b(c10511xc2ae2c6e, null, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.z(b1Var, j17, null), 1, null);
                return false;
            }
        };
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object aj(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 r20, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1.aj(com.tencent.mm.feature.chatrecordstts.b1, com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0646, code lost:
    
        if (r0.sj(r3) == r4) goto L186;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0031. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0490  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x061f -> B:18:0x0627). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x066f -> B:24:0x066d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object bj(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1.bj(com.tencent.mm.feature.chatrecordstts.b1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.x1.class);
    }

    public final void Zi() {
        f25.m0 m0Var = this.f146892v;
        jz5.f0 f0Var = null;
        if (m0Var != null) {
            if (((g25.e) m0Var).f349513c) {
                ((f25.n0) ((jz5.n) this.f146884n).mo141623x754a37bb()).yg(m0Var);
                this.f146892v = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "abandonAudioFocus");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "abandonAudioFocus skipped, no focus");
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "abandonAudioFocus skipped, no session");
        }
    }

    public final java.lang.Object cj(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.j jVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "addPlayTtsTask text length=" + str.length());
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.k2 k2Var = jVar.f147003d;
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.c2 c2Var = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.c2(new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.k(this, str, null), new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.l(this, null), new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.m(this, null), new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.n(this, null), new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.p(this, str, null));
        k2Var.getClass();
        java.lang.Object b17 = k2Var.b(kz5.b0.c(c2Var), interfaceC29045xdcb5ca57);
        pz5.a aVar = pz5.a.f440719d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (b17 != aVar) {
            b17 = f0Var;
        }
        return b17 == aVar ? b17 : f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fj(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.w
            if (r0 == 0) goto L13
            r0 = r5
            com.tencent.mm.feature.chatrecordstts.w r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.w) r0
            int r1 = r0.f147082g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147082g = r1
            goto L18
        L13:
            com.tencent.mm.feature.chatrecordstts.w r0 = new com.tencent.mm.feature.chatrecordstts.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f147080e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f147082g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f147079d
            com.tencent.mm.feature.chatrecordstts.b1 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            com.tencent.mm.feature.chatrecordstts.j r5 = r4.f146887q
            if (r5 == 0) goto L49
            com.tencent.mm.feature.chatrecordstts.k2 r5 = r5.f147003d
            if (r5 == 0) goto L49
            r0.f147079d = r4
            r0.f147082g = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            r5 = 0
            r0.f146887q = r5
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1.fj(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object hj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str = this.f146890t;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatRecordsTtsService", "fetchNextBatch failed, talker is null, lastMsgId=" + f9Var.m124847x74d37ac6());
            return java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "fetchNextBatch start talker=" + str + " lastMsgId=" + f9Var.m124847x74d37ac6() + " createTime=" + f9Var.mo78012x3fdd41df());
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.a0(this, str, f9Var, null), interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Code restructure failed: missing block: B:409:0x0849, code lost:
    
        if (r0 == null) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x091a, code lost:
    
        if (r5 == null) goto L456;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0a50 A[EDGE_INSN: B:504:0x0a50->B:505:0x0a50 BREAK  A[LOOP:0: B:473:0x09fd->B:500:0x09fd], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oy.m ij(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r31, kz5.q r32, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r33, java.lang.Boolean r34) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1.ij(com.tencent.mm.storage.f9, kz5.q, com.tencent.mm.storage.f9, java.lang.Boolean):oy.m");
    }

    public final cv.f1 mj() {
        return (cv.f1) ((jz5.n) this.f146883m).mo141623x754a37bb();
    }

    public void nj() {
        oy.k kVar = this.f146886p;
        if (kVar != oy.k.f431358f && kVar != oy.k.f431357e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "hold ignored, state=" + this.f146886p);
            return;
        }
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = this.A;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "hold failed, holdMutex is null");
        } else if (p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.b(dVar, null, 1, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "hold started");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "hold already active");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public final java.util.List oj(final java.lang.String str, final long j17) {
        java.util.ArrayList arrayList;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) ((xg3.m0) ((jz5.n) this.B).mo141623x754a37bb());
        final java.lang.String X8 = g9Var.X8(str);
        if (g9Var.Da(X8)) {
            final int i17 = 50;
            final int i18 = 50;
            arrayList = ot0.c3.l().e("getAllMessageAfterCreateTimeIncludingSys", new yz5.a() { // from class: com.tencent.mm.storage.g9$$o6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return new java.util.ArrayList(ot0.z2.f430355a.n(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, j17, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$p6
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var2.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var2.f275522r.f("Select * From " + X8 + " Where " + g9Var2.Z8(str) + " AND createTime > ? Order By createTime Asc Limit " + i18 + ";", new java.lang.String[]{"" + j17}, 2);
                    while (f17.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(f17);
                        arrayList2.add(f9Var);
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList2);
                }
            });
        } else if (g9Var.Pb(X8)) {
            arrayList = ot0.z2.f430355a.n(g9Var.f275522r, X8, str, j17, 50);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.database.Cursor f17 = g9Var.f275522r.f("Select * From " + X8 + " Where " + g9Var.Z8(str) + " AND createTime > ? Order By createTime Asc Limit 50;", new java.lang.String[]{"" + j17}, 2);
            while (f17.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(f17);
                arrayList2.add(f9Var);
            }
            f17.close();
            arrayList = arrayList2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "loadMessagesAfter talker=" + str + " createTime=" + j17 + " loaded=" + arrayList.size() + " messages");
        return arrayList;
    }

    public void pj() {
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = this.A;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "releaseHold failed, holdMutex is null");
            return;
        }
        try {
            if (((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).a()) {
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.c(dVar, null, 1, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "hold released");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "releaseHold called but not holding");
            }
        } catch (java.lang.IllegalStateException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "releaseHold mutex already unlocked by another thread");
        }
    }

    public final boolean qj() {
        Zi();
        f25.m0 m96 = ((f25.n0) ((jz5.n) this.f146884n).mo141623x754a37bb()).m9(new f25.j("MicroMsg.ChatRecordsTtsService"), new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.p0(this));
        this.f146892v = m96;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestAudioFocus gainFocus=");
        g25.e eVar = (g25.e) m96;
        sb6.append(eVar.f349513c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", sb6.toString());
        if (eVar.f349513c) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "requestAudioFocus failed to gain focus");
        tj();
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i iVar = this.f146896z;
        if (iVar == null) {
            return false;
        }
        iVar.b(3);
        return false;
    }

    public void rj() {
        if (this.f146886p != oy.k.f431359g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "resume ignored, state=" + this.f146886p);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "resume state=" + this.f146886p);
        qj();
        wj(oy.k.f431358f, true);
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e = this.f146891u;
        if (c10511xc2ae2c6e != null) {
            v65.i.b(c10511xc2ae2c6e, null, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.q0(this, null), 1, null);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.i iVar = this.f146896z;
        if (iVar != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.g gVar = iVar.f146989a;
            gVar.f146965c = currentTimeMillis;
            ((cy1.a) iVar.a()).Ej("chat_hear_msg_play", kz5.c1.m(gVar.f146963a, kz5.b1.e(new jz5.l("hear_play_type", 2))), 33488);
        }
    }

    public java.lang.Object sj(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.i3.f392011d, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.x0(this, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    public final void tj() {
        gm0.b bVar;
        vj();
        gm0.m b17 = gm0.j1.b();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = (b17 == null || (bVar = b17.f354778h) == null) ? null : bVar.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.c(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.y0(this, null), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object uj(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.z0
            if (r0 == 0) goto L13
            r0 = r5
            com.tencent.mm.feature.chatrecordstts.z0 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.z0) r0
            int r1 = r0.f147104g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147104g = r1
            goto L18
        L13:
            com.tencent.mm.feature.chatrecordstts.z0 r0 = new com.tencent.mm.feature.chatrecordstts.z0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f147102e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f147104g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f147101d
            com.tencent.mm.feature.chatrecordstts.b1 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            r0.f147101d = r4
            r0.f147104g = r3
            java.lang.Object r5 = r4.sj(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.tencent.mm.feature.chatrecordstts.i r5 = r0.f146896z
            if (r5 == 0) goto L4a
            r0 = 3
            r5.b(r0)
        L4a:
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1.uj(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void vj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "stop state=" + this.f146886p);
        wj(oy.k.f431356d, true);
        Zi();
        mo48814x2efc64();
        mo48814x2efc64();
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e = this.f146891u;
        if (c10511xc2ae2c6e != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(c10511xc2ae2c6e, null);
        }
        this.f146891u = null;
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f fVar = this.f146889s;
        if (fVar != null) {
            fVar.d();
        }
        this.f146889s = null;
        ((pn4.z) mj()).m158777x360802();
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f1 f1Var = this.f146894x;
        if (f1Var != null && f1Var.f146954e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConditionWatchdog", "stop");
            f1Var.f146954e = false;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = f1Var.f146953d;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            f1Var.f146953d = null;
        }
        this.f146894x = null;
        this.f146888r.clear();
        this.f146890t = null;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = this.A;
        if (dVar != null) {
            try {
                if (((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).a()) {
                    p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.c(dVar, null, 1, null);
                }
            } catch (java.lang.IllegalStateException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsTtsService", "syncStopInner holdMutex already unlocked");
            }
        }
        this.A = null;
    }

    public final void wj(oy.k kVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "updateState newState=" + kVar + ", oldState=" + this.f146886p);
        this.f146886p = kVar;
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.r1.c(false, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.m0(kVar));
        if (z17) {
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.r1.c(true, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.a1(this, kVar));
        }
    }
}
