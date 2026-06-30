package vt2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f521473a;

    /* renamed from: b, reason: collision with root package name */
    public final long f521474b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f521475c;

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f521476d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f521477e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f521478f;

    public c(int i17, long j17, android.content.Context context, gk2.e buContext, yz5.a refresher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refresher, "refresher");
        this.f521473a = i17;
        this.f521474b = j17;
        this.f521475c = context;
        this.f521476d = buContext;
        this.f521477e = refresher;
        this.f521478f = "Finder.FinderLiveProductOpenPriceRequestPresenter";
    }

    public final boolean a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type ");
        int i17 = this.f521473a;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f521478f, sb6.toString());
        if (i17 != 3) {
            return false;
        }
        r45.ld2 ld2Var = new r45.ld2();
        gk2.e eVar = this.f521476d;
        ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
        ld2Var.set(0, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
        ld2Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        p3325xe03a0797.p3326xc267989b.l.d(eVar.f354008i, null, null, new vt2.b("/cgi-bin/mmbiz-bin/finderliveaskforopenpriceproduct", 7401, ld2Var, this, null), 3, null);
        return true;
    }
}
