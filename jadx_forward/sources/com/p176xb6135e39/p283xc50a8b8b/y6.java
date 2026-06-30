package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class y6 extends java.io.IOException {

    /* renamed from: d, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.o8 f127272d;

    public y6(java.lang.String str) {
        super(str);
        this.f127272d = null;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y6 a() {
        return new com.p176xb6135e39.p283xc50a8b8b.y6("Protocol message end-group tag did not match expected tag.");
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y6 b() {
        return new com.p176xb6135e39.p283xc50a8b8b.y6("Protocol message contained an invalid tag (zero).");
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y6 c() {
        return new com.p176xb6135e39.p283xc50a8b8b.y6("Protocol message had invalid UTF-8.");
    }

    public static com.p176xb6135e39.p283xc50a8b8b.x6 d() {
        return new com.p176xb6135e39.p283xc50a8b8b.x6("Protocol message tag had invalid wire type.");
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y6 e() {
        return new com.p176xb6135e39.p283xc50a8b8b.y6("CodedInputStream encountered a malformed varint.");
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y6 f() {
        return new com.p176xb6135e39.p283xc50a8b8b.y6("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y6 g() {
        return new com.p176xb6135e39.p283xc50a8b8b.y6("Failed to parse the message.");
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y6 h() {
        return new com.p176xb6135e39.p283xc50a8b8b.y6("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static com.p176xb6135e39.p283xc50a8b8b.y6 i() {
        return new com.p176xb6135e39.p283xc50a8b8b.y6("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public java.io.IOException j() {
        return getCause() instanceof java.io.IOException ? (java.io.IOException) getCause() : this;
    }

    public y6(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f127272d = null;
    }
}
