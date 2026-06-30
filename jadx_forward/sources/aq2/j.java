package aq2;

/* loaded from: classes2.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94669d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aq2.k f94671f;

    /* renamed from: g, reason: collision with root package name */
    public int f94672g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(aq2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94671f = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94670e = obj;
        this.f94672g |= Integer.MIN_VALUE;
        return this.f94671f.b(this);
    }
}
