package bw5;

/* loaded from: classes8.dex */
public class v5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.t5 f34146d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34148f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34149g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34150h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34151i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f34152m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.x7 f34153n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34154o;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34147e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f34155p = new boolean[11];

    static {
        new bw5.v5();
    }

    public bw5.t5 b() {
        return this.f34155p[1] ? this.f34146d : new bw5.t5();
    }

    public bw5.x7 c() {
        return this.f34155p[8] ? this.f34153n : new bw5.x7();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v5)) {
            return false;
        }
        bw5.v5 v5Var = (bw5.v5) fVar;
        return n51.f.a(this.f34146d, v5Var.f34146d) && n51.f.a(this.f34147e, v5Var.f34147e) && n51.f.a(this.f34148f, v5Var.f34148f) && n51.f.a(this.f34149g, v5Var.f34149g) && n51.f.a(this.f34150h, v5Var.f34150h) && n51.f.a(this.f34151i, v5Var.f34151i) && n51.f.a(java.lang.Boolean.valueOf(this.f34152m), java.lang.Boolean.valueOf(v5Var.f34152m)) && n51.f.a(this.f34153n, v5Var.f34153n) && n51.f.a(java.lang.Boolean.valueOf(this.f34154o), java.lang.Boolean.valueOf(v5Var.f34154o));
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.v5 parseFrom(byte[] bArr) {
        return (bw5.v5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34147e;
        int i18 = 0;
        boolean[] zArr = this.f34155p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.t5 t5Var = this.f34146d;
            if (t5Var != null && zArr[1]) {
                fVar.i(1, t5Var.computeSize());
                this.f34146d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f34148f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f34149g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f34150h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f34151i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.a(7, this.f34152m);
            }
            bw5.x7 x7Var = this.f34153n;
            if (x7Var != null && zArr[8]) {
                fVar.i(8, x7Var.computeSize());
                this.f34153n.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f34154o);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.t5 t5Var2 = this.f34146d;
            if (t5Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, t5Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str5 = this.f34148f;
            if (str5 != null && zArr[3]) {
                g17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f34149g;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f34150h;
            if (str7 != null && zArr[5]) {
                g17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f34151i;
            if (str8 != null && zArr[6]) {
                g17 += b36.f.j(6, str8);
            }
            if (zArr[7]) {
                g17 += b36.f.a(7, this.f34152m);
            }
            bw5.x7 x7Var2 = this.f34153n;
            if (x7Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, x7Var2.computeSize());
            }
            return zArr[10] ? g17 + b36.f.a(10, this.f34154o) : g17;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.t5 t5Var3 = new bw5.t5();
                    if (bArr != null && bArr.length > 0) {
                        t5Var3.parseFrom(bArr);
                    }
                    this.f34146d = t5Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.u5 u5Var = new bw5.u5();
                    if (bArr2 != null && bArr2.length > 0) {
                        u5Var.parseFrom(bArr2);
                    }
                    linkedList.add(u5Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f34148f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34149g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34150h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34151i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34152m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr3 != null && bArr3.length > 0) {
                        x7Var3.parseFrom(bArr3);
                    }
                    this.f34153n = x7Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.f34154o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
        }
    }
}
