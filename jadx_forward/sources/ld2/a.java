package ld2;

/* loaded from: classes15.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399600d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f399601e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f399602f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f399603g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399604h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ld2.i f399605i;

    /* renamed from: m, reason: collision with root package name */
    public int f399606m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ld2.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f399605i = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f399604h = obj;
        this.f399606m |= Integer.MIN_VALUE;
        return this.f399605i.a(null, null, false, this);
    }
}
