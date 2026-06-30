package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class p2 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vz.o1 f97115a;

    public p2(vz.o1 o1Var) {
        this.f97115a = o1Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        vz.o1 o1Var = this.f97115a;
        if (str != null) {
            o1Var.d(com.tencent.mm.plugin.downloader.model.t2.a(str), str);
        } else {
            o1Var.d(0, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
        }
    }
}
