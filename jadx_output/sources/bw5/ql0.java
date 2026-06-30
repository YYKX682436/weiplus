package bw5;

/* loaded from: classes9.dex */
public class ql0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32172d;

    /* renamed from: e, reason: collision with root package name */
    public int f32173e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32174f;

    /* renamed from: g, reason: collision with root package name */
    public long f32175g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32176h;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f32179n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f32180o;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f32177i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f32178m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f32181p = new boolean[10];

    static {
        new bw5.ql0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ql0 parseFrom(byte[] bArr) {
        return (bw5.ql0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ql0)) {
            return false;
        }
        bw5.ql0 ql0Var = (bw5.ql0) fVar;
        return n51.f.a(this.f32172d, ql0Var.f32172d) && n51.f.a(java.lang.Integer.valueOf(this.f32173e), java.lang.Integer.valueOf(ql0Var.f32173e)) && n51.f.a(this.f32174f, ql0Var.f32174f) && n51.f.a(java.lang.Long.valueOf(this.f32175g), java.lang.Long.valueOf(ql0Var.f32175g)) && n51.f.a(this.f32176h, ql0Var.f32176h) && n51.f.a(this.f32177i, ql0Var.f32177i) && n51.f.a(this.f32178m, ql0Var.f32178m) && n51.f.a(this.f32179n, ql0Var.f32179n) && n51.f.a(this.f32180o, ql0Var.f32180o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ql0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32178m;
        java.util.LinkedList linkedList2 = this.f32177i;
        int i18 = 0;
        boolean[] zArr = this.f32181p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32172d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32173e);
            }
            java.lang.String str2 = this.f32174f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f32175g);
            }
            java.lang.String str3 = this.f32176h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, linkedList2);
            fVar.g(7, 8, linkedList);
            java.lang.String str4 = this.f32179n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f32180o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f32172d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f32173e);
            }
            java.lang.String str7 = this.f32174f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f32175g);
            }
            java.lang.String str8 = this.f32176h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList2) + b36.f.g(7, 8, linkedList);
            java.lang.String str9 = this.f32179n;
            if (str9 != null && zArr[8]) {
                g17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f32180o;
            return (str10 == null || !zArr[9]) ? g17 : g17 + b36.f.j(9, str10);
        }
        if (i17 == 2) {
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
                this.f32172d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32173e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32174f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32175g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32176h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.bn0 bn0Var = new bw5.bn0();
                    if (bArr != null && bArr.length > 0) {
                        bn0Var.parseFrom(bArr);
                    }
                    linkedList2.add(bn0Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.bn0 bn0Var2 = new bw5.bn0();
                    if (bArr2 != null && bArr2.length > 0) {
                        bn0Var2.parseFrom(bArr2);
                    }
                    linkedList.add(bn0Var2);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f32179n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32180o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
