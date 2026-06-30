package bw5;

/* loaded from: classes2.dex */
public class ij extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28603e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28605g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28606h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28607i;

    /* renamed from: m, reason: collision with root package name */
    public int f28608m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f28609n;

    /* renamed from: q, reason: collision with root package name */
    public int f28612q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f28604f = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f28610o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f28611p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f28613r = new boolean[12];

    static {
        new bw5.ij();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ij parseFrom(byte[] bArr) {
        return (bw5.ij) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ij)) {
            return false;
        }
        bw5.ij ijVar = (bw5.ij) fVar;
        return n51.f.a(this.f28602d, ijVar.f28602d) && n51.f.a(this.f28603e, ijVar.f28603e) && n51.f.a(this.f28604f, ijVar.f28604f) && n51.f.a(this.f28605g, ijVar.f28605g) && n51.f.a(this.f28606h, ijVar.f28606h) && n51.f.a(this.f28607i, ijVar.f28607i) && n51.f.a(java.lang.Integer.valueOf(this.f28608m), java.lang.Integer.valueOf(ijVar.f28608m)) && n51.f.a(this.f28609n, ijVar.f28609n) && n51.f.a(this.f28610o, ijVar.f28610o) && n51.f.a(this.f28611p, ijVar.f28611p) && n51.f.a(java.lang.Integer.valueOf(this.f28612q), java.lang.Integer.valueOf(ijVar.f28612q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ij();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28611p;
        java.util.LinkedList linkedList2 = this.f28610o;
        java.util.LinkedList linkedList3 = this.f28604f;
        boolean[] zArr = this.f28613r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28602d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28603e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList3);
            java.lang.String str3 = this.f28605g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f28606h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f28607i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f28608m);
            }
            java.lang.String str6 = this.f28609n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            fVar.g(9, 1, linkedList2);
            fVar.g(10, 8, linkedList);
            if (!zArr[11]) {
                return 0;
            }
            fVar.e(11, this.f28612q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f28602d;
            int j17 = (str7 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str7);
            java.lang.String str8 = this.f28603e;
            if (str8 != null && zArr[2]) {
                j17 += b36.f.j(2, str8);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList3);
            java.lang.String str9 = this.f28605g;
            if (str9 != null && zArr[4]) {
                g17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f28606h;
            if (str10 != null && zArr[5]) {
                g17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f28607i;
            if (str11 != null && zArr[6]) {
                g17 += b36.f.j(6, str11);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f28608m);
            }
            java.lang.String str12 = this.f28609n;
            if (str12 != null && zArr[8]) {
                g17 += b36.f.j(8, str12);
            }
            int g18 = g17 + b36.f.g(9, 1, linkedList2) + b36.f.g(10, 8, linkedList);
            return zArr[11] ? g18 + b36.f.e(11, this.f28612q) : g18;
        }
        if (i17 == 2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
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
                this.f28602d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28603e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.gj gjVar = new bw5.gj();
                    if (bArr != null && bArr.length > 0) {
                        gjVar.parseFrom(bArr);
                    }
                    linkedList3.add(gjVar);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f28605g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28606h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28607i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28608m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28609n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                linkedList2.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.fj fjVar = new bw5.fj();
                    if (bArr2 != null && bArr2.length > 0) {
                        fjVar.parseFrom(bArr2);
                    }
                    linkedList.add(fjVar);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f28612q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
