package kj1;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f389898a;

    static {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^mp://\\w+");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        f389898a = compile;
    }

    public abstract kj1.v a();

    public abstract void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12590x3a54364b c12590x3a54364b, yz5.l lVar);

    public void c(android.app.Activity ctx, java.lang.String url, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
    }

    public abstract boolean d(android.app.Activity activity, boolean z17);

    public void e(android.app.Activity ctx, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
    }
}
