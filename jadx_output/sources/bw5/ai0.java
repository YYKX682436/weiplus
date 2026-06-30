package bw5;

/* loaded from: classes15.dex */
public class ai0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25205d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.io0 f25206e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25207f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.f30 f25208g;

    /* renamed from: h, reason: collision with root package name */
    public int f25209h;

    /* renamed from: m, reason: collision with root package name */
    public int f25211m;

    /* renamed from: n, reason: collision with root package name */
    public int f25212n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f25213o;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f25210i = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f25214p = new boolean[10];

    static {
        new bw5.ai0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ai0 parseFrom(byte[] bArr) {
        return (bw5.ai0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ai0)) {
            return false;
        }
        bw5.ai0 ai0Var = (bw5.ai0) fVar;
        return n51.f.a(this.f25205d, ai0Var.f25205d) && n51.f.a(this.f25206e, ai0Var.f25206e) && n51.f.a(this.f25207f, ai0Var.f25207f) && n51.f.a(this.f25208g, ai0Var.f25208g) && n51.f.a(java.lang.Integer.valueOf(this.f25209h), java.lang.Integer.valueOf(ai0Var.f25209h)) && n51.f.a(this.f25210i, ai0Var.f25210i) && n51.f.a(java.lang.Integer.valueOf(this.f25211m), java.lang.Integer.valueOf(ai0Var.f25211m)) && n51.f.a(java.lang.Integer.valueOf(this.f25212n), java.lang.Integer.valueOf(ai0Var.f25212n)) && n51.f.a(this.f25213o, ai0Var.f25213o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ai0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25210i;
        int i18 = 0;
        boolean[] zArr = this.f25214p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25205d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.io0 io0Var = this.f25206e;
            if (io0Var != null && zArr[2]) {
                fVar.e(2, io0Var.f28657d);
            }
            java.lang.String str2 = this.f25207f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.f30 f30Var = this.f25208g;
            if (f30Var != null && zArr[4]) {
                fVar.e(4, f30Var.f27141d);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25209h);
            }
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.e(7, this.f25211m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f25212n);
            }
            java.lang.String str3 = this.f25213o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f25205d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            bw5.io0 io0Var2 = this.f25206e;
            if (io0Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, io0Var2.f28657d);
            }
            java.lang.String str5 = this.f25207f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            bw5.f30 f30Var2 = this.f25208g;
            if (f30Var2 != null && zArr[4]) {
                i18 += b36.f.e(4, f30Var2.f27141d);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f25209h);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList);
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f25211m);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f25212n);
            }
            java.lang.String str6 = this.f25213o;
            return (str6 == null || !zArr[9]) ? g17 : g17 + b36.f.j(9, str6);
        }
        if (i17 == 2) {
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
                this.f25205d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                this.f25206e = g18 != 0 ? g18 != 1 ? g18 != 2 ? g18 != 3 ? null : bw5.io0.PREVIEW_ERROR : bw5.io0.PREVIEW_NEED_PASSWORD : bw5.io0.PREVIEW_SUCCESS : bw5.io0.PREVIEW_RUNNING;
                zArr[2] = true;
                return 0;
            case 3:
                this.f25207f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25208g = bw5.f30.a(aVar2.g(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                this.f25209h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mr0 mr0Var = new bw5.mr0();
                    if (bArr != null && bArr.length > 0) {
                        mr0Var.parseFrom(bArr);
                    }
                    linkedList.add(mr0Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f25211m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25212n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25213o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
