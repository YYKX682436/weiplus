package df2;

/* loaded from: classes3.dex */
public final class e4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.l4 f311565d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(df2.l4 l4Var) {
        super(0);
        this.f311565d = l4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.l4 l4Var = this.f311565d;
        try {
            android.view.View T6 = l4Var.T6(com.p314xaae8f345.mm.R.id.tow, com.p314xaae8f345.mm.R.id.tou);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = T6 != null ? (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) T6.findViewById(com.p314xaae8f345.mm.R.id.v6q) : null;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.h();
            }
            l4Var.f312167r = true;
            if (T6 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(T6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController$hideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                T6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(T6, "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController$hideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveSlideToCloseGuideController", "hideTip fail " + e17);
        }
        return jz5.f0.f384359a;
    }
}
