package on2;

/* loaded from: classes3.dex */
public final class x0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f428597d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f428598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(on2.y0 y0Var, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.bx8);
        d92.f fVar = d92.f.f309003a;
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 14.0f, 0.0f, 8, null);
        this.f428597d = textView;
        android.widget.TextView textView2 = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.bwv);
        android.content.Context context2 = textView2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView2, 14.0f, 0.0f, 8, null);
        this.f428598e = textView2;
    }
}
