package pw1;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440201d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pw1.d f440203f;

    /* renamed from: g, reason: collision with root package name */
    public int f440204g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pw1.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f440203f = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f440202e = obj;
        this.f440204g |= Integer.MIN_VALUE;
        return this.f440203f.b(this);
    }
}
