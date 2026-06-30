package ro2;

/* loaded from: classes2.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f479592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479595g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479596h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, java.lang.String str) {
        super(0);
        this.f479592d = abstractC14490x69736cb5;
        this.f479593e = context;
        this.f479594f = qeVar;
        this.f479595g = s0Var;
        this.f479596h = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.I0().r()).booleanValue();
        android.content.Context context = this.f479593e;
        if (booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f479592d;
            if (!abstractC14490x69736cb5.getFeedObject().m59303x7d1523()) {
                java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ohb);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                int dimension2 = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f479594f;
                java.util.Map a17 = d2Var.a(context, ro2.r.b(qeVar, context, abstractC14490x69736cb5));
                int i17 = al5.u4.f87591t;
                al5.t4 t4Var = new al5.t4(context);
                qeVar.F = t4Var.d();
                t4Var.f87575e = hc2.x0.k(string, context, '#', com.p314xaae8f345.mm.R.raw.f78821xb211a201, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an, dimension, dimension, 0, dimension2, 2, 64, null);
                t4Var.a(string2);
                t4Var.f87572b = 1;
                t4Var.f87579i = 4000;
                t4Var.f87578h = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561193bx);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar2 = this.f479594f;
                in5.s0 s0Var = this.f479595g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f479592d;
                android.content.Context context2 = this.f479593e;
                t4Var.f87571a.f87547b = new ro2.j(qeVar2, s0Var, abstractC14490x69736cb52, context2, this.f479596h, a17);
                t4Var.f87580j = new ro2.k(context2, a17, qeVar2);
                t4Var.i();
                t4Var.g();
                return jz5.f0.f384359a;
            }
        }
        db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mrk), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        return jz5.f0.f384359a;
    }
}
