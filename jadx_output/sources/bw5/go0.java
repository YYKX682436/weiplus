package bw5;

/* loaded from: classes2.dex */
public class go0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27934d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27935e;

    /* renamed from: f, reason: collision with root package name */
    public int f27936f;

    /* renamed from: g, reason: collision with root package name */
    public int f27937g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27938h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f27939i = new boolean[6];

    static {
        new bw5.go0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.go0 parseFrom(byte[] bArr) {
        return (bw5.go0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.go0)) {
            return false;
        }
        bw5.go0 go0Var = (bw5.go0) fVar;
        return n51.f.a(this.f27934d, go0Var.f27934d) && n51.f.a(this.f27935e, go0Var.f27935e) && n51.f.a(java.lang.Integer.valueOf(this.f27936f), java.lang.Integer.valueOf(go0Var.f27936f)) && n51.f.a(java.lang.Integer.valueOf(this.f27937g), java.lang.Integer.valueOf(go0Var.f27937g)) && n51.f.a(this.f27938h, go0Var.f27938h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.go0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27939i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27934d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27935e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27936f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27937g);
            }
            java.lang.String str3 = this.f27938h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f27934d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f27935e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27936f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f27937g);
            }
            java.lang.String str6 = this.f27938h;
            return (str6 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str6);
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
            this.f27934d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27935e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27936f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f27937g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f27938h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
