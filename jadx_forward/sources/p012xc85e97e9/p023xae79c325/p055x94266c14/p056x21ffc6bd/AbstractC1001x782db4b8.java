package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.Version */
/* loaded from: classes13.dex */
public abstract class AbstractC1001x782db4b8 implements java.lang.Comparable<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8> {

    /* renamed from: VERSION_1_0 */
    public static final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 f2439xa9797f9b = m6719xaf65a0fc(1, 0, 0, "");

    /* renamed from: VERSION_1_1 */
    public static final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 f2440xa9797f9c = m6719xaf65a0fc(1, 1, 0, "");

    /* renamed from: VERSION_1_2 */
    public static final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 f2441xa9797f9d = m6719xaf65a0fc(1, 2, 0, "");

    /* renamed from: VERSION_1_3 */
    public static final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 f2442xa9797f9e = m6719xaf65a0fc(1, 3, 0, "");

    /* renamed from: VERSION_1_4 */
    public static final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 f2443xa9797f9f = m6719xaf65a0fc(1, 4, 0, "");

    /* renamed from: VERSION_STRING_PATTERN */
    private static final java.util.regex.Pattern f2444xfab20fa9 = java.util.regex.Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 m6719xaf65a0fc(int i17, int i18, int i19, java.lang.String str) {
        return new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0987x3d7f725b(i17, i18, i19, str);
    }

    /* renamed from: createBigInteger */
    private static java.math.BigInteger m6720x64856e3a(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8) {
        return java.math.BigInteger.valueOf(abstractC1001x782db4b8.mo6678x74cb5c03()).shiftLeft(32).or(java.math.BigInteger.valueOf(abstractC1001x782db4b8.mo6679x74cf0dff())).shiftLeft(32).or(java.math.BigInteger.valueOf(abstractC1001x782db4b8.mo6680x74f5c692()));
    }

    /* renamed from: parse */
    public static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 m6721x6581ab3(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.regex.Matcher matcher = f2444xfab20fa9.matcher(str);
        if (matcher.matches()) {
            return m6719xaf65a0fc(java.lang.Integer.parseInt(matcher.group(1)), java.lang.Integer.parseInt(matcher.group(2)), java.lang.Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    /* renamed from: equals */
    public final boolean m6724xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8) obj;
        return java.util.Objects.equals(java.lang.Integer.valueOf(mo6678x74cb5c03()), java.lang.Integer.valueOf(abstractC1001x782db4b8.mo6678x74cb5c03())) && java.util.Objects.equals(java.lang.Integer.valueOf(mo6679x74cf0dff()), java.lang.Integer.valueOf(abstractC1001x782db4b8.mo6679x74cf0dff())) && java.util.Objects.equals(java.lang.Integer.valueOf(mo6680x74f5c692()), java.lang.Integer.valueOf(abstractC1001x782db4b8.mo6680x74f5c692()));
    }

    /* renamed from: getDescription */
    public abstract java.lang.String mo6677x730bcac6();

    /* renamed from: getMajor */
    public abstract int mo6678x74cb5c03();

    /* renamed from: getMinor */
    public abstract int mo6679x74cf0dff();

    /* renamed from: getPatch */
    public abstract int mo6680x74f5c692();

    /* renamed from: hashCode */
    public final int m6725x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(mo6678x74cb5c03()), java.lang.Integer.valueOf(mo6679x74cf0dff()), java.lang.Integer.valueOf(mo6680x74f5c692()));
    }

    /* renamed from: toString */
    public final java.lang.String m6726x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(mo6678x74cb5c03() + "." + mo6679x74cf0dff() + "." + mo6680x74f5c692());
        if (!android.text.TextUtils.isEmpty(mo6677x730bcac6())) {
            sb6.append("-" + mo6677x730bcac6());
        }
        return sb6.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8) {
        return m6720x64856e3a(this).compareTo(m6720x64856e3a(abstractC1001x782db4b8));
    }

    /* renamed from: compareTo */
    public int m6722xabcba240(int i17) {
        return m6723xabcba240(i17, 0);
    }

    /* renamed from: compareTo */
    public int m6723xabcba240(int i17, int i18) {
        if (mo6678x74cb5c03() == i17) {
            return java.lang.Integer.compare(mo6679x74cf0dff(), i18);
        }
        return java.lang.Integer.compare(mo6678x74cb5c03(), i17);
    }
}
