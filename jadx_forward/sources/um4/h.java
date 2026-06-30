package um4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/h;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiHideNavBarShadow", jSONObject != null ? jSONObject.toString() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(this.f224975e.f380557a);
        if (m65361xd4eb96cf == null || !(m65361xd4eb96cf instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) || ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) m65361xd4eb96cf).getRootView() == null) {
            this.f224976f.a("cannot find view");
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new um4.g(m65361xd4eb96cf));
        }
    }
}
