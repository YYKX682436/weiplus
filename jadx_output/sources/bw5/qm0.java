package bw5;

/* loaded from: classes2.dex */
public class qm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.qm0 f32187i = new bw5.qm0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f32188d;

    /* renamed from: e, reason: collision with root package name */
    public int f32189e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32190f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f32191g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32192h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qm0)) {
            return false;
        }
        bw5.qm0 qm0Var = (bw5.qm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f32188d), java.lang.Boolean.valueOf(qm0Var.f32188d)) && n51.f.a(java.lang.Integer.valueOf(this.f32189e), java.lang.Integer.valueOf(qm0Var.f32189e)) && n51.f.a(this.f32190f, qm0Var.f32190f) && n51.f.a(this.f32191g, qm0Var.f32191g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32191g;
        boolean[] zArr = this.f32192h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f32188d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32189e);
            }
            java.lang.String str = this.f32190f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f32188d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f32189e);
            }
            java.lang.String str2 = this.f32190f;
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
            this.f32188d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32189e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32190f = aVar2.k(intValue);
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
            bw5.jm0 jm0Var = new bw5.jm0();
            if (bArr != null && bArr.length > 0) {
                jm0Var.parseFrom(bArr);
            }
            linkedList.add(jm0Var);
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.qm0) super.parseFrom(bArr);
    }
}
