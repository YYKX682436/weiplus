package at2;

/* loaded from: classes3.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.s0 f13740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(at2.s0 s0Var) {
        super(0);
        this.f13740d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup;
        android.content.Context context;
        at2.u0 u0Var = (at2.u0) this.f13740d.f13744d.get();
        return java.lang.Integer.valueOf((u0Var == null || (viewGroup = u0Var.f365323d) == null || (context = viewGroup.getContext()) == null) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv) : android.view.ViewConfiguration.get(context).getScaledTouchSlop());
    }
}
