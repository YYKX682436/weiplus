package vn2;

/* loaded from: classes2.dex */
public final class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f519803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f519804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f519806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f519808i;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str, r45.qt2 qt2Var, android.content.Context context, ym5.q1 q1Var) {
        this.f519803d = abstractC13919x46aff122;
        this.f519804e = abstractC14490x69736cb5;
        this.f519805f = str;
        this.f519806g = qt2Var;
        this.f519807h = context;
        this.f519808i = q1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        if (menuItem.getItemId() == 1) {
            java.util.List<E> m56392xfc5c33e5 = this.f519803d.m56392xfc5c33e5(so2.j5.class);
            int indexOf = m56392xfc5c33e5.indexOf(this.f519804e);
            if (indexOf >= 0) {
                java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f519804e;
                synchronized (m56392xfc5c33e5) {
                    int i18 = 0;
                    for (java.lang.Object obj : m56392xfc5c33e5) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        so2.j5 j5Var = (so2.j5) obj;
                        if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11() == abstractC14490x69736cb5.getFeedObject().m59251x5db1b11()) {
                            linkedList.add(0, new jz5.l(java.lang.Integer.valueOf(i18), j5Var));
                        }
                        i18 = i19;
                    }
                }
                android.content.Context context = this.f519807h;
                r45.qt2 qt2Var = this.f519806g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f519803d;
                ym5.q1 q1Var = this.f519808i;
                java.lang.String str2 = this.f519805f;
                for (jz5.l lVar : linkedList) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(um3.b.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    pf5.e.m158343xd39de650((pf5.e) a17, null, null, new vn2.e0(context, qt2Var, lVar, abstractC13919x46aff122, q1Var, str2, null), 3, null);
                    str2 = str2;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f519805f, "deleteSeeLater pos error=" + indexOf + ", feed=" + this.f519804e + ", dataList=" + m56392xfc5c33e5);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("view_id", "remove_watch_later_card");
            r45.qt2 qt2Var2 = this.f519806g;
            if (qt2Var2 == null || (str = qt2Var2.m75945x2fec8307(1)) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l("finder_context_id", str);
            r45.qt2 qt2Var3 = this.f519806g;
            lVarArr[2] = new jz5.l("comment_scene", qt2Var3 != null ? java.lang.Integer.valueOf(qt2Var3.m75939xb282bd08(5)) : "");
            lVarArr[3] = new jz5.l("feed_id", pm0.v.u(this.f519804e.mo2128x1ed62e84()));
            ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
        }
    }
}
