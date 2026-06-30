package i05;

/* loaded from: classes4.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f368117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p94.u0 f368118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f368119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i05.j f368120g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i17, p94.u0 u0Var, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, i05.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f368117d = i17;
        this.f368118e = u0Var;
        this.f368119f = c21053xdbf1e5f4;
        this.f368120g = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new i05.k(this.f368117d, this.f368118e, this.f368119f, this.f368120g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        i05.k kVar = (i05.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = this.f368117d;
        p94.u0 u0Var = this.f368118e;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo = this.f368119f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emojiInfo, "$emojiInfo");
            u0Var.b(emojiInfo);
            i05.j.b(this.f368120g, 0L, null, null, 6, null);
        } else {
            u0Var.a();
            i05.j.b(this.f368120g, 3L, null, null, 6, null);
        }
        return jz5.f0.f384359a;
    }
}
