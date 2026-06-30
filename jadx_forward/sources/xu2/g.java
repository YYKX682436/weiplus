package xu2;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu2.n f538737d;

    public g(xu2.n nVar) {
        this.f538737d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xu2.n nVar = this.f538737d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f538748e, "click reason 1");
        xu2.v vVar = nVar.f538747d;
        java.lang.String str = vVar.f538774c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "reportFeedback");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", vVar.f538781j);
            jSONObject.put("expTime", vVar.f538777f);
            jSONObject.put("isClickAd", vVar.f538775d ? 1 : 0);
            jSONObject.put("clickAdTimeMs", vVar.f538776e);
            jSONObject.put("feedbackTimeMs", c01.id.c());
            vVar.f538782k.put(jSONObject);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "reportFeedbackGood", new java.lang.Object[0]);
        }
        android.content.Context context = nVar.f538744a;
        db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2g));
        nVar.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
