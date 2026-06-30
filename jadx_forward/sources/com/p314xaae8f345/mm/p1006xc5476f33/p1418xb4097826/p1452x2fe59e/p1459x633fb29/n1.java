package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public class n1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09 f189740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09 c13860x3630fe09) {
        super(c13860x3630fe09);
        this.f189740e = c13860x3630fe09;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0
    /* renamed from: dead */
    public void mo56312x2efc64() {
        super.mo56312x2efc64();
        ((ey2.e2) pf5.u.f435469a.e(c61.l7.class).a(ey2.e2.class)).N6(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.List m56409x97891cf7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a = super.mo983xfcd2013a(i17, i18, str, iVar, fVar);
        if ((fVar instanceof r45.aa1) && (iVar instanceof db2.t0)) {
            if (i17 == 0 && i18 == 0) {
                p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.e2.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                ((ey2.e2) a17).N6(false);
            }
            java.lang.String m56464xb5886c64 = m56464xb5886c64();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dealOnSceneEnd] errType=");
            sb6.append(i17);
            sb6.append(" errCode=");
            sb6.append(str);
            sb6.append(" pullType=");
            sb6.append(((db2.t0) iVar).f309695z);
            sb6.append(" lastBuffer=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09 c13860x3630fe09 = this.f189740e;
            sb6.append(c13860x3630fe09.m56357x44e5026c() != null);
            sb6.append(" cardBuffer=");
            sb6.append(c13860x3630fe09.f188956n != null);
            sb6.append(" stats=");
            r45.vd6 vd6Var = c13860x3630fe09.f188957o;
            sb6.append(pm0.v.u(vd6Var != null ? vd6Var.m75942xfb822ef2(0) : 0L));
            sb6.append(" get_column_feed_info=");
            r45.kd3 kd3Var = c13860x3630fe09.f188955m;
            sb6.append(pm0.v.u(kd3Var != null ? kd3Var.m75942xfb822ef2(0) : 0L));
            sb6.append(" hasMore=");
            java.lang.Integer num = null;
            sb6.append(mo983xfcd2013a != null ? java.lang.Boolean.valueOf(mo983xfcd2013a.getHasMore()) : null);
            sb6.append(" size=");
            if (mo983xfcd2013a != null && (m56409x97891cf7 = mo983xfcd2013a.m56409x97891cf7()) != null) {
                num = java.lang.Integer.valueOf(m56409x97891cf7.size());
            }
            sb6.append(num);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        }
        return mo983xfcd2013a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        ey2.e2 e2Var = (ey2.e2) pf5.u.f435469a.e(c61.l7.class).a(ey2.e2.class);
        e2Var.getClass();
        java.util.LinkedList<r45.ni4> linkedList = new java.util.LinkedList();
        synchronized (e2Var.f338892g) {
            linkedList.addAll(e2Var.f338892g);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (r45.ni4 ni4Var : linkedList) {
            r45.vd6 vd6Var = new r45.vd6();
            vd6Var.set(2, new r45.yw6());
            vd6Var.set(1, new r45.oi());
            vd6Var.set(3, new r45.q25());
            vd6Var.set(0, java.lang.Long.valueOf(ni4Var.m75942xfb822ef2(0)));
            vd6Var.set(28, ni4Var.m75945x2fec8307(15));
            vd6Var.set(10, java.lang.Integer.valueOf(ni4Var.m75939xb282bd08(3)));
            vd6Var.set(8, ni4Var.m75945x2fec8307(4));
            vd6Var.set(5, xy2.c.f(this.f189740e.m56354xfe9224be()));
            vd6Var.set(6, java.lang.Long.valueOf(c01.id.c()));
            vd6Var.set(13, 11);
            arrayList.add(vd6Var);
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m56357x44e5026c = this.f189740e.m56357x44e5026c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09 c13860x3630fe09 = this.f189740e;
        db2.t0 t0Var = new db2.t0(m56357x44e5026c, c13860x3630fe09.f188958p, arrayList, c13860x3630fe09.f188955m, c13860x3630fe09.m56354xfe9224be(), null, null, 96, null);
        t0Var.f309695z = 2;
        return t0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09 c13860x3630fe09 = this.f189740e;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = c13860x3630fe09.f188956n;
        int i17 = c13860x3630fe09.f188958p;
        r45.vd6 vd6Var = c13860x3630fe09.f188957o;
        db2.t0 t0Var = new db2.t0(gVar, i17, vd6Var != null ? kz5.b0.c(vd6Var) : null, c13860x3630fe09.f188955m, c13860x3630fe09.m56354xfe9224be(), null, null, 96, null);
        t0Var.f309695z = 0;
        return t0Var;
    }
}
