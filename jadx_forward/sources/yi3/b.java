package yi3;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi3.d f544131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yi3.d dVar) {
        super(1);
        this.f544131d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object parent = it.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.String format = java.lang.String.format(this.f544131d.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f574114h12), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(view != null ? view.getTag(com.p314xaae8f345.mm.R.id.nwv) : null)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
