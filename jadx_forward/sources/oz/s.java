package oz;

@j95.b
/* loaded from: classes12.dex */
public final class s extends jm0.o implements pz.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f431720m = new java.lang.Object();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedHashMap f431721n = new java.util.LinkedHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p721x551ac888.C10517xa6a8527b f431722o;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.download.ScheduledDownloadService$networkChangeListener$1] */
    public s() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f431722o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p689xc5a27af6.cdn.api.C10498xeb0bddc>(a0Var) { // from class: com.tencent.mm.feature.download.ScheduledDownloadService$networkChangeListener$1
            {
                this.f39173x3fe91575 = -211003263;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p689xc5a27af6.cdn.api.C10498xeb0bddc c10498xeb0bddc) {
                com.p314xaae8f345.mm.p689xc5a27af6.cdn.api.C10498xeb0bddc event = c10498xeb0bddc;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadService", "networkChangeListener: networkChanged, action=retryPendingTasks");
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    oz.s sVar = oz.s.this;
                    synchronized (sVar.f431720m) {
                        for (oz.b bVar : sVar.f431721n.values()) {
                            if (!bVar.f431678d.isEmpty()) {
                                oz.v vVar = bVar.f431677c;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.util.Iterator it = vVar.f431727a.f277869d.iterator();
                                while (it.hasNext()) {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.y9 y9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.y9) it.next();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y9Var);
                                    if (bVar.f431678d.contains(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(y9Var.f277917d, y9Var.f277920g))) {
                                        arrayList.add(y9Var);
                                    }
                                }
                                for (com.p314xaae8f345.mm.p2621x8fb0427b.y9 y9Var2 : vVar.f431728b.values()) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y9Var2);
                                    if (bVar.f431678d.contains(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(y9Var2.f277917d, y9Var2.f277920g))) {
                                        arrayList.add(y9Var2);
                                    }
                                }
                                java.util.Iterator it6 = arrayList.iterator();
                                int i17 = 0;
                                while (it6.hasNext()) {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.y9 y9Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.y9) it6.next();
                                    y9Var3.f277918e = 0L;
                                    oz.v vVar2 = bVar.f431677c;
                                    vVar2.getClass();
                                    if (vVar2.f431727a.f277869d.contains(y9Var3)) {
                                        vVar2.d();
                                    }
                                    i17++;
                                }
                                if (i17 > 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadService", "resetCooldownForCellularLimitedTasks: scene=" + bVar.f431675a + ", resetCount=" + i17);
                                }
                            }
                        }
                    }
                    sVar.hj();
                }
                return false;
            }
        };
    }

    public static final void Zi(oz.s sVar, int i17, oz.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        synchronized (sVar.f431720m) {
            bVar.f431679e.remove(c16564xb55e1d5);
            if (bVar.f431680f.remove(c16564xb55e1d5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadService", "handleDownloadResult[" + bVar.f431675a + "]: cancelled, msgId=" + c16564xb55e1d5.f231013d + ", retCode=" + i17);
                bVar.f431678d.remove(c16564xb55e1d5);
                bVar.f431677c.b(c16564xb55e1d5);
                return;
            }
            if (!gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScheduledDownloadService", "handleDownloadResult[" + bVar.f431675a + "]: skip, reason=accountNotReady, msgId=" + c16564xb55e1d5.f231013d);
                return;
            }
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
            if (i17 == -21230) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadService", "handleDownloadResult[" + bVar.f431675a + "]: mobileLimited, msgId=" + c16564xb55e1d5.f231013d + ", retCode=" + i17);
                synchronized (sVar.f431720m) {
                    bVar.f431678d.add(c16564xb55e1d5);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadService", "handleDownloadResult[" + bVar.f431675a + "]: done, msgId=" + c16564xb55e1d5.f231013d + ", retCode=" + i17);
                synchronized (sVar.f431720m) {
                    bVar.f431678d.remove(c16564xb55e1d5);
                    bVar.f431677c.b(c16564xb55e1d5);
                }
            }
            sVar.ij(bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0144, code lost:
    
        if (r12.f277919f <= r10.f277919f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014d A[Catch: all -> 0x029e, TryCatch #5 {all -> 0x029e, blocks: (B:154:0x013e, B:115:0x014d, B:117:0x0155, B:136:0x0279, B:142:0x027f, B:125:0x028b, B:133:0x0291, B:145:0x0160, B:149:0x0174), top: B:153:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0181 A[EDGE_INSN: B:144:0x0181->B:54:0x0181 BREAK  A[LOOP:3: B:50:0x0134->B:131:0x0134], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x014b A[EDGE_INSN: B:152:0x014b->B:53:0x014b BREAK  A[LOOP:3: B:50:0x0134->B:131:0x0134], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void aj(oz.s r17, oz.b r18) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.s.aj(oz.s, oz.b):void");
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        synchronized (this.f431720m) {
            oz.b bVar = new oz.b("auto_sync", new oz.a(1000L, true, "ScheduledDownload_auto_sync", ""));
            this.f431721n.put(bVar.f431675a, bVar);
            oz.b bVar2 = new oz.b("voice_download", new oz.a(1000L, false, "ScheduledDownload_voice_download", "voice_download"));
            this.f431721n.put(bVar2.f431675a, bVar2);
            java.util.Collection values = this.f431721n.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (it.hasNext()) {
                ((oz.b) it.next()).a();
            }
        }
        mo48813x58998cd();
    }

    @Override // jm0.o
    public void Vi() {
        mo48814x2efc64();
        synchronized (this.f431720m) {
            java.util.Collection values = this.f431721n.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (it.hasNext()) {
                ((oz.b) it.next()).b();
            }
        }
    }

    public void bj(long j17, java.lang.String talker, java.lang.String scene, boolean z17, boolean z18) {
        oz.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        synchronized (this.f431720m) {
            bVar = (oz.b) this.f431721n.get(scene);
        }
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScheduledDownloadService", "addTask: skip, reason=unknownScene, scene=" + scene + ", msgId=" + j17);
            return;
        }
        if (bVar.f431676b.f431672b) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE);
            java.lang.Boolean bool = m17 instanceof java.lang.Boolean ? (java.lang.Boolean) m17 : null;
            if (!(bool != null ? bool.booleanValue() : false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduledDownloadService", "addTask: skip, reason=autoSyncDisabled, scene=" + scene + ", msgId=" + j17 + ", talker=" + talker);
                return;
            }
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScheduledDownloadService", "addTask: skip, reason=accountNotReady, scene=" + scene + ", msgId=" + j17);
            return;
        }
        synchronized (this.f431720m) {
            bVar.f431677c.a(j17, talker, z17);
        }
        if (z18) {
            ((ku5.t0) ku5.t0.f394148d).l(new oz.m(this, bVar), 0L, bVar.f431676b.f431673c);
        } else {
            ij(bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0463  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oz.l cj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r20, oz.b r21, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 r22) {
        /*
            Method dump skipped, instructions count: 1253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.s.cj(com.tencent.mm.storage.f9, oz.b, com.tencent.mm.plugin.msg.MsgIdTalker):oz.l");
    }

    public final long fj() {
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20152x9d204b07());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getExptString(...)");
        java.lang.Long j17 = r26.h0.j(f17);
        long j18 = 1024;
        return (j17 != null ? j17.longValue() : 80L) * j18 * j18;
    }

    public void hj() {
        java.util.List<oz.b> S0;
        synchronized (this.f431720m) {
            java.util.Collection values = this.f431721n.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            S0 = kz5.n0.S0(values);
        }
        for (oz.b bVar : S0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            ij(bVar);
        }
    }

    public final void ij(oz.b bVar) {
        ku5.u0 u0Var = ku5.t0.f394148d;
        oz.r rVar = new oz.r(this, bVar);
        oz.a aVar = bVar.f431676b;
        ((ku5.t0) u0Var).l(rVar, aVar.f431671a, aVar.f431673c);
    }

    @Override // jm0.o
    public java.lang.String wi() {
        return "MicroMsg.ScheduledDownloadService";
    }
}
