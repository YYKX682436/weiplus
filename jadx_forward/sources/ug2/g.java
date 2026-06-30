package ug2;

/* loaded from: classes3.dex */
public final class g implements ug2.f {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ch1 f509059a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f509060b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.d42 f509061c;

    /* renamed from: d, reason: collision with root package name */
    public long f509062d;

    public g(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f509059a = msg;
        r45.d42 d42Var = null;
        if (msg.m75939xb282bd08(1) == 20096) {
            r45.d42 d42Var2 = new r45.d42();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = msg.m75934xbce7f2f(4);
            byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 != null) {
                try {
                    d42Var2.mo11468x92b714fd(g17);
                    d42Var = d42Var2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
        }
        this.f509061c = d42Var;
    }

    @Override // ug2.f
    public void a(long j17) {
        this.f509062d = j17;
    }

    @Override // ug2.f
    public ug2.e b() {
        return ug2.e.f509057f;
    }

    @Override // ug2.f
    public long c() {
        return this.f509062d;
    }

    @Override // ug2.f
    /* renamed from: priority */
    public ug2.d mo167986xba8879a4() {
        return ug2.d.f509052d;
    }
}
