package tr5;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f503023a;

    /* renamed from: b, reason: collision with root package name */
    public final int f503024b;

    public g(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("channel".concat(" can not be empty"));
        }
        if ((1 == i17 || 2 == i17 || 3 == i17) ? false : true) {
            throw new java.lang.IllegalArgumentException("family".concat(" is invalid"));
        }
        this.f503023a = str;
        this.f503024b = i17;
    }

    /* renamed from: toString */
    public java.lang.String m166985x9616526c() {
        return this.f503023a + "Dns(" + this.f503024b + ")";
    }
}
