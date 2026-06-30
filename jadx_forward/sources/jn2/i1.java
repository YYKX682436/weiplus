package jn2;

/* loaded from: classes8.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f382164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(jn2.r1 r1Var) {
        super(1);
        this.f382164d = r1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jn2.z1 z1Var;
        int intValue = ((java.lang.Number) obj).intValue();
        jn2.r1 r1Var = this.f382164d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = r1Var.V;
        if (c22849x81a93d25 != null && (z1Var = r1Var.f382219x0) != null && intValue >= 0 && intValue < z1Var.mo1894x7e414b06()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c22849x81a93d25.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null) {
                if (c1162x665295de.w() <= intValue && intValue <= c1162x665295de.y()) {
                    c22849x81a93d25.post(new jn2.m1(z1Var, intValue));
                } else {
                    c22849x81a93d25.i(new jn2.n1(z1Var, intValue));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "scrollToPositionAndHighlight", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    c22849x81a93d25.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "scrollToPositionAndHighlight", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
