package ut2;

/* loaded from: classes3.dex */
public final class d5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(ut2.j5 j5Var) {
        super(0);
        this.f512393d = j5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView = (android.widget.TextView) this.f512393d.t().findViewById(com.p314xaae8f345.mm.R.id.f568439rb0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        java.lang.Float dpSize = java.lang.Float.valueOf(14.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dpSize, "dpSize");
        textView.setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        return textView;
    }
}
