package df1;

/* loaded from: classes15.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe1.l1 f311174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12274xd0769b70 f311175e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12274xd0769b70 c12274xd0769b70, oe1.l1 l1Var) {
        this.f311175e = c12274xd0769b70;
        this.f311174d = l1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/AppBrandVideoViewControlBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12274xd0769b70 c12274xd0769b70 = this.f311175e;
        boolean z17 = !c12274xd0769b70.S;
        c12274xd0769b70.S = z17;
        if (z17) {
            c12274xd0769b70.D.setImageResource(com.p314xaae8f345.mm.R.raw.f78492x57005d3f);
        } else {
            c12274xd0769b70.D.setImageResource(com.p314xaae8f345.mm.R.raw.f78491x890b4a0f);
        }
        oe1.l1 l1Var = this.f311174d;
        if (l1Var != null) {
            boolean z18 = c12274xd0769b70.S;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = ((oe1.r) l1Var).f426269a;
            if (!z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e = c12262x4a2a25a.f165064h;
                c12264x3a069b1e.f165121t = 4;
                c12264x3a069b1e.invalidate();
            } else if (c12262x4a2a25a.f165062f.mo51382xc00617a4()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e2 = c12262x4a2a25a.f165064h;
                c12264x3a069b1e2.f165121t = 1;
                c12264x3a069b1e2.invalidate();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e3 = c12262x4a2a25a.f165064h;
                c12264x3a069b1e3.f165121t = 2;
                c12264x3a069b1e3.invalidate();
            }
            xe1.p pVar = c12262x4a2a25a.C;
            if (pVar != null) {
                int i17 = c12262x4a2a25a.f165083y;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoClickDanmuBtn showDanmu=%b", java.lang.Boolean.valueOf(z18));
                    org.json.JSONObject b17 = pVar.b();
                    b17.put("showDanmu", z18);
                    b17.put("videoPlayerId", i17);
                    pVar.a(new xe1.c(null), b17);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoClickDanmuBtn e=%s", e17);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/AppBrandVideoViewControlBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
