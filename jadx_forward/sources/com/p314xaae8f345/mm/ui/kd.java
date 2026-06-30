package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class kd implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        if (runnable == null) {
            return null;
        }
        return new java.lang.Thread(new com.p314xaae8f345.mm.ui.jd(runnable), "MMLayoutPrefetcher");
    }
}
