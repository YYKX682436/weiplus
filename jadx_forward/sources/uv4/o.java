package uv4;

/* loaded from: classes8.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv4.p f512976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uv4.p pVar) {
        super(1);
        this.f512976d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return java.lang.Boolean.valueOf(this.f512976d.w(path));
    }
}
