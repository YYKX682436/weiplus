package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class l0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI f99550d;

    public l0(com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI exdeviceBindDeviceUI) {
        this.f99550d = exdeviceBindDeviceUI;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.model.q0.c(this.f99550d.getContext(), "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy_) + "/mydevice/page/deviceHelp.html");
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceBindDeviceUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
