package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.BufferInfo */
/* loaded from: classes16.dex */
public class C25321xe86c292e {

    /* renamed from: bufferSize */
    public int f45534x719ec861;

    /* renamed from: byteBuffer */
    public byte[] f45535x93fb68;

    /* renamed from: tempByteBuffer */
    public byte[] f45536x5448625c;

    /* renamed from: appendByte */
    public void m93668x80738742(byte[] bArr, int i17, int i18) {
        if (bArr == null || i17 < 0 || i18 <= 0 || i17 + i18 > bArr.length) {
            return;
        }
        m93671xbc8d7044(this.f45534x719ec861 + i18);
        java.lang.System.arraycopy(bArr, i17, this.f45535x93fb68, this.f45534x719ec861, i18);
    }

    /* renamed from: fillByte */
    public void m93669xd483512b(byte[] bArr, int i17) {
        if (bArr == null || i17 <= 0 || i17 > bArr.length) {
            return;
        }
        this.f45535x93fb68 = bArr;
        this.f45534x719ec861 = i17;
    }

    /* renamed from: fillInto */
    public com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e m93670xd4865683(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e) {
        c25321xe86c292e.f45534x719ec861 = this.f45534x719ec861;
        c25321xe86c292e.f45535x93fb68 = this.f45535x93fb68;
        c25321xe86c292e.f45536x5448625c = this.f45536x5448625c;
        return c25321xe86c292e;
    }

    /* renamed from: setByteBufferCapacity */
    public void m93671xbc8d7044(int i17) {
        byte[] bArr = this.f45535x93fb68;
        if (bArr == null || bArr.length < i17) {
            this.f45535x93fb68 = new byte[i17];
        }
    }

    /* renamed from: setTempByteBufferCapacity */
    public void m93672xa33fd238(int i17) {
        byte[] bArr = this.f45536x5448625c;
        if (bArr == null || bArr.length < i17) {
            this.f45536x5448625c = new byte[i17];
        }
    }
}
