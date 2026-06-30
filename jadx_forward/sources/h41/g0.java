package h41;

/* loaded from: classes15.dex */
public final class g0 implements ey.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f360318a;

    public g0(h41.i0 i0Var) {
        this.f360318a = i0Var;
    }

    @Override // ey.k
    public java.lang.String a() {
        return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
    }

    @Override // ey.k
    public java.lang.String b() {
        return "message::send_text_message";
    }

    @Override // ey.k
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.e notification) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notification, "notification");
        try {
            str = new org.json.JSONObject(notification.b()).getString("chat_id");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        boolean z17 = false;
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "onSendTextMsgEnd: username is empty");
            return;
        }
        try {
            z17 = new org.json.JSONObject(notification.c()).getBoolean(ya.b.f77504xbb80cbe3);
        } catch (java.lang.Exception unused2) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "onSendTextMsgEnd: username " + str + ' ' + z17);
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.d dVar = this.f360318a.f360327a;
        if (dVar != null) {
            dVar.l1(str, z17);
        }
    }
}
