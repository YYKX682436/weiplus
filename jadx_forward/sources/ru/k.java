package ru;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f481116d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f481117e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f481118f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481119g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ru.u f481120h;

    /* renamed from: i, reason: collision with root package name */
    public int f481121i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ru.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481120h = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481119g = obj;
        this.f481121i |= Integer.MIN_VALUE;
        return this.f481120h.D(null, this);
    }
}
