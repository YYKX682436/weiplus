package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes8.dex */
public class r implements tx5.e {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.WebStorage f302102a;

    public r() {
        by5.c4.c("SysWebStorage", "SysWebStorage, Default.");
        this.f302102a = android.webkit.WebStorage.getInstance();
    }

    @Override // tx5.e
    public void a() {
        this.f302102a.deleteAllData();
    }

    @Override // tx5.e
    public void b(java.lang.String str) {
        this.f302102a.deleteOrigin(str);
    }

    public r(android.webkit.WebStorage webStorage) {
        this.f302102a = webStorage;
    }
}
