package te2;

/* loaded from: classes.dex */
public final class b5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f499431b;

    public b5(te2.p8 p8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f499430a = p8Var;
        this.f499431b = interfaceC29045xdcb5ca57;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = true;
        boolean z18 = fVar != null && fVar.f152148a == 0;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f499431b;
        te2.p8 p8Var = this.f499430a;
        if (z18 && fVar.f152148a == 0) {
            java.util.Iterator it = ((r45.m02) fVar.f152151d).m75941xfb821914(1).iterator();
            while (it.hasNext()) {
                r45.ix0 ix0Var = (r45.ix0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCoverImage ret:");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ix0Var);
                sb6.append(pm0.b0.g(ix0Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", sb6.toString());
                if (ix0Var.m75939xb282bd08(0) == 11) {
                    if (ix0Var.m75939xb282bd08(1) != 0) {
                        java.lang.String m75945x2fec8307 = ix0Var.m75945x2fec8307(2);
                        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            m75945x2fec8307 = p8Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dq_);
                        }
                        db5.t7.i(p8Var.m80379x76847179(), m75945x2fec8307, com.p314xaae8f345.mm.R.raw.f79678x41464de0);
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
                    } else {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                    }
                    return jz5.f0.f384359a;
                }
            }
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mod cover image errType ");
            sb7.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb7.append(",errCode:");
            sb7.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            sb7.append(",errMsg:");
            sb7.append(fVar != null ? fVar.f152150c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeQRCodeUIC", sb7.toString());
            db5.t7.i(p8Var.m80379x76847179(), p8Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dq_), com.p314xaae8f345.mm.R.raw.f79678x41464de0);
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        return jz5.f0.f384359a;
    }
}
