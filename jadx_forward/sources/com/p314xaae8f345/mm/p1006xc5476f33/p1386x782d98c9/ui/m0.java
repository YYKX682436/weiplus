package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class m0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13460xef0a2250 f181094d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13460xef0a2250 activityC13460xef0a2250) {
        this.f181094d = activityC13460xef0a2250;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$9", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        this.f181094d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$9", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
