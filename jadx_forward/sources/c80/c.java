package c80;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f121179d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f121180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c80.e f121181f;

    /* renamed from: g, reason: collision with root package name */
    public int f121182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c80.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f121181f = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f121180e = obj;
        this.f121182g |= Integer.MIN_VALUE;
        return this.f121181f.U6(null, this);
    }
}
