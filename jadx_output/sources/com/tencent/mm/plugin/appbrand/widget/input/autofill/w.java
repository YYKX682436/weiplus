package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase f91359d;

    public w(com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase, com.tencent.mm.plugin.appbrand.widget.input.autofill.t tVar) {
        this.f91359d = autoFillListPopupWindowBase;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar = this.f91359d.f91292d;
        if (vVar != null) {
            vVar.f91357d = true;
            vVar.requestLayout();
        }
    }
}
