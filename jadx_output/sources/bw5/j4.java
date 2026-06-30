package bw5;

/* loaded from: classes11.dex */
public class j4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f28786d;

    /* renamed from: e, reason: collision with root package name */
    public long f28787e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28788f;

    /* renamed from: g, reason: collision with root package name */
    public long f28789g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28790h;

    /* renamed from: i, reason: collision with root package name */
    public long f28791i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.xa f28792m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.xa f28793n;

    /* renamed from: o, reason: collision with root package name */
    public long f28794o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.dj0 f28795p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f28796q;

    /* renamed from: r, reason: collision with root package name */
    public long f28797r;

    /* renamed from: s, reason: collision with root package name */
    public int f28798s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f28799t;

    /* renamed from: u, reason: collision with root package name */
    public int f28800u;

    /* renamed from: v, reason: collision with root package name */
    public int f28801v;

    /* renamed from: w, reason: collision with root package name */
    public int f28802w;

    /* renamed from: x, reason: collision with root package name */
    public int f28803x;

    /* renamed from: y, reason: collision with root package name */
    public int f28804y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f28805z = new boolean[20];

    static {
        new bw5.j4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j4 parseFrom(byte[] bArr) {
        return (bw5.j4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j4)) {
            return false;
        }
        bw5.j4 j4Var = (bw5.j4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f28786d), java.lang.Long.valueOf(j4Var.f28786d)) && n51.f.a(java.lang.Long.valueOf(this.f28787e), java.lang.Long.valueOf(j4Var.f28787e)) && n51.f.a(this.f28788f, j4Var.f28788f) && n51.f.a(java.lang.Long.valueOf(this.f28789g), java.lang.Long.valueOf(j4Var.f28789g)) && n51.f.a(this.f28790h, j4Var.f28790h) && n51.f.a(java.lang.Long.valueOf(this.f28791i), java.lang.Long.valueOf(j4Var.f28791i)) && n51.f.a(this.f28792m, j4Var.f28792m) && n51.f.a(this.f28793n, j4Var.f28793n) && n51.f.a(java.lang.Long.valueOf(this.f28794o), java.lang.Long.valueOf(j4Var.f28794o)) && n51.f.a(this.f28795p, j4Var.f28795p) && n51.f.a(this.f28796q, j4Var.f28796q) && n51.f.a(java.lang.Long.valueOf(this.f28797r), java.lang.Long.valueOf(j4Var.f28797r)) && n51.f.a(java.lang.Integer.valueOf(this.f28798s), java.lang.Integer.valueOf(j4Var.f28798s)) && n51.f.a(this.f28799t, j4Var.f28799t) && n51.f.a(java.lang.Integer.valueOf(this.f28800u), java.lang.Integer.valueOf(j4Var.f28800u)) && n51.f.a(java.lang.Integer.valueOf(this.f28801v), java.lang.Integer.valueOf(j4Var.f28801v)) && n51.f.a(java.lang.Integer.valueOf(this.f28802w), java.lang.Integer.valueOf(j4Var.f28802w)) && n51.f.a(java.lang.Integer.valueOf(this.f28803x), java.lang.Integer.valueOf(j4Var.f28803x)) && n51.f.a(java.lang.Integer.valueOf(this.f28804y), java.lang.Integer.valueOf(j4Var.f28804y));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28805z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f28786d);
            }
            if (zArr[12]) {
                fVar.h(12, this.f28787e);
            }
            java.lang.String str = this.f28788f;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f28789g);
            }
            java.lang.String str2 = this.f28790h;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f28791i);
            }
            bw5.xa xaVar = this.f28792m;
            if (xaVar != null && zArr[6]) {
                fVar.i(6, xaVar.computeSize());
                this.f28792m.writeFields(fVar);
            }
            bw5.xa xaVar2 = this.f28793n;
            if (xaVar2 != null && zArr[7]) {
                fVar.i(7, xaVar2.computeSize());
                this.f28793n.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.h(8, this.f28794o);
            }
            bw5.dj0 dj0Var = this.f28795p;
            if (dj0Var != null && zArr[9]) {
                fVar.i(9, dj0Var.computeSize());
                this.f28795p.writeFields(fVar);
            }
            java.lang.String str3 = this.f28796q;
            if (str3 != null && zArr[10]) {
                fVar.j(10, str3);
            }
            if (zArr[11]) {
                fVar.h(11, this.f28797r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f28798s);
            }
            java.lang.String str4 = this.f28799t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            if (zArr[15]) {
                fVar.e(15, this.f28800u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f28801v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f28802w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f28803x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f28804y);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f28786d) + 0 : 0;
            if (zArr[12]) {
                h17 += b36.f.h(12, this.f28787e);
            }
            java.lang.String str5 = this.f28788f;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f28789g);
            }
            java.lang.String str6 = this.f28790h;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f28791i);
            }
            bw5.xa xaVar3 = this.f28792m;
            if (xaVar3 != null && zArr[6]) {
                h17 += b36.f.i(6, xaVar3.computeSize());
            }
            bw5.xa xaVar4 = this.f28793n;
            if (xaVar4 != null && zArr[7]) {
                h17 += b36.f.i(7, xaVar4.computeSize());
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f28794o);
            }
            bw5.dj0 dj0Var2 = this.f28795p;
            if (dj0Var2 != null && zArr[9]) {
                h17 += b36.f.i(9, dj0Var2.computeSize());
            }
            java.lang.String str7 = this.f28796q;
            if (str7 != null && zArr[10]) {
                h17 += b36.f.j(10, str7);
            }
            if (zArr[11]) {
                h17 += b36.f.h(11, this.f28797r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f28798s);
            }
            java.lang.String str8 = this.f28799t;
            if (str8 != null && zArr[14]) {
                h17 += b36.f.j(14, str8);
            }
            if (zArr[15]) {
                h17 += b36.f.e(15, this.f28800u);
            }
            if (zArr[16]) {
                h17 += b36.f.e(16, this.f28801v);
            }
            if (zArr[17]) {
                h17 += b36.f.e(17, this.f28802w);
            }
            if (zArr[18]) {
                h17 += b36.f.e(18, this.f28803x);
            }
            return zArr[19] ? h17 + b36.f.e(19, this.f28804y) : h17;
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
                this.f28786d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28788f = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28789g = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28790h = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28791i = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.xa xaVar5 = new bw5.xa();
                    if (bArr != null && bArr.length > 0) {
                        xaVar5.parseFrom(bArr);
                    }
                    this.f28792m = xaVar5;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.xa xaVar6 = new bw5.xa();
                    if (bArr2 != null && bArr2.length > 0) {
                        xaVar6.parseFrom(bArr2);
                    }
                    this.f28793n = xaVar6;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f28794o = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.dj0 dj0Var3 = new bw5.dj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        dj0Var3.parseFrom(bArr3);
                    }
                    this.f28795p = dj0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f28796q = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28797r = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28787e = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f28798s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f28799t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f28800u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f28801v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f28802w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f28803x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f28804y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            default:
                return -1;
        }
    }
}
