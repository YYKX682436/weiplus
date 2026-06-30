package com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f129149d = new java.util.concurrent.ConcurrentLinkedQueue();

    public abstract void a(android.os.Parcelable parcelable);

    /* renamed from: finalize */
    public void m32215xd764dc1e() {
        while (true) {
            java.util.Queue queue = this.f129149d;
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
