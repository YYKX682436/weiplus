package com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26;

/* renamed from: com.tenpay.android.wechat.MyKeyboardAccessibilityDelegateWrap */
/* loaded from: classes14.dex */
class C27989x3ae3954a extends android.view.View.AccessibilityDelegate {
    private static final java.lang.String TAG = "MicroMsg.MyKeyboardAccessibilityDelegateWrap";

    /* renamed from: origin */
    private android.view.View.AccessibilityDelegate f62757xc3e1af26;

    /* renamed from: viewTypeName */
    private java.lang.String f62758xc6007aaa;

    public C27989x3ae3954a() {
        this.f62758xc6007aaa = null;
        this.f62757xc3e1af26 = null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void addExtraDataToAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
        try {
            android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
            if (accessibilityDelegate == null) {
                super.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            } else if (android.os.Build.VERSION.SDK_INT >= 26) {
                accessibilityDelegate.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e17.getMessage());
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
        return accessibilityDelegate == null ? super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
        return accessibilityDelegate == null ? super.getAccessibilityNodeProvider(view) : accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.String str;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
        if (accessibilityDelegate == null) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
        if (accessibilityNodeInfo == null || (str = this.f62758xc6007aaa) == null) {
            return;
        }
        accessibilityNodeInfo.setClassName(str);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
        if (accessibilityDelegate == null) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            accessibilityDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
        return accessibilityDelegate == null ? super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : accessibilityDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
        return accessibilityDelegate == null ? super.performAccessibilityAction(view, i17, bundle) : accessibilityDelegate.performAccessibilityAction(view, i17, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(android.view.View view, int i17) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
        if (accessibilityDelegate == null) {
            super.sendAccessibilityEvent(view, i17);
        } else {
            accessibilityDelegate.sendAccessibilityEvent(view, i17);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f62757xc3e1af26;
        if (accessibilityDelegate == null) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            accessibilityDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* renamed from: setViewTypeName */
    public void m121435x5d3c082c(java.lang.String str) {
        this.f62758xc6007aaa = str;
    }

    public C27989x3ae3954a(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.f62758xc6007aaa = null;
        this.f62757xc3e1af26 = accessibilityDelegate;
    }
}
