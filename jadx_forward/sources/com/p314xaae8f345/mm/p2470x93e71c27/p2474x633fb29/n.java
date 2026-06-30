package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes8.dex */
public final class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f270916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v f270917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f270918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f270919d;

    public n(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17) {
        this.f270916a = c0Var;
        this.f270917b = vVar;
        this.f270918c = interfaceC29045xdcb5ca57;
        this.f270919d = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o rr6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFinderLiveLogic", "getBizFinderLives callback " + i17 + ", " + i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f270916a;
        if (c0Var.f391645d) {
            return;
        }
        boolean z17 = true;
        c0Var.f391645d = true;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v vVar = this.f270917b;
        if (vVar != null) {
            vVar.a(i18, i18, str, rr6);
        }
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f270918c;
        try {
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.v(2L);
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            b0Var.v(1L);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = rr6.f152244b.f152233a;
            if (!(fVar instanceof r45.qk)) {
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizFinderLiveResp");
            r45.qk qkVar = (r45.qk) fVar;
            java.util.LinkedList linkedList = qkVar.f465596d;
            if (qk.ka.a()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService");
                if (R == null || R.o("BizTimeLineFinderLiveStatus", 1) != 0) {
                    z17 = false;
                }
                if (z17) {
                    linkedList.clear();
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBizFinderLives card scene = ");
            sb6.append(this.f270919d);
            sb6.append(" size=");
            sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
            sb6.append(" interval=");
            sb6.append(qkVar.f465599g);
            sb6.append(" funcFlag=");
            sb6.append(qkVar.f465601i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFinderLiveLogic", sb6.toString());
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = qkVar.f465597e;
            if (gVar != null && gVar.f273689a.length > 0) {
                b0Var.h().H("FinderLiveBuffer", qkVar.f465597e.g());
            }
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(qkVar));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.v(3L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFinderLiveLogic", "callback ex " + e17.getMessage());
        }
    }
}
