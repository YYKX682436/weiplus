package sf2;

/* loaded from: classes.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f488795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f488799i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, sf2.d3 d3Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488794d = hVar;
        this.f488795e = i17;
        this.f488796f = str;
        this.f488797g = str2;
        this.f488798h = h0Var;
        this.f488799i = d3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.r2(this.f488794d, interfaceC29045xdcb5ca57, this.f488795e, this.f488796f, this.f488797g, this.f488798h, this.f488799i);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.r2 r2Var = (sf2.r2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rm0.j jVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f488794d).f535914b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveRequestSongController", "FinderLiveKtvModSongListRequest fail, modType: " + this.f488795e + ", mid: " + this.f488796f + ", uniqueId " + this.f488797g + " errMsg: " + aVar2 + ' ');
        rm0.j jVar2 = aVar2.f535912a;
        this.f488798h.f391656d = jVar2;
        java.lang.Integer num = jVar2 != null ? new java.lang.Integer(jVar2.f478958f) : null;
        boolean z17 = false;
        java.lang.Integer[] numArr = {new java.lang.Integer(-200307), new java.lang.Integer(-200315)};
        int i17 = 0;
        while (true) {
            if (i17 >= 2) {
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(numArr[i17], num)) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17 && (jVar = aVar2.f535912a) != null && (str = jVar.f478959g) != null) {
            android.content.Context O6 = this.f488799i.O6();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
            e4Var.f293309c = str;
            e4Var.c();
        }
        return jz5.f0.f384359a;
    }
}
