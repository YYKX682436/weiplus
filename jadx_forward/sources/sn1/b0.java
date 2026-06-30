package sn1;

/* loaded from: classes12.dex */
public class b0 implements ln1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sn1.f0 f491519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn1.e0 f491520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.d0 f491522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f491523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f491524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f491525g;

    public b0(sn1.f0 f0Var, sn1.e0 e0Var, java.lang.String str, sn1.d0 d0Var, byte[] bArr, byte[] bArr2, int i17) {
        this.f491519a = f0Var;
        this.f491520b = e0Var;
        this.f491521c = str;
        this.f491522d = d0Var;
        this.f491523e = bArr;
        this.f491524f = bArr2;
        this.f491525g = i17;
    }

    @Override // ln1.z
    public void a(java.lang.Object obj) {
        ((ln1.e0) this.f491519a).a((sn1.a0) obj);
    }

    @Override // ln1.z
    public java.lang.Object run() {
        return new sn1.a0(this.f491520b, this.f491521c, this.f491522d, this.f491523e, this.f491524f, this.f491525g, null);
    }
}
