package xc5;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f534974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.l f534975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f534976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf3.a f534977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f534978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f534979i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, xc5.l lVar, int i17, qf3.a aVar, java.util.List list2, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534974d = list;
        this.f534975e = lVar;
        this.f534976f = i17;
        this.f534977g = aVar;
        this.f534978h = list2;
        this.f534979i = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.f(this.f534974d, this.f534975e, this.f534976f, this.f534977g, this.f534978h, this.f534979i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xc5.f fVar = (xc5.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.List list = this.f534974d;
        boolean z17 = !list.isEmpty();
        qf3.a aVar2 = this.f534977g;
        xc5.l lVar = this.f534975e;
        if (z17) {
            lVar.f535055d.addAll(0, list);
            lVar.f535059h = this.f534976f;
            aVar2.h1(lVar.f535055d, new java.util.ArrayList(list));
        }
        java.util.List list2 = this.f534978h;
        if (!list2.isEmpty()) {
            lVar.f535055d.addAll(list2);
            lVar.f535060i = this.f534979i;
            ((lf3.c0) aVar2).W6(lVar.f535055d, new java.util.ArrayList(list2));
        }
        if (!list.isEmpty()) {
            aVar2.T3(list.size());
        }
        lVar.f535063o = true;
        return jz5.f0.f384359a;
    }
}
