package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes4.dex */
public class q0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11492x2ff66a73 f156147d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11492x2ff66a73 activityC11492x2ff66a73) {
        this.f156147d = activityC11492x2ff66a73;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11492x2ff66a73.f155977x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11492x2ff66a73 activityC11492x2ff66a73 = this.f156147d;
        android.view.WindowManager.LayoutParams attributes = activityC11492x2ff66a73.getWindow().getAttributes();
        float f17 = attributes.screenBrightness;
        float f18 = activityC11492x2ff66a73.f155992u;
        if (f17 > f18) {
            attributes.screenBrightness = f18;
            activityC11492x2ff66a73.getWindow().setAttributes(attributes);
        }
    }
}
