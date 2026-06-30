package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016;

/* renamed from: com.tencent.thumbplayer.tmediacodec.codec.AudioCodecWrapper */
/* loaded from: classes14.dex */
public final class C26488x28070673 extends com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 {
    public C26488x28070673(android.media.MediaCodec mediaCodec, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        super(mediaCodec, c26493xe13fc07c);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411
    /* renamed from: canReuse */
    public com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType mo103361xf7b91884(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.m103489xaedbdb3a(this, c26493xe13fc07c) ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411
    /* renamed from: toString */
    public java.lang.String mo103362x9616526c() {
        return "AudioCodecWrapper[" + hashCode() + ']';
    }
}
