package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 f189407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f189408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f189409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f189410g;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, long j17, java.lang.Long l17) {
        this.f189407d = l0Var;
        this.f189408e = c19781xd1c47b87;
        this.f189409f = j17;
        this.f189410g = l17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.f189407d;
        java.lang.String str = l0Var.f189659h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show desc comment, content=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = this.f189408e;
        sb6.append(c19781xd1c47b87.m76060x76847043());
        sb6.append(", feedId=");
        long j17 = this.f189409f;
        sb6.append(pm0.v.u(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = l0Var.f189658g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc xcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xc.class);
        if (xcVar != null) {
            p012xc85e97e9.p093xedfae76a.j0 f76 = xcVar.f7(j17);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(c19781xd1c47b87);
            java.lang.Long l17 = this.f189410g;
            f76.mo7808x76db6cb1(new jz5.l(linkedList, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L)));
        }
    }
}
