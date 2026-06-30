package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class re implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ue f82907f;

    public re(com.tencent.mm.plugin.appbrand.jsapi.ue ueVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f82907f = ueVar;
        this.f82905d = e9Var;
        this.f82906e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("ret", 1);
        com.tencent.mm.plugin.appbrand.jsapi.ue ueVar = this.f82907f;
        int i18 = this.f82906e;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f82905d;
        if (i17 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("fileUrl", bundle.getString("fileUrl", ""));
            hashMap.put("thumbUrl", bundle.getString("thumbUrl", ""));
            e9Var.a(i18, ueVar.p("ok", hashMap));
            return;
        }
        if (i17 == 1) {
            e9Var.a(i18, ueVar.o("fail:cdn com upload error"));
            return;
        }
        if (i17 == 2) {
            e9Var.a(i18, ueVar.o("fail:cdn com call error"));
            return;
        }
        if (i17 == 3) {
            e9Var.a(i18, ueVar.o("fail:cancel succeed"));
            return;
        }
        if (i17 != 4) {
            e9Var.a(i18, ueVar.o("fail:cdn com upload error"));
            return;
        }
        e9Var.a(i18, ueVar.o("fail:cancel cdn com upload cancel: " + bundle.getLong("progress")));
    }
}
