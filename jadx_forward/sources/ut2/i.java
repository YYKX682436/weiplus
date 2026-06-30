package ut2;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f512448d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View view) {
        super(0);
        this.f512448d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f512448d;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.l7n);
        d92.f fVar = d92.f.f309003a;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 10.0f, 0.0f, 8, null);
        return textView;
    }
}
