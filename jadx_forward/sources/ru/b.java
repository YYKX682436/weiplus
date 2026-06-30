package ru;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f481081d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ru.j f481083f;

    /* renamed from: g, reason: collision with root package name */
    public int f481084g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ru.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481083f = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481082e = obj;
        this.f481084g |= Integer.MIN_VALUE;
        return ru.j.E(this.f481083f, null, this);
    }
}
