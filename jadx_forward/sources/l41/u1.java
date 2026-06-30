package l41;

/* loaded from: classes4.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f397470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f397471g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f397472h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f397473i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397474m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.lang.String str, java.lang.String str2, double d17, double d18, double d19, int i17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f397468d = str;
        this.f397469e = str2;
        this.f397470f = d17;
        this.f397471g = d18;
        this.f397472h = d19;
        this.f397473i = i17;
        this.f397474m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l41.u1(this.f397468d, this.f397469e, this.f397470f, this.f397471g, this.f397472h, this.f397473i, this.f397474m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        l41.u1 u1Var = (l41.u1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.i05 i05Var = new r45.i05();
        i05Var.f458156d = this.f397468d;
        java.lang.String str = this.f397469e;
        if (str != null) {
            i05Var.f458157e = str;
        }
        i05Var.f458158f = this.f397470f;
        i05Var.f458159g = this.f397471g;
        i05Var.f458160h = this.f397472h;
        i05Var.f458161i = this.f397473i;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/openimkefucontactreportlocation";
        lVar.f152200d = 8291;
        lVar.f152197a = i05Var;
        lVar.f152198b = new r45.j05();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = o01.d.f423424a.a(lVar.a());
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.c(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, p3325xe03a0797.p3326xc267989b.a1.DEFAULT, new l41.t1(a17, this.f397474m, null));
        }
        return jz5.f0.f384359a;
    }
}
