package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class o implements com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f82252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.r f82254c;

    public o(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.r rVar, com.tencent.mm.plugin.appbrand.y yVar, int i17) {
        this.f82254c = rVar;
        this.f82252a = yVar;
        this.f82253b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g
    public void a(boolean z17, java.lang.String str) {
        java.lang.String str2;
        java.lang.String sb6;
        if (z17) {
            sb6 = "ok";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fail");
            if (android.text.TextUtils.isEmpty(str)) {
                str2 = "";
            } else {
                str2 = " " + str;
            }
            sb7.append(str2);
            sb6 = sb7.toString();
        }
        this.f82252a.a(this.f82253b, this.f82254c.o(sb6));
    }
}
