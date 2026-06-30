package in2;

/* loaded from: classes.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f374379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25) {
        super(1);
        this.f374379d = c22849x81a93d25;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f374379d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c22849x81a93d25.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            int b17 = i65.a.b(c22849x81a93d25.getContext(), 40);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(b17));
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c1162x665295de;
            yj0.a.d(c1162x665295de2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddWidget$initContentView$1$4", "invoke", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddWidget$initContentView$1$4", "invoke", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        return jz5.f0.f384359a;
    }
}
