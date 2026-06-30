package z5;

/* loaded from: classes9.dex */
public final class c implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f551693a;

    public c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f551693a = context;
    }

    @Override // z5.b
    public boolean a(java.lang.Object obj) {
        return this.f551693a.getResources().getResourceEntryName(((java.lang.Number) obj).intValue()) != null;
    }

    @Override // z5.b
    public java.lang.Object d(java.lang.Object obj) {
        android.net.Uri parse = android.net.Uri.parse("android.resource://" + ((java.lang.Object) this.f551693a.getPackageName()) + '/' + ((java.lang.Number) obj).intValue());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parse, "parse(this)");
        return parse;
    }
}
