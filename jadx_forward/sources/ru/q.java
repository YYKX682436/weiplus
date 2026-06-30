package ru;

/* loaded from: classes12.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f481151d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ru.u f481153f;

    /* renamed from: g, reason: collision with root package name */
    public int f481154g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ru.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481153f = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481152e = obj;
        this.f481154g |= Integer.MIN_VALUE;
        return this.f481153f.B(this);
    }
}
