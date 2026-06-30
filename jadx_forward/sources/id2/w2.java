package id2;

/* loaded from: classes2.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl0.g f372399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(cl0.g gVar) {
        super(1);
        this.f372399d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.d03 d03Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.f186860a) {
            r45.f03 f03Var = it.f186861b;
            if (f03Var != null && f03Var.f455427n == 9) {
                byte[] g17 = (f03Var == null || (gVar = f03Var.f455428o) == null) ? null : gVar.g();
                if (g17 != null) {
                    d03Var = new r45.d03();
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(d03Var.mo11468x92b714fd(g17));
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                } else {
                    d03Var = new r45.d03();
                }
                java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(d03Var.m75942xfb822ef2(0));
                if (r07 == null) {
                    r07 = "";
                }
                cl0.g gVar2 = this.f372399d;
                gVar2.h("objectId", r07);
                java.lang.String m75945x2fec8307 = d03Var.m75945x2fec8307(1);
                gVar2.h("exportId", m75945x2fec8307 != null ? m75945x2fec8307 : "");
            }
        }
        return jz5.f0.f384359a;
    }
}
