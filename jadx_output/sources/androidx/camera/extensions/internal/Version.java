package androidx.camera.extensions.internal;

/* loaded from: classes13.dex */
public abstract class Version implements java.lang.Comparable<androidx.camera.extensions.internal.Version> {
    public static final androidx.camera.extensions.internal.Version VERSION_1_0 = create(1, 0, 0, "");
    public static final androidx.camera.extensions.internal.Version VERSION_1_1 = create(1, 1, 0, "");
    public static final androidx.camera.extensions.internal.Version VERSION_1_2 = create(1, 2, 0, "");
    public static final androidx.camera.extensions.internal.Version VERSION_1_3 = create(1, 3, 0, "");
    public static final androidx.camera.extensions.internal.Version VERSION_1_4 = create(1, 4, 0, "");
    private static final java.util.regex.Pattern VERSION_STRING_PATTERN = java.util.regex.Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    public static androidx.camera.extensions.internal.Version create(int i17, int i18, int i19, java.lang.String str) {
        return new androidx.camera.extensions.internal.AutoValue_Version(i17, i18, i19, str);
    }

    private static java.math.BigInteger createBigInteger(androidx.camera.extensions.internal.Version version) {
        return java.math.BigInteger.valueOf(version.getMajor()).shiftLeft(32).or(java.math.BigInteger.valueOf(version.getMinor())).shiftLeft(32).or(java.math.BigInteger.valueOf(version.getPatch()));
    }

    public static androidx.camera.extensions.internal.Version parse(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.regex.Matcher matcher = VERSION_STRING_PATTERN.matcher(str);
        if (matcher.matches()) {
            return create(java.lang.Integer.parseInt(matcher.group(1)), java.lang.Integer.parseInt(matcher.group(2)), java.lang.Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.camera.extensions.internal.Version)) {
            return false;
        }
        androidx.camera.extensions.internal.Version version = (androidx.camera.extensions.internal.Version) obj;
        return java.util.Objects.equals(java.lang.Integer.valueOf(getMajor()), java.lang.Integer.valueOf(version.getMajor())) && java.util.Objects.equals(java.lang.Integer.valueOf(getMinor()), java.lang.Integer.valueOf(version.getMinor())) && java.util.Objects.equals(java.lang.Integer.valueOf(getPatch()), java.lang.Integer.valueOf(version.getPatch()));
    }

    public abstract java.lang.String getDescription();

    public abstract int getMajor();

    public abstract int getMinor();

    public abstract int getPatch();

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(getMajor()), java.lang.Integer.valueOf(getMinor()), java.lang.Integer.valueOf(getPatch()));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(getMajor() + "." + getMinor() + "." + getPatch());
        if (!android.text.TextUtils.isEmpty(getDescription())) {
            sb6.append("-" + getDescription());
        }
        return sb6.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.camera.extensions.internal.Version version) {
        return createBigInteger(this).compareTo(createBigInteger(version));
    }

    public int compareTo(int i17) {
        return compareTo(i17, 0);
    }

    public int compareTo(int i17, int i18) {
        if (getMajor() == i17) {
            return java.lang.Integer.compare(getMinor(), i18);
        }
        return java.lang.Integer.compare(getMajor(), i17);
    }
}
