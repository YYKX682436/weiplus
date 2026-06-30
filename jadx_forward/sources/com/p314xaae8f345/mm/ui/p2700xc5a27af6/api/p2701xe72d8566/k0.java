package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f290047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qj5.q f290049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290050g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f290051h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(qj5.n nVar, android.app.Activity activity, qj5.q qVar, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var, java.util.HashMap hashMap) {
        super(1);
        this.f290047d = nVar;
        this.f290048e = activity;
        this.f290049f = qVar;
        this.f290050g = j1Var;
        this.f290051h = hashMap;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = this.f290047d.f445519t2;
        if (str2 != null) {
            jd5.a aVar = new jd5.a();
            aVar.p(str2);
            aVar.q(this.f290049f.b(!r0.f445520u2));
            com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j0 j0Var = new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j0(str, this.f290048e, this.f290047d, this.f290050g, this.f290051h, this.f290049f, str2, aVar);
            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
            n13.t tVar = new n13.t();
            tVar.f415666a = j0Var;
            tVar.f415671f.f415672a = 0;
            ((dk5.y) a0Var).wi(this.f290048e, aVar, str, tVar);
        }
        return jz5.f0.f384359a;
    }
}
