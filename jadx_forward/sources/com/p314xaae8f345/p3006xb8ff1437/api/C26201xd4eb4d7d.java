package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPTrackInfo */
/* loaded from: classes16.dex */
public class C26201xd4eb4d7d {

    /* renamed from: TP_MEDIA_CONTAINER_TYPE_DASH */
    public static final int f51052xb0ff9a1b = 2;

    /* renamed from: TP_MEDIA_CONTAINER_TYPE_HLS */
    public static final int f51053x608c7026 = 1;

    /* renamed from: TP_MEDIA_CONTAINER_TYPE_UNKNOWN */
    public static final int f51054x19ba8d01 = 0;

    /* renamed from: TP_MEDIA_TRACK_TYPE_AUDIO */
    public static final int f51055xaea8f243 = 2;

    /* renamed from: TP_MEDIA_TRACK_TYPE_SUBTITLE */
    public static final int f51056xa97d466b = 3;

    /* renamed from: TP_MEDIA_TRACK_TYPE_UNKNOW */
    public static final int f51057x4836dfb7 = 0;

    /* renamed from: TP_MEDIA_TRACK_TYPE_VIDEO */
    public static final int f51058xafcb6ae8 = 1;

    /* renamed from: name */
    public java.lang.String f51065x337a8b;

    /* renamed from: trackType */
    public int f51066x2b805725 = 0;

    /* renamed from: containerType */
    public int f51059x753d275b = 0;

    /* renamed from: isSelected */
    public boolean f51064x17bd99e5 = false;

    /* renamed from: isExclusive */
    public boolean f51062xaac50094 = true;

    /* renamed from: isInternal */
    public boolean f51063xf2b76e07 = true;

    /* renamed from: hlsTag */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26177x1ed9a2c7 f51061xb79f792b = new com.p314xaae8f345.p3006xb8ff1437.api.C26177x1ed9a2c7();

    /* renamed from: dashFormat */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26173xc4a659c5 f51060x40125e29 = new com.p314xaae8f345.p3006xb8ff1437.api.C26173xc4a659c5();

    /* renamed from: equals */
    public boolean m101183xb2c87fbf(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d)) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d = (com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d) obj;
            if (this.f51065x337a8b.equals(c26201xd4eb4d7d.f51065x337a8b) && this.f51066x2b805725 == c26201xd4eb4d7d.f51066x2b805725) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getDashFormat */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26173xc4a659c5 m101184x2e53161f() {
        return this.f51060x40125e29;
    }

    /* renamed from: getHlsTag */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26177x1ed9a2c7 m101185x1cb69c21() {
        return this.f51061xb79f792b;
    }

    /* renamed from: getName */
    public java.lang.String m101186xfb82e301() {
        return this.f51065x337a8b;
    }

    /* renamed from: getTrackType */
    public int m101187x2aedc86f() {
        return this.f51066x2b805725;
    }
}
