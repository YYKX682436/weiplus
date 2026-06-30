package zd2;

/* loaded from: classes5.dex */
public final class a implements yd2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final zd2.a f553124a = new zd2.a();

    @Override // yd2.a
    public void b(yd2.l lVar, yd2.b context, yz5.q completion) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1476x696c9db.C14172xdfa03c2b params = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1476x696c9db.C14172xdfa03c2b) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Live.AiAssistant.ToolEcho", "echo: message=" + params.message + ", toolCallId=" + context.f542566e);
        java.lang.String jSONObject = new org.json.JSONObject().put("echo_message", params.message).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        completion.mo147xb9724478(java.lang.Boolean.TRUE, jSONObject, 0);
    }

    @Override // yd2.a
    public boolean c(yd2.b context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return true;
    }
}
