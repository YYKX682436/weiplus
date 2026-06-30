package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class j extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI f99522d;

    public j(com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI) {
        this.f99522d = exdeviceAddDataSourceUI;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$3", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.model.q0.c(this.f99522d.getContext(), "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492290fy1) + "/steprank/step/connect-help.html");
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$3", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
