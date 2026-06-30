package com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk;

/* loaded from: classes13.dex */
public class x implements com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y f302033a;

    public x(java.lang.Object obj) {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1 m120281x9cf0d20b = com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120281x9cf0d20b();
        if (m120281x9cf0d20b == null) {
            this.f302033a = null;
        } else if (m120281x9cf0d20b.m120198xfefc2a39("WebStorageAdapter").isInstance(obj)) {
            this.f302033a = new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.z(obj);
        } else {
            by5.c4.c("WebStorage", "Object must be an instance of WebStorageAdapter");
            this.f302033a = null;
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y
    public void a() {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y yVar = this.f302033a;
        if (yVar != null) {
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.z) yVar).a();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y
    public void b(java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.y yVar = this.f302033a;
        if (yVar != null) {
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.z) yVar).b(str);
        }
    }
}
