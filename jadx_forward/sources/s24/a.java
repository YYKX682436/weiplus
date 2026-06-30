package s24;

/* loaded from: classes.dex */
public abstract class a extends s24.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(M7(), "webview");
    }

    public abstract java.lang.String L7();

    public abstract java.lang.String M7();

    @Override // s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t7(m158354x19263085().getIntent());
        android.content.Intent intent = this.f483892g;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("setting_level", m7() + 1);
        intent.putExtra("ui_version", 2);
        intent.putExtra("setting_from_source", m158354x19263085().getIntent().getIntExtra("setting_from_source", 2));
        G7(context, intent);
        j45.l.j(context, M7(), L7(), intent, null);
    }
}
