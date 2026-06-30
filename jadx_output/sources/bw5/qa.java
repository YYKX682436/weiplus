package bw5;

/* loaded from: classes2.dex */
public class qa extends com.tencent.mm.protobuf.f {

    /* renamed from: q, reason: collision with root package name */
    public static final bw5.qa f32017q = new bw5.qa();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32018d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32019e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32020f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32021g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f32022h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f32023i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f32024m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f32025n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f32026o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f32027p = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qa)) {
            return false;
        }
        bw5.qa qaVar = (bw5.qa) fVar;
        return n51.f.a(this.f32018d, qaVar.f32018d) && n51.f.a(this.f32019e, qaVar.f32019e) && n51.f.a(this.f32020f, qaVar.f32020f) && n51.f.a(this.f32021g, qaVar.f32021g) && n51.f.a(java.lang.Integer.valueOf(this.f32022h), java.lang.Integer.valueOf(qaVar.f32022h)) && n51.f.a(java.lang.Integer.valueOf(this.f32023i), java.lang.Integer.valueOf(qaVar.f32023i)) && n51.f.a(java.lang.Integer.valueOf(this.f32024m), java.lang.Integer.valueOf(qaVar.f32024m)) && n51.f.a(java.lang.Integer.valueOf(this.f32025n), java.lang.Integer.valueOf(qaVar.f32025n)) && n51.f.a(java.lang.Integer.valueOf(this.f32026o), java.lang.Integer.valueOf(qaVar.f32026o)) && n51.f.a(java.lang.Integer.valueOf(this.f32027p), java.lang.Integer.valueOf(qaVar.f32027p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qa();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32018d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32019e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f32020f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f32021g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f32022h);
            fVar.e(6, this.f32023i);
            fVar.e(7, this.f32024m);
            fVar.e(8, this.f32025n);
            fVar.e(9, this.f32026o);
            fVar.e(10, this.f32027p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f32018d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f32019e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f32020f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f32021g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f32022h) + b36.f.e(6, this.f32023i) + b36.f.e(7, this.f32024m) + b36.f.e(8, this.f32025n) + b36.f.e(9, this.f32026o) + b36.f.e(10, this.f32027p);
        }
        if (i17 == 2) {
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
                this.f32018d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f32019e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f32020f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f32021g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f32022h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f32023i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f32024m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f32025n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f32026o = aVar2.g(intValue);
                return 0;
            case 10:
                this.f32027p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.qa) super.parseFrom(bArr);
    }
}
