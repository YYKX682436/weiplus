package yf4;

/* loaded from: classes4.dex */
public class g implements com.p314xaae8f345.mm.p944x882e457a.i1, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Queue f543372d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f543373e = false;

    public final void b() {
        if (this.f543373e || this.f543372d.size() == 0) {
            return;
        }
        yf4.f fVar = (yf4.f) this.f543372d.peek();
        if (((java.util.LinkedList) fVar.f543371b).size() == 0) {
            this.f543372d.poll();
            c01.d9.b().p().w(8193, fVar.f543370a);
            c01.d9.b().p().w(8449, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            return;
        }
        java.lang.String str = (java.lang.String) ((java.util.LinkedList) fVar.f543371b).peek();
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f543373e = true;
        yf4.e eVar = new yf4.e(str);
        c01.d9.e().a(141, this);
        c01.d9.e().g(eVar);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public com.p314xaae8f345.mm.p944x882e457a.q0 b1(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f152259a.f459094h);
        if (this.f543372d == null) {
            this.f543372d = new java.util.LinkedList();
        }
        yf4.f fVar = new yf4.f(g17);
        if (g17 == null) {
            return null;
        }
        ((java.util.LinkedList) this.f543372d).offer(fVar);
        b();
        return null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 141) {
            this.f543373e = false;
            return;
        }
        c01.d9.e().q(141, this);
        yf4.e eVar = (yf4.e) m1Var;
        yf4.f fVar = (yf4.f) this.f543372d.peek();
        if (fVar != null) {
            java.util.Queue queue = fVar.f543371b;
            if (((java.util.LinkedList) queue).size() != 0) {
                if (((java.util.LinkedList) queue).size() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushMessageExtension", "get imgQueue failed ! ignore this message");
                    this.f543372d.poll();
                    this.f543373e = false;
                    return;
                }
                java.lang.String str2 = (java.lang.String) ((java.util.LinkedList) queue).peek();
                java.lang.String str3 = eVar.f543365e;
                if (!str2.equals(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushMessageExtension", "check img url failed ! ignore this message");
                    this.f543372d.poll();
                    this.f543373e = false;
                    return;
                }
                if (i17 == 0 && i18 == 0) {
                    ((java.util.LinkedList) queue).poll();
                    this.f543373e = false;
                    b();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushMessageExtension", "down failed [" + i17 + "," + i18 + "] ignore this message : img:[" + str3 + "] ");
                this.f543372d.poll();
                this.f543373e = false;
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PushMessageExtension", "getDoSceneQueue failed ! reset queue!");
        this.f543372d = new java.util.LinkedList();
        this.f543373e = false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public void x5(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
