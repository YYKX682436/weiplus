package com.tencent.cloud.component.common.ai.log;

/* loaded from: classes14.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public java.io.File f45898a;

    /* renamed from: b, reason: collision with root package name */
    public volatile java.io.BufferedWriter f45899b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference<android.content.Context> f45900c;

    public f(android.content.Context context) {
        this.f45900c = new java.lang.ref.WeakReference<>(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        try {
            if (this.f45899b != null) {
                this.f45899b.close();
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        } finally {
            this.f45899b = null;
            this.f45898a = null;
        }
    }
}
