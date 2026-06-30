package fn4;

/* loaded from: classes15.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.h f346144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.v0 f346145e;

    public u0(fn4.v0 v0Var, sm4.h hVar) {
        this.f346145e = v0Var;
        this.f346144d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sm4.h hVar = this.f346144d;
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(((r45.s97) hVar.f491477e.f152244b.f152233a).f467120f).optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return;
            }
            java.util.List k17 = fn4.z0.k(this.f346145e.f346147d.f346164a.p6(), optJSONArray);
            hVar.f491478f.N.f467405i.addAll(k17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "netSceneTopStoryRelevantVideo add result list %d", java.lang.Integer.valueOf(((java.util.ArrayList) k17).size()));
        } catch (java.lang.Exception unused) {
        }
    }
}
