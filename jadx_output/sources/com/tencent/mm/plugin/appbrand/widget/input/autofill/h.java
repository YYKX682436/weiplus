package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class h implements android.widget.Filter.FilterListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.k f91334d;

    public h(com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar) {
        this.f91334d = kVar;
    }

    @Override // android.widget.Filter.FilterListener
    public void onFilterComplete(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar = this.f91334d;
        if (i17 <= 0) {
            kVar.f91338b.a();
        } else if (kVar.f91338b.b()) {
            kVar.f91338b.c();
        }
    }
}
