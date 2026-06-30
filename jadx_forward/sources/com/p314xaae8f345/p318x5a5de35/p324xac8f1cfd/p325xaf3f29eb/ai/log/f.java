package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log;

/* loaded from: classes14.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public java.io.File f127431a;

    /* renamed from: b, reason: collision with root package name */
    public volatile java.io.BufferedWriter f127432b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference<android.content.Context> f127433c;

    public f(android.content.Context context) {
        this.f127433c = new java.lang.ref.WeakReference<>(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        try {
            if (this.f127432b != null) {
                this.f127432b.close();
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        } finally {
            this.f127432b = null;
            this.f127431a = null;
        }
    }
}
