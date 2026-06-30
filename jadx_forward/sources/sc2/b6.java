package sc2;

/* loaded from: classes2.dex */
public final class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wf6 f487319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487320g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f487321h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487322i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.wf6 f487323m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487324n;

    public b6(xc2.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.wf6 wf6Var, android.view.View view, sc2.d6 d6Var, in5.s0 s0Var, r45.wf6 wf6Var2, java.lang.String str) {
        this.f487317d = p0Var;
        this.f487318e = abstractC14490x69736cb5;
        this.f487319f = wf6Var;
        this.f487320g = view;
        this.f487321h = d6Var;
        this.f487322i = s0Var;
        this.f487323m = wf6Var2;
        this.f487324n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.dm2 m76806xdef68064;
        r45.cl2 cl2Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.in2 in2Var = new r45.in2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f487318e;
        in2Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11()));
        in2Var.set(1, abstractC14490x69736cb5.getFeedObject().m59276x6c285d75());
        in2Var.set(2, java.lang.Integer.valueOf(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76752x103fd925()));
        in2Var.set(3, abstractC14490x69736cb5.getFeedObject().getFeedObject().m76761x14572d5a());
        linkedList.add(in2Var);
        xc2.p0 p0Var = this.f487317d;
        xc2.o0 o0Var = p0Var.f534779h;
        xc2.p pVar = o0Var instanceof xc2.p ? (xc2.p) o0Var : null;
        java.lang.String str = pVar != null ? pVar.f534762h : null;
        if ((str == null || str.length() == 0) && ((m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064()) == null || (cl2Var = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null || (str = cl2Var.m75945x2fec8307(2)) == null)) {
            str = "";
        }
        java.lang.String str2 = str;
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        int m75939xb282bd08 = this.f487319f.m75939xb282bd08(36);
        android.view.View view = this.f487320g;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n;
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context2);
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        android.content.Context context3 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        az2.j Xh = c61.zb.Xh(zbVar, linkedList, m75939xb282bd08, 0, i17, e17, str2, null, null, 0, null, null, null, null, ((c61.w8) paVar).wi(context3), null, null, null, 122820, null);
        p0Var.f534769b = android.os.SystemClock.elapsedRealtime();
        pq5.g h17 = Xh.l().h(new sc2.a6(this.f487317d, this.f487321h, this.f487322i, this.f487320g, this.f487323m, this.f487318e, this.f487324n));
        java.lang.Object obj = this.f487322i.f374654e;
        im5.b bVar = obj instanceof im5.b ? (im5.b) obj : null;
        if (bVar != null) {
            h17.f(bVar);
        }
    }
}
