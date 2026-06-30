package in2;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f374378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(in2.s sVar) {
        super(1);
        this.f374378d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f374378d.f374424p1;
        if (c22849x81a93d25 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget$initView$4$4", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c22849x81a93d25.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget$initView$4$4", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
