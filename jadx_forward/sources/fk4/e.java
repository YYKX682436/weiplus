package fk4;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345131d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk4.k f345133f;

    /* renamed from: g, reason: collision with root package name */
    public int f345134g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fk4.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f345133f = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f345132e = obj;
        this.f345134g |= Integer.MIN_VALUE;
        return this.f345133f.c(this);
    }
}
