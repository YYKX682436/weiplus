package bw5;

/* loaded from: classes11.dex */
public class a50 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25023d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.c2 f25024e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25026g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f25025f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25027h = new boolean[7];

    static {
        new bw5.a50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a50 parseFrom(byte[] bArr) {
        return (bw5.a50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a50)) {
            return false;
        }
        bw5.a50 a50Var = (bw5.a50) fVar;
        return n51.f.a(this.BaseResponse, a50Var.BaseResponse) && n51.f.a(this.f25023d, a50Var.f25023d) && n51.f.a(this.f25024e, a50Var.f25024e) && n51.f.a(this.f25025f, a50Var.f25025f) && n51.f.a(java.lang.Boolean.valueOf(this.f25026g), java.lang.Boolean.valueOf(a50Var.f25026g));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f25027h[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25025f;
        boolean[] zArr = this.f25027h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f25023d;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            bw5.c2 c2Var = this.f25024e;
            if (c2Var != null && zArr[4]) {
                fVar.i(4, c2Var.computeSize());
                this.f25024e.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList);
            if (zArr[6]) {
                fVar.a(6, this.f25026g);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f25023d;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            bw5.c2 c2Var2 = this.f25024e;
            if (c2Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, c2Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList);
            return zArr[6] ? g17 + b36.f.a(6, this.f25026g) : g17;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                this.BaseResponse = ieVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25023d = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.c2 c2Var3 = new bw5.c2();
                if (bArr2 != null && bArr2.length > 0) {
                    c2Var3.parseFrom(bArr2);
                }
                this.f25024e = c2Var3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            if (intValue != 6) {
                return -1;
            }
            this.f25026g = aVar2.c(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.d2 d2Var = new bw5.d2();
            if (bArr3 != null && bArr3.length > 0) {
                d2Var.parseFrom(bArr3);
            }
            linkedList.add(d2Var);
        }
        zArr[5] = true;
        return 0;
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f25027h[1] = true;
        return this;
    }
}
