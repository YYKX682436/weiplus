package ya3;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f542131d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f542132e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f542133f;

    /* renamed from: g, reason: collision with root package name */
    public int f542134g;

    /* renamed from: i, reason: collision with root package name */
    public r45.hn5 f542136i;

    /* renamed from: m, reason: collision with root package name */
    public final int f542137m;

    /* renamed from: h, reason: collision with root package name */
    public r45.io6 f542135h = null;

    /* renamed from: n, reason: collision with root package name */
    public int f542138n = 0;

    public c(java.lang.String str, int i17, r45.mw6 mw6Var, int i18, r45.io6 io6Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gn5();
        lVar.f152198b = new r45.hn5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/refreshtrackroom";
        lVar.f152200d = uc1.o.f76896x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f542132e = a17;
        r45.gn5 gn5Var = (r45.gn5) a17.f152243a.f152217a;
        gn5Var.f456915d = str;
        gn5Var.f456916e = i17;
        gn5Var.f456917f = mw6Var;
        gn5Var.f456918g = i18;
        gn5Var.f456919h = io6Var;
        this.f542137m = i17;
        java.lang.String str2 = mw6Var.f462405d;
        r45.wa5 wa5Var = mw6Var.f462406e;
        double d17 = wa5Var.f470544d;
        double d18 = wa5Var.f470545e;
        double d19 = wa5Var.f470546f;
        double d27 = io6Var.f458755d;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f542131d = u0Var;
        return mo9409x10f9447a(sVar, this.f542132e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return uc1.o.f76896x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.hn5 hn5Var = (r45.hn5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f542136i = hn5Var;
        if (hn5Var != null) {
            this.f542133f = hn5Var.f457851f;
        }
        if (i18 == 0 && i19 == 0) {
            this.f542134g = hn5Var.f457852g;
            this.f542138n = hn5Var.f457854i;
            this.f542135h = hn5Var.f457853h;
            java.util.LinkedList linkedList = hn5Var.f457850e;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(java.lang.String.format("[ resp count %d ] ", java.lang.Integer.valueOf(this.f542136i.f457849d)));
            r45.io6 io6Var = this.f542135h;
            if (io6Var != null) {
                stringBuffer.append(java.lang.String.format("[ roomPoi  %f %f %s] ", java.lang.Double.valueOf(io6Var.f458755d), java.lang.Double.valueOf(this.f542135h.f458756e), this.f542135h.f458757f));
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = this.f542136i.f457850e.iterator();
            while (it.hasNext()) {
                r45.mw6 mw6Var = (r45.mw6) it.next();
                if (mw6Var == null) {
                    linkedList2.add(mw6Var);
                } else {
                    if (mw6Var.f462406e == null) {
                        linkedList2.add(mw6Var);
                    }
                    if (java.lang.Math.abs(mw6Var.f462406e.f470545e) > 180.0d || java.lang.Math.abs(mw6Var.f462406e.f470544d) > 90.0d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneRefreshTrackRoom", "server lat lng invalid %s %f %f %f", mw6Var.f462405d, java.lang.Double.valueOf(mw6Var.f462406e.f470544d), java.lang.Double.valueOf(mw6Var.f462406e.f470545e), java.lang.Double.valueOf(mw6Var.f462406e.f470546f));
                        linkedList2.add(mw6Var);
                    }
                }
            }
            r45.hn5 hn5Var2 = this.f542136i;
            hn5Var2.f457849d = hn5Var2.f457850e.size();
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f542131d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
