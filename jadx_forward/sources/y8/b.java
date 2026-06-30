package y8;

/* loaded from: classes15.dex */
public class b extends java.lang.Exception {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f541329d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f541330e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f541331f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f541332g;

    public b(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, java.lang.Throwable th6, boolean z17, int i17) {
        super("Decoder init failed: [" + i17 + "], " + c1601x7dc4e417, th6);
        this.f541329d = c1601x7dc4e417.f125613i;
        this.f541330e = z17;
        this.f541331f = null;
        this.f541332g = "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i17 < 0 ? "neg_" : "") + java.lang.Math.abs(i17);
    }

    public b(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417, java.lang.Throwable th6, boolean z17, java.lang.String str) {
        super("Decoder init failed: " + str + ", " + c1601x7dc4e417, th6);
        this.f541329d = c1601x7dc4e417.f125613i;
        this.f541330e = z17;
        this.f541331f = str;
        java.lang.String str2 = null;
        if (t9.d0.f498031a >= 21 && (th6 instanceof android.media.MediaCodec.CodecException)) {
            str2 = ((android.media.MediaCodec.CodecException) th6).getDiagnosticInfo();
        }
        this.f541332g = str2;
    }
}
