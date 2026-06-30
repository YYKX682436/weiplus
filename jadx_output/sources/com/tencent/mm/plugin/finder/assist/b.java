package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class b implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f102016d;

    public b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isSheetLaunchMode", 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        this.f102016d = jSONObject2;
    }

    @Override // l81.p0
    public java.lang.String a() {
        return this.f102016d;
    }
}
