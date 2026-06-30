package v13;

/* loaded from: classes5.dex */
public final class e extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public long f514064f;

    /* renamed from: g, reason: collision with root package name */
    public long f514065g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.i f514066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218912d;
        if (tVar != null) {
            tVar.b(-86016, new v13.a(this));
        }
        final jm0.o oVar = this.f381800d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785>(oVar) { // from class: com.tencent.mm.plugin.fts.plc.FTSQueryClickRecallFSC$onAccountInit$1
            {
                this.f39173x3fe91575 = -981145195;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 event = c6205xeec13785;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkRecallRequest timeInterval:");
                v13.e eVar = v13.e.this;
                sb6.append(eVar.f514065g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSQueryClickRecallPLC", sb6.toString());
                java.lang.String str = gm0.j1.b().j() + "_recall_last_request_time";
                long c17 = c01.id.c();
                long j17 = eVar.f514065g;
                if (!new v65.b("MicroMsg.FTSQueryClickRecallPLC", c17, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q(str, 0L), j17 < 600000 ? 600000L : j17).b()) {
                    return false;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B(str, c17);
                com.p314xaae8f345.mm.p944x882e457a.i iVar = eVar.f514066h;
                if (iVar != null) {
                    iVar.j();
                }
                r45.xc4 xc4Var = new r45.xc4();
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152200d = 4534;
                lVar.f152199c = "/cgi-bin/mmsearch-bin/localsearchdict";
                lVar.f152197a = xc4Var;
                lVar.f152198b = new r45.yc4();
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                com.p314xaae8f345.mm.p944x882e457a.i iVar2 = new com.p314xaae8f345.mm.p944x882e457a.i();
                iVar2.p(a17);
                eVar.f514066h = iVar2;
                pq5.g l17 = iVar2.l();
                if (l17 == null) {
                    return false;
                }
                l17.q(new v13.b(eVar));
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // jm0.g
    public void S6() {
        com.p314xaae8f345.mm.p944x882e457a.i iVar = this.f514066h;
        if (iVar != null) {
            iVar.j();
        }
    }
}
