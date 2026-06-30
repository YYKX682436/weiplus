package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class f1<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.f1 f94232d = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.f1();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.database.Cursor E = yq1.u0.wi().f284562d.E("BizAppMsgReportContext", null, null, null, null, null, "reportTime DESC limit 50");
        java.util.LinkedList<hs1.a> linkedList = new java.util.LinkedList();
        while (E.moveToNext()) {
            hs1.a aVar = new hs1.a();
            aVar.convertFrom(E);
            linkedList.add(aVar);
        }
        E.close();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] list size:%d", java.lang.Integer.valueOf(linkedList.size()));
            for (hs1.a aVar2 : linkedList) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(aVar2.field_url)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] url is null, err");
                } else if (java.lang.System.currentTimeMillis() - aVar2.field_reportTime >= com.tencent.mm.plugin.brandservice.ui.timeline.preload.x.f94470a) {
                    ax4.a.b(908, 60, 1, true);
                } else {
                    r45.p9 p9Var = new r45.p9();
                    p9Var.f382861d = aVar2.field_url;
                    p9Var.f382862e = aVar2.field_reportTime;
                    linkedList2.add(p9Var);
                }
            }
        }
        if (linkedList2.size() <= 0) {
            yq1.u0.wi().z0(linkedList);
            com.tencent.mars.xlog.Log.w("MicroMsg.Preload.BizAppMsgReportMgr", "list is null, return");
        } else {
            ax4.a.a(53);
            com.tencent.mm.modelbase.z2.d(hs1.e.a(linkedList2, 1).a(), new hs1.d(linkedList2, linkedList), false);
        }
    }
}
