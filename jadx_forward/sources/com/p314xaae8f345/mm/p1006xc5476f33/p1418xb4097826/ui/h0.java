package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class h0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15009x8d3b9588 f210842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210843e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15009x8d3b9588 activityC15009x8d3b9588, android.view.View view) {
        this.f210842d = activityC15009x8d3b9588;
        this.f210843e = view;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.li2 req = (r45.li2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        this.f210842d.setResult(-1);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.view.View view = this.f210843e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$2$2", "onModifyResult", "(Lcom/tencent/mm/protocal/protobuf/FinderModPlayHistoryRequest;Lcom/tencent/mm/protocal/protobuf/FinderCmdRet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$2$2", "onModifyResult", "(Lcom/tencent/mm/protocal/protobuf/FinderModPlayHistoryRequest;Lcom/tencent/mm/protocal/protobuf/FinderCmdRet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
