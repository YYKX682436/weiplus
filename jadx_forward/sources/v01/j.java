package v01;

/* loaded from: classes10.dex */
public final class j implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 f513741d;

    public j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 c19800x7f8d35f8) {
        this.f513741d = c19800x7f8d35f8;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object m77176x1accd66f = this.f513741d.m77176x1accd66f();
        if (m77176x1accd66f == null) {
            m77176x1accd66f = "";
        }
        jSONObject.put("personalCenterWxaDataKey", m77176x1accd66f);
        return jSONObject.toString();
    }
}
