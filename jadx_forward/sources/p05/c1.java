package p05;

/* loaded from: classes3.dex */
public final class c1 implements com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p05.d1 f432003a;

    public c1(p05.d1 d1Var) {
        this.f432003a = d1Var;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced
    public int a(int i17, java.lang.String message, tq5.g type) {
        java.lang.Object obj;
        p05.d1 d1Var = this.f432003a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (type != tq5.g.JSON_LUA_GENERIC) {
            return 0;
        }
        try {
            java.util.Iterator it = d1Var.f432016e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((p05.a1) obj).f431969a == ((long) i17)) {
                    break;
                }
            }
            if (((p05.a1) obj) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "#jsoncb type=" + type + " sourceId=" + i17 + " message=" + message);
                int optInt = new org.json.JSONObject(message).optInt("animStatus");
                if (optInt == 1 || optInt == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "#weVisionJsonCallback ptr=" + i17 + " end.");
                    p05.r0 r0Var = d1Var.f432017f;
                    if (r0Var != null) {
                        ((df2.r9) r0Var).a();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("InteractiveGiftEffect", e17.toString());
        }
        return 0;
    }
}
