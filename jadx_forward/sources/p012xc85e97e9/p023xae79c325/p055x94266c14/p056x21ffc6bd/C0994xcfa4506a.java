package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.ImageAnalysisConfigProvider */
/* loaded from: classes14.dex */
public class C0994xcfa4506a implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59> {

    /* renamed from: mVendorExtender */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf f2433x3dedb87c;

    public C0994xcfa4506a(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf interfaceC0999xfb817acf) {
        this.f2433x3dedb87c = interfaceC0999xfb817acf;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773
    /* renamed from: getConfig, reason: avoid collision after fix types in other method */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 mo4473x1456a638() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder();
        android.util.Size[] mo6670x360a99a9 = this.f2433x3dedb87c.mo6670x360a99a9();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (mo6670x360a99a9 != null && mo6670x360a99a9.length > 0) {
            arrayList.add(new android.util.Pair(35, mo6670x360a99a9));
        }
        builder.mo4466x9b56433b((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) arrayList);
        return builder.mo4446x111127c3();
    }
}
