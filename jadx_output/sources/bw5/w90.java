package bw5;

/* loaded from: classes2.dex */
public class w90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34617d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34618e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34619f;

    /* renamed from: h, reason: collision with root package name */
    public int f34621h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f34620g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34622i = new boolean[6];

    static {
        new bw5.w90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w90 parseFrom(byte[] bArr) {
        return (bw5.w90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w90)) {
            return false;
        }
        bw5.w90 w90Var = (bw5.w90) fVar;
        return n51.f.a(this.f34617d, w90Var.f34617d) && n51.f.a(this.f34618e, w90Var.f34618e) && n51.f.a(this.f34619f, w90Var.f34619f) && n51.f.a(this.f34620g, w90Var.f34620g) && n51.f.a(java.lang.Integer.valueOf(this.f34621h), java.lang.Integer.valueOf(w90Var.f34621h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.w90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34620g;
        int i18 = 0;
        boolean[] zArr = this.f34622i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34617d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34618e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f34619f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList);
            if (zArr[5]) {
                fVar.e(5, this.f34621h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f34617d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f34618e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f34619f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            int g17 = i18 + b36.f.g(4, 1, linkedList);
            return zArr[5] ? g17 + b36.f.e(5, this.f34621h) : g17;
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
            this.f34617d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34618e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34619f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            linkedList.add(aVar2.k(intValue));
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f34621h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
