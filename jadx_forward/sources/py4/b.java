package py4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1 f440621a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27766xc0682b74 f440622b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27767x40d461d9 f440623c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27768xea664901 f440624d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f440625e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f440626f = jz5.h.b(py4.a.f440620d);

    public final rh0.y a() {
        return (rh0.y) ((jz5.n) this.f440626f).mo141623x754a37bb();
    }

    public final boolean b(java.lang.String str) {
        return !(str == null || str.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(str);
    }

    public final void c() {
        com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27768xea664901 c27768xea664901 = this.f440624d;
        if (c27768xea664901 != null) {
            java.lang.String m119927x9bd346f5 = c27768xea664901.m119927x9bd346f5();
            if (m119927x9bd346f5 == null || m119927x9bd346f5.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeOcrClsManager", "Nothing to report to 28950");
                return;
            }
            jx3.f.INSTANCE.mo68478xbd3cda5f(28950, "Cpu,INT8," + m119927x9bd346f5 + ",2");
        }
    }
}
