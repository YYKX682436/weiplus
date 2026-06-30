package q12;

/* loaded from: classes5.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q12.k0 f441129d;

    public j0(q12.k0 k0Var) {
        this.f441129d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f441129d.f441131d;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonMsgDeleteListener", "report queue is empty");
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        java.util.Iterator it = arrayList.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var.z0() != null && f9Var.Q0() != null) {
                jSONArray.put(f9Var.mo78012x3fdd41df() / 1000);
                jSONArray2.put(f9Var.z0());
                jSONArray3.put(f9Var.A0() == 1);
                if (android.text.TextUtils.isEmpty(str)) {
                    str = f9Var.Q0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getTalker(...)");
                }
            }
        }
        if (jSONArray.length() > 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("begin_timestamps", jSONArray);
            hashMap.put("to_username", str);
            hashMap.put("md5s", jSONArray2);
            hashMap.put("is_send", jSONArray3);
            hashMap.put("view_id", "chat_emoticon_delete_report");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("chat_emoticon_delete_report", null, hashMap, 10, false);
        }
        arrayList.clear();
    }
}
