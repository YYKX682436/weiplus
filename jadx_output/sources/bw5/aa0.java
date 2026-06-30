package bw5;

/* loaded from: classes2.dex */
public class aa0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f25110d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25112f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25113g;

    /* renamed from: h, reason: collision with root package name */
    public int f25114h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f25111e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f25115i = new boolean[6];

    static {
        new bw5.aa0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.aa0 parseFrom(byte[] bArr) {
        return (bw5.aa0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.aa0)) {
            return false;
        }
        bw5.aa0 aa0Var = (bw5.aa0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f25110d), java.lang.Boolean.valueOf(aa0Var.f25110d)) && n51.f.a(this.f25111e, aa0Var.f25111e) && n51.f.a(this.f25112f, aa0Var.f25112f) && n51.f.a(this.f25113g, aa0Var.f25113g) && n51.f.a(java.lang.Integer.valueOf(this.f25114h), java.lang.Integer.valueOf(aa0Var.f25114h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.aa0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25111e;
        boolean[] zArr = this.f25115i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f25110d);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f25112f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f25113g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25114h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = (zArr[1] ? 0 + b36.f.a(1, this.f25110d) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str3 = this.f25112f;
            if (str3 != null && zArr[3]) {
                a17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f25113g;
            if (str4 != null && zArr[4]) {
                a17 += b36.f.j(4, str4);
            }
            return zArr[5] ? a17 + b36.f.e(5, this.f25114h) : a17;
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
            this.f25110d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f25112f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f25113g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f25114h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.mc0 mc0Var = new bw5.mc0();
            if (bArr != null && bArr.length > 0) {
                mc0Var.parseFrom(bArr);
            }
            linkedList.add(mc0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
