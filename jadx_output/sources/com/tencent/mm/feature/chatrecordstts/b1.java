package com.tencent.mm.feature.chatrecordstts;

@j95.b
/* loaded from: classes12.dex */
public final class b1 extends jm0.o implements oy.i {
    public kotlinx.coroutines.sync.d A;
    public final com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$revokeMsgListener$1 C;
    public final com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$deleteMsgListener$1 D;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.feature.chatrecordstts.j f65354q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.feature.chatrecordstts.f f65356s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f65357t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope f65358u;

    /* renamed from: v, reason: collision with root package name */
    public f25.m0 f65359v;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.feature.chatrecordstts.f1 f65361x;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.feature.chatrecordstts.i f65363z;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f65350m = jz5.h.b(com.tencent.mm.feature.chatrecordstts.d0.f65384d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f65351n = jz5.h.b(com.tencent.mm.feature.chatrecordstts.x.f65556d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f65352o = jz5.h.b(com.tencent.mm.feature.chatrecordstts.b0.f65349d);

    /* renamed from: p, reason: collision with root package name */
    public oy.k f65353p = oy.k.f349823d;

    /* renamed from: r, reason: collision with root package name */
    public final kz5.q f65355r = new kz5.q();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f65360w = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f65362y = kotlinx.coroutines.sync.l.a(false, 1, null);
    public final jz5.g B = jz5.h.b(com.tencent.mm.feature.chatrecordstts.e0.f65395d);

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$revokeMsgListener$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$deleteMsgListener$1] */
    public b1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeMsgEvent>(a0Var) { // from class: com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$revokeMsgListener$1
            {
                this.__eventId = 675629679;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent) {
                com.tencent.mm.storage.f9 f9Var;
                com.tencent.mm.autogen.events.RevokeMsgEvent event = revokeMsgEvent;
                kotlin.jvm.internal.o.g(event, "event");
                long j17 = event.f54713g.f6394a;
                com.tencent.mm.feature.chatrecordstts.b1 b1Var = com.tencent.mm.feature.chatrecordstts.b1.this;
                com.tencent.mm.feature.chatrecordstts.j jVar = b1Var.f65354q;
                if (jVar == null || (f9Var = jVar.f65467a) == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "revokeMsgListener current message not found");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "revokeMsgListener callback revokedMsgId=" + j17 + " currentMsgId=" + f9Var.getMsgId() + " state=" + b1Var.f65353p);
                    if (b1Var.f65353p == oy.k.f349823d) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "revokeMsgListener idle");
                    } else if (f9Var.getMsgId() != j17) {
                        kz5.q qVar = b1Var.f65355r;
                        java.util.Iterator it = qVar.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i17 = -1;
                                break;
                            }
                            if (((com.tencent.mm.storage.f9) it.next()).getMsgId() == j17) {
                                break;
                            }
                            i17++;
                        }
                        if (i17 >= 0 && i17 < qVar.d()) {
                            b1Var.nj();
                            qVar.subList(i17, qVar.d()).clear();
                            b1Var.pj();
                        }
                    } else if (kotlinx.coroutines.sync.c.b(b1Var.f65362y, null, 1, null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "revokeMsgListener current message revoked, handling");
                        com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope = b1Var.f65358u;
                        if (supervisedLifecycleScope != null) {
                            v65.i.b(supervisedLifecycleScope, null, new com.tencent.mm.feature.chatrecordstts.r0(b1Var, event, null), 1, null);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "revokeMsgListener already handling revoke");
                    }
                }
                return false;
            }
        };
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DeleteMsgEvent>(a0Var) { // from class: com.tencent.mm.feature.chatrecordstts.ChatRecordsTtsService$deleteMsgListener$1
            {
                this.__eventId = 1188678804;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DeleteMsgEvent deleteMsgEvent) {
                java.lang.String Q0;
                com.tencent.mm.autogen.events.DeleteMsgEvent event = deleteMsgEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.feature.chatrecordstts.b1 b1Var = com.tencent.mm.feature.chatrecordstts.b1.this;
                if (b1Var.f65353p == oy.k.f349823d) {
                    return false;
                }
                com.tencent.mm.feature.chatrecordstts.j jVar = b1Var.f65354q;
                oy.l lVar = (jVar == null || (Q0 = jVar.f65467a.Q0()) == null) ? null : new oy.l(Q0, jVar.f65467a.getMsgId());
                if (lVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "deleteMsgListener playingInfo is null, state=" + b1Var.f65353p);
                    return false;
                }
                am.y3 y3Var = event.f54086g;
                java.lang.String str = y3Var != null ? y3Var.f8427c : null;
                if (str == null || y3Var == null) {
                    return false;
                }
                long j17 = y3Var.f8425a;
                if (!kotlin.jvm.internal.o.b(str, lVar.f349828a) || j17 == -1) {
                    return false;
                }
                if (j17 == Long.MIN_VALUE) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "deleteMsgListener bulk deletion for talker: " + str + ", stopping playback");
                    b1Var.tj();
                    com.tencent.mm.feature.chatrecordstts.i iVar = b1Var.f65363z;
                    if (iVar == null) {
                        return false;
                    }
                    iVar.b(3);
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "deleteMsgListener single message deleted: msgId=" + j17 + ", talker=" + str);
                com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope = b1Var.f65358u;
                if (supervisedLifecycleScope == null) {
                    return false;
                }
                v65.i.b(supervisedLifecycleScope, null, new com.tencent.mm.feature.chatrecordstts.z(b1Var, j17, null), 1, null);
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
    public static final java.lang.Object aj(com.tencent.mm.feature.chatrecordstts.b1 r20, com.tencent.mm.storage.f9 r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.b1.aj(com.tencent.mm.feature.chatrecordstts.b1, com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
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
    public static final java.lang.Object bj(com.tencent.mm.feature.chatrecordstts.b1 r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.b1.bj(com.tencent.mm.feature.chatrecordstts.b1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(com.tencent.mm.feature.chatrecordstts.x1.class);
    }

    public final void Zi() {
        f25.m0 m0Var = this.f65359v;
        jz5.f0 f0Var = null;
        if (m0Var != null) {
            if (((g25.e) m0Var).f267980c) {
                ((f25.n0) ((jz5.n) this.f65351n).getValue()).yg(m0Var);
                this.f65359v = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "abandonAudioFocus");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "abandonAudioFocus skipped, no focus");
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "abandonAudioFocus skipped, no session");
        }
    }

    public final java.lang.Object cj(com.tencent.mm.feature.chatrecordstts.j jVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "addPlayTtsTask text length=" + str.length());
        com.tencent.mm.feature.chatrecordstts.k2 k2Var = jVar.f65470d;
        com.tencent.mm.feature.chatrecordstts.c2 c2Var = new com.tencent.mm.feature.chatrecordstts.c2(new com.tencent.mm.feature.chatrecordstts.k(this, str, null), new com.tencent.mm.feature.chatrecordstts.l(this, null), new com.tencent.mm.feature.chatrecordstts.m(this, null), new com.tencent.mm.feature.chatrecordstts.n(this, null), new com.tencent.mm.feature.chatrecordstts.p(this, str, null));
        k2Var.getClass();
        java.lang.Object b17 = k2Var.b(kz5.b0.c(c2Var), continuation);
        pz5.a aVar = pz5.a.f359186d;
        jz5.f0 f0Var = jz5.f0.f302826a;
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
    public final java.lang.Object fj(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.tencent.mm.feature.chatrecordstts.w
            if (r0 == 0) goto L13
            r0 = r5
            com.tencent.mm.feature.chatrecordstts.w r0 = (com.tencent.mm.feature.chatrecordstts.w) r0
            int r1 = r0.f65549g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65549g = r1
            goto L18
        L13:
            com.tencent.mm.feature.chatrecordstts.w r0 = new com.tencent.mm.feature.chatrecordstts.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f65547e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f65549g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f65546d
            com.tencent.mm.feature.chatrecordstts.b1 r0 = (com.tencent.mm.feature.chatrecordstts.b1) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            com.tencent.mm.feature.chatrecordstts.j r5 = r4.f65354q
            if (r5 == 0) goto L49
            com.tencent.mm.feature.chatrecordstts.k2 r5 = r5.f65470d
            if (r5 == 0) goto L49
            r0.f65546d = r4
            r0.f65549g = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            r5 = 0
            r0.f65354q = r5
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.b1.fj(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object hj(com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = this.f65357t;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatRecordsTtsService", "fetchNextBatch failed, talker is null, lastMsgId=" + f9Var.getMsgId());
            return java.lang.Boolean.FALSE;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "fetchNextBatch start talker=" + str + " lastMsgId=" + f9Var.getMsgId() + " createTime=" + f9Var.getCreateTime());
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.feature.chatrecordstts.a0(this, str, f9Var, null), continuation);
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
    public oy.m ij(com.tencent.mm.storage.f9 r31, kz5.q r32, com.tencent.mm.storage.f9 r33, java.lang.Boolean r34) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.b1.ij(com.tencent.mm.storage.f9, kz5.q, com.tencent.mm.storage.f9, java.lang.Boolean):oy.m");
    }

    public final cv.f1 mj() {
        return (cv.f1) ((jz5.n) this.f65350m).getValue();
    }

    public void nj() {
        oy.k kVar = this.f65353p;
        if (kVar != oy.k.f349825f && kVar != oy.k.f349824e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "hold ignored, state=" + this.f65353p);
            return;
        }
        kotlinx.coroutines.sync.d dVar = this.A;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "hold failed, holdMutex is null");
        } else if (kotlinx.coroutines.sync.c.b(dVar, null, 1, null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "hold started");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "hold already active");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public final java.util.List oj(final java.lang.String str, final long j17) {
        java.util.ArrayList arrayList;
        final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) ((xg3.m0) ((jz5.n) this.B).getValue());
        final java.lang.String X8 = g9Var.X8(str);
        if (g9Var.Da(X8)) {
            final int i17 = 50;
            final int i18 = 50;
            arrayList = ot0.c3.l().e("getAllMessageAfterCreateTimeIncludingSys", new yz5.a() { // from class: com.tencent.mm.storage.g9$$o6
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return new java.util.ArrayList(ot0.z2.f348822a.n(com.tencent.mm.storage.g9.this.f193989r, X8, str, j17, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$p6
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                    g9Var2.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var2.f193989r.f("Select * From " + X8 + " Where " + g9Var2.Z8(str) + " AND createTime > ? Order By createTime Asc Limit " + i18 + ";", new java.lang.String[]{"" + j17}, 2);
                    while (f17.moveToNext()) {
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.convertFrom(f17);
                        arrayList2.add(f9Var);
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList2);
                }
            });
        } else if (g9Var.Pb(X8)) {
            arrayList = ot0.z2.f348822a.n(g9Var.f193989r, X8, str, j17, 50);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.database.Cursor f17 = g9Var.f193989r.f("Select * From " + X8 + " Where " + g9Var.Z8(str) + " AND createTime > ? Order By createTime Asc Limit 50;", new java.lang.String[]{"" + j17}, 2);
            while (f17.moveToNext()) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(f17);
                arrayList2.add(f9Var);
            }
            f17.close();
            arrayList = arrayList2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "loadMessagesAfter talker=" + str + " createTime=" + j17 + " loaded=" + arrayList.size() + " messages");
        return arrayList;
    }

    public void pj() {
        kotlinx.coroutines.sync.d dVar = this.A;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "releaseHold failed, holdMutex is null");
            return;
        }
        try {
            if (((kotlinx.coroutines.sync.k) dVar).a()) {
                kotlinx.coroutines.sync.c.c(dVar, null, 1, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "hold released");
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "releaseHold called but not holding");
            }
        } catch (java.lang.IllegalStateException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "releaseHold mutex already unlocked by another thread");
        }
    }

    public final boolean qj() {
        Zi();
        f25.m0 m96 = ((f25.n0) ((jz5.n) this.f65351n).getValue()).m9(new f25.j("MicroMsg.ChatRecordsTtsService"), new com.tencent.mm.feature.chatrecordstts.p0(this));
        this.f65359v = m96;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestAudioFocus gainFocus=");
        g25.e eVar = (g25.e) m96;
        sb6.append(eVar.f267980c);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", sb6.toString());
        if (eVar.f267980c) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "requestAudioFocus failed to gain focus");
        tj();
        com.tencent.mm.feature.chatrecordstts.i iVar = this.f65363z;
        if (iVar == null) {
            return false;
        }
        iVar.b(3);
        return false;
    }

    public void rj() {
        if (this.f65353p != oy.k.f349826g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "resume ignored, state=" + this.f65353p);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "resume state=" + this.f65353p);
        qj();
        wj(oy.k.f349825f, true);
        com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope = this.f65358u;
        if (supervisedLifecycleScope != null) {
            v65.i.b(supervisedLifecycleScope, null, new com.tencent.mm.feature.chatrecordstts.q0(this, null), 1, null);
        }
        com.tencent.mm.feature.chatrecordstts.i iVar = this.f65363z;
        if (iVar != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.feature.chatrecordstts.g gVar = iVar.f65456a;
            gVar.f65432c = currentTimeMillis;
            ((cy1.a) iVar.a()).Ej("chat_hear_msg_play", kz5.c1.m(gVar.f65430a, kz5.b1.e(new jz5.l("hear_play_type", 2))), 33488);
        }
    }

    public java.lang.Object sj(kotlin.coroutines.Continuation continuation) {
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.i3.f310478d, new com.tencent.mm.feature.chatrecordstts.x0(this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final void tj() {
        gm0.b bVar;
        vj();
        gm0.m b17 = gm0.j1.b();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = (b17 == null || (bVar = b17.f273245h) == null) ? null : bVar.f273145e;
        if (lifecycleScope != null) {
            v65.i.c(lifecycleScope, null, new com.tencent.mm.feature.chatrecordstts.y0(this, null), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object uj(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.tencent.mm.feature.chatrecordstts.z0
            if (r0 == 0) goto L13
            r0 = r5
            com.tencent.mm.feature.chatrecordstts.z0 r0 = (com.tencent.mm.feature.chatrecordstts.z0) r0
            int r1 = r0.f65571g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65571g = r1
            goto L18
        L13:
            com.tencent.mm.feature.chatrecordstts.z0 r0 = new com.tencent.mm.feature.chatrecordstts.z0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f65569e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f65571g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f65568d
            com.tencent.mm.feature.chatrecordstts.b1 r0 = (com.tencent.mm.feature.chatrecordstts.b1) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            r0.f65568d = r4
            r0.f65571g = r3
            java.lang.Object r5 = r4.sj(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.tencent.mm.feature.chatrecordstts.i r5 = r0.f65363z
            if (r5 == 0) goto L4a
            r0 = 3
            r5.b(r0)
        L4a:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.chatrecordstts.b1.uj(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void vj() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "stop state=" + this.f65353p);
        wj(oy.k.f349823d, true);
        Zi();
        dead();
        dead();
        com.tencent.mm.feature.chatrecordstts.SupervisedLifecycleScope supervisedLifecycleScope = this.f65358u;
        if (supervisedLifecycleScope != null) {
            kotlinx.coroutines.z0.c(supervisedLifecycleScope, null);
        }
        this.f65358u = null;
        com.tencent.mm.feature.chatrecordstts.f fVar = this.f65356s;
        if (fVar != null) {
            fVar.d();
        }
        this.f65356s = null;
        ((pn4.z) mj()).stop();
        com.tencent.mm.feature.chatrecordstts.f1 f1Var = this.f65361x;
        if (f1Var != null && f1Var.f65421e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConditionWatchdog", "stop");
            f1Var.f65421e = false;
            kotlinx.coroutines.r2 r2Var = f1Var.f65420d;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            f1Var.f65420d = null;
        }
        this.f65361x = null;
        this.f65355r.clear();
        this.f65357t = null;
        kotlinx.coroutines.sync.d dVar = this.A;
        if (dVar != null) {
            try {
                if (((kotlinx.coroutines.sync.k) dVar).a()) {
                    kotlinx.coroutines.sync.c.c(dVar, null, 1, null);
                }
            } catch (java.lang.IllegalStateException unused) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChatRecordsTtsService", "syncStopInner holdMutex already unlocked");
            }
        }
        this.A = null;
    }

    public final void wj(oy.k kVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsService", "updateState newState=" + kVar + ", oldState=" + this.f65353p);
        this.f65353p = kVar;
        com.tencent.mm.feature.chatrecordstts.r1.c(false, new com.tencent.mm.feature.chatrecordstts.m0(kVar));
        if (z17) {
            com.tencent.mm.feature.chatrecordstts.r1.c(true, new com.tencent.mm.feature.chatrecordstts.a1(this, kVar));
        }
    }
}
