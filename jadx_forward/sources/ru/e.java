package ru;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f481092d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f481093e;

    /* renamed from: f, reason: collision with root package name */
    public long f481094f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ru.j f481096h;

    /* renamed from: i, reason: collision with root package name */
    public int f481097i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ru.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481096h = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481095g = obj;
        this.f481097i |= Integer.MIN_VALUE;
        return ru.j.I(this.f481096h, this);
    }
}
