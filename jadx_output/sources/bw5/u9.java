package bw5;

/* loaded from: classes4.dex */
public class u9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f33808d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33809e;

    /* renamed from: f, reason: collision with root package name */
    public long f33810f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33812h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f33811g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f33813i = new boolean[6];

    static {
        new bw5.u9();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u9)) {
            return false;
        }
        bw5.u9 u9Var = (bw5.u9) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f33808d), java.lang.Boolean.valueOf(u9Var.f33808d)) && n51.f.a(this.f33809e, u9Var.f33809e) && n51.f.a(java.lang.Long.valueOf(this.f33810f), java.lang.Long.valueOf(u9Var.f33810f)) && n51.f.a(this.f33811g, u9Var.f33811g) && n51.f.a(java.lang.Boolean.valueOf(this.f33812h), java.lang.Boolean.valueOf(u9Var.f33812h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.u9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33811g;
        boolean[] zArr = this.f33813i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f33808d);
            }
            java.lang.String str = this.f33809e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f33810f);
            }
            fVar.g(4, 8, linkedList);
            if (zArr[5]) {
                fVar.a(5, this.f33812h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f33808d) : 0;
            java.lang.String str2 = this.f33809e;
            if (str2 != null && zArr[2]) {
                a17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                a17 += b36.f.h(3, this.f33810f);
            }
            int g17 = a17 + b36.f.g(4, 8, linkedList);
            return zArr[5] ? g17 + b36.f.a(5, this.f33812h) : g17;
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
            this.f33808d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33809e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33810f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f33812h = aVar2.c(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.e9 e9Var = new bw5.e9();
            if (bArr != null && bArr.length > 0) {
                e9Var.parseFrom(bArr);
            }
            linkedList.add(e9Var);
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.u9) super.parseFrom(bArr);
    }
}
