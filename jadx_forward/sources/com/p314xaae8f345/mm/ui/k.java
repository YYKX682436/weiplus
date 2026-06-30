package com.p314xaae8f345.mm.ui;

/* loaded from: classes13.dex */
public class k extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21338x1152d899 f290545e;

    public k(com.p314xaae8f345.mm.ui.C21338x1152d899 c21338x1152d899) {
        this.f290545e = c21338x1152d899;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        super.mo7102x1bd2f9af(view, lVar);
        com.p314xaae8f345.mm.ui.C21338x1152d899 c21338x1152d899 = this.f290545e;
        java.lang.CharSequence contentDescription = c21338x1152d899.getContentDescription();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = c21338x1152d899.f39287x4281c8e;
        }
        lVar.v(contentDescription);
    }

    @Override // n3.c
    /* renamed from: onPopulateAccessibilityEvent */
    public void mo20440x6b5fe1b5(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo20440x6b5fe1b5(view, accessibilityEvent);
        com.p314xaae8f345.mm.ui.C21338x1152d899 c21338x1152d899 = this.f290545e;
        java.lang.CharSequence contentDescription = c21338x1152d899.getContentDescription();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) contentDescription)) {
            contentDescription = c21338x1152d899.f39287x4281c8e;
        }
        accessibilityEvent.getText().add(contentDescription);
    }
}
