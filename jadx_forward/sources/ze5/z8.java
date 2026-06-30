package ze5;

/* loaded from: classes9.dex */
public final class z8 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f553885b;

    public final ze5.z8 a(android.view.View view, com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo80050xaf65a0fc(view);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.uma);
        if (frameLayout != null && abstractC11172x705e5905 != null) {
            this.f553885b = abstractC11172x705e5905;
            frameLayout.addView(abstractC11172x705e5905);
        }
        return this;
    }
}
