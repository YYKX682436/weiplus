package tl2;

/* loaded from: classes8.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f501803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f501804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tl2.u uVar, yz5.a aVar) {
        super(0);
        this.f501803d = uVar;
        this.f501804e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f501803d.f501807d.getWindow().getDecorView().post(new tl2.q(this.f501804e));
        return jz5.f0.f384359a;
    }
}
