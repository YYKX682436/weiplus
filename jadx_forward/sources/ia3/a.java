package ia3;

/* loaded from: classes15.dex */
public class a implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f371518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f371520c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f371522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f371523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback f371524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ia3.e f371525h;

    public a(ia3.e eVar, long j17, java.lang.String str, long j18, java.lang.String str2, boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.NativeCallback nativeCallback) {
        this.f371525h = eVar;
        this.f371518a = j17;
        this.f371519b = str;
        this.f371520c = j18;
        this.f371521d = str2;
        this.f371522e = z17;
        this.f371523f = i17;
        this.f371524g = nativeCallback;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf((iArr == null || iArr.length <= 0) ? -1 : iArr[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onRequestPermissionsResult, requestCode: %d, grantResults: %s", objArr);
        if (i17 != 80 || iArr == null || iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            this.f371525h.b(this.f371518a, this.f371519b, this.f371520c, this.f371521d, this.f371522e, this.f371523f, this.f371524g);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onRequestPermissionsResult: permission denied");
            this.f371525h.a(3, "startSpeechRecognition:fail permission denied", this.f371524g);
        }
    }
}
