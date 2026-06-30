package kh;

/* loaded from: classes12.dex */
public class l3 extends kh.o3 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f389390c;

    /* renamed from: d, reason: collision with root package name */
    public final kh.i3 f389391d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(java.lang.String pattern, kh.i3 mapping) {
        super(mapping);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mapping, "mapping");
        this.f389390c = pattern;
        this.f389391d = mapping;
    }

    @Override // kh.o3
    public java.lang.String a(java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.String pattern = this.f389390c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        if (compile.matcher(name).find()) {
            return this.f389391d.a(this, name);
        }
        return null;
    }
}
