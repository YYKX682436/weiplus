package bw5;

/* loaded from: classes2.dex */
public class mm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f30319d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30320e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f30321f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f30322g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30323h = new boolean[5];

    static {
        new bw5.mm0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mm0 parseFrom(byte[] bArr) {
        return (bw5.mm0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mm0)) {
            return false;
        }
        bw5.mm0 mm0Var = (bw5.mm0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30319d), java.lang.Long.valueOf(mm0Var.f30319d)) && n51.f.a(this.f30320e, mm0Var.f30320e) && n51.f.a(this.f30321f, mm0Var.f30321f) && n51.f.a(this.f30322g, mm0Var.f30322g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30322g;
        java.util.LinkedList linkedList2 = this.f30321f;
        boolean[] zArr = this.f30323h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30319d);
            }
            java.lang.String str = this.f30320e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30319d) : 0;
            java.lang.String str2 = this.f30320e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
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
        if (intValue == 1) {
            this.f30319d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30320e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.om0 om0Var = new bw5.om0();
                if (bArr != null && bArr.length > 0) {
                    om0Var.parseFrom(bArr);
                }
                linkedList2.add(om0Var);
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.jm0 jm0Var = new bw5.jm0();
            if (bArr2 != null && bArr2.length > 0) {
                jm0Var.parseFrom(bArr2);
            }
            linkedList.add(jm0Var);
        }
        zArr[4] = true;
        return 0;
    }
}
