package w00;

/* loaded from: classes7.dex */
public final class a implements t00.s0 {
    @Override // t00.s0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.H;
    }

    @Override // t00.s0
    public java.lang.String b(int i17, android.content.Context context, org.json.JSONObject data, c00.p3 actionReturn) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionReturn, "actionReturn");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ActionHandlerCheckActionSync", "params not set");
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i) actionReturn).a(null);
        }
        org.json.JSONObject a17 = t00.d.f495805a.a(optJSONObject, i17);
        return a17 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i) actionReturn).b(a17) : ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i) actionReturn).a(null);
    }
}
