package sn1;

/* loaded from: classes9.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f491640d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f491641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sn1.z f491642f;

    /* renamed from: g, reason: collision with root package name */
    public int f491643g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(sn1.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f491642f = zVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f491641e = obj;
        this.f491643g |= Integer.MIN_VALUE;
        return this.f491642f.f(null, this);
    }
}
