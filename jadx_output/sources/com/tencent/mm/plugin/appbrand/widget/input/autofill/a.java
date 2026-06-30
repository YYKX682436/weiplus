package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class a implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.c f91309d;

    public a(com.tencent.mm.plugin.appbrand.widget.input.autofill.c cVar) {
        this.f91309d = cVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.c cVar = this.f91309d;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.e0 e0Var = cVar.f91323f;
        if (e0Var == null || cVar.f91324g) {
            return;
        }
        e0Var.a("", com.tencent.mm.plugin.appbrand.widget.input.autofill.d0.CANCEL);
    }
}
