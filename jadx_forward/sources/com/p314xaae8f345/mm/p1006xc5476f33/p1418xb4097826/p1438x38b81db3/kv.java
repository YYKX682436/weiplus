package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class kv extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys f185396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13704xa673085b f185397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew f185398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.vd6 f185399h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f185400i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13704xa673085b c13704xa673085b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar, r45.vd6 vd6Var, yz5.l lVar) {
        super(1);
        this.f185395d = z17;
        this.f185396e = ysVar;
        this.f185397f = c13704xa673085b;
        this.f185398g = ewVar;
        this.f185399h = vd6Var;
        this.f185400i = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.z91 z91Var;
        java.util.LinkedList m75941xfb821914;
        fp0.r task = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fetchContent#execute] isRefresh=");
        boolean z17 = this.f185395d;
        sb6.append(z17);
        sb6.append(' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = this.f185396e;
        sb6.append(fb2.l.a(ysVar.f192725d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStreamCardAlbumConvert", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13704xa673085b c13704xa673085b = this.f185397f;
        if (z17) {
            r45.xw2 xw2Var = (r45.xw2) ysVar.f192725d.m75936x14adae67(22);
            c13704xa673085b.f188959q = xw2Var != null ? (r45.z91) xw2Var.m75936x14adae67(2) : null;
        } else {
            r45.xw2 xw2Var2 = (r45.xw2) ysVar.f192725d.m75936x14adae67(20);
            c13704xa673085b.f188959q = xw2Var2 != null ? (r45.z91) xw2Var2.m75936x14adae67(2) : null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar = this.f185398g;
        if (((java.lang.Boolean) ((jz5.n) ewVar.f184830i).mo141623x754a37bb()).booleanValue()) {
            c13704xa673085b.m56378x9e42f747(ewVar.f184833o);
        }
        r45.vd6 vd6Var = this.f185399h;
        if (vd6Var != null && (z91Var = c13704xa673085b.f188959q) != null && (m75941xfb821914 = z91Var.m75941xfb821914(22)) != null) {
            m75941xfb821914.add(vd6Var);
        }
        c13704xa673085b.f188963u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jv(task, this.f185396e, this.f185395d, this.f185398g, this.f185400i);
        c13704xa673085b.mo56155xd210094c();
        return jz5.f0.f384359a;
    }
}
