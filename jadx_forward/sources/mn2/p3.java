package mn2;

/* loaded from: classes4.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.q3 f411622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(mn2.q3 q3Var) {
        super(0);
        this.f411622d = q3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f411622d.f411629e;
        if (str == null) {
            str = "";
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
}
