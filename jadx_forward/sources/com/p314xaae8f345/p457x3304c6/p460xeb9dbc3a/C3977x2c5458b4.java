package com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a;

/* renamed from: com.tencent.maas.camerafun.MJAudioFrame */
/* loaded from: classes5.dex */
public class C3977x2c5458b4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f129337a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129338b;

    /* renamed from: c, reason: collision with root package name */
    public final int f129339c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129340d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.ByteBuffer f129341e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f129342f;

    public C3977x2c5458b4(jg.b bVar, int i17, jg.a aVar, int i18, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, java.nio.ByteBuffer byteBuffer) {
        this.f129337a = bVar.f381057d;
        this.f129338b = i17;
        this.f129339c = aVar.f381054d;
        this.f129340d = i18;
        this.f129342f = c4129xdee64553;
        this.f129341e = byteBuffer;
    }

    /* renamed from: getAudioData */
    public java.nio.ByteBuffer m32446xa9d95ea() {
        return this.f129341e;
    }

    /* renamed from: getChannelCount */
    public int m32447x5a902042() {
        return this.f129339c;
    }

    /* renamed from: getSampleCountPerChannel */
    public int m32448xf3358ad5() {
        return this.f129340d;
    }

    /* renamed from: getSampleFormat */
    public int m32449x513684b7() {
        return this.f129337a;
    }

    /* renamed from: getSampleRate */
    public int m32450xf6c809a0() {
        return this.f129338b;
    }

    /* renamed from: getTimeRange */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m32451xdd1fba() {
        return this.f129342f;
    }
}
