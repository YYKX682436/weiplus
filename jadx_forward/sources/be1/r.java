package be1;

/* loaded from: classes8.dex */
public class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4230x366c91de = 169;

    /* renamed from: NAME */
    public static final java.lang.String f4231x24728b = "getClipboardData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("clipboard");
        if (clipboardManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetClipboardData", "getSystemService(CLIPBOARD_SERVICE) failed.");
            lVar.a(i17, o("fail"));
            return;
        }
        try {
            android.content.ClipData primaryClip = clipboardManager.getPrimaryClip();
            java.lang.String str = "";
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt.getText() != null) {
                    str = itemAt.getText().toString();
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
            lVar.a(i17, p("ok", hashMap));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetClipboardData", "invoke with appId:%s, but get Exception:%s", lVar.mo48798x74292566(), e17);
        }
    }
}
