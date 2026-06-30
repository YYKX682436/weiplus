package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f286924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f286926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f286927g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.c f286928h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286929i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.content.Intent intent, yb5.d dVar, long j17, long j18, zy2.c cVar, java.lang.String str) {
        super(2);
        this.f286924d = intent;
        this.f286925e = dVar;
        this.f286926f = j17;
        this.f286927g = j18;
        this.f286928h = cVar;
        this.f286929i = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent i17 = (android.content.Intent) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "i");
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        long j17 = this.f286926f;
        android.content.Intent intent = this.f286924d;
        intent.putExtra("CURRENT_FEED_ID", j17);
        intent.putExtra("LAUNCH_WITH_ANIM", booleanValue);
        android.app.Activity g17 = this.f286925e.g();
        long j18 = this.f286926f;
        long j19 = this.f286927g;
        zy2.c cVar = this.f286928h;
        java.lang.String m75945x2fec8307 = cVar.f558892b.m75945x2fec8307(1);
        java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        java.lang.String m75945x2fec83072 = cVar.f558892b.m75945x2fec8307(12);
        ((vd2.d5) i0Var).wi(intent, g17, j18, j19, str, m75945x2fec83072 == null ? "" : m75945x2fec83072, cVar.f558892b.m75945x2fec8307(4), this.f286929i, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
        return jz5.f0.f384359a;
    }
}
