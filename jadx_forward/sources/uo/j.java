package uo;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f511048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f511049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, yz5.a aVar) {
        super(0);
        this.f511048d = z17;
        this.f511049e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Boolean.valueOf(!this.f511048d || ((java.lang.Boolean) this.f511049e.mo152xb9724478()).booleanValue());
    }
}
