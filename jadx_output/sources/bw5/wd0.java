package bw5;

/* loaded from: classes7.dex */
public class wd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34663e;

    /* renamed from: f, reason: collision with root package name */
    public long f34664f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34665g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34666h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f34662d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34667i = new boolean[6];

    static {
        new bw5.wd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wd0 parseFrom(byte[] bArr) {
        return (bw5.wd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wd0)) {
            return false;
        }
        bw5.wd0 wd0Var = (bw5.wd0) fVar;
        return n51.f.a(this.f34662d, wd0Var.f34662d) && n51.f.a(this.f34663e, wd0Var.f34663e) && n51.f.a(java.lang.Long.valueOf(this.f34664f), java.lang.Long.valueOf(wd0Var.f34664f)) && n51.f.a(this.f34665g, wd0Var.f34665g) && n51.f.a(this.f34666h, wd0Var.f34666h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34662d;
        boolean[] zArr = this.f34667i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f34663e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f34664f);
            }
            java.lang.String str2 = this.f34665g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f34666h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str3 = this.f34663e;
            if (str3 != null && zArr[2]) {
                g17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                g17 += b36.f.h(3, this.f34664f);
            }
            java.lang.String str4 = this.f34665g;
            if (str4 != null && zArr[4]) {
                g17 += b36.f.j(4, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34666h;
            return (gVar2 == null || !zArr[5]) ? g17 : g17 + b36.f.b(5, gVar2);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.vd0 vd0Var = new bw5.vd0();
                if (bArr != null && bArr.length > 0) {
                    vd0Var.parseFrom(bArr);
                }
                linkedList.add(vd0Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34663e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34664f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f34665g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f34666h = aVar2.d(intValue);
        zArr[5] = true;
        return 0;
    }
}
