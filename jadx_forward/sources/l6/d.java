package l6;

/* loaded from: classes16.dex */
public class d extends l6.e {

    /* renamed from: h, reason: collision with root package name */
    public int f398247h;

    /* renamed from: i, reason: collision with root package name */
    public l6.g[] f398248i;

    @Override // l6.e
    public int[] a() {
        int i17 = 8;
        int[] iArr = new int[(this.f398247h * 3) + 8];
        java.util.Arrays.fill(iArr, 0);
        iArr[0] = this.f398249a;
        int i18 = this.f398247h;
        iArr[1] = ((i18 * 3) + 8) - 2;
        iArr[2] = this.f398251c;
        iArr[3] = this.f398252d;
        iArr[4] = this.f398253e;
        iArr[5] = this.f398254f;
        iArr[6] = this.f398255g;
        iArr[7] = i18;
        for (int i19 = 0; i19 < this.f398247h; i19++) {
            l6.g gVar = this.f398248i[i19];
            iArr[i17] = gVar.f398258a;
            int i27 = i17 + 1;
            iArr[i27] = gVar.f398259b;
            int i28 = i27 + 1;
            iArr[i28] = gVar.f398260c;
            i17 = i28 + 1;
        }
        return iArr;
    }

    @Override // l6.e
    /* renamed from: toString */
    public java.lang.String mo145181x9616526c() {
        return "Continuous{mPointNum=" + this.f398247h + ", mPoint=" + java.util.Arrays.toString(this.f398248i) + '}';
    }
}
