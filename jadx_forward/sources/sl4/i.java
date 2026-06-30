package sl4;

/* loaded from: classes11.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl4.l f490806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sl4.l lVar) {
        super(0);
        this.f490806d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sl4.l lVar = this.f490806d;
        java.lang.Boolean bool = lVar.f490815i;
        if (bool == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMinimizeModule", "onEnterForeground");
            lVar.f490815i = java.lang.Boolean.TRUE;
            sl4.a aVar = lVar.f490813g;
            if (aVar != null) {
                aVar.h();
            }
        }
        return jz5.f0.f384359a;
    }
}
