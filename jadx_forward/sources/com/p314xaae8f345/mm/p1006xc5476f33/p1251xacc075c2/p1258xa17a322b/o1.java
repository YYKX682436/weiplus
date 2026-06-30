package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 f174201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f174202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f174203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var, boolean z17, long j17) {
        super(0);
        this.f174201d = p1Var;
        this.f174202e = z17;
        this.f174203f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", 2);
        jSONObject.put("packageId", this.f174203f);
        java.lang.String str = this.f174202e ? "roamLiteStartBackupResult" : "roamLiteStartRestoreResult";
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        this.f174201d.Di(str, jSONObject2);
        return jz5.f0.f384359a;
    }
}
