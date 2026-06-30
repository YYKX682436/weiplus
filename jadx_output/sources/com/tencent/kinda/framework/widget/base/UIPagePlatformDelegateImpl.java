package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class UIPagePlatformDelegateImpl implements com.tencent.kinda.gen.IUIPagePlatformDelegate {
    private java.lang.ref.WeakReference<android.content.Context> context;
    private java.util.ArrayList<java.lang.Integer> secureViews = new java.util.ArrayList<>();

    public UIPagePlatformDelegateImpl(android.content.Context context) {
        this.context = new java.lang.ref.WeakReference<>(context);
    }

    public boolean addSecureView(int i17) {
        return this.secureViews.add(java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformDelegate
    public com.tencent.kinda.gen.Platform currentPlatform() {
        return com.tencent.kinda.gen.Platform.ANDROID;
    }

    public android.content.Context getContext() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = this.context;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public java.util.ArrayList<java.lang.Integer> getSecureViews() {
        return this.secureViews;
    }

    public boolean removeSecureView(java.lang.Integer num) {
        if (num == null || this.secureViews.size() <= 0) {
            return false;
        }
        return this.secureViews.remove(num);
    }

    public void setContext(android.content.Context context) {
        this.context = new java.lang.ref.WeakReference<>(context);
    }
}
