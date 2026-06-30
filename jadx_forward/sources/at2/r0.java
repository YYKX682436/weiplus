package at2;

/* loaded from: classes3.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.s0 f95273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(at2.s0 s0Var) {
        super(0);
        this.f95273d = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup;
        android.content.Context context;
        at2.u0 u0Var = (at2.u0) this.f95273d.f95277d.get();
        return java.lang.Integer.valueOf((u0Var == null || (viewGroup = u0Var.f446856d) == null || (context = viewGroup.getContext()) == null) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) : android.view.ViewConfiguration.get(context).getScaledTouchSlop());
    }
}
