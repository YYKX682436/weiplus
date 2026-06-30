package zi2;

/* loaded from: classes3.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f554629d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f554630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f554631f;

    /* renamed from: g, reason: collision with root package name */
    public int f554632g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zi2.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f554631f = wVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f554630e = obj;
        this.f554632g |= Integer.MIN_VALUE;
        return this.f554631f.M(null, this);
    }
}
