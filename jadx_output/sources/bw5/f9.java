package bw5;

/* loaded from: classes2.dex */
public class f9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27191d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27192e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27193f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27194g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27195h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f27196i = new boolean[6];

    static {
        new bw5.f9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.f9 parseFrom(byte[] bArr) {
        return (bw5.f9) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f9)) {
            return false;
        }
        bw5.f9 f9Var = (bw5.f9) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27191d), java.lang.Integer.valueOf(f9Var.f27191d)) && n51.f.a(this.f27192e, f9Var.f27192e) && n51.f.a(this.f27193f, f9Var.f27193f) && n51.f.a(this.f27194g, f9Var.f27194g) && n51.f.a(this.f27195h, f9Var.f27195h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.f9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27196i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27191d);
            }
            java.lang.String str = this.f27192e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f27193f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f27194g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f27195h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27191d) : 0;
            java.lang.String str5 = this.f27192e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f27193f;
            if (str6 != null && zArr[3]) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f27194g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f27195h;
            return (str8 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str8);
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
        if (intValue == 1) {
            this.f27191d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27192e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27193f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f27194g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f27195h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
