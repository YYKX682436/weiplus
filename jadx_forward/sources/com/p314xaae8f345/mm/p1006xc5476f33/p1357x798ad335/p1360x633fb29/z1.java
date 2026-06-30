package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class z1 implements m02.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f178746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f178747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f178748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f178749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f178750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f178751f;

    public z1(com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, org.json.JSONObject jSONObject, long j17, h02.a aVar, android.content.Context context, vz.z1 z1Var) {
        this.f178746a = c19762x487075a;
        this.f178747b = jSONObject;
        this.f178748c = j17;
        this.f178749d = aVar;
        this.f178750e = context;
        this.f178751f = z1Var;
    }

    @Override // m02.q
    public void a() {
        org.json.JSONObject jSONObject = this.f178747b;
        this.f178746a.f38859x6ac9171 = true;
        try {
            jSONObject.put("reserve_for_wifi", 0);
            jSONObject.put("download_id", this.f178748c);
        } catch (org.json.JSONException unused) {
        }
        h02.a aVar = this.f178749d;
        aVar.f68409xc4f9be67 = false;
        aVar.f68431x4651c731 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(aVar);
        if (aVar.f68441x10a0fed7 == 0) {
            m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
            java.lang.String str = aVar.f68404x28d45f97;
            ((l02.q) sVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.e(str);
            k02.s.b(this.f178750e, aVar.f68404x28d45f97, 0);
        }
        this.f178751f.a(null, jSONObject);
    }
}
