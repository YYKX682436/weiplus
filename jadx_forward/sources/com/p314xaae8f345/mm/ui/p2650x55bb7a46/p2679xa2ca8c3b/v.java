package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes2.dex */
public final class v implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f287264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f287265b;

    public v(boolean z17, r45.g92 g92Var) {
        this.f287264a = z17;
        this.f287265b = g92Var;
    }

    @Override // j45.g
    /* renamed from: onActivityResult */
    public final void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            java.util.Iterator<T> it = stringArrayListExtra.iterator();
            java.lang.String str = "";
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it.next();
                if (str.length() == 0) {
                    str = str + str2;
                } else {
                    str = str + ';' + str2;
                }
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("share_username", str);
            boolean z17 = this.f287264a;
            vs5.a aVar = vs5.a.f521457a;
            r45.g92 g92Var = this.f287265b;
            if (z17) {
                aVar.a(g92Var.m75945x2fec8307(0), g92Var.m75945x2fec8307(2), g92Var.m75945x2fec8307(1), "4", "1", "0", (i17 & 64) != 0 ? null : jSONObject, (i17 & 128) != 0 ? "" : null);
            } else {
                aVar.a(g92Var.m75945x2fec8307(0), g92Var.m75945x2fec8307(2), g92Var.m75945x2fec8307(1), "3", "1", "0", (i17 & 64) != 0 ? null : jSONObject, (i17 & 128) != 0 ? "" : null);
            }
        }
    }
}
