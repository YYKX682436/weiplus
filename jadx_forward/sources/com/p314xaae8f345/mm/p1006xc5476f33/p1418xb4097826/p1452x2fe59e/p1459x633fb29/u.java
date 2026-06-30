package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j51 f189913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f189914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f189916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f189917h;

    public u(r45.j51 j51Var, android.content.Context context, java.lang.String str, long j17, java.util.List list) {
        this.f189913d = j51Var;
        this.f189914e = context;
        this.f189915f = str;
        this.f189916g = j17;
        this.f189917h = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.sm2 sm2Var;
        r45.pm2 pm2Var = (r45.pm2) this.f189913d.m75936x14adae67(7);
        int m75939xb282bd08 = (pm2Var == null || (sm2Var = (r45.sm2) pm2Var.m75936x14adae67(1)) == null) ? 0 : sm2Var.m75939xb282bd08(1);
        android.content.Context context = this.f189914e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qp qpVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qp) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qp.class);
        if (qpVar != null) {
            java.lang.String source = this.f189915f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            java.util.List commentList = this.f189917h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentList, "commentList");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
            sb6.append(qpVar.hashCode());
            sb6.append(')');
            sb6.append(source);
            sb6.append(" set multi image desc comment,feedId=");
            long j17 = this.f189916g;
            sb6.append(pm0.v.u(j17));
            sb6.append(",commentList=");
            java.util.List r17 = kz5.d0.r(commentList);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(r17, 10));
            java.util.Iterator it = ((java.util.ArrayList) r17).iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next()).m76058xa6514d24()));
            }
            sb6.append(arrayList);
            sb6.append(",commentCount=");
            sb6.append(m75939xb282bd08);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMultiImageDescCommentUIC", sb6.toString());
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) ((jz5.n) qpVar.f217259f).mo141623x754a37bb()).d(java.lang.Long.valueOf(j17), kz5.n0.V0(commentList));
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c0) ((jz5.n) qpVar.f217260g).mo141623x754a37bb()).d(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(m75939xb282bd08));
        }
    }
}
