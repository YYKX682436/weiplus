package ut2;

/* loaded from: classes.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f512587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.view.View view) {
        super(0);
        this.f512587d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f512587d.findViewById(com.p314xaae8f345.mm.R.id.rra);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        textView.setTextSize(1, 12.0f);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        return (android.widget.TextView) findViewById;
    }
}
