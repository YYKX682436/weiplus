package bw5;

/* loaded from: classes2.dex */
public class ao extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25281d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25282e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25283f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25284g;

    /* renamed from: h, reason: collision with root package name */
    public int f25285h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25286i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f25287m = new boolean[7];

    static {
        new bw5.ao();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ao parseFrom(byte[] bArr) {
        return (bw5.ao) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ao)) {
            return false;
        }
        bw5.ao aoVar = (bw5.ao) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25281d), java.lang.Integer.valueOf(aoVar.f25281d)) && n51.f.a(this.f25282e, aoVar.f25282e) && n51.f.a(this.f25283f, aoVar.f25283f) && n51.f.a(this.f25284g, aoVar.f25284g) && n51.f.a(java.lang.Integer.valueOf(this.f25285h), java.lang.Integer.valueOf(aoVar.f25285h)) && n51.f.a(java.lang.Boolean.valueOf(this.f25286i), java.lang.Boolean.valueOf(aoVar.f25286i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ao();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25287m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25281d);
            }
            java.lang.String str = this.f25282e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f25283f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f25284g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25285h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f25286i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25281d) : 0;
            java.lang.String str4 = this.f25282e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f25283f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f25284g;
            if (str6 != null && zArr[4]) {
                e17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f25285h);
            }
            return zArr[6] ? e17 + b36.f.a(6, this.f25286i) : e17;
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
                this.f25281d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25282e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25283f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25284g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25285h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25286i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
