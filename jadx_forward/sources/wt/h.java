package wt;

/* loaded from: classes12.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f530773d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f530774e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f530775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wt.i f530776g;

    /* renamed from: h, reason: collision with root package name */
    public int f530777h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wt.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f530776g = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f530775f = obj;
        this.f530777h |= Integer.MIN_VALUE;
        return this.f530776g.f(null, null, this);
    }
}
