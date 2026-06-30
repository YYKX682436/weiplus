package zd3;

/* loaded from: classes7.dex */
public final class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.k f553152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f553153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f553155g;

    public j(zd3.k kVar, int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f553152d = kVar;
        this.f553153e = i17;
        this.f553154f = str;
        this.f553155g = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b c16466x1a72912b = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b) obj;
        int i17 = c16466x1a72912b.f229692d;
        zd3.k kVar = this.f553152d;
        if (i17 != 0) {
            kVar.w(lc3.x.f399470d, c16466x1a72912b.f229693e);
            return;
        }
        kVar.v(this.f553153e, this.f553154f, this.f553155g);
    }
}
