package androidx.window.core;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB)\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/window/core/Version;", "", "", "toString", "other", "", "compareTo", "", "", "equals", "hashCode", "major", "I", "getMajor", "()I", "minor", "getMinor", "patch", "getPatch", "description", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Ljava/math/BigInteger;", "bigInteger$delegate", "Ljz5/g;", "getBigInteger", "()Ljava/math/BigInteger;", "bigInteger", "<init>", "(IIILjava/lang/String;)V", "Companion", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes13.dex */
public final class Version implements java.lang.Comparable<androidx.window.core.Version> {
    private static final androidx.window.core.Version CURRENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.core.Version.Companion INSTANCE = new androidx.window.core.Version.Companion(null);
    private static final androidx.window.core.Version UNKNOWN = new androidx.window.core.Version(0, 0, 0, "");
    private static final androidx.window.core.Version VERSION_0_1 = new androidx.window.core.Version(0, 1, 0, "");
    private static final androidx.window.core.Version VERSION_1_0;
    private static final java.lang.String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    /* renamed from: bigInteger$delegate, reason: from kotlin metadata */
    private final jz5.g bigInteger;
    private final java.lang.String description;
    private final int major;
    private final int minor;
    private final int patch;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/core/Version$Companion;", "", "()V", "CURRENT", "Landroidx/window/core/Version;", "getCURRENT", "()Landroidx/window/core/Version;", "UNKNOWN", "getUNKNOWN", "VERSION_0_1", "getVERSION_0_1", "VERSION_1_0", "getVERSION_1_0", "VERSION_PATTERN_STRING", "", "parse", "versionString", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final androidx.window.core.Version getCURRENT() {
            return androidx.window.core.Version.CURRENT;
        }

        public final androidx.window.core.Version getUNKNOWN() {
            return androidx.window.core.Version.UNKNOWN;
        }

        public final androidx.window.core.Version getVERSION_0_1() {
            return androidx.window.core.Version.VERSION_0_1;
        }

        public final androidx.window.core.Version getVERSION_1_0() {
            return androidx.window.core.Version.VERSION_1_0;
        }

        public final androidx.window.core.Version parse(java.lang.String versionString) {
            if (versionString == null || r26.n0.N(versionString)) {
                return null;
            }
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(androidx.window.core.Version.VERSION_PATTERN_STRING).matcher(versionString);
            if (!matcher.matches()) {
                return null;
            }
            java.lang.String group = matcher.group(1);
            java.lang.Integer valueOf = group == null ? null : java.lang.Integer.valueOf(java.lang.Integer.parseInt(group));
            if (valueOf == null) {
                return null;
            }
            int intValue = valueOf.intValue();
            java.lang.String group2 = matcher.group(2);
            java.lang.Integer valueOf2 = group2 == null ? null : java.lang.Integer.valueOf(java.lang.Integer.parseInt(group2));
            if (valueOf2 == null) {
                return null;
            }
            int intValue2 = valueOf2.intValue();
            java.lang.String group3 = matcher.group(3);
            java.lang.Integer valueOf3 = group3 == null ? null : java.lang.Integer.valueOf(java.lang.Integer.parseInt(group3));
            if (valueOf3 == null) {
                return null;
            }
            int intValue3 = valueOf3.intValue();
            java.lang.String description = matcher.group(4) != null ? matcher.group(4) : "";
            kotlin.jvm.internal.o.f(description, "description");
            return new androidx.window.core.Version(intValue, intValue2, intValue3, description, null);
        }
    }

    static {
        androidx.window.core.Version version = new androidx.window.core.Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    public /* synthetic */ Version(int i17, int i18, int i19, java.lang.String str, kotlin.jvm.internal.i iVar) {
        this(i17, i18, i19, str);
    }

    private final java.math.BigInteger getBigInteger() {
        java.lang.Object value = this.bigInteger.getValue();
        kotlin.jvm.internal.o.f(value, "<get-bigInteger>(...)");
        return (java.math.BigInteger) value;
    }

    public static final androidx.window.core.Version parse(java.lang.String str) {
        return INSTANCE.parse(str);
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.window.core.Version)) {
            return false;
        }
        androidx.window.core.Version version = (androidx.window.core.Version) other;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    public java.lang.String toString() {
        return this.major + '.' + this.minor + '.' + this.patch + (r26.n0.N(this.description) ^ true ? kotlin.jvm.internal.o.m("-", this.description) : "");
    }

    private Version(int i17, int i18, int i19, java.lang.String str) {
        this.major = i17;
        this.minor = i18;
        this.patch = i19;
        this.description = str;
        this.bigInteger = jz5.h.b(new androidx.window.core.Version$bigInteger$2(this));
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.window.core.Version other) {
        kotlin.jvm.internal.o.g(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }
}
