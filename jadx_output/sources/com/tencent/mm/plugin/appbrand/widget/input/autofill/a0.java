package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase f91310d;

    public a0(com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase, com.tencent.mm.plugin.appbrand.widget.input.autofill.t tVar) {
        this.f91310d = autoFillListPopupWindowBase;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase = this.f91310d;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar = autoFillListPopupWindowBase.f91292d;
        if (vVar == null || vVar.getCount() <= autoFillListPopupWindowBase.f91292d.getChildCount() || autoFillListPopupWindowBase.f91292d.getChildCount() > autoFillListPopupWindowBase.f91299k) {
            return;
        }
        autoFillListPopupWindowBase.f91290b.setInputMethodMode(2);
        autoFillListPopupWindowBase.c();
    }
}
