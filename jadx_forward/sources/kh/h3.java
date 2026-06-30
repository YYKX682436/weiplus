package kh;

/* loaded from: classes12.dex */
public final class h3 extends kh.i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.h3 f389357a = new kh.h3();

    @Override // kh.i3
    public java.lang.String a(kh.o3 rule, java.lang.String input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        if (rule instanceof kh.m3) {
            return ((kh.m3) rule).f389401c + '?';
        }
        if (rule instanceof kh.k3) {
            return "?" + ((kh.k3) rule).f389375c;
        }
        if (!(rule instanceof kh.n3)) {
            return null;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\d+");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("?");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
}
