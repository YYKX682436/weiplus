package bw5;

/* loaded from: classes2.dex */
public class vv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34490d;

    /* renamed from: e, reason: collision with root package name */
    public int f34491e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34492f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34493g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.rv f34494h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34495i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.dc f34496m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34497n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.z30 f34498o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f34499p = new boolean[10];

    static {
        new bw5.vv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vv parseFrom(byte[] bArr) {
        return (bw5.vv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vv)) {
            return false;
        }
        bw5.vv vvVar = (bw5.vv) fVar;
        return n51.f.a(this.f34490d, vvVar.f34490d) && n51.f.a(java.lang.Integer.valueOf(this.f34491e), java.lang.Integer.valueOf(vvVar.f34491e)) && n51.f.a(this.f34492f, vvVar.f34492f) && n51.f.a(this.f34493g, vvVar.f34493g) && n51.f.a(this.f34494h, vvVar.f34494h) && n51.f.a(this.f34495i, vvVar.f34495i) && n51.f.a(this.f34496m, vvVar.f34496m) && n51.f.a(this.f34497n, vvVar.f34497n) && n51.f.a(this.f34498o, vvVar.f34498o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34499p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34490d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34491e);
            }
            java.lang.String str2 = this.f34492f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f34493g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            bw5.rv rvVar = this.f34494h;
            if (rvVar != null && zArr[5]) {
                fVar.i(5, rvVar.computeSize());
                this.f34494h.writeFields(fVar);
            }
            java.lang.String str4 = this.f34495i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.dc dcVar = this.f34496m;
            if (dcVar != null && zArr[7]) {
                fVar.i(7, dcVar.computeSize());
                this.f34496m.writeFields(fVar);
            }
            java.lang.String str5 = this.f34497n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            bw5.z30 z30Var = this.f34498o;
            if (z30Var != null && zArr[9]) {
                fVar.i(9, z30Var.computeSize());
                this.f34498o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f34490d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f34491e);
            }
            java.lang.String str7 = this.f34492f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f34493g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            bw5.rv rvVar2 = this.f34494h;
            if (rvVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, rvVar2.computeSize());
            }
            java.lang.String str9 = this.f34495i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            bw5.dc dcVar2 = this.f34496m;
            if (dcVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, dcVar2.computeSize());
            }
            java.lang.String str10 = this.f34497n;
            if (str10 != null && zArr[8]) {
                i18 += b36.f.j(8, str10);
            }
            bw5.z30 z30Var2 = this.f34498o;
            return (z30Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, z30Var2.computeSize());
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
                this.f34490d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34491e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34492f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34493g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.rv rvVar3 = new bw5.rv();
                    if (bArr != null && bArr.length > 0) {
                        rvVar3.parseFrom(bArr);
                    }
                    this.f34494h = rvVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f34495i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.dc dcVar3 = new bw5.dc();
                    if (bArr2 != null && bArr2.length > 0) {
                        dcVar3.parseFrom(bArr2);
                    }
                    this.f34496m = dcVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f34497n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.z30 z30Var3 = new bw5.z30();
                    if (bArr3 != null && bArr3.length > 0) {
                        z30Var3.parseFrom(bArr3);
                    }
                    this.f34498o = z30Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
