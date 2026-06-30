package fg5;

/* loaded from: classes11.dex */
public final class b extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final yf5.j0 f344031d;

    /* renamed from: e, reason: collision with root package name */
    public long f344032e;

    /* renamed from: f, reason: collision with root package name */
    public long f344033f;

    public b(yf5.j0 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f344031d = adapter;
    }

    public final fg5.a a() {
        long j17;
        long j18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = ((yf5.w0) this.f344031d).f543518q.f543380d;
        long j19 = 0;
        if (list != null) {
            int size = list.size();
            long j27 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                yf5.x xVar = (yf5.x) list.get(i17);
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = xVar != null ? xVar.f543528d : null;
                if (l4Var != null && xVar.f543547z == 2) {
                    j27 += l4Var.d1();
                    j19++;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String h17 = l4Var.h1();
                    if (h17 == null) {
                        h17 = "";
                    }
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, h17);
                    jSONObject.put("unreadmsgcnt", l4Var.d1());
                    jSONObject.put("msgtime", l4Var.w0() / 1000);
                    jSONObject.put("pos", i17);
                    arrayList.add(jSONObject);
                }
            }
            j18 = j19;
            j17 = j27;
        } else {
            j17 = 0;
            j18 = 0;
        }
        java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) arrayList).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "toString(...)");
        return new fg5.a(j17, j18, r26.i0.t(jSONArray, ",", ";", false));
    }

    public final long b() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2524x2c1ddc83.C20113xe34cc462()) == 1 ? 3L : 2L;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        fg5.a a17 = a();
        long b17 = b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationForegroundListener", "onAppBackground unreadMsgOut=" + a17.f344028a + ", unreadSessOut=" + a17.f344029b + ", userGreyType=" + b17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6728x8d4e94f5 c6728x8d4e94f5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6728x8d4e94f5();
        c6728x8d4e94f5.f140659f = a17.f344028a;
        c6728x8d4e94f5.f140660g = a17.f344029b;
        c6728x8d4e94f5.f140661h = c6728x8d4e94f5.b("unread_sess_out_detail", a17.f344030c, true);
        c6728x8d4e94f5.f140657d = this.f344032e;
        c6728x8d4e94f5.f140658e = this.f344033f;
        c6728x8d4e94f5.f140662i = b17;
        c6728x8d4e94f5.f140663j = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.e0.f289663b ? 1L : 0L;
        c6728x8d4e94f5.f140664k = 20260429L;
        c6728x8d4e94f5.k();
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        fg5.a a17 = a();
        long j17 = a17.f344028a;
        this.f344032e = j17;
        long j18 = a17.f344029b;
        this.f344033f = j18;
        long b17 = b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationForegroundListener", "onAppForeground unreadMsgIn=" + j17 + ", unreadSessIn=" + j18 + " userGreyType=" + b17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6727x2956386f c6727x2956386f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6727x2956386f();
        c6727x2956386f.f140652d = j17;
        c6727x2956386f.f140653e = j18;
        c6727x2956386f.f140654f = c6727x2956386f.b("unread_sess_in_detail", a17.f344030c, true);
        c6727x2956386f.f140655g = b17;
        c6727x2956386f.f140656h = 20260429L;
        c6727x2956386f.k();
    }
}
