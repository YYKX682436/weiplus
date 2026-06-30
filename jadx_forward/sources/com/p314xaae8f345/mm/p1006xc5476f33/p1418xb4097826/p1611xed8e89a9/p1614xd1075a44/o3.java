package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes.dex */
public final class o3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f206193a;

    public o3(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f206193a = interfaceC29045xdcb5ca57;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean e17 = xg2.g.e(fVar);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f206193a;
        if (e17) {
            java.util.Iterator it = ((r45.m02) fVar.f152151d).m75941xfb821914(1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
                    break;
                }
                r45.ix0 ix0Var = (r45.ix0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#cgiModNoticeInfo ret:");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ix0Var);
                sb6.append(pm0.b0.g(ix0Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMoreLiveNoticeListWidget", sb6.toString());
                if (ix0Var.m75939xb282bd08(0) == 10) {
                    if (ix0Var.m75939xb282bd08(1) == 0) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
                    } else {
                        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
                    }
                }
            }
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#cgiModNoticeInfo errType ");
            sb7.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb7.append(",errCode:");
            sb7.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            sb7.append(",errMsg:");
            sb7.append(fVar != null ? fVar.f152150c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMoreLiveNoticeListWidget", sb7.toString());
            p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        }
        return jz5.f0.f384359a;
    }
}
