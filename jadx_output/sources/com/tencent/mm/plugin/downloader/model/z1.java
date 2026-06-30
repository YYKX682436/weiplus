package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class z1 implements m02.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f97213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f97214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f97215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f97216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97218f;

    public z1(com.tencent.mm.pointers.PBool pBool, org.json.JSONObject jSONObject, long j17, h02.a aVar, android.content.Context context, vz.z1 z1Var) {
        this.f97213a = pBool;
        this.f97214b = jSONObject;
        this.f97215c = j17;
        this.f97216d = aVar;
        this.f97217e = context;
        this.f97218f = z1Var;
    }

    @Override // m02.q
    public void a() {
        org.json.JSONObject jSONObject = this.f97214b;
        this.f97213a.value = true;
        try {
            jSONObject.put("reserve_for_wifi", 0);
            jSONObject.put("download_id", this.f97215c);
        } catch (org.json.JSONException unused) {
        }
        h02.a aVar = this.f97216d;
        aVar.field_downloadInWifi = false;
        aVar.field_reserveInWifi = false;
        com.tencent.mm.plugin.downloader.model.m0.l(aVar);
        if (aVar.field_status == 0) {
            m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
            java.lang.String str = aVar.field_appId;
            ((l02.q) sVar).getClass();
            com.tencent.mm.plugin.downloader_app.model.s0.e(str);
            k02.s.b(this.f97217e, aVar.field_appId, 0);
        }
        this.f97218f.a(null, jSONObject);
    }
}
