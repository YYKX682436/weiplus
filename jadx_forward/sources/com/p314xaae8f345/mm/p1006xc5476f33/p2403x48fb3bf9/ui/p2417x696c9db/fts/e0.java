package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes.dex */
public class e0 implements su4.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 f265925a;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74) {
        this.f265925a = abstractActivityC19367xd1ae8c74;
    }

    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = this.f265925a;
        if (abstractActivityC19367xd1ae8c74.s9() != null) {
            nw4.n s96 = abstractActivityC19367xd1ae8c74.s9();
            if (!s96.f422428i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, not ready");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onSearchActionSheetClick success, ready");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ya.b.f77479x42930b2, java.lang.Integer.valueOf(i17));
            hashMap.put("actionSheetId", java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.w0(s96, nw4.x2.c("onSearchActionSheetClick", hashMap, s96.f422436q, s96.f422437r)));
        }
    }
}
