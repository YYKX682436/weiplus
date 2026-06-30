package u4;

/* loaded from: classes13.dex */
public class j1 extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p112x993b6d55.C1184xfa388aad f506038d;

    public j1(p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad) {
        this.f506038d = c1184xfa388aad;
    }

    @Override // u4.d1, u4.b1
    public void b(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = this.f506038d;
        if (c1184xfa388aad.P) {
            return;
        }
        c1184xfa388aad.R();
        c1184xfa388aad.P = true;
    }

    @Override // u4.b1
    public void d(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = this.f506038d;
        int i17 = c1184xfa388aad.N - 1;
        c1184xfa388aad.N = i17;
        if (i17 == 0) {
            c1184xfa388aad.P = false;
            c1184xfa388aad.p();
        }
        abstractC1183x100d4975.E(this);
    }
}
