package q12;

/* loaded from: classes5.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q12.o0 f441150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f441151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q12.o0 o0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(0);
        this.f441150d = o0Var;
        this.f441151e = f9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f441150d.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f441151e;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonMsgRevokeListener", "info data is null");
        } else {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            jSONArray.put(f9Var.mo78012x3fdd41df() / 1000);
            jSONArray2.put(f9Var.z0());
            jSONArray3.put(f9Var.A0() == 1);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("begin_timestamps", jSONArray);
            java.lang.String Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            hashMap.put("to_username", Q0);
            hashMap.put("md5s", jSONArray2);
            hashMap.put("is_send", jSONArray3);
            hashMap.put("view_id", "chat_emoticon_delete_report");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("chat_emoticon_delete_report", null, hashMap, 10, false);
        }
        return jz5.f0.f384359a;
    }
}
