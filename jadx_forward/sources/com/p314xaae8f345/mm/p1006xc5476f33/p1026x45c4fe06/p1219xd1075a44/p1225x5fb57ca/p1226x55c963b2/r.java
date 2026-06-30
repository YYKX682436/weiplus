package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public abstract class r {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, android.widget.EditText editText, pl1.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) editText;
        if (t4Var.f()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.p(new java.lang.ref.WeakReference(editText), new java.lang.ref.WeakReference(v5Var));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k m53463xdb215b04 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var).m53463xdb215b04();
            java.util.ArrayList arrayList = aVar.f438109b;
            m53463xdb215b04.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.c(m53463xdb215b04.f172870a.m53522x76847179(), arrayList);
            m53463xdb215b04.f172876g = cVar;
            cVar.f172856f = m53463xdb215b04.f172874e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.s sVar = m53463xdb215b04.f172871b;
            android.database.DataSetObserver dataSetObserver = sVar.f172833l;
            if (dataSetObserver == null) {
                sVar.f172833l = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.x(sVar, null);
            } else {
                android.widget.ListAdapter listAdapter = sVar.f172824c;
                if (listAdapter != null) {
                    listAdapter.unregisterDataSetObserver(dataSetObserver);
                }
            }
            sVar.f172824c = cVar;
            cVar.registerDataSetObserver(sVar.f172833l);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v vVar = sVar.f172825d;
            if (vVar != null) {
                vVar.setAdapter(sVar.f172824c);
            }
            m53463xdb215b04.f172874e.f172869a = pVar;
            m53463xdb215b04.f172875f = "screen".equalsIgnoreCase(aVar.f438108a) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.b0.SCREEN : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.b0.VIEW;
            m53463xdb215b04.c();
        }
    }
}
