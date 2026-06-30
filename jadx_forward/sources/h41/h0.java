package h41;

/* loaded from: classes15.dex */
public final class h0 implements ey.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f360325a;

    public h0(h41.i0 i0Var) {
        this.f360325a = i0Var;
    }

    @Override // ey.t
    public java.lang.String a() {
        return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
    }

    @Override // ey.t
    public java.lang.String b() {
        return "message::start_msg_typing";
    }

    @Override // ey.t
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.o notification) {
        java.lang.String str = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notification, "notification");
        try {
            java.lang.String string = new org.json.JSONObject(notification.f298443h[4] ? notification.f298442g : "").getString("chat_id");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            str = string;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "ask confirm send msg parametersJson error " + e17);
        }
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "ask confirm send msg chat_id empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "start msg typing ".concat(str));
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.d dVar = this.f360325a.f360327a;
        if (dVar != null) {
            dVar.B1(str);
        }
    }
}
