package dk2;

/* loaded from: classes3.dex */
public final class i1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f315132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315133c;

    public i1(yz5.p pVar, int i17, dk2.r4 r4Var) {
        this.f315131a = pVar;
        this.f315132b = i17;
        this.f315133c = r4Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && (m75941xfb821914 = ((r45.bq1) fVar.f152151d).m75941xfb821914(1)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                java.util.LinkedList<r45.kv1> m75941xfb8219142 = ((r45.yp1) it.next()).m75941xfb821914(4);
                if (m75941xfb8219142 != null) {
                    for (r45.kv1 kv1Var : m75941xfb8219142) {
                        ce2.g gVar = ce2.i.U1;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kv1Var);
                        ce2.i b17 = gVar.b(kv1Var);
                        b17.f67799x225ba391 |= 2;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().J0(b17);
                        java.lang.String str = this.f315133c.f315542d;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpRemoteGift ");
                        int i17 = ek2.z.f335110z;
                        sb6.append(ek2.k3.f335025a.c(kv1Var));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                        dk2.u7.f315714a.a(b17);
                    }
                }
            }
        }
        yz5.p pVar = this.f315131a;
        if (pVar == null) {
            return null;
        }
        pVar.mo149xb9724478(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(this.f315132b));
        return jz5.f0.f384359a;
    }
}
