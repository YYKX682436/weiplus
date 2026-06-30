package as3;

/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f13482a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f13483b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f13484c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f13485d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView f13486e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f13487f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f13488g;

    public a0(android.app.Activity context, java.util.ArrayList outerDataList) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(outerDataList, "outerDataList");
        this.f13482a = context;
        this.f13483b = outerDataList;
        this.f13484c = "BizProfileTopicFlowController";
        this.f13485d = new java.util.ArrayList();
    }

    public final void a(java.util.ArrayList newDataList) {
        kotlin.jvm.internal.o.g(newDataList, "newDataList");
        java.util.ArrayList arrayList = this.f13485d;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(newDataList, 10));
        java.util.Iterator it = newDataList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new vr3.d0((r45.um) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView = this.f13486e;
            if (bizProfileTopicFlowView != null) {
                bizProfileTopicFlowView.setVisibility(8);
            }
        } else {
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView2 = this.f13486e;
            if (bizProfileTopicFlowView2 != null) {
                bizProfileTopicFlowView2.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTopicFlowView bizProfileTopicFlowView3 = this.f13486e;
        if (bizProfileTopicFlowView3 != null) {
            bizProfileTopicFlowView3.c();
        }
        com.tencent.mars.xlog.Log.i(this.f13484c, "refresh, dataList size:" + arrayList.size());
    }
}
