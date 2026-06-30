package ef0;

/* loaded from: classes11.dex */
public final class j1 implements jk3.d {
    @Override // jk3.d
    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        java.lang.Integer valueOf = c16601x7ed0e40c != null ? java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f) : null;
        byte[] bArr = c16601x7ed0e40c != null ? c16601x7ed0e40c.f66790x225a93cf : null;
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                if ((valueOf != null && valueOf.intValue() == 23) || (valueOf != null && valueOf.intValue() == 24)) {
                    try {
                        bw5.zo0 zo0Var = new bw5.zo0();
                        zo0Var.mo11468x92b714fd(bArr);
                        bw5.v70 v70Var = zo0Var.f117608e[1] ? zo0Var.f117607d : new bw5.v70();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAddToPlayListFeatureService", "onMultiTaskInfoChanged " + v70Var.m13170xcc16feb8() + ", " + v70Var.m13171x7531c8a2());
                        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25180x35e58c40 c25180x35e58c40 = rk4.l3.f478348u;
                        if (c25180x35e58c40 != null) {
                            java.lang.String m13170xcc16feb8 = v70Var.m13170xcc16feb8();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m13170xcc16feb8, "getListenId(...)");
                            c25180x35e58c40.m93147x8593ed7f(m13170xcc16feb8, ef0.i1.f333763d);
                        }
                    } catch (java.lang.Exception e17) {
                        e17.toString();
                    }
                }
            }
        }
    }
}
