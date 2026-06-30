package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public abstract class r {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(com.tencent.mm.plugin.appbrand.page.v5 v5Var, android.widget.EditText editText, pl1.a aVar) {
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = (com.tencent.mm.plugin.appbrand.widget.input.t4) editText;
        if (t4Var.f()) {
            com.tencent.mm.plugin.appbrand.widget.input.autofill.p pVar = new com.tencent.mm.plugin.appbrand.widget.input.autofill.p(new java.lang.ref.WeakReference(editText), new java.lang.ref.WeakReference(v5Var));
            com.tencent.mm.plugin.appbrand.widget.input.autofill.k autoFillController = ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).getAutoFillController();
            java.util.ArrayList arrayList = aVar.f356576b;
            autoFillController.getClass();
            com.tencent.mm.plugin.appbrand.widget.input.autofill.c cVar = new com.tencent.mm.plugin.appbrand.widget.input.autofill.c(autoFillController.f91337a.getContext(), arrayList);
            autoFillController.f91343g = cVar;
            cVar.f91323f = autoFillController.f91341e;
            com.tencent.mm.plugin.appbrand.widget.input.autofill.s sVar = autoFillController.f91338b;
            android.database.DataSetObserver dataSetObserver = sVar.f91300l;
            if (dataSetObserver == null) {
                sVar.f91300l = new com.tencent.mm.plugin.appbrand.widget.input.autofill.x(sVar, null);
            } else {
                android.widget.ListAdapter listAdapter = sVar.f91291c;
                if (listAdapter != null) {
                    listAdapter.unregisterDataSetObserver(dataSetObserver);
                }
            }
            sVar.f91291c = cVar;
            cVar.registerDataSetObserver(sVar.f91300l);
            com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar = sVar.f91292d;
            if (vVar != null) {
                vVar.setAdapter(sVar.f91291c);
            }
            autoFillController.f91341e.f91336a = pVar;
            autoFillController.f91342f = "screen".equalsIgnoreCase(aVar.f356575a) ? com.tencent.mm.plugin.appbrand.widget.input.autofill.b0.SCREEN : com.tencent.mm.plugin.appbrand.widget.input.autofill.b0.VIEW;
            autoFillController.c();
        }
    }
}
