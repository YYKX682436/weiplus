package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.ByteRange */
/* loaded from: classes13.dex */
public class C26665xfc706cf5 {

    /* renamed from: BYTES_UNIT */
    protected static final java.lang.String f56068x71af38f8 = "bytes";

    /* renamed from: INVALID_RANGE_HEADER_REGEX */
    protected static final java.lang.String f56070x7583a73f = "((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)";

    /* renamed from: UNIT_REGEX */
    protected static final java.lang.String f56072xeabdf9ac = "([^=\\s]+)";

    /* renamed from: VALID_CONTENT_RANGE_HEADER_REGEX */
    protected static final java.lang.String f56073xe2a697c0 = "bytes\\s+(\\d+)-(\\d+)/(\\d+)";

    /* renamed from: VALID_RANGE_HEADER_REGEX */
    protected static final java.lang.String f56074xa7d37d1a = "([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)";
    protected final java.lang.Long end;

    /* renamed from: start */
    protected final long f56075x68ac462;

    /* renamed from: RANGE_HEADER_PATTERN */
    protected static final java.util.regex.Pattern f56071xdd4720 = java.util.regex.Pattern.compile("^\\s*([^=\\s]+)\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)((?:\\s*,\\s*(?:\\d*)-(?:\\d*))*)\\s*$");

    /* renamed from: CONTENT_RANGE_HEADER_PATTERN */
    protected static final java.util.regex.Pattern f56069xffd38346 = java.util.regex.Pattern.compile("^\\s*bytes\\s+(\\d+)-(\\d+)/(\\d+)\\s*$");

    public C26665xfc706cf5(long j17) {
        this(j17, (java.lang.Long) null);
    }

    /* renamed from: getTotalSize */
    public static long m104872xdd045eaf(java.lang.String str) {
        int indexOf = str.indexOf("/");
        if (indexOf != -1) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str.substring(indexOf + 1));
        }
        throw new android.content.res.Resources.NotFoundException();
    }

    /* renamed from: parseContentRange */
    public static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26665xfc706cf5 m104873x913ef297(java.lang.String str) {
        java.util.regex.Matcher matcher = f56069xffd38346.matcher(str);
        if (matcher.matches()) {
            return new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26665xfc706cf5(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(matcher.group(1)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(matcher.group(2)));
        }
        throw new java.lang.Throwable("Invalid content-range format: " + str);
    }

    /* renamed from: equals */
    public boolean m104874xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26665xfc706cf5)) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26665xfc706cf5 c26665xfc706cf5 = (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26665xfc706cf5) obj;
        if (this.f56075x68ac462 != c26665xfc706cf5.m104876x75286aac() || m104877xb7043fe1() != c26665xfc706cf5.m104877xb7043fe1()) {
            return false;
        }
        if (m104877xb7043fe1()) {
            return this.end.equals(java.lang.Long.valueOf(c26665xfc706cf5.m104875xb58839a5()));
        }
        return true;
    }

    /* renamed from: getEnd */
    public long m104875xb58839a5() {
        if (m104877xb7043fe1()) {
            return this.end.longValue();
        }
        throw new java.lang.IllegalStateException("Byte-range does not have end.  Check hasEnd() before use");
    }

    /* renamed from: getStart */
    public long m104876x75286aac() {
        return this.f56075x68ac462;
    }

    /* renamed from: hasEnd */
    public boolean m104877xb7043fe1() {
        return this.end != null;
    }

    /* renamed from: hashCode */
    public int m104878x8cdac1b() {
        int hashCode = 629 + java.lang.Long.valueOf(this.f56075x68ac462).hashCode();
        java.lang.Long l17 = this.end;
        return l17 != null ? (hashCode * 37) + l17.hashCode() : hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m104879x9616526c() {
        if (this.end != null) {
            return "bytes=" + this.f56075x68ac462 + "-" + this.end;
        }
        if (this.f56075x68ac462 < 0) {
            return "bytes=" + this.f56075x68ac462;
        }
        return "bytes=" + this.f56075x68ac462 + "-";
    }

    public C26665xfc706cf5(long j17, long j18) {
        this(j17, java.lang.Long.valueOf(j18));
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("If end is provided, start must be positive.");
        }
        if (j18 < j17) {
            throw new java.lang.IllegalArgumentException("end must be >= start.");
        }
    }

    public C26665xfc706cf5(long j17, java.lang.Long l17) {
        this.f56075x68ac462 = j17;
        this.end = l17;
    }
}
