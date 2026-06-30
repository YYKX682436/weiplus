package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class n2 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.o2 f97093a;

    public n2(com.tencent.mm.plugin.downloader.model.o2 o2Var) {
        this.f97093a = o2Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.downloader.model.o2 o2Var = this.f97093a;
        if (str != null) {
            o2Var.f97103h.d(com.tencent.mm.plugin.downloader.model.t2.a(str), str);
        } else {
            o2Var.f97103h.d(0, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
        }
    }
}
