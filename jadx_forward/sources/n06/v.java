package n06;

/* loaded from: classes15.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n06.b0 f415544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n06.b0 b0Var) {
        super(1);
        this.f415544d = b0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<name for destructuring parameter 0>");
        java.lang.String str = (java.lang.String) lVar.f384366d;
        java.lang.String str2 = (java.lang.String) lVar.f384367e;
        p06.c a17 = p06.g.a(this.f415544d.f415473a.h(), "'" + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", null, true, 4, null);
        int i17 = p06.k.Z0;
        java.util.List c17 = kz5.b0.c(a17);
        return c17.isEmpty() ? p06.i.f432298a : new p06.l(c17);
    }
}
