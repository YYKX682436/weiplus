package bw5;

/* loaded from: classes2.dex */
public class p30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31449d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31451f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31452g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f31450e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f31453h = new boolean[5];

    static {
        new bw5.p30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p30 parseFrom(byte[] bArr) {
        return (bw5.p30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p30)) {
            return false;
        }
        bw5.p30 p30Var = (bw5.p30) fVar;
        return n51.f.a(this.f31449d, p30Var.f31449d) && n51.f.a(this.f31450e, p30Var.f31450e) && n51.f.a(java.lang.Boolean.valueOf(this.f31451f), java.lang.Boolean.valueOf(p30Var.f31451f)) && n51.f.a(java.lang.Boolean.valueOf(this.f31452g), java.lang.Boolean.valueOf(p30Var.f31452g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31450e;
        boolean[] zArr = this.f31453h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31449d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.a(3, this.f31451f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f31452g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f31449d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.a(3, this.f31451f);
            }
            return zArr[4] ? g17 + b36.f.a(4, this.f31452g) : g17;
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
        if (intValue == 1) {
            this.f31449d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f31451f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f31452g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.o30 o30Var = new bw5.o30();
            if (bArr != null && bArr.length > 0) {
                o30Var.parseFrom(bArr);
            }
            linkedList.add(o30Var);
        }
        zArr[2] = true;
        return 0;
    }
}
