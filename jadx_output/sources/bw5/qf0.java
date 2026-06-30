package bw5;

/* loaded from: classes2.dex */
public class qf0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f32087d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32088e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32090g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32091h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f32092i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.lb0 f32093m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f32089f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f32094n = new boolean[8];

    static {
        new bw5.qf0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qf0 parseFrom(byte[] bArr) {
        return (bw5.qf0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qf0)) {
            return false;
        }
        bw5.qf0 qf0Var = (bw5.qf0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32087d), java.lang.Long.valueOf(qf0Var.f32087d)) && n51.f.a(this.f32088e, qf0Var.f32088e) && n51.f.a(this.f32089f, qf0Var.f32089f) && n51.f.a(this.f32090g, qf0Var.f32090g) && n51.f.a(this.f32091h, qf0Var.f32091h) && n51.f.a(this.f32092i, qf0Var.f32092i) && n51.f.a(this.f32093m, qf0Var.f32093m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qf0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32089f;
        boolean[] zArr = this.f32094n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32087d);
            }
            java.lang.String str = this.f32088e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList);
            java.lang.String str2 = this.f32090g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f32091h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f32092i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.lb0 lb0Var = this.f32093m;
            if (lb0Var != null && zArr[7]) {
                fVar.i(7, lb0Var.computeSize());
                this.f32093m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f32087d) : 0;
            java.lang.String str5 = this.f32088e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            int g17 = h17 + b36.f.g(3, 1, linkedList);
            java.lang.String str6 = this.f32090g;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f32091h;
            if (str7 != null && zArr[5]) {
                g17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f32092i;
            if (str8 != null && zArr[6]) {
                g17 += b36.f.j(6, str8);
            }
            bw5.lb0 lb0Var2 = this.f32093m;
            return (lb0Var2 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, lb0Var2.computeSize());
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
                this.f32087d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32088e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                linkedList.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f32090g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32091h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32092i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.lb0 lb0Var3 = new bw5.lb0();
                    if (bArr != null && bArr.length > 0) {
                        lb0Var3.parseFrom(bArr);
                    }
                    this.f32093m = lb0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
