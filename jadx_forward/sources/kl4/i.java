package kl4;

/* loaded from: classes13.dex */
public final class i implements com.p314xaae8f345.mm.p630x58d9bd6.mix.p631xb06291ee.InterfaceC5140x264f60fc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kl4.k f390447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.io.ByteArrayOutputStream f390448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f390449c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.y1 f390450d;

    public i(kl4.k kVar, java.io.ByteArrayOutputStream byteArrayOutputStream, int i17, bw5.y1 y1Var) {
        this.f390447a = kVar;
        this.f390448b = byteArrayOutputStream;
        this.f390449c = i17;
        this.f390450d = y1Var;
    }

    @Override // com.p314xaae8f345.mm.p630x58d9bd6.mix.p631xb06291ee.InterfaceC5140x264f60fc
    /* renamed from: onDecodeData */
    public final boolean mo43233x7f09adf7(byte[] bArr, int i17, boolean z17) {
        kl4.k kVar = this.f390447a;
        if (!kVar.f390458h.get()) {
            return true;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.f390448b;
        if (z17) {
            if (bArr != null) {
                byteArrayOutputStream.write(bArr);
            }
            return true;
        }
        if (bArr != null && i17 != 0) {
            byteArrayOutputStream.write(bArr);
            if (byteArrayOutputStream.size() >= this.f390449c) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 a17 = kVar.f390461n.a(byteArray.length, byteArray);
                try {
                    try {
                        jm4.x xVar = kVar.f390456f;
                        if (xVar != null) {
                            ((jm4.y) xVar).a(a17, this.f390450d, true);
                        }
                        kVar.f390461n.b(a17);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(kVar.f390454d, "audio decode frame out callback error: " + e17.getMessage());
                        kVar.f390461n.b(a17);
                    }
                    byteArrayOutputStream.reset();
                } catch (java.lang.Throwable th6) {
                    kVar.f390461n.b(a17);
                    throw th6;
                }
            }
        }
        return false;
    }
}
