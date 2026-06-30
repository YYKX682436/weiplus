package aw3;

/* loaded from: classes10.dex */
public final class e implements l45.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7 f96368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qc0.p1 f96369b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7 c17090xc5b6aeb7, qc0.p1 p1Var) {
        this.f96368a = c17090xc5b6aeb7;
        this.f96369b = p1Var;
    }

    public final void a(c01.s2 status, xk0.f fVar) {
        um.t m68377x6a871a2c;
        xk0.o k17;
        qc0.j2 j2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (!(fVar instanceof xk0.n)) {
            boolean z17 = fVar instanceof xk0.h;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7 c17090xc5b6aeb7 = this.f96368a;
        java.lang.String str = c17090xc5b6aeb7.f237959d;
        status.toString();
        r0 = null;
        android.graphics.Bitmap bitmap = null;
        switch (status.ordinal()) {
            case 0:
                ym5.y5 y5Var = c17090xc5b6aeb7.f237961f;
                if (y5Var != null) {
                    y5Var.i(false);
                }
                ym5.y5 y5Var2 = c17090xc5b6aeb7.f237961f;
                if (y5Var2 != null && y5Var2.D) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y5Var2.f545114x, "hideCurrentItemOnEditText: ");
                    xk0.f g17 = y5Var2.g();
                    if (g17 != null) {
                        l45.q m177317xc879b3f2 = y5Var2.m177317xc879b3f2();
                        dl.f0 f0Var = m177317xc879b3f2 != null ? (dl.f0) ((l45.n) m177317xc879b3f2).d(y5Var2.m177360x1f85dc49()) : null;
                        um.g gVar = f0Var != null ? (um.g) f0Var.d() : null;
                        yk0.a aVar = g17 instanceof yk0.a ? (yk0.a) g17 : null;
                        if (aVar != null) {
                            aVar.E = false;
                        }
                        if (gVar != null) {
                            gVar.b(g17.q());
                        }
                        if (f0Var != null) {
                            f0Var.r();
                        }
                    }
                }
                j2Var = qc0.e2.f442912c;
                break;
            case 1:
                j2Var = qc0.f2.f442913c;
                break;
            case 2:
                qc0.j2 j2Var2 = qc0.g2.f442917c;
                m68377x6a871a2c = c17090xc5b6aeb7.m68377x6a871a2c();
                if (m68377x6a871a2c != null && (k17 = m68377x6a871a2c.k(true)) != null) {
                    bitmap = k17.p();
                }
                j2Var2.f442923a = bitmap;
                j2Var2.f442924b = c17090xc5b6aeb7.e();
                j2Var = j2Var2;
                break;
            case 3:
                j2Var = qc0.h2.f442918c;
                break;
            case 4:
                j2Var = qc0.z1.f442990c;
                break;
            case 5:
                j2Var = qc0.a2.f442890c;
                break;
            case 6:
                j2Var = qc0.b2.f442891c;
                break;
            case 7:
                j2Var = qc0.t1.f442976c;
                break;
            case 8:
                j2Var = qc0.w1.f442985c;
                break;
            case 9:
                j2Var = qc0.v1.f442981c;
                break;
            case 10:
                j2Var = qc0.u1.f442980c;
                break;
            case 11:
                j2Var = qc0.q1.f442970c;
                break;
            case 12:
                j2Var = qc0.s1.f442975c;
                break;
            case 13:
                j2Var = qc0.r1.f442971c;
                break;
            case 14:
                j2Var = qc0.i2.f442922c;
                break;
            case 15:
                j2Var = qc0.c2.f442895c;
                break;
            case 16:
                j2Var = qc0.x1.f442986c;
                break;
            case 17:
                j2Var = qc0.y1.f442989c;
                break;
            case 18:
                j2Var = qc0.d2.f442908c;
                break;
            default:
                throw new jz5.j();
        }
        this.f96369b.f442966d.mo146xb9724478(j2Var);
    }
}
