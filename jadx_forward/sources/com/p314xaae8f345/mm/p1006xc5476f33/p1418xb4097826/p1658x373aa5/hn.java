package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class hn implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f213788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.lz0 f213789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e1 f213790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f213791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f213792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f213793g;

    public hn(java.lang.String str, android.os.Bundle bundle, r45.lz0 lz0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var, boolean z17, yz5.l lVar) {
        this.f213787a = str;
        this.f213788b = bundle;
        this.f213789c = lz0Var;
        this.f213790d = e1Var;
        this.f213791e = e3Var;
        this.f213792f = z17;
        this.f213793g = lVar;
    }

    @Override // zy2.c6
    public final void a(zy2.dc dcVar) {
        ya2.b2 b2Var = (ya2.b2) dcVar;
        java.lang.String D0 = b2Var.D0();
        java.lang.String str = this.f213787a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, D0)) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gn(this.f213790d, this.f213791e, this.f213788b, this.f213792f, this.f213793g));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderWxProfileHelper", "get contact success %s", str);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fn(b2Var, this.f213788b, this.f213789c, this.f213790d, this.f213791e, this.f213792f, this.f213793g));
        }
    }
}
