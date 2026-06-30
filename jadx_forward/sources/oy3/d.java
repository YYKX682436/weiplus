package oy3;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final oy3.d f431549d = new oy3.d();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", "save quick reply.");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < 4; i17++) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.f77479x42930b2, i17);
            jSONObject.put("msg", "Quick Reply " + i17);
            jSONArray.put(jSONObject);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5952x5645b0f7 c5952x5645b0f7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5952x5645b0f7();
        c5952x5645b0f7.f136250g.f88320a = jSONArray.toString();
        c5952x5645b0f7.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", c5952x5645b0f7.f136251h.f88398a);
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
