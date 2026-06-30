package wo4;

/* loaded from: classes10.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f529823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wo4.y yVar) {
        super(0);
        this.f529823d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogRemuxer", "video onEncodeEnd");
        gs0.b bVar = this.f529823d.f529830d;
        if (bVar != null) {
            bVar.f();
        }
        this.f529823d.f529838l = true;
        this.f529823d.c();
        return jz5.f0.f384359a;
    }
}
