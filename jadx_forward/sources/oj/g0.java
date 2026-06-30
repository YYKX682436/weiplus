package oj;

/* loaded from: classes4.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final oj.g0 f427238d = new oj.g0();

    public g0() {
        super(2);
    }

    public final long a(java.util.Map getInt, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getInt, "$this$getInt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.String str = (java.lang.String) getInt.get(key);
        if (str == null) {
            str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\d+").matcher(str);
        if (!matcher.find()) {
            return -2L;
        }
        java.lang.String group = matcher.group();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(group, "matcher.group()");
        return java.lang.Long.parseLong(group);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.valueOf(a((java.util.Map) obj, (java.lang.String) obj2));
    }
}
