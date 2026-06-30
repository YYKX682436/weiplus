package com.p159x477cd522.p160x333422.p163x10fad5c4;

/* renamed from: com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo */
/* loaded from: classes7.dex */
public final class C1518x9ab0551d {

    /* renamed from: INVALID_FD */
    public static final int f5033xafba8c26 = -1;

    /* renamed from: content */
    public final java.lang.String f5034x38b73479;

    /* renamed from: fd, reason: collision with root package name */
    public final int f125530fd;

    /* renamed from: length */
    public long f5035xbe0e3ae6;

    /* renamed from: name */
    public final java.lang.String f5036x337a8b;

    /* renamed from: startOffset */
    public final long f5037x8926c395;

    public C1518x9ab0551d(java.lang.String str, int i17, long j17, long j18) {
        if (!com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(str)) {
            if (!com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16635xc6d89b0b(i17)) {
                this.f5036x337a8b = str;
                this.f125530fd = i17;
                this.f5037x8926c395 = j17;
                this.f5035xbe0e3ae6 = j18;
                this.f5034x38b73479 = null;
                return;
            }
            throw new java.lang.IllegalArgumentException("fd is illegal");
        }
        throw new java.lang.IllegalArgumentException("name is empty");
    }

    /* renamed from: equals */
    public boolean m16632xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d.class != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.f5036x337a8b, ((com.p159x477cd522.p160x333422.p163x10fad5c4.C1518x9ab0551d) obj).f5036x337a8b);
    }

    /* renamed from: hashCode */
    public int m16633x8cdac1b() {
        return java.util.Objects.hash(this.f5036x337a8b);
    }

    /* renamed from: toString */
    public java.lang.String m16634x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnapshotScriptInfo{name='");
        sb6.append(this.f5036x337a8b);
        sb6.append("', fd=");
        sb6.append(this.f125530fd);
        sb6.append(", startOffset=");
        sb6.append(this.f5037x8926c395);
        sb6.append(", length=");
        sb6.append(this.f5035xbe0e3ae6);
        sb6.append(", content='");
        java.lang.String str = this.f5034x38b73479;
        sb6.append(str != null ? str.substring(0, java.lang.Math.min(str.length(), 1024)) : null);
        sb6.append("'}");
        return sb6.toString();
    }

    public C1518x9ab0551d(java.lang.String str, java.lang.String str2) {
        if (!com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(str)) {
            if (!com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(str2)) {
                this.f5036x337a8b = str;
                this.f125530fd = -1;
                this.f5037x8926c395 = 0L;
                this.f5035xbe0e3ae6 = 0L;
                this.f5034x38b73479 = str2;
                return;
            }
            throw new java.lang.IllegalArgumentException("content is empty");
        }
        throw new java.lang.IllegalArgumentException("name is empty");
    }
}
