package zb1;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 {

    /* renamed from: CTRL_INDEX */
    private static final int f77553x366c91de = -2;

    /* renamed from: NAME */
    private static final java.lang.String f77554x24728b = "onUpdateWXConfig";

    public final void u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str, java.lang.String str2) {
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                s("opConfig", new org.json.JSONObject(str));
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                s("globalExpt", new org.json.JSONObject(str2));
            }
            p(c11510xdd90c2f2.C0());
            m();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsEventOnUpdateWXConfig", "dispatchOpConfig(rt:%s), exception=%s", c11510xdd90c2f2.f156336n, e17);
        }
    }
}
