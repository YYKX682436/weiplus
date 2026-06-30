package sl4;

/* loaded from: classes11.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl4.l f490805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sl4.l lVar) {
        super(0);
        this.f490805d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sl4.l lVar = this.f490805d;
        java.lang.Boolean bool = lVar.f490815i;
        if (bool == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMinimizeModule", "onEnterBackground");
            lVar.f490815i = java.lang.Boolean.FALSE;
            sl4.a aVar = lVar.f490813g;
            if (aVar != null) {
                aVar.i(false);
            }
        }
        return jz5.f0.f384359a;
    }
}
