package ru;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f481143d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f481144e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ru.u f481146g;

    /* renamed from: h, reason: collision with root package name */
    public int f481147h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ru.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481146g = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481145f = obj;
        this.f481147h |= Integer.MIN_VALUE;
        return this.f481146g.m(this);
    }
}
