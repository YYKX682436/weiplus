package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class KindaBackContextObject {
    private boolean isProcessed;
    private java.lang.ref.WeakReference<android.content.Context> m_context;

    public KindaBackContextObject(java.lang.ref.WeakReference<android.content.Context> weakReference, boolean z17) {
        this.m_context = weakReference;
        this.isProcessed = z17;
    }

    public java.lang.ref.WeakReference<android.content.Context> getContext() {
        return this.m_context;
    }

    public boolean isProcessed() {
        return this.isProcessed;
    }

    public void setContext(java.lang.ref.WeakReference<android.content.Context> weakReference) {
        this.m_context = weakReference;
    }

    public void setProcessed(boolean z17) {
        this.isProcessed = z17;
    }
}
