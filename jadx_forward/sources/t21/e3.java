package t21;

/* loaded from: classes12.dex */
public class e3 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f496274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f496275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f496278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496279i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f496280m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t21.g3 f496281n;

    public e3(t21.g3 g3Var, long j17, t21.v2 v2Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, long j18) {
        this.f496281n = g3Var;
        this.f496274d = j17;
        this.f496275e = v2Var;
        this.f496276f = str;
        this.f496277g = str2;
        this.f496278h = i17;
        this.f496279i = str3;
        this.f496280m = j18;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        return this.f496281n.b(i17, hVar, this.f496274d, this.f496275e, this.f496276f, this.f496277g, this.f496278h, this.f496279i, this.f496280m);
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
