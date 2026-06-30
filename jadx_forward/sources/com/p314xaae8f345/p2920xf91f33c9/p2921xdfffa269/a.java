package com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f296791a = null;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f296792b = null;

    /* renamed from: c, reason: collision with root package name */
    public long f296793c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f296794d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.C25466xb1960ef4 f296795e = new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.C25466xb1960ef4();

    public byte[] a(byte[] bArr, int i17, int i18) {
        long j17 = this.f296794d;
        if (j17 == 0) {
            throw new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.b(-102);
        }
        if (bArr == null || bArr.length == 0) {
            throw new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.b(-104);
        }
        int m94425x14a31e14 = this.f296795e.m94425x14a31e14(j17, bArr, i17, i18, this.f296792b);
        if (m94425x14a31e14 < 0) {
            throw new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.b(m94425x14a31e14);
        }
        if (m94425x14a31e14 == 0) {
            return null;
        }
        byte[] bArr2 = new byte[m94425x14a31e14];
        java.lang.System.arraycopy(this.f296792b, 0, bArr2, 0, m94425x14a31e14);
        return bArr2;
    }

    public int b() {
        if (this.f296794d != 0) {
            return -103;
        }
        long m94426xb320cd44 = this.f296795e.m94426xb320cd44();
        if (m94426xb320cd44 == -1) {
            return (int) m94426xb320cd44;
        }
        this.f296794d = m94426xb320cd44;
        this.f296792b = new byte[30000];
        return 0;
    }

    public int c() {
        long j17 = this.f296794d;
        if (j17 == 0) {
            return -102;
        }
        this.f296792b = null;
        int m94427x23106353 = this.f296795e.m94427x23106353(j17);
        this.f296794d = 0L;
        return m94427x23106353;
    }

    public byte[] d(byte[] bArr, int i17, int i18) {
        long j17 = this.f296793c;
        if (j17 == 0) {
            throw new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.b(-102);
        }
        if (bArr == null || bArr.length == 0) {
            throw new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.b(-104);
        }
        int m94428x16d6ca3c = this.f296795e.m94428x16d6ca3c(j17, bArr, i17, i18, this.f296791a);
        if (m94428x16d6ca3c < 0) {
            throw new com.p314xaae8f345.p2920xf91f33c9.p2921xdfffa269.b(m94428x16d6ca3c);
        }
        if (m94428x16d6ca3c == 0) {
            return null;
        }
        byte[] bArr2 = new byte[m94428x16d6ca3c];
        java.lang.System.arraycopy(this.f296791a, 0, bArr2, 0, m94428x16d6ca3c);
        return bArr2;
    }

    public int e() {
        if (this.f296793c != 0) {
            return -103;
        }
        long m94429xa752c2b6 = this.f296795e.m94429xa752c2b6();
        if (m94429xa752c2b6 == -1) {
            return (int) m94429xa752c2b6;
        }
        this.f296793c = m94429xa752c2b6;
        this.f296791a = new byte[com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059];
        return 0;
    }

    public int f() {
        long j17 = this.f296793c;
        if (j17 == 0) {
            return -102;
        }
        this.f296791a = null;
        int m94430x64d220a1 = this.f296795e.m94430x64d220a1(j17);
        this.f296793c = 0L;
        return m94430x64d220a1;
    }
}
