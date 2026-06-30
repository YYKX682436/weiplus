package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class aw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew f184437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys f184438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.vd6 f184439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar, r45.vd6 vd6Var) {
        super(1);
        this.f184437d = ewVar;
        this.f184438e = ysVar;
        this.f184439f = vd6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        fp0.r task = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar = this.f184437d;
        final r45.qt2 qt2Var = ewVar.f184829h;
        if (qt2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        final r45.vd6 vd6Var = this.f184439f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09 c13860x3630fe09 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09(qt2Var) { // from class: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$preloadContent$1$loader$1
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
            /* renamed from: createDataFetch */
            public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zv(this, r45.vd6.this);
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13860x3630fe09, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
            /* renamed from: isObservePostEvent */
            public boolean mo55621xcb60d968() {
                return false;
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(c13860x3630fe09, new ym5.w(), false, 2, null);
        c13860x3630fe09.m56378x9e42f747(ewVar.f184833o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = this.f184438e;
        r45.xw2 xw2Var = (r45.xw2) ysVar.f192725d.m75936x14adae67(22);
        r45.z91 z91Var = xw2Var != null ? (r45.z91) xw2Var.m75936x14adae67(2) : null;
        c13860x3630fe09.f188959q = z91Var;
        if (vd6Var != null && z91Var != null && (m75941xfb821914 = z91Var.m75941xfb821914(22)) != null) {
            m75941xfb821914.add(vd6Var);
        }
        c13860x3630fe09.mo56309x7e61e47a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yv(ewVar, ysVar, task));
        return jz5.f0.f384359a;
    }
}
