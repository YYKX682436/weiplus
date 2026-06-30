package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f92669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f92670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.backup.roambackup.p1 p1Var, boolean z17, long j17) {
        super(0);
        this.f92668d = p1Var;
        this.f92669e = z17;
        this.f92670f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", 2);
        jSONObject.put("packageId", this.f92670f);
        java.lang.String str = this.f92669e ? "roamLiteStartBackupResult" : "roamLiteStartRestoreResult";
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        this.f92668d.Di(str, jSONObject2);
        return jz5.f0.f302826a;
    }
}
