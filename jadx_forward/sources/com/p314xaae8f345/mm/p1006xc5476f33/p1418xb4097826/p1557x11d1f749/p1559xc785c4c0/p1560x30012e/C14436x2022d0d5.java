package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/topstory/flow/LinearLayoutManagerWrapper;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper */
/* loaded from: classes2.dex */
public final class C14436x2022d0d5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f202416v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14436x2022d0d5(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f202416v = "Finder.LinearLayoutManagerWrapper";
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        try {
            super.mo2418x457c9b08(z2Var, h3Var);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            pm0.z.b(xy2.b.f539688b, "longVideoMergeAndNotify", false, null, null, false, false, null, 124, null);
            hc2.c.a(e17, this.f202416v + "_longVideoMergeAndNotify");
        }
    }
}
