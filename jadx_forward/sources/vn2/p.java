package vn2;

/* loaded from: classes2.dex */
public final class p extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements qg3.a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f519878e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f519879d = jz5.h.b(vn2.o.f519874d);

    public static final r45.hn6 a(vn2.p pVar, bw5.wy wyVar, int i17) {
        pVar.getClass();
        if (wyVar == null) {
            return null;
        }
        r45.hn6 hn6Var = new r45.hn6();
        java.util.LinkedList<bw5.yr> linkedList = wyVar.f116403d;
        if (linkedList != null) {
            for (bw5.yr yrVar : linkedList) {
                java.util.LinkedList m75941xfb821914 = hn6Var.m75941xfb821914(0);
                r45.gn6 gn6Var = new r45.gn6();
                gn6Var.set(0, java.lang.Long.valueOf(yrVar.f117165d));
                boolean[] zArr = yrVar.f117194r2;
                gn6Var.set(1, zArr[25] ? yrVar.E : "");
                gn6Var.set(2, 23);
                gn6Var.set(3, zArr[34] ? yrVar.N : "");
                bw5.qs qsVar = zArr[98] ? yrVar.f117192q2 : new bw5.qs();
                gn6Var.set(4, qsVar != null ? qsVar.S1[43] ? qsVar.U : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b : null);
                m75941xfb821914.add(gn6Var);
            }
        }
        return hn6Var;
    }

    @Override // qg3.a
    public void d6(bw5.ev evVar, bw5.c40 c40Var, yz5.l onSuccess, yz5.p onFail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFail, "onFail");
        p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) this.f519879d).mo141623x754a37bb(), null, null, new vn2.n(evVar, c40Var, this, onSuccess, onFail, null), 3, null);
    }

    @Override // qg3.a
    public java.lang.String jg() {
        return "AndroidNativeMainFeedsCache";
    }
}
