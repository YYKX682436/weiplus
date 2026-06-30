package i62;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final i62.l f370493d = new i62.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = (java.lang.String) wo.t.c().get("Hardware");
        if ((str == null || r26.n0.N(str)) || !r26.n0.D(str, ",", false, 2, null)) {
            return str;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str).replaceAll(" ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
}
