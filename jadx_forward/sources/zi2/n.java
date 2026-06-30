package zi2;

/* loaded from: classes.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f554656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f554657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f554658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, zi2.w wVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554656d = hVar;
        this.f554657e = c0Var;
        this.f554658f = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zi2.n(this.f554656d, interfaceC29045xdcb5ca57, this.f554657e, this.f554658f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zi2.n nVar = (zi2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        nVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f554656d).f535914b;
        rm0.j jVar = aVar2.f535912a;
        int i17 = jVar != null ? jVar.f478958f : -1;
        if (jVar == null || (str = jVar.getMessage()) == null) {
            str = "";
        }
        rm0.j jVar2 = aVar2.f535912a;
        int i18 = jVar2 != null ? jVar2.f478957e : -1;
        this.f554657e.f391645d = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "opMicConfig fail, errCode: " + i17 + " errType: " + i18 + " errMsg: " + str);
        if (str.length() > 0) {
            db5.t7.m(this.f554658f.f446856d.getContext(), str);
        }
        return jz5.f0.f384359a;
    }
}
