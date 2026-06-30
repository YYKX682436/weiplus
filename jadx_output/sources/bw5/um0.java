package bw5;

/* loaded from: classes11.dex */
public class um0 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.um0 f33983i = new bw5.um0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f33984d;

    /* renamed from: e, reason: collision with root package name */
    public int f33985e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33986f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f33987g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33988h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.um0)) {
            return false;
        }
        bw5.um0 um0Var = (bw5.um0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f33984d), java.lang.Boolean.valueOf(um0Var.f33984d)) && n51.f.a(java.lang.Integer.valueOf(this.f33985e), java.lang.Integer.valueOf(um0Var.f33985e)) && n51.f.a(this.f33986f, um0Var.f33986f) && n51.f.a(this.f33987g, um0Var.f33987g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.um0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33987g;
        boolean[] zArr = this.f33988h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f33984d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33985e);
            }
            java.lang.String str = this.f33986f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f33984d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f33985e);
            }
            java.lang.String str2 = this.f33986f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            return a17 + b36.f.g(4, 8, linkedList);
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
            this.f33984d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33985e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33986f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.sm0 sm0Var = new bw5.sm0();
            if (bArr != null && bArr.length > 0) {
                sm0Var.parseFrom(bArr);
            }
            linkedList.add(sm0Var);
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.um0) super.parseFrom(bArr);
    }
}
