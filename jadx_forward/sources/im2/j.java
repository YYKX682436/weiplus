package im2;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mo0.a f373928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.k f373929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug5.v f373930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(mo0.a aVar, im2.k kVar, ug5.v vVar) {
        super(0);
        this.f373928d = aVar;
        this.f373929e = kVar;
        this.f373930f = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        im2.k kVar = this.f373929e;
        mo0.a aVar = this.f373928d;
        aVar.post(new im2.i(kVar, aVar, this.f373930f));
        return jz5.f0.f384359a;
    }
}
