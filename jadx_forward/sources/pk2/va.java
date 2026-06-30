package pk2;

/* loaded from: classes3.dex */
public final class va extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.xa f437847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f437848f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(pk2.o9 o9Var, pk2.xa xaVar, boolean z17) {
        super(1);
        this.f437846d = o9Var;
        this.f437847e = xaVar;
        this.f437848f = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList<r45.ix0> m75941xfb821914;
        hn0.r rVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        pk2.o9 o9Var = this.f437846d;
        java.lang.String str = o9Var.f437605a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("p2p switch resp.isSuccess=");
        sb6.append(fVar != null ? java.lang.Boolean.valueOf(fVar.b()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.lang.Object[] objArr = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str2 = o9Var.f437605a;
        if (objArr == true) {
            r45.ml1 ml1Var = (r45.ml1) fVar.f152151d;
            if (ml1Var == null || (m75941xfb821914 = ml1Var.m75941xfb821914(1)) == null) {
                return null;
            }
            for (r45.ix0 ix0Var : m75941xfb821914) {
                if (ix0Var.m75939xb282bd08(0) == 1) {
                    int m75939xb282bd08 = ix0Var.m75939xb282bd08(1);
                    if (m75939xb282bd08 == 0) {
                        r45.q82 q82Var = (r45.q82) ((mm2.e1) this.f437847e.f445960a.c(mm2.e1.class)).f410521r.m75936x14adae67(9);
                        boolean z17 = this.f437848f;
                        if (q82Var != null) {
                            q82Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
                        }
                        co0.s u07 = dk2.ef.f314905a.u0();
                        kn0.g gVar = (u07 == null || (rVar = u07.R1) == null) ? null : rVar.f363943b;
                        if (gVar != null) {
                            gVar.f391085s = z17;
                        }
                        tn0.w0 w0Var = dk2.ef.f314911d;
                        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
                        if (sVar != null) {
                            sVar.W0();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "real success, enableP2P=" + z17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "retCode=" + m75939xb282bd08);
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "p2p switch operation failed");
        }
        return f0Var;
    }
}
