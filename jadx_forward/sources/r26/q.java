package r26;

/* loaded from: classes5.dex */
public final class q implements r26.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Matcher f450442a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f450443b;

    /* renamed from: c, reason: collision with root package name */
    public final r26.l f450444c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f450445d;

    public q(java.util.regex.Matcher matcher, java.lang.CharSequence input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matcher, "matcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        this.f450442a = matcher;
        this.f450443b = input;
        this.f450444c = new r26.p(this);
    }

    public java.util.List a() {
        if (this.f450445d == null) {
            this.f450445d = new r26.n(this);
        }
        java.util.List list = this.f450445d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        return list;
    }

    public e06.k b() {
        java.util.regex.Matcher matcher = this.f450442a;
        return e06.p.m(matcher.start(), matcher.end());
    }

    public java.lang.String c() {
        java.lang.String group = this.f450442a.group();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(group, "group(...)");
        return group;
    }

    public r26.m d() {
        java.util.regex.Matcher matcher = this.f450442a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        java.lang.CharSequence charSequence = this.f450443b;
        if (end > charSequence.length()) {
            return null;
        }
        java.util.regex.Matcher matcher2 = matcher.pattern().matcher(charSequence);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher2, "matcher(...)");
        return r26.u.a(matcher2, end, charSequence);
    }
}
