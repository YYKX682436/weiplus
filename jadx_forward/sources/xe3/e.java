package xe3;

/* loaded from: classes15.dex */
public final class e implements rh3.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe3.f f535472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve3.o f535473e;

    public e(xe3.f fVar, ve3.o oVar) {
        this.f535472d = fVar;
        this.f535473e = oVar;
    }

    @Override // rh3.k
    public void b(rh3.o mp6, rh3.s mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("step 5 getVideoHeight ");
        xe3.f fVar = this.f535472d;
        sb6.append(fVar.f535477d.mo162435x463504c());
        sb6.append(" getvideoWidth ");
        rh3.r rVar = fVar.f535477d;
        sb6.append(rVar.mo162436x8d5c7601());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", sb6.toString());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b, rVar.mo162436x8d5c7601());
        jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122, rVar.mo162435x463504c());
        java.lang.String jSONObject2 = jSONObject.toString();
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar2 = ((xd3.c) this.f535473e).f535149a;
        if (rVar2 != null) {
            rVar2.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b(0, "", jSONObject2));
        }
    }
}
