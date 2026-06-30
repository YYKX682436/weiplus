package d32;

/* loaded from: classes14.dex */
public final class a extends d32.p {
    public final os0.a K;

    public a(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        os0.c cVar = new os0.c(i17, i18, this.C, this.D, 2, 2);
        this.K = cVar;
        cVar.f429539o = true;
    }

    @Override // d32.p, os0.a
    public void n() {
        super.n();
        os0.a aVar = this.K;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // os0.a
    public void r(int i17) {
        os0.a aVar = this.K;
        if (aVar != null) {
            ((os0.c) aVar).H = i17;
        }
    }
}
