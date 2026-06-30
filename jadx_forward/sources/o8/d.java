package o8;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f425130a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f425131b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f425132c;

    /* renamed from: d, reason: collision with root package name */
    public final android.media.MediaCodec.CryptoInfo f425133d;

    /* renamed from: e, reason: collision with root package name */
    public final o8.c f425134e;

    public d() {
        int i17 = t9.d0.f498031a;
        android.media.MediaCodec.CryptoInfo cryptoInfo = i17 >= 16 ? new android.media.MediaCodec.CryptoInfo() : null;
        this.f425133d = cryptoInfo;
        this.f425134e = i17 >= 24 ? new o8.c(cryptoInfo, null) : null;
    }
}
