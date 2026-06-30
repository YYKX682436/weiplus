package bw5;

/* loaded from: classes2.dex */
public class s60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32818d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32819e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.e80 f32820f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32821g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32822h;

    /* renamed from: i, reason: collision with root package name */
    public int f32823i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f32824m = new boolean[7];

    static {
        new bw5.s60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s60 parseFrom(byte[] bArr) {
        return (bw5.s60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s60)) {
            return false;
        }
        bw5.s60 s60Var = (bw5.s60) fVar;
        return n51.f.a(this.f32818d, s60Var.f32818d) && n51.f.a(this.f32819e, s60Var.f32819e) && n51.f.a(this.f32820f, s60Var.f32820f) && n51.f.a(this.f32821g, s60Var.f32821g) && n51.f.a(this.f32822h, s60Var.f32822h) && n51.f.a(java.lang.Integer.valueOf(this.f32823i), java.lang.Integer.valueOf(s60Var.f32823i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32824m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32818d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32819e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.e80 e80Var = this.f32820f;
            if (e80Var != null && zArr[3]) {
                fVar.i(3, e80Var.computeSize());
                this.f32820f.writeFields(fVar);
            }
            java.lang.String str3 = this.f32821g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f32822h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32823i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f32818d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f32819e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            bw5.e80 e80Var2 = this.f32820f;
            if (e80Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, e80Var2.computeSize());
            }
            java.lang.String str7 = this.f32821g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f32822h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f32823i) : i18;
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
                this.f32818d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32819e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.e80 e80Var3 = new bw5.e80();
                    if (bArr != null && bArr.length > 0) {
                        e80Var3.parseFrom(bArr);
                    }
                    this.f32820f = e80Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f32821g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32822h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32823i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
