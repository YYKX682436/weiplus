package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class a6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f199264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.u24 f199265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f199266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f199267g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f199268h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var, r45.u24 u24Var, r45.xq1 xq1Var, int i17, java.lang.Integer num) {
        super(0);
        this.f199264d = d6Var;
        this.f199265e = u24Var;
        this.f199266f = xq1Var;
        this.f199267g = i17;
        this.f199268h = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.t63 t63Var;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f199264d;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = ((mm2.c1) d6Var.f199594c.P0(mm2.c1.class)).f410366k6;
        r45.u24 u24Var = this.f199265e;
        java.lang.String m75945x2fec8307 = u24Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        j0Var.mo7808x76db6cb1(m75945x2fec8307);
        r45.xq1 xq1Var = this.f199266f;
        if (xq1Var != null) {
            xq1Var.set(1, java.lang.Integer.valueOf(u24Var.m75939xb282bd08(1)));
        }
        r45.u24 u24Var2 = null;
        if (u24Var.m75939xb282bd08(1) == 7) {
            r45.j73 j73Var = (r45.j73) u24Var.m75936x14adae67(2);
            if (j73Var != null) {
                j73Var.set(1, java.lang.Integer.valueOf(this.f199267g));
            }
            mm2.c1 c1Var = (mm2.c1) d6Var.f199594c.P0(mm2.c1.class);
            r45.j73 j73Var2 = (r45.j73) u24Var.m75936x14adae67(2);
            r45.xq1 xq1Var2 = c1Var.C2;
            if (xq1Var2 != null && (t63Var = (r45.t63) xq1Var2.m75936x14adae67(0)) != null && (m75941xfb821914 = t63Var.m75941xfb821914(0)) != null) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((r45.u24) next).m75939xb282bd08(1) == 7) {
                        u24Var2 = next;
                        break;
                    }
                }
                u24Var2 = u24Var2;
            }
            if (u24Var2 != null) {
                u24Var2.set(2, j73Var2);
            }
        } else if (u24Var.m75939xb282bd08(1) == 1) {
            android.view.ViewGroup viewGroup = d6Var.f199592a;
            db5.t7.i(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cz7), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            qo0.c.a(d6Var.f199593b, qo0.b.U2, null, 2, null);
        }
        int m75939xb282bd08 = u24Var.m75939xb282bd08(1);
        java.lang.Integer num = this.f199268h;
        if (m75939xb282bd08 == 7) {
            if (num != null && num.intValue() == 7) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.j0.Oj((ml2.j0) c17, ml2.i3.f409089g, this.f199267g, null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.j0.Oj((ml2.j0) c18, ml2.i3.f409088f, this.f199267g, null, 4, null);
            }
        } else if (num != null && num.intValue() == 7) {
            i95.m c19 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            ml2.j0.Oj((ml2.j0) c19, ml2.i3.f409087e, 0, null, 6, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d6Var.f199595d, "onSuccess");
        return jz5.f0.f384359a;
    }
}
