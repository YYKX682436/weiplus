package bw5;

/* loaded from: classes2.dex */
public class w00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34548d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34550f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pj f34551g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34552h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.x7 f34553i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34549e = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f34554m = new boolean[7];

    static {
        new bw5.w00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w00 parseFrom(byte[] bArr) {
        return (bw5.w00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w00)) {
            return false;
        }
        bw5.w00 w00Var = (bw5.w00) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34548d), java.lang.Integer.valueOf(w00Var.f34548d)) && n51.f.a(this.f34549e, w00Var.f34549e) && n51.f.a(this.f34550f, w00Var.f34550f) && n51.f.a(this.f34551g, w00Var.f34551g) && n51.f.a(this.f34552h, w00Var.f34552h) && n51.f.a(this.f34553i, w00Var.f34553i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.w00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34549e;
        boolean[] zArr = this.f34554m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34548d);
            }
            fVar.g(2, 1, linkedList);
            java.lang.String str = this.f34550f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.pj pjVar = this.f34551g;
            if (pjVar != null && zArr[4]) {
                fVar.i(4, pjVar.computeSize());
                this.f34551g.writeFields(fVar);
            }
            java.lang.String str2 = this.f34552h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            bw5.x7 x7Var = this.f34553i;
            if (x7Var != null && zArr[6]) {
                fVar.i(6, x7Var.computeSize());
                this.f34553i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f34548d) : 0) + b36.f.g(2, 1, linkedList);
            java.lang.String str3 = this.f34550f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            bw5.pj pjVar2 = this.f34551g;
            if (pjVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, pjVar2.computeSize());
            }
            java.lang.String str4 = this.f34552h;
            if (str4 != null && zArr[5]) {
                e17 += b36.f.j(5, str4);
            }
            bw5.x7 x7Var2 = this.f34553i;
            return (x7Var2 == null || !zArr[6]) ? e17 : e17 + b36.f.i(6, x7Var2.computeSize());
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
                this.f34548d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                linkedList.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f34550f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr != null && bArr.length > 0) {
                        pjVar3.parseFrom(bArr);
                    }
                    this.f34551g = pjVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f34552h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr2 != null && bArr2.length > 0) {
                        x7Var3.parseFrom(bArr2);
                    }
                    this.f34553i = x7Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
