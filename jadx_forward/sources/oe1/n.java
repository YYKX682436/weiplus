package oe1;

/* loaded from: classes15.dex */
public class n implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a f426260d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a) {
        this.f426260d = c12262x4a2a25a;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = this.f426260d;
        int m51330x8a3f46d8 = c12262x4a2a25a.m51330x8a3f46d8();
        int m51335x51e8b0a = c12262x4a2a25a.m51335x51e8b0a();
        if (m51335x51e8b0a != 0 && (i17 = (int) ((m51330x8a3f46d8 * 100.0f) / m51335x51e8b0a)) != c12262x4a2a25a.f165087z1) {
            c12262x4a2a25a.f165087z1 = i17;
            xe1.p pVar = c12262x4a2a25a.C;
            if (pVar != null) {
                pVar.getClass();
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoCacheUpdate, percent:%d, duration:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m51335x51e8b0a));
                    org.json.JSONObject b17 = pVar.b();
                    b17.put("buffered", i17);
                    b17.put("duration", m51335x51e8b0a);
                    pVar.a(new xe1.k(null), b17);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoCacheUpdate e=%s", e17);
                }
            }
        }
        return true;
    }
}
