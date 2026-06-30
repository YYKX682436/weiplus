package com.eclipsesource.mmv8.utils;

/* loaded from: classes7.dex */
public class V8Thread extends java.lang.Thread {
    private com.eclipsesource.mmv8.V8 runtime;
    private final com.eclipsesource.mmv8.utils.V8Runnable target;

    public V8Thread(com.eclipsesource.mmv8.utils.V8Runnable v8Runnable) {
        this.target = v8Runnable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.eclipsesource.mmv8.V8 createV8Runtime = com.eclipsesource.mmv8.V8.createV8Runtime();
        this.runtime = createV8Runtime;
        try {
            this.target.run(createV8Runtime);
            synchronized (this) {
                if (this.runtime.getLocker().hasLock()) {
                    this.runtime.release();
                    this.runtime = null;
                }
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                if (this.runtime.getLocker().hasLock()) {
                    this.runtime.release();
                    this.runtime = null;
                }
                throw th6;
            }
        }
    }
}
