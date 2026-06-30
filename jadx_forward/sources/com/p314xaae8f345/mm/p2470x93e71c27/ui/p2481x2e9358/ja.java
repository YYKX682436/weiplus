package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class ja implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra f271968d;

    public ja(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar) {
        this.f271968d = raVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ra raVar = this.f271968d;
        java.util.HashMap c17 = raVar.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashMap hashMap = raVar.f272164v;
        java.util.Iterator it = hashMap.entrySet().iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.ArrayList arrayList = raVar.f272154l;
            if (!hasNext) {
                c17.put("issue_emo_num", java.lang.Integer.valueOf(arrayList.size()));
                c17.put("exp_emo_num", java.lang.Integer.valueOf(hashMap.size()));
                c17.put("issue_emo_info", raVar.f272165w);
                c17.put("exp_emo_info", sb6.toString().replace(",", ";"));
                raVar.e("chat_emo_bubble", "view_unexp", c17);
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            long longValue = ((java.lang.Long) entry.getValue()).longValue();
            jr.p pVar = (jr.p) arrayList.get(intValue);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            raVar.b(hashMap2, pVar, intValue);
            hashMap2.put("exp_time", java.lang.Long.valueOf(longValue));
            sb6.append(new org.json.JSONObject(hashMap2));
            i17++;
            if (i17 < hashMap.size()) {
                sb6.append("#");
            }
        }
    }
}
