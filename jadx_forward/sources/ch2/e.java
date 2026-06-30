package ch2;

/* loaded from: classes10.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f122844d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f122845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ch2.q f122846f;

    /* renamed from: g, reason: collision with root package name */
    public int f122847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ch2.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f122846f = qVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f122845e = obj;
        this.f122847g |= Integer.MIN_VALUE;
        return ch2.q.Z6(this.f122846f, this);
    }
}
