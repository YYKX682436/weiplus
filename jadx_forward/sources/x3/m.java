package x3;

/* loaded from: classes15.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final x3.k[] f533110a;

    /* renamed from: b, reason: collision with root package name */
    public int f533111b;

    /* renamed from: c, reason: collision with root package name */
    public final x3.k[][] f533112c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f533113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p088x532b79f0.p089xd1075a44.a f533114e;

    public m(p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar, x3.k[] kVarArr) {
        this.f533114e = aVar;
        int length = kVarArr.length;
        this.f533110a = new x3.k[length];
        this.f533111b = length - 1;
        int f17 = aVar.f() + 1;
        x3.k[][] kVarArr2 = new x3.k[f17];
        int[] iArr = new int[f17];
        for (x3.k kVar : kVarArr) {
            int i17 = kVar.f533105a.f533118a;
            iArr[i17] = iArr[i17] + 1;
        }
        for (int i18 = 0; i18 < f17; i18++) {
            kVarArr2[i18] = new x3.k[iArr[i18]];
        }
        java.util.Arrays.fill(iArr, 0);
        for (x3.k kVar2 : kVarArr) {
            int i19 = kVar2.f533105a.f533118a;
            x3.k[] kVarArr3 = kVarArr2[i19];
            int i27 = iArr[i19];
            iArr[i19] = i27 + 1;
            kVarArr3[i27] = kVar2;
        }
        this.f533112c = kVarArr2;
        this.f533113d = new int[this.f533114e.f() + 1];
    }

    public void a(int i17) {
        int[] iArr = this.f533113d;
        if (iArr[i17] != 0) {
            return;
        }
        iArr[i17] = 1;
        for (x3.k kVar : this.f533112c[i17]) {
            a(kVar.f533105a.f533119b);
            int i18 = this.f533111b;
            this.f533111b = i18 - 1;
            this.f533110a[i18] = kVar;
        }
        iArr[i17] = 2;
    }
}
