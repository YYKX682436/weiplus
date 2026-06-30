package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes4.dex */
public class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11492x2ff66a73 f156154d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11492x2ff66a73 activityC11492x2ff66a73) {
        this.f156154d = activityC11492x2ff66a73;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.hfr) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11492x2ff66a73 activityC11492x2ff66a73 = this.f156154d;
            if (activityC11492x2ff66a73.f155989r != null) {
                activityC11492x2ff66a73.m48754xa863047f(view);
                android.view.WindowManager.LayoutParams attributes = activityC11492x2ff66a73.getWindow().getAttributes();
                float f17 = attributes.screenBrightness;
                if (f17 < 0.85f) {
                    activityC11492x2ff66a73.f155992u = f17;
                    attributes.screenBrightness = 0.85f;
                    activityC11492x2ff66a73.getWindow().setAttributes(attributes);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
