package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.g f76180d = new com.tencent.mm.plugin.appbrand.appstorage.g();

    public g() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.String appId = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(appId, "appId");
        return longValue + '#' + appId + "#had_been_cleaned_dirty";
    }
}
