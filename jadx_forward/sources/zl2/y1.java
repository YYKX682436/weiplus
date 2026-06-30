package zl2;

/* loaded from: classes2.dex */
public final class y1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f555564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555567g;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, android.content.Context context) {
        this.f555564d = abstractC14490x69736cb5;
        this.f555565e = h0Var;
        this.f555566f = h0Var2;
        this.f555567g = context;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f555564d;
        r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        if (!r4Var.n(m59258xd0557130 != null ? m59258xd0557130.m75939xb282bd08(54) : 0) || (k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) this.f555565e.f391656d) == null) {
            return;
        }
        android.content.Context context = this.f555567g;
        o25.y1 y1Var = (o25.y1) this.f555566f.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).Ai(context, g4Var, k0Var, 2, zl2.x1.f555554d);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.u1 u1Var = ml2.u1.f409609q;
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((b92.d1) zbVar).sj(u1Var, abstractC14490x69736cb5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6());
    }
}
