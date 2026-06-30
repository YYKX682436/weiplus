package p05;

/* loaded from: classes10.dex */
public final class c2 implements com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f432004a;

    public c2(p05.d2 d2Var) {
        this.f432004a = d2Var;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced
    public int a(int i17, java.lang.String message, tq5.g type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#jsoncb type=" + type + " sourceId=" + i17 + " message=" + message);
        if (type != tq5.g.JSON_LUA_GENERIC) {
            return 0;
        }
        p05.d2 d2Var = this.f432004a;
        d2Var.e(0L, new p05.b2(d2Var, i17, message));
        return 0;
    }
}
