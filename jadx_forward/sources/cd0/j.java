package cd0;

/* loaded from: classes5.dex */
public final class j implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f122068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f122069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f122070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f122071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122072h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f122073i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122074m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f122075n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f122076o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f122077p;

    public j(java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.List list2, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, boolean z17, long j17, boolean z18) {
        this.f122069e = list;
        this.f122070f = f9Var;
        this.f122071g = list2;
        this.f122072h = str;
        this.f122073i = weakReference;
        this.f122074m = str2;
        this.f122075n = z17;
        this.f122076o = j17;
        this.f122077p = z18;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.Iterator it;
        boolean z17;
        long j17;
        java.lang.String str;
        boolean z18;
        java.lang.ref.WeakReference weakReference;
        long j18;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        if (m0Var == null || l0Var == null || this.f122068d) {
            return;
        }
        java.util.ArrayList msgList = l0Var.f535945c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f122070f;
        java.util.List list = this.f122071g;
        java.lang.String str2 = this.f122072h;
        java.lang.ref.WeakReference weakReference2 = this.f122073i;
        java.lang.String str3 = this.f122074m;
        boolean z19 = this.f122075n;
        long j19 = this.f122076o;
        boolean z27 = this.f122077p;
        java.util.Iterator it6 = msgList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next();
            if (this.f122069e.contains(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var2.m124847x74d37ac6(), f9Var2.Q0()))) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(f9Var2.Q0(), f9Var2.m124847x74d37ac6());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", "reqBatchRevoke() onNotifyChange msgId=" + java.lang.Long.valueOf(n17.m124847x74d37ac6()) + " status:" + java.lang.Integer.valueOf(n17.P0()));
                if (n17.P0() == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", "reqBatchRevoke() STATE_SENT msgId=" + n17.m124847x74d37ac6());
                    this.f122068d = true;
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(this);
                    z17 = z27;
                    j18 = j19;
                    it = it6;
                    str = str3;
                    z18 = z19;
                    weakReference = weakReference2;
                    cd0.b0.f122058a.a(f9Var, list, kz5.b0.c(n17), str2, weakReference2, str3, z19, j18, z17);
                } else {
                    it = it6;
                    z17 = z27;
                    j18 = j19;
                    str = str3;
                    z18 = z19;
                    weakReference = weakReference2;
                    if (n17.P0() == 5) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqBatchRevoke() STATE_FAILED msgId=");
                        sb6.append(n17.m124847x74d37ac6());
                        sb6.append(" chattingContext is null:");
                        sb6.append((weakReference != null ? (yb5.d) weakReference.get() : null) == null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", sb6.toString());
                        this.f122068d = true;
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).za(this);
                        java.lang.ref.WeakReference weakReference3 = cd0.b0.f122059b;
                        if (weakReference3 != null && (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference3.get()) != null) {
                            u3Var.dismiss();
                        }
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6737x6a91c12e c6737x6a91c12e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6737x6a91c12e();
                        c6737x6a91c12e.f140711d = 3L;
                        j17 = j18;
                        c6737x6a91c12e.f140716i = j17;
                        c6737x6a91c12e.f140717j = (c01.id.c() - n17.mo78012x3fdd41df()) / 1000;
                        c6737x6a91c12e.f140713f = list.size();
                        c6737x6a91c12e.f140715h = 1L;
                        c6737x6a91c12e.f140714g = 0L;
                        c6737x6a91c12e.f140712e = 4L;
                        c6737x6a91c12e.p(str);
                        c6737x6a91c12e.f140719l = 2L;
                        c6737x6a91c12e.k();
                    }
                }
                j17 = j18;
            } else {
                it = it6;
                z17 = z27;
                j17 = j19;
                str = str3;
                z18 = z19;
                weakReference = weakReference2;
            }
            str3 = str;
            j19 = j17;
            z27 = z17;
            z19 = z18;
            weakReference2 = weakReference;
            it6 = it;
        }
    }
}
