package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class x extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase f91360a;

    public x(com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase, com.tencent.mm.plugin.appbrand.widget.input.autofill.t tVar) {
        this.f91360a = autoFillListPopupWindowBase;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase = this.f91360a;
        if (autoFillListPopupWindowBase.b()) {
            autoFillListPopupWindowBase.c();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f91360a.a();
    }
}
