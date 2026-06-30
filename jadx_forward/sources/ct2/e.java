package ct2;

/* loaded from: classes3.dex */
public final class e extends pf5.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f303786d = "LiveReplayCacheSlice";

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f303787e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(50);

    public final void N6(long j17, int i17) {
        if (j17 == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f303786d, "cache offset:" + i17 + " for liveId:" + j17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f303787e;
        zs2.g gVar = (zs2.g) r2Var.get(java.lang.Long.valueOf(j17));
        if (gVar != null) {
            gVar.f556790a = i17;
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        zs2.g gVar2 = new zs2.g();
        gVar2.f556790a = i17;
    }

    @Override // pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
    }
}
