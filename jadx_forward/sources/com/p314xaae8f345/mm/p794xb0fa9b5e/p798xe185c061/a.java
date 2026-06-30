package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes7.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c f149947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f149948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ im5.c f149949c;

    public a(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c cVar, p3325xe03a0797.p3326xc267989b.q qVar, im5.c cVar2) {
        this.f149947a = cVar;
        this.f149948b = qVar;
        this.f149949c = cVar2;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.lang.String msg = "runCgi onTerminate, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c cVar = this.f149947a;
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.b() + "[Cgi][" + cVar.hashCode() + ']', msg);
        com.p314xaae8f345.mm.p944x882e457a.n nVar = oVar.f152244b;
        cVar.f149955c = nVar != null ? nVar.m150576x2b5bc573() : null;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f149948b;
        if (i17 == 0 && i18 == 0) {
            if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type RESPONSE of com.tencent.mm.ipcinvoker.wx_extension.Cgi.send$lambda$2");
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813((r45.js5) fVar));
            }
        } else if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.d(i17, i18, str, cVar))));
        }
        this.f149949c.mo10668x2efc64();
    }
}
