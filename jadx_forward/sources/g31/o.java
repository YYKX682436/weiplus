package g31;

/* loaded from: classes9.dex */
public final class o implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 f349635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g31.p f349636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e31.i f349637c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349638d;

    public o(com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3, g31.p pVar, e31.i iVar, java.lang.String str) {
        this.f349635a = c11159x8f55e6d3;
        this.f349636b = pVar;
        this.f349637c = iVar;
        this.f349638d = str;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchSubscribeStatus onError templateId: ");
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = this.f349635a;
        sb6.append(c11159x8f55e6d3.f153336f);
        sb6.append(", errType: ");
        sb6.append(i17);
        sb6.append(", errCode: ");
        sb6.append(i18);
        sb6.append(", errMsg: ");
        sb6.append(errMsg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubscribeStatusUpdateManager", sb6.toString());
        if (c11159x8f55e6d3.f153340m == 1) {
            c11159x8f55e6d3.f153340m = 0;
        } else {
            c11159x8f55e6d3.f153340m = 1;
        }
        this.f349637c.a();
        e31.k kVar = this.f349636b.f349640b;
        if (kVar != null) {
            e31.k.i(kVar, this.f349638d, kz5.c0.k(c11159x8f55e6d3), false, false, false, 4, null);
        }
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = this.f349635a;
        java.lang.String str = c11159x8f55e6d3.f153336f;
        int i17 = c11159x8f55e6d3.f153340m;
        boolean z17 = false;
        boolean z18 = false;
        for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 : result.f153318h) {
            if (c11159x8f55e6d3.f153336f.equals(c11159x8f55e6d32.f153336f)) {
                z18 = c11159x8f55e6d32.f153341n;
                z17 = true;
            }
        }
        e31.j jVar = z17 ? new e31.j(c11159x8f55e6d3.f153340m == 1, z18) : new e31.j(false, c11159x8f55e6d3.f153341n);
        jVar.f328610c = c11159x8f55e6d3.f153347t;
        jVar.f328611d = c11159x8f55e6d3.f153348u;
        jVar.f328612e = c11159x8f55e6d3.f153350w;
        jVar.f328613f = c11159x8f55e6d3.f153351x;
        jVar.f328614g = c11159x8f55e6d3.B;
        jVar.f328615h = c11159x8f55e6d3.C;
        jVar.f328617j = bizUsername;
        jVar.f328616i = c11159x8f55e6d3.f153352y;
        jVar.f328618k = c11159x8f55e6d3.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeStatusUpdateManager", "switchSubscribeStatus onSuccess hasResult: %b, isSubscribed: %b, switchOpen: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(jVar.f328608a), java.lang.Boolean.valueOf(jVar.f328609b));
        e31.k kVar = this.f349636b.f349640b;
        if (kVar != null) {
            e31.k.i(kVar, bizUsername, result.f153318h, false, false, false, 4, null);
        }
        this.f349637c.b(c11159x8f55e6d3.f153336f, jVar);
    }
}
