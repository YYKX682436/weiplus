package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016;

/* renamed from: com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper */
/* loaded from: classes14.dex */
public final class C26495xaba8af98 extends com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 {
    public C26495xaba8af98(android.media.MediaCodec mediaCodec, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        super(mediaCodec, c26493xe13fc07c);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411
    /* renamed from: canReuse */
    public com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType mo103361xf7b91884(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.m103489xaedbdb3a(this, c26493xe13fc07c)) {
            int i17 = c26493xe13fc07c.f54093x6be2dc6;
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26490x18ff2850 c26490x18ff2850 = this.f54107x5b6b65fd;
            if (i17 <= c26490x18ff2850.f54078x6be2dc6 && c26493xe13fc07c.f54083xb7389127 <= c26490x18ff2850.f54076xb7389127 && com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26516x943b34bd.m103545x71da945d(this, c26493xe13fc07c) <= this.f54107x5b6b65fd.f54077x65bdb6eb) {
                return c26493xe13fc07c.m103388xc55580c9(this.f54112x3cc1ec4) ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION;
            }
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411
    /* renamed from: isNeedKeep */
    public boolean mo103419x44c9485() {
        return super.mo103419x44c9485() && this.f54123x2fa29f80 != null && this.f54112x3cc1ec4.f54090x461e29c9 == 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411
    /* renamed from: toString */
    public java.lang.String mo103362x9616526c() {
        return "VideoCodecWrapper[" + hashCode() + ']';
    }
}
