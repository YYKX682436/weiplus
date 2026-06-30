package u61;

/* loaded from: classes4.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f506460d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f506461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u61.u f506462f;

    /* renamed from: g, reason: collision with root package name */
    public int f506463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u61.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f506462f = uVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f506461e = obj;
        this.f506463g |= Integer.MIN_VALUE;
        return this.f506462f.Ai(null, null, this);
    }
}
