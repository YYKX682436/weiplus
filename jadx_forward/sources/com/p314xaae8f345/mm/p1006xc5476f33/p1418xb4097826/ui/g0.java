package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15009x8d3b9588 f210814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f210815f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15009x8d3b9588 activityC15009x8d3b9588, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8) {
        super(1);
        this.f210813d = view;
        this.f210814e = activityC15009x8d3b9588;
        this.f210815f = viewOnClickListenerC22631x1cc07cc8;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            android.view.View view = this.f210813d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$2$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderAggregationSettingUI$onCreate$2$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f210814e.setResult(-1);
        } else {
            this.f210815f.m81392x52cfa5c6(true);
        }
        return jz5.f0.f384359a;
    }
}
