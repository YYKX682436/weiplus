package zw3;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final zw3.e f558409d = new zw3.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object parent = it.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.String format = java.lang.String.format("这是%s的头像", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(view != null ? view.getTag(com.p314xaae8f345.mm.R.id.nwn) : null)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
