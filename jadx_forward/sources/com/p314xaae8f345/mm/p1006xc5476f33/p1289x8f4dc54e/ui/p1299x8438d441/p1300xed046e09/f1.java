package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class f1<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.f1 f175765d = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.f1();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.database.Cursor E = yq1.u0.wi().f366095d.E("BizAppMsgReportContext", null, null, null, null, null, "reportTime DESC limit 50");
        java.util.LinkedList<hs1.a> linkedList = new java.util.LinkedList();
        while (E.moveToNext()) {
            hs1.a aVar = new hs1.a();
            aVar.mo9015xbf5d97fd(E);
            linkedList.add(aVar);
        }
        E.close();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] list size:%d", java.lang.Integer.valueOf(linkedList.size()));
            for (hs1.a aVar2 : linkedList) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f68635x4b6e88aa)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] url is null, err");
                } else if (java.lang.System.currentTimeMillis() - aVar2.f68634x2c459686 >= com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.x.f176003a) {
                    ax4.a.b(908, 60, 1, true);
                } else {
                    r45.p9 p9Var = new r45.p9();
                    p9Var.f464394d = aVar2.f68635x4b6e88aa;
                    p9Var.f464395e = aVar2.f68634x2c459686;
                    linkedList2.add(p9Var);
                }
            }
        }
        if (linkedList2.size() <= 0) {
            yq1.u0.wi().z0(linkedList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.BizAppMsgReportMgr", "list is null, return");
        } else {
            ax4.a.a(53);
            com.p314xaae8f345.mm.p944x882e457a.z2.d(hs1.e.a(linkedList2, 1).a(), new hs1.d(linkedList2, linkedList), false);
        }
    }
}
