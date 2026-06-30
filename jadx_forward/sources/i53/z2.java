package i53;

/* loaded from: classes8.dex */
public class z2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.d3 f370338a;

    public z2(i53.d3 d3Var) {
        this.f370338a = d3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        i53.d3 d3Var = this.f370338a;
        if (!((java.util.HashSet) d3Var.f370085f).contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "onFinish, not in uploadingList, localId: %s", str);
            return;
        }
        ((java.util.HashSet) d3Var.f370085f).remove(str);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) d3Var.f370090k.remove(str), java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "success : %b, errCode: %d, localId : %s, mediaId : %s, mediaUrl : %s, costTime: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str, str2, str3, java.lang.Long.valueOf(currentTimeMillis));
        if (d3Var.f370089j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "uploadMediaFile, has cancel");
        } else {
            p95.a.a(new i53.y2(this, str, currentTimeMillis, z17, str3, str4, i17));
        }
    }
}
