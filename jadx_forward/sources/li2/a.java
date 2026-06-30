package li2;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f400289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ li2.b f400290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z17, li2.b bVar) {
        super(0);
        this.f400289d = z17;
        this.f400290e = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f400289d;
        li2.b bVar = this.f400290e;
        if (z17) {
            bVar.m145796xc91ab508().a();
        } else {
            bVar.m145796xc91ab508().b();
        }
        return jz5.f0.f384359a;
    }
}
