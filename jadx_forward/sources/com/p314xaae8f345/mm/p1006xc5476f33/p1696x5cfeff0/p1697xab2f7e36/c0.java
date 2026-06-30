package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f218653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 f218654e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 c15533x22cea970, org.json.JSONObject jSONObject) {
        this.f218654e = c15533x22cea970;
        this.f218653d = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        org.json.JSONObject jSONObject = this.f218653d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970.f218621t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionProcessLayout", "click customBtn");
        try {
            jSONObject.put("click_other_verify_btn", "yes");
            this.f218654e.f218622d.U6(jSONObject);
            if (wz2.a.d(jSONObject)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23269, 1, 1, 1);
            }
        } catch (java.lang.Exception e17) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970.f218621t;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "face start feedback webview exception", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
