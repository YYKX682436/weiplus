package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/AggregationCardLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.AggregationCardLinearLayoutManager */
/* loaded from: classes10.dex */
public final class C14536x9a32afac extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f203090v;

    /* renamed from: w, reason: collision with root package name */
    public final android.content.Context f203091w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14536x9a32afac(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f203090v = "FinderLiveMsgLinearLayoutManager";
        this.f203091w = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        android.content.Context context = this.f203091w;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        up2.b bVar = new up2.b(this, context);
        bVar.f93582a = i17;
        m8099x6305639d(bVar);
    }
}
