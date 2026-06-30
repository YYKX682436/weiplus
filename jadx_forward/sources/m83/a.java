package m83;

/* loaded from: classes14.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m83.c f406249a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m83.c cVar, android.os.Looper looper) {
        super(looper);
        this.f406249a = cVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message == null || message.what != 59998) {
            return;
        }
        int i17 = message.arg1;
        m83.c cVar = this.f406249a;
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEVFAILED");
            m83.b bVar = cVar.f406255f;
            if (bVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) bVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onStartEngineFailed, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
                if (jVar.j(6, 0)) {
                    jVar.i(6, null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572306aq1), 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_RESET");
            int i18 = message.arg2;
            if (i18 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_BROKEN");
                m83.b bVar2 = cVar.f406255f;
                if (bVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) bVar2).g(34);
                    return;
                }
                return;
            }
            if (i18 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_FAIL");
                m83.b bVar3 = cVar.f406255f;
                if (bVar3 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) bVar3).g(20);
                    return;
                }
                return;
            }
            if (i18 == 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_NETWORK_ERROR");
                m83.b bVar4 = cVar.f406255f;
                if (bVar4 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) bVar4).g(30);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 6) {
            if (i17 == 9) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_FIRST_PKT");
                return;
            }
            if (i17 != 10) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_ANSWER_MARK");
            cVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "handleChannelAccept");
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.p cj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj();
            cj6.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "handleChannelAccept");
            if (cj6.f224033w) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "current status has accepted, ignore channel accept");
                return;
            }
            cj6.f224034x = true;
            k83.g gVar = cj6.f224031u;
            if (gVar != null) {
                gVar.f386443m = 2;
                c01.d9.e().g(new p83.o(gVar.f386431a, gVar.f386432b, gVar.b(), cj6.f224031u.f386433c, true));
            }
            cj6.k(2);
            return;
        }
        if (cVar.f406253d) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = cVar.f406250a;
        if (c18912x54425f62.m72851x78875944() == 0) {
            c18912x54425f62.J0 = 0;
        } else {
            c18912x54425f62.J0 = 1;
        }
        c18912x54425f62.m72843x780afaed();
        cVar.f406253d = true;
        m83.b bVar5 = cVar.f406255f;
        if (bVar5 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j) bVar5;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "onChannelConnected, currentState: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().a());
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.aj().e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j.f223976u.mo50300x3fa464aa(jVar2.f223986p);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().b()) {
                l83.d Di = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di();
                Di.f398629b.r("ipcall", 4);
                Di.f398629b.getClass();
                Di.f398629b.getClass();
                j83.b bVar6 = Di.f398629b;
                l83.c cVar2 = bVar6.f379694l;
                if (cVar2 != null && !cVar2.f398625c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAudioPlayer", "startPlay");
                    if (cVar2.f398623a == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e();
                        cVar2.f398623a = eVar;
                        eVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.Y1, 1, 20, 1);
                    }
                    cVar2.f398623a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = cVar2.f398623a;
                    eVar2.f257987q = new l83.a(cVar2);
                    if (eVar2.d() <= 0) {
                        m83.d Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                        if (Zi.F == 0) {
                            Zi.F = 1;
                        }
                    }
                    cVar2.f398627e.a(cVar2.f398626d);
                    cVar2.f398625c = true;
                }
                j83.a aVar = bVar6.f379693k;
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) aVar).e(bVar6.d() == 3);
                }
                j83.a aVar2 = bVar6.f379693k;
                if (aVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) aVar2).d(bVar6.d() == 4);
                }
            }
            m83.d Zi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
            Zi2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallReportHelper", "channelConnect");
            Zi2.f406263h = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().c();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().c() || jVar2.f223979f) {
                return;
            }
            m83.d Zi3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
            if (Zi3.f406276u == 0) {
                Zi3.f406276u = java.lang.System.currentTimeMillis();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406250a.m72840x37bd608();
            jVar2.f223979f = true;
            jVar2.f223989s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            jVar2.n();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.l lVar = jVar2.f223977d;
            if (lVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) lVar).f();
            }
            s83.l lVar2 = jVar2.f223978e;
            if (lVar2 != null && lVar2.f72763xa3c65b86 != -1) {
                lVar2.f68177x10a0fed7 = 3;
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar2);
            }
            m83.d Zi4 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
            if (Zi4.f406281z == 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                Zi4.f406281z = currentTimeMillis;
                Zi4.A = currentTimeMillis - Zi4.f406273r;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2.a().c();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2.a();
            a17.getClass();
            a17.f257861f = new java.lang.ref.WeakReference(jVar2);
        }
    }
}
