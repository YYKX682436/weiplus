package ic3;

/* loaded from: classes5.dex */
public final class f0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f371934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context, java.lang.String title, java.lang.String aid) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
        this.f371934d = aid;
        xj.n nVar = new xj.n(null, null, null, kz5.c1.k(new jz5.l("number", 123), new jz5.l("string", "hello"), new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03, java.lang.Boolean.TRUE)), 7, null);
        android.widget.Button button = new android.widget.Button(context);
        button.setText(title);
        button.setOnClickListener(new ic3.d0(this, nVar));
        addView(button);
        addOnAttachStateChangeListener(new ic3.e0(this));
    }
}
