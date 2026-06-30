package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f218661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f218662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 f218664g;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 c15533x22cea970, boolean z17, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f218664g = c15533x22cea970;
        this.f218661d = z17;
        this.f218662e = jSONObject;
        this.f218663f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970.f218621t;
        boolean z17 = this.f218661d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionProcessLayout", "click retry btn, canRetry：%s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 c15533x22cea970 = this.f218664g;
        if (z17) {
            c15533x22cea970.f218622d.Y6();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd viewOnClickListenerC15534xde6dcfdd = c15533x22cea970.f218622d;
            org.json.JSONObject jSONObject = this.f218662e;
            viewOnClickListenerC15534xde6dcfdd.U6(jSONObject);
            if (wz2.a.d(jSONObject)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f218663f)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23269, 1, 3, 0);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23269, 1, 3, 1);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
