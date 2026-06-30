package bw5;

/* loaded from: classes9.dex */
public class e1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f26678d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26679e;

    /* renamed from: f, reason: collision with root package name */
    public int f26680f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26681g;

    /* renamed from: m, reason: collision with root package name */
    public bw5.b1 f26684m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.b1 f26685n;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f26682h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f26683i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f26686o = new boolean[9];

    static {
        new bw5.e1();
    }

    public bw5.b1 b() {
        return this.f26686o[8] ? this.f26685n : new bw5.b1();
    }

    public bw5.b1 c() {
        return this.f26686o[7] ? this.f26684m : new bw5.b1();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e1)) {
            return false;
        }
        bw5.e1 e1Var = (bw5.e1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f26678d), java.lang.Long.valueOf(e1Var.f26678d)) && n51.f.a(this.f26679e, e1Var.f26679e) && n51.f.a(java.lang.Integer.valueOf(this.f26680f), java.lang.Integer.valueOf(e1Var.f26680f)) && n51.f.a(this.f26681g, e1Var.f26681g) && n51.f.a(this.f26682h, e1Var.f26682h) && n51.f.a(this.f26683i, e1Var.f26683i) && n51.f.a(this.f26684m, e1Var.f26684m) && n51.f.a(this.f26685n, e1Var.f26685n);
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.e1 parseFrom(byte[] bArr) {
        return (bw5.e1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26683i;
        java.util.LinkedList linkedList2 = this.f26682h;
        boolean[] zArr = this.f26686o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f26678d);
            }
            java.lang.String str = this.f26679e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26680f);
            }
            java.lang.String str2 = this.f26681g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList2);
            fVar.g(6, 8, linkedList);
            bw5.b1 b1Var = this.f26684m;
            if (b1Var != null && zArr[7]) {
                fVar.i(7, b1Var.computeSize());
                this.f26684m.writeFields(fVar);
            }
            bw5.b1 b1Var2 = this.f26685n;
            if (b1Var2 != null && zArr[8]) {
                fVar.i(8, b1Var2.computeSize());
                this.f26685n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f26678d) : 0;
            java.lang.String str3 = this.f26679e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f26680f);
            }
            java.lang.String str4 = this.f26681g;
            if (str4 != null && zArr[4]) {
                h17 += b36.f.j(4, str4);
            }
            int g17 = h17 + b36.f.g(5, 8, linkedList2) + b36.f.g(6, 8, linkedList);
            bw5.b1 b1Var3 = this.f26684m;
            if (b1Var3 != null && zArr[7]) {
                g17 += b36.f.i(7, b1Var3.computeSize());
            }
            bw5.b1 b1Var4 = this.f26685n;
            return (b1Var4 == null || !zArr[8]) ? g17 : g17 + b36.f.i(8, b1Var4.computeSize());
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
                this.f26678d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26679e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26680f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26681g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.c1 c1Var = new bw5.c1();
                    if (bArr != null && bArr.length > 0) {
                        c1Var.parseFrom(bArr);
                    }
                    linkedList2.add(c1Var);
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.d1 d1Var = new bw5.d1();
                    if (bArr2 != null && bArr2.length > 0) {
                        d1Var.parseFrom(bArr2);
                    }
                    linkedList.add(d1Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.b1 b1Var5 = new bw5.b1();
                    if (bArr3 != null && bArr3.length > 0) {
                        b1Var5.parseFrom(bArr3);
                    }
                    this.f26684m = b1Var5;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.b1 b1Var6 = new bw5.b1();
                    if (bArr4 != null && bArr4.length > 0) {
                        b1Var6.parseFrom(bArr4);
                    }
                    this.f26685n = b1Var6;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
