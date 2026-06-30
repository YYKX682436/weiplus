package sn1;

/* loaded from: classes9.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f491630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sn1.z f491631e;

    /* renamed from: f, reason: collision with root package name */
    public int f491632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sn1.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f491631e = zVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f491630d = obj;
        this.f491632f |= Integer.MIN_VALUE;
        return this.f491631e.e(null, this);
    }
}
