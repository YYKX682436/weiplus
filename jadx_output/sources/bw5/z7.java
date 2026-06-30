package bw5;

/* loaded from: classes8.dex */
public class z7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f35844d;

    /* renamed from: e, reason: collision with root package name */
    public int f35845e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35847g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f35846f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35848h = new boolean[5];

    static {
        new bw5.z7();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z7)) {
            return false;
        }
        bw5.z7 z7Var = (bw5.z7) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f35844d), java.lang.Long.valueOf(z7Var.f35844d)) && n51.f.a(java.lang.Integer.valueOf(this.f35845e), java.lang.Integer.valueOf(z7Var.f35845e)) && n51.f.a(this.f35846f, z7Var.f35846f) && n51.f.a(this.f35847g, z7Var.f35847g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35846f;
        boolean[] zArr = this.f35848h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f35844d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35845e);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f35847g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f35844d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f35845e);
            }
            int g17 = h17 + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f35847g;
            return (str2 == null || !zArr[4]) ? g17 : g17 + b36.f.j(4, str2);
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
            this.f35844d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35845e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f35847g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.a8 a8Var = new bw5.a8();
            if (bArr != null && bArr.length > 0) {
                a8Var.parseFrom(bArr);
            }
            linkedList.add(a8Var);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.z7) super.parseFrom(bArr);
    }
}
