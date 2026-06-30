package com.tencent.maas.camerafun;

/* loaded from: classes5.dex */
public class MJAudioFrame {

    /* renamed from: a, reason: collision with root package name */
    public final int f47804a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47805b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47806c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47807d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.ByteBuffer f47808e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTimeRange f47809f;

    public MJAudioFrame(jg.b bVar, int i17, jg.a aVar, int i18, com.tencent.maas.model.time.MJTimeRange mJTimeRange, java.nio.ByteBuffer byteBuffer) {
        this.f47804a = bVar.f299524d;
        this.f47805b = i17;
        this.f47806c = aVar.f299521d;
        this.f47807d = i18;
        this.f47809f = mJTimeRange;
        this.f47808e = byteBuffer;
    }

    public java.nio.ByteBuffer getAudioData() {
        return this.f47808e;
    }

    public int getChannelCount() {
        return this.f47806c;
    }

    public int getSampleCountPerChannel() {
        return this.f47807d;
    }

    public int getSampleFormat() {
        return this.f47804a;
    }

    public int getSampleRate() {
        return this.f47805b;
    }

    public com.tencent.maas.model.time.MJTimeRange getTimeRange() {
        return this.f47809f;
    }
}
