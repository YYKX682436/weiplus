package hi5;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2721x33323e.C22452xfeb68e00 f363094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.ui.p2721x33323e.C22452xfeb68e00 c22452xfeb68e00) {
        super(1);
        this.f363094d = c22452xfeb68e00;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ya0 ya0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        if (aVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRedDotNotify] view=");
            com.p314xaae8f345.mm.ui.p2721x33323e.C22452xfeb68e00 c22452xfeb68e00 = this.f363094d;
            sb6.append(c22452xfeb68e00.W1 != null);
            sb6.append(" isShow=");
            boolean z17 = aVar.f186860a;
            sb6.append(z17);
            sb6.append(" path=");
            sb6.append(aVar.f186864e);
            sb6.append(" showType=");
            r45.f03 f03Var = aVar.f186861b;
            sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f455420d) : null);
            sb6.append(" uuid=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = aVar.f186862c;
            sb6.append(jbVar != null ? jbVar.f65882x5364c75d : null);
            sb6.append(" isExposed=");
            sb6.append(c22452xfeb68e00.f290682m3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewCardPackageTipPreference", sb6.toString());
            if (c22452xfeb68e00.W1 != null) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f186864e, "Card.Entrance.Left")) {
                    if (f03Var != null && f03Var.f455420d == 1) {
                        c22452xfeb68e00.y(z17);
                        c22452xfeb68e00.j1(aVar);
                    } else {
                        c22452xfeb68e00.y(false);
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f186864e, "Card.Entrance.Right")) {
                    if (f03Var != null && f03Var.f455420d == 3) {
                        r45.pm6 pm6Var = new r45.pm6();
                        pm6Var.f464720e = f03Var != null ? f03Var.f455422f : null;
                        pm6Var.f464732t = jbVar != null ? jbVar.f65882x5364c75d : null;
                        c22452xfeb68e00.e1(aVar.f186860a, pm6Var, 6, true, false, false, false, 0);
                        c22452xfeb68e00.j1(aVar);
                    } else {
                        if ((f03Var != null && f03Var.f455420d == 999) && (ya0Var = f03Var.B) != null && ya0Var.f472451d != null) {
                            c22452xfeb68e00.b1(aVar.f186860a, true, f03Var, 999, f03Var.f455421e);
                            c22452xfeb68e00.j1(aVar);
                        } else if (!z17) {
                            c22452xfeb68e00.y(false);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
