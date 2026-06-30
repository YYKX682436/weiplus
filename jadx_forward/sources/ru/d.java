package ru;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f481086d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f481087e;

    /* renamed from: f, reason: collision with root package name */
    public long f481088f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ru.j f481090h;

    /* renamed from: i, reason: collision with root package name */
    public int f481091i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481090h = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481089g = obj;
        this.f481091i |= Integer.MIN_VALUE;
        return ru.j.H(this.f481090h, this);
    }
}
