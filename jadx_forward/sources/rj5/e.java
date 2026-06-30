package rj5;

/* loaded from: classes10.dex */
public final class e extends rj5.c {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f477914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.ui.p2734x9d861347.C22477xdcb09b9d c22477xdcb09b9d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        super(c22477xdcb09b9d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f477914d = recyclerView;
    }

    @Override // rj5.l
    public void a(float f17, boolean z17) {
        int height;
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = this.f477914d;
        int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent();
        if (computeVerticalScrollRange < 0) {
            computeVerticalScrollRange = 0;
        }
        int computeVerticalScrollOffset = ((int) (computeVerticalScrollRange * e17)) - recyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset == 0) {
            return;
        }
        if (this.f477910b != null && !z17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            rj5.g gVar = null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
                int m8020x7e414b06 = c1162x665295de.m8020x7e414b06();
                if (m8020x7e414b06 > 0) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = c1162x665295de instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) c1162x665295de : null;
                    int i17 = c1161x57298f5d != null ? c1161x57298f5d.f93394w : 1;
                    android.view.View m8007x6a486239 = c1162x665295de.m8007x6a486239(0);
                    if (m8007x6a486239 != null && (height = m8007x6a486239.getHeight()) > 0) {
                        int i18 = (int) (e17 * (((m8020x7e414b06 + i17) - 1) / i17) * height);
                        gVar = new rj5.g(e06.p.f((i18 / height) * i17, 0, m8020x7e414b06 - 1), -(i18 % height));
                    }
                }
                if (gVar != null) {
                    recyclerView.f1();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(gVar.f477916b));
                    arrayList.add(java.lang.Integer.valueOf(gVar.f477915a));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController", "scrollTo", "(FZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(c1162x665295de, "com/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper$RecyclerViewController", "scrollTo", "(FZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    return;
                }
            }
        }
        if (z17) {
            recyclerView.mo7976xc291bbd2(0, computeVerticalScrollOffset);
        } else {
            recyclerView.scrollBy(0, computeVerticalScrollOffset);
        }
    }

    @Override // rj5.l
    public boolean b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f477914d;
        return c1163xf1deaba4.computeVerticalScrollRange() > c1163xf1deaba4.computeVerticalScrollExtent();
    }

    @Override // rj5.l
    /* renamed from: getCurrentPosition */
    public float mo162529x9746038c() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f477914d;
        int computeVerticalScrollOffset = c1163xf1deaba4.computeVerticalScrollOffset();
        int computeVerticalScrollRange = c1163xf1deaba4.computeVerticalScrollRange() - c1163xf1deaba4.computeVerticalScrollExtent();
        if (computeVerticalScrollRange < 0) {
            computeVerticalScrollRange = 0;
        }
        if (computeVerticalScrollRange == 0) {
            return 0.0f;
        }
        return e06.p.e(computeVerticalScrollOffset / computeVerticalScrollRange, 0.0f, 1.0f);
    }
}
