package mx0;

/* loaded from: classes5.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f413698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f413699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f413700g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(java.lang.String str, java.util.List list, mx0.q2 q2Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413697d = str;
        this.f413698e = list;
        this.f413699f = q2Var;
        this.f413700g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.n2(this.f413697d, this.f413698e, this.f413699f, this.f413700g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.n2 n2Var = (mx0.n2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        n2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setMusicList: templateId ");
        java.lang.String str = this.f413697d;
        sb6.append(str);
        sb6.append(" musicListSize: ");
        java.util.List list = this.f413698e;
        sb6.append(list != null ? new java.lang.Integer(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicEntranceV2Plugin", sb6.toString());
        mx0.k3 d17 = this.f413699f.d();
        mx0.n3 o17 = d17.o();
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10976xccdd83a4) o17.e()).t(list, this.f413700g, false);
        d17.i().putString("KEY_TEMPLATE_ID", str);
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10976xccdd83a4) d17.o().e()).m47287x6a1ea537(str);
        return jz5.f0.f384359a;
    }
}
