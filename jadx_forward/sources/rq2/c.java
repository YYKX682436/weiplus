package rq2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq2.a f480348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rq2.a aVar) {
        super(0);
        this.f480348d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rq2.d dVar = rq2.d.f480349a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6784x711efb71 c6784x711efb71 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6784x711efb71();
        rq2.a aVar = this.f480348d;
        c6784x711efb71.f141156f = (int) aVar.f480341s;
        c6784x711efb71.f141154d = (int) aVar.f480338p;
        c6784x711efb71.f141155e = (int) aVar.f480339q;
        c6784x711efb71.f141157g = (int) aVar.f480340r;
        c6784x711efb71.f141165o = aVar.f480333k;
        c6784x711efb71.f141163m = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
        c6784x711efb71.f141161k = rq2.d.f480352d ? 1 : 0;
        c6784x711efb71.f141164n = c6784x711efb71.b("networkType", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        rq2.b bVar = rq2.b.f480344e;
        c6784x711efb71.f141166p = 8;
        c6784x711efb71.f141158h = (int) aVar.f480342t;
        c6784x711efb71.f141167q = aVar.f480336n;
        c6784x711efb71.f141168r = c6784x711efb71.b("tabName", aVar.f480337o, true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("isVerticalSquare", java.lang.Integer.valueOf(rq2.d.f480358j ? 1 : 0));
        ae2.b2 b2Var = ae2.b2.f84994a;
        jSONObject.putOpt("isOpenSquareTabOp", ((lb2.j) ((jz5.n) ae2.b2.G).mo141623x754a37bb()).r());
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6784x711efb71.f141169s = c6784x711efb71.b("opMsg", r26.i0.t(jSONObject2, ",", ";", false), true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (aVar.f480331i - rq2.d.f480357i));
        if ((valueOf.intValue() > 0) == false) {
            valueOf = null;
        }
        c6784x711efb71.f141170t = valueOf != null ? valueOf.intValue() : 1;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) (aVar.f480331i - aVar.f480323a));
        if ((valueOf2.intValue() > 0) == false) {
            valueOf2 = null;
        }
        c6784x711efb71.f141171u = valueOf2 != null ? valueOf2.intValue() : 1;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf((int) (aVar.f480331i - aVar.f480323a));
        java.lang.Integer num = (valueOf3.intValue() > 0) == true ? valueOf3 : null;
        c6784x711efb71.f141172v = num != null ? num.intValue() : 1;
        c6784x711efb71.f141173w = aVar.f480335m;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        ae2.in inVar = ae2.in.f85221a;
        jSONObject3.put("isOpenSquareTouchPreload", ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85253d1).mo141623x754a37bb()).r()).intValue());
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        c6784x711efb71.f141174x = c6784x711efb71.b("exptJson", r26.i0.t(jSONObject4, ",", ";", false), true);
        c6784x711efb71.f141175y = aVar.f480334l;
        c6784x711efb71.f141176z = aVar.f480327e;
        if (rq2.d.f480353e) {
            c6784x711efb71.f141161k = 2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report24459: ");
        java.lang.String n17 = c6784x711efb71.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        sb6.append(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
        sb6.append(" ，isFromRedClick = ");
        sb6.append(rq2.d.f480353e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", sb6.toString());
        c6784x711efb71.k();
        return jz5.f0.f384359a;
    }
}
