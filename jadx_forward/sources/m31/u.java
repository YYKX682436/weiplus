package m31;

/* loaded from: classes.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f404749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.view.View view, android.content.Context context) {
        super(0);
        this.f404748d = view;
        this.f404749e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f404748d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.content.Context context = this.f404749e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        int measuredWidth = view.getMeasuredWidth();
        int b17 = a06.d.b(context.getResources().getDisplayMetrics().density * 375);
        int max = java.lang.Math.max(b17, context.getResources().getDisplayMetrics().widthPixels / 2);
        if (measuredWidth < b17) {
            measuredWidth = b17;
        } else if (measuredWidth > max) {
            measuredWidth = max;
        }
        layoutParams.width = java.lang.Math.min(measuredWidth, context.getResources().getDisplayMetrics().widthPixels);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new m31.y(view));
        return jz5.f0.f384359a;
    }
}
