package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f86816d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f86817e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86818f = false;

    public k2(java.lang.String str) {
        this.f86816d = str;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if ((this.f86817e || this.f86818f) ? false : true) {
            this.f86817e = true;
            a();
        }
    }
}
