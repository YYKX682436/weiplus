package kw1;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mw1.b f394352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw1.k f394353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rw1.c f394354g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mw1.b bVar, kw1.k kVar, rw1.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f394352e = bVar;
        this.f394353f = kVar;
        this.f394354g = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kw1.c(this.f394352e, this.f394353f, this.f394354g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f394351d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mw1.c a17 = this.f394352e.a();
            if (a17 == null) {
                return null;
            }
            pw1.d dVar = this.f394353f.f394389f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3 b3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) a17;
            android.util.Size drawSize = b3Var.m54521x356c92ad();
            int m54525x8f7ec8ee = b3Var.m54525x8f7ec8ee();
            rw1.c cVar = this.f394354g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
            pw1.e eVar = new pw1.e(pw1.g.a(cVar.f482120b, 0, 0, 0, false, m54525x8f7ec8ee, 15, null), drawSize, cVar.f482121c);
            this.f394351d = 1;
            obj = dVar.c(eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return (pw1.f) obj;
    }
}
