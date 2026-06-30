package nl4;

/* loaded from: classes10.dex */
public final class m implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nl4.r f419750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.b6 f419751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f419752c;

    public m(nl4.r rVar, zy2.b6 b6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f419750a = rVar;
        this.f419751b = b6Var;
        this.f419752c = interfaceC29045xdcb5ca57;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419750a.f419775l, "requestFinderData ret:" + i18 + ", type:" + i17 + ", feed:" + obj);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f419752c;
        if (obj == null || !(obj instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725)) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("error:" + i18 + ", type:" + i17 + ", request finderObject failed"))));
            return;
        }
        dk4.a sj6 = ((c61.l7) this.f419751b).sj((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj);
        if (sj6 != null) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(sj6));
            return;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("error:" + i18 + ", type:" + i17 + ", mediaInfo from finderObject failed"))));
    }
}
