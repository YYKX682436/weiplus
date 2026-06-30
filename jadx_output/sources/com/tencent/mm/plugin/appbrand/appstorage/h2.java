package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class h2 extends com.tencent.mm.plugin.appbrand.appstorage.FileStructStat implements com.tencent.mm.plugin.appbrand.appstorage.t1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f76194d;

    public h2(java.lang.String str) {
        this.f76194d = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.t1
    public java.lang.String a() {
        return this.f76194d;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.t1
    public long b() {
        return this.st_size;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.t1
    public long lastModified() {
        return this.st_mtime;
    }
}
