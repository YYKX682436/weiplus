package lh4;

/* loaded from: classes8.dex */
public final class l extends lh4.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.epv, (android.view.ViewGroup) m145776x329d8f10(), false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        a(inflate);
        inflate.setOnClickListener(new lh4.j(this));
    }

    @Override // lh4.h
    public java.lang.String f() {
        return "";
    }
}
