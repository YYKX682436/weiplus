package com.tencent.luggage.sdk.launching;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f47616d = new java.util.concurrent.ConcurrentLinkedQueue();

    public abstract void a(android.os.Parcelable parcelable);

    public void finalize() {
        while (true) {
            java.util.Queue queue = this.f47616d;
            try {
                if (((java.util.concurrent.ConcurrentLinkedQueue) queue).isEmpty()) {
                    return;
                } else {
                    ((java.lang.Runnable) ((java.util.concurrent.ConcurrentLinkedQueue) queue).poll()).run();
                }
            } finally {
                super.finalize();
            }
        }
    }
}
