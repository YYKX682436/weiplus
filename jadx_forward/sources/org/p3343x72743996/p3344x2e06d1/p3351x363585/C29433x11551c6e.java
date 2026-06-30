package org.p3343x72743996.p3344x2e06d1.p3351x363585;

/* renamed from: org.chromium.base.task.ChainedTasks */
/* loaded from: classes13.dex */
public class C29433x11551c6e {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73593x7118e671 = false;

    /* renamed from: mCanceled */
    private volatile boolean f73594x1da62c26;

    /* renamed from: mFinalized */
    private boolean f73595x8fedf219;

    /* renamed from: mTasks */
    private final java.util.LinkedList<android.util.Pair<java.lang.Integer, java.lang.Runnable>> f73598xbecdc721 = new java.util.LinkedList<>();

    /* renamed from: mIterationIdForTesting */
    private int f73596x4f732192 = org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.f73614x2a93dfdf;

    /* renamed from: mRunAndPost */
    private final java.lang.Runnable f73597x3abfb659 = new java.lang.Runnable() { // from class: org.chromium.base.task.ChainedTasks.1
        @Override // java.lang.Runnable
        public void run() {
            if (org.p3343x72743996.p3344x2e06d1.p3351x363585.C29433x11551c6e.this.f73596x4f732192 != org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.f73614x2a93dfdf) {
                org.p3343x72743996.p3344x2e06d1.p3351x363585.C29433x11551c6e.this.m152992xae7a2e7a();
            }
            if (org.p3343x72743996.p3344x2e06d1.p3351x363585.C29433x11551c6e.this.f73594x1da62c26) {
                return;
            }
            android.util.Pair pair = (android.util.Pair) org.p3343x72743996.p3344x2e06d1.p3351x363585.C29433x11551c6e.this.f73598xbecdc721.pop();
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90("ChainedTask.run: ".concat(((java.lang.Runnable) pair.second).getClass().getName()));
            try {
                ((java.lang.Runnable) pair.second).run();
                if (m152702xc9e48c90 != null) {
                    m152702xc9e48c90.close();
                }
                if (org.p3343x72743996.p3344x2e06d1.p3351x363585.C29433x11551c6e.this.f73598xbecdc721.isEmpty()) {
                    return;
                }
                org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153010x2d1ef245(((java.lang.Integer) ((android.util.Pair) org.p3343x72743996.p3344x2e06d1.p3351x363585.C29433x11551c6e.this.f73598xbecdc721.peek()).first).intValue(), this);
            } catch (java.lang.Throwable th6) {
                if (m152702xc9e48c90 != null) {
                    try {
                        m152702xc9e48c90.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$start$0 */
    public /* synthetic */ void m152991xb49a2491() {
        java.util.Iterator<android.util.Pair<java.lang.Integer, java.lang.Runnable>> it = this.f73598xbecdc721.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next().second).run();
            if (this.f73594x1da62c26) {
                return;
            }
        }
    }

    public void add(int i17, java.lang.Runnable runnable) {
        synchronized (this.f73598xbecdc721) {
            this.f73598xbecdc721.add(new android.util.Pair<>(java.lang.Integer.valueOf(i17), runnable));
        }
    }

    /* renamed from: cancel */
    public void m152992xae7a2e7a() {
        synchronized (this.f73598xbecdc721) {
            this.f73595x8fedf219 = true;
            this.f73594x1da62c26 = true;
        }
    }

    /* renamed from: start */
    public void m152993x68ac462(boolean z17) {
        synchronized (this.f73598xbecdc721) {
            this.f73595x8fedf219 = true;
        }
        if (this.f73598xbecdc721.isEmpty()) {
            return;
        }
        if (z17) {
            org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153014x4eeaf633(((java.lang.Integer) this.f73598xbecdc721.peek().first).intValue(), new java.lang.Runnable() { // from class: org.chromium.base.task.ChainedTasks$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3343x72743996.p3344x2e06d1.p3351x363585.C29433x11551c6e.this.m152991xb49a2491();
                }
            });
        } else {
            org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153010x2d1ef245(((java.lang.Integer) this.f73598xbecdc721.peek().first).intValue(), this.f73597x3abfb659);
        }
    }
}
