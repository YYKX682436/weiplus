package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016;

/* renamed from: com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper */
/* loaded from: classes14.dex */
public final class C26493xe13fc07c {

    /* renamed from: NO_VALUE */
    public static final int f54081xa09ef153 = -1;
    public static final java.lang.String TAG = "FormatWrapper";

    /* renamed from: channelCount */
    public int f54082xf99d8dcc;

    /* renamed from: isVideo */
    private boolean f54085x7b98c171;

    /* renamed from: isVideoFieldInit */
    private boolean f54086x4f1dab9;

    /* renamed from: rotationDegrees */
    public int f54090x461e29c9;

    /* renamed from: sampleMimeType */
    public final java.lang.String f54091x7fd47d58;

    /* renamed from: sampleRate */
    public int f54092x88751aa;

    /* renamed from: initializationData */
    public java.util.ArrayList<byte[]> f54084xfa6c8c6a = new java.util.ArrayList<>();

    /* renamed from: width */
    public int f54093x6be2dc6 = -1;

    /* renamed from: height */
    public int f54083xb7389127 = -1;

    /* renamed from: maxWidth */
    public int f54089x17dd56c2 = -1;

    /* renamed from: maxHeight */
    public int f54087xc9fe87ab = -1;

    /* renamed from: maxInputSize */
    public int f54088x10e801e7 = -1;

    public C26493xe13fc07c(java.lang.String str) {
        this.f54091x7fd47d58 = str;
    }

    /* renamed from: configCsdArray */
    private static java.lang.String m103383xe07a9e27(java.lang.String str, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.append(", length:");
        sb6.append(bArr.length);
        sb6.append("  [");
        for (int i17 = 0; i17 < java.lang.Math.min(bArr.length, 20); i17++) {
            if (i17 != 0) {
                sb6.append(" ,");
            }
            sb6.append((int) bArr[i17]);
        }
        sb6.append("]");
        return sb6.toString();
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c m103384xaf65a0fc(android.media.MediaFormat mediaFormat) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c(mediaFormat.getString("mime"));
        try {
            c26493xe13fc07c.f54092x88751aa = m103386xb282bd08(mediaFormat, "sample-rate");
            c26493xe13fc07c.f54088x10e801e7 = m103386xb282bd08(mediaFormat, "max-input-size");
            c26493xe13fc07c.f54084xfa6c8c6a = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103544x62a6795(mediaFormat);
            if (c26493xe13fc07c.m103389x7b98c171()) {
                c26493xe13fc07c.f54090x461e29c9 = m103386xb282bd08(mediaFormat, "rotation-degrees");
                c26493xe13fc07c.f54093x6be2dc6 = m103386xb282bd08(mediaFormat, "width");
                c26493xe13fc07c.f54083xb7389127 = m103386xb282bd08(mediaFormat, "height");
                c26493xe13fc07c.f54089x17dd56c2 = m103386xb282bd08(mediaFormat, "max-width");
                c26493xe13fc07c.f54087xc9fe87ab = m103386xb282bd08(mediaFormat, "max-height");
            } else {
                c26493xe13fc07c.f54082xf99d8dcc = m103386xb282bd08(mediaFormat, "channel-count");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.e(TAG, "create format error", th6);
        }
        return c26493xe13fc07c;
    }

    /* renamed from: dumpCsdArray */
    public static void m103385x90e982d9(java.util.ArrayList<byte[]> arrayList) {
        if (arrayList != null && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                sb6.append(m103383xe07a9e27(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.f54295xf808681[i17], arrayList.get(i17)));
                sb6.append("\n");
            }
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "csdData size:" + arrayList.size() + "    " + sb6.toString());
        }
    }

    /* renamed from: getInteger */
    public static int m103386xb282bd08(android.media.MediaFormat mediaFormat, java.lang.String str) {
        return m103387xb282bd08(mediaFormat, str, -1);
    }

    /* renamed from: initializationDataEquals */
    public final boolean m103388xc55580c9(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        if (this.f54084xfa6c8c6a.size() != c26493xe13fc07c.f54084xfa6c8c6a.size()) {
            return false;
        }
        for (int i17 = 0; i17 < this.f54084xfa6c8c6a.size(); i17++) {
            if (!this.f54084xfa6c8c6a.get(i17).equals(c26493xe13fc07c.f54084xfa6c8c6a.get(i17))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isVideo */
    public final boolean m103389x7b98c171() {
        if (!this.f54086x4f1dab9) {
            this.f54086x4f1dab9 = true;
            this.f54085x7b98c171 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103552x7b98c171(this.f54091x7fd47d58);
        }
        return this.f54085x7b98c171;
    }

    /* renamed from: getInteger */
    public static int m103387xb282bd08(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i17;
    }
}
