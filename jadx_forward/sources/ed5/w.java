package ed5;

/* loaded from: classes10.dex */
public final class w extends eh5.y {

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g f332932s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 f332933t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.l f332934u;

    /* renamed from: v, reason: collision with root package name */
    public final int f332935v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g defaultType, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 actionBarView, yz5.l onOptionSelectedListener) {
        super(actionBarView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultType, "defaultType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionBarView, "actionBarView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onOptionSelectedListener, "onOptionSelectedListener");
        this.f332932s = defaultType;
        this.f332933t = actionBarView;
        this.f332934u = onOptionSelectedListener;
        this.f332935v = com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a;
    }

    public final int F(float f17) {
        return a06.d.b(getContext().getResources().getDisplayMetrics().density * f17);
    }
}
