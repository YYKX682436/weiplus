package q12;

/* loaded from: classes5.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q12.k0 f441123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84 f441124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(q12.k0 k0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84 c5297xfbfc3e84) {
        super(0);
        this.f441123d = k0Var;
        this.f441124e = c5297xfbfc3e84;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        am.y3 y3Var = this.f441124e.f135619g;
        java.lang.String str = y3Var != null ? y3Var.f89960c : null;
        long p17 = c01.w9.p() / 1000;
        this.f441123d.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonMsgDeleteListener", "talker is empty");
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            hashMap.put("to_username", str);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(0);
            hashMap.put("begin_timestamps", jSONArray);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            jSONArray2.put(p17);
            hashMap.put("end_timestamps", jSONArray2);
            hashMap.put("view_id", "chat_emoticon_delete_report");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("chat_emoticon_delete_report", null, hashMap, 10, false);
        }
        return jz5.f0.f384359a;
    }
}
