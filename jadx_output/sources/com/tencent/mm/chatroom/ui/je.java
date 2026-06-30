package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class je extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.le f64261a;

    public je(com.tencent.mm.chatroom.ui.le leVar) {
        this.f64261a = leVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        return this.f64261a.S;
    }
}
