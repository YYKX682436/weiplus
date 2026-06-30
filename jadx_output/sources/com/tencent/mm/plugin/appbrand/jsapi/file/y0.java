package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class y0 implements com.tencent.mm.plugin.appbrand.utils.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.util.ArrayMap f81142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cf.d f81144c;

    public y0(android.util.ArrayMap arrayMap, java.lang.String str, cf.d dVar) {
        this.f81142a = arrayMap;
        this.f81143b = str;
        this.f81144c = dVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        java.lang.String str2;
        if (str == null || str.length() == 0) {
            str2 = "fail";
        } else {
            str2 = "fail " + str;
        }
        this.f81142a.put(this.f81143b, str2);
        this.f81144c.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        this.f81142a.put(this.f81143b, "ok");
        this.f81144c.a();
    }
}
