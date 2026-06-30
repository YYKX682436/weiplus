package ch2;

/* loaded from: classes10.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f122829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f122832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, ch2.o2 o2Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122829d = hVar;
        this.f122830e = str;
        this.f122831f = o2Var;
        this.f122832g = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.c0(this.f122829d, interfaceC29045xdcb5ca57, this.f122830e, this.f122831f, this.f122832g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ch2.c0 c0Var = (ch2.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", "getSongPlayDetailInfo fail songUniqueId: " + this.f122830e + " error: " + ((xg2.a) ((xg2.b) this.f122829d).f535914b));
        if (zl2.q4.f555466a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSongPlayDetailInfo fail cookie: ");
            byte[] bArr = this.f122831f.i7().f410518o;
            if (bArr == null) {
                bArr = "".getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
            }
            sb6.append(android.util.Base64.encodeToString(bArr, 2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", sb6.toString());
        }
        this.f122832g.f391656d = null;
        return jz5.f0.f384359a;
    }
}
