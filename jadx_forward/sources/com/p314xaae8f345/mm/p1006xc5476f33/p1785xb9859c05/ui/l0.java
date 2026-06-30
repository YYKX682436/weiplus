package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s83.l f224427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f224428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 f224429f;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var, s83.l lVar, int i17) {
        this.f224429f = m0Var;
        this.f224427d = lVar;
        this.f224428e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = this.f224429f;
            m0Var.getClass();
            s83.l lVar = this.f224427d;
            if (lVar.f68172xcebea32a > 0) {
                s83.m Vi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi();
                long j17 = lVar.f68172xcebea32a;
                Vi.getClass();
                if (j17 > 0) {
                    Vi.f486421d.mo70514xb06685ab("IPCallRecord", "addressId=?", new java.lang.String[]{java.lang.String.valueOf(j17)});
                }
            } else {
                s83.m Vi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi();
                java.lang.String str = lVar.f68176x5b3f2672;
                Vi2.getClass();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    Vi2.f486421d.mo70514xb06685ab("IPCallRecord", "phonenumber=?", new java.lang.String[]{str});
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j3 j3Var = m0Var.f224463b;
            j3Var.f224413q.remove(this.f224428e);
            j3Var.notifyDataSetChanged();
            if (m0Var.f224463b.getCount() > 0) {
                android.view.View view = m0Var.f224464c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = m0Var.f224464c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
