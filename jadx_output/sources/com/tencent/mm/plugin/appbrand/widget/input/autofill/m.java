package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class m extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.o f91345a;

    public m(com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar) {
        this.f91345a = oVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar = this.f91345a;
        if (oVar.f91349b.b()) {
            oVar.b(1);
        }
    }
}
