package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.backup.roambackup.p1 p1Var, java.lang.String str) {
        super(0);
        this.f92582d = p1Var;
        this.f92583e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", 2);
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.f92583e);
        jSONObject.put("packageId", -1);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        this.f92582d.Di("roamLiteNewBackupResult", jSONObject2);
        return jz5.f0.f302826a;
    }
}
