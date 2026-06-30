package bw5;

/* loaded from: classes2.dex */
public class lm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29851d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29852e;

    /* renamed from: f, reason: collision with root package name */
    public int f29853f;

    /* renamed from: g, reason: collision with root package name */
    public float f29854g;

    /* renamed from: h, reason: collision with root package name */
    public float f29855h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.km f29856i;

    /* renamed from: m, reason: collision with root package name */
    public int f29857m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29858n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f29859o = new boolean[9];

    static {
        new bw5.lm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lm parseFrom(byte[] bArr) {
        return (bw5.lm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lm)) {
            return false;
        }
        bw5.lm lmVar = (bw5.lm) fVar;
        return n51.f.a(this.f29851d, lmVar.f29851d) && n51.f.a(this.f29852e, lmVar.f29852e) && n51.f.a(java.lang.Integer.valueOf(this.f29853f), java.lang.Integer.valueOf(lmVar.f29853f)) && n51.f.a(java.lang.Float.valueOf(this.f29854g), java.lang.Float.valueOf(lmVar.f29854g)) && n51.f.a(java.lang.Float.valueOf(this.f29855h), java.lang.Float.valueOf(lmVar.f29855h)) && n51.f.a(this.f29856i, lmVar.f29856i) && n51.f.a(java.lang.Integer.valueOf(this.f29857m), java.lang.Integer.valueOf(lmVar.f29857m)) && n51.f.a(java.lang.Boolean.valueOf(this.f29858n), java.lang.Boolean.valueOf(lmVar.f29858n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29859o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29851d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29852e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29853f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f29854g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f29855h);
            }
            bw5.km kmVar = this.f29856i;
            if (kmVar != null && zArr[6]) {
                fVar.e(6, kmVar.f29422d);
            }
            if (zArr[7]) {
                fVar.e(7, this.f29857m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f29858n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f29851d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f29852e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f29853f);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f29854g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f29855h);
            }
            bw5.km kmVar2 = this.f29856i;
            if (kmVar2 != null && zArr[6]) {
                i18 += b36.f.e(6, kmVar2.f29422d);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f29857m);
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f29858n) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f29851d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29852e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29853f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29854g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29855h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                this.f29856i = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.km.FinderLiveImgRatio_4vs3 : bw5.km.FinderLiveImgRatio_16vs9 : bw5.km.FinderLiveImgRatio_Default;
                zArr[6] = true;
                return 0;
            case 7:
                this.f29857m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29858n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
