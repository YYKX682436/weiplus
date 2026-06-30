package t24;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a24.i f496854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a24.i iVar) {
        super(2);
        this.f496854d = iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string = (java.lang.String) obj;
        android.widget.ImageView view = (android.widget.ImageView) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(view, string, null);
        view.setAlpha(((s24.f) this.f496854d).x7());
        return jz5.f0.f384359a;
    }
}
