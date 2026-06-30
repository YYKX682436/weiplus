package p05;

/* loaded from: classes3.dex */
public final class h0 implements com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p05.i0 f432064a;

    public h0(p05.i0 i0Var) {
        this.f432064a = i0Var;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced
    public int a(int i17, java.lang.String message, tq5.g type) {
        java.lang.Object obj;
        p05.i0 i0Var = this.f432064a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (type != tq5.g.JSON_LUA_GENERIC) {
            return 0;
        }
        try {
            java.util.Iterator it = i0Var.f432078f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((p05.d0) obj).f432010a == ((long) i17)) {
                    break;
                }
            }
            if (((p05.d0) obj) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "#jsoncb type=" + type + " sourceId=" + i17 + " message=" + message);
                if (new org.json.JSONObject(message).optInt("animEnd") == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "#weVisionJsonCallback ptr=" + i17 + " end.");
                    p05.n0 n0Var = i0Var.f432079g;
                    if (n0Var != null) {
                        ((df2.b1) n0Var).a();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLive.FallingGiftEffect", e17.toString());
        }
        return 0;
    }
}
