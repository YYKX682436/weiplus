package lh4;

/* loaded from: classes8.dex */
public final class i extends lh4.h {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f400249m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571087cy4, (android.view.ViewGroup) m145776x329d8f10(), false);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565759dg0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f400249m = (android.widget.TextView) findViewById;
        a(inflate);
    }

    @Override // lh4.h
    public java.lang.String f() {
        return "";
    }
}
