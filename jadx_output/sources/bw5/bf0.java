package bw5;

/* loaded from: classes8.dex */
public class bf0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.zh0 f25634d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25635e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25636f;

    /* renamed from: g, reason: collision with root package name */
    public int f25637g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25638h = new boolean[6];

    static {
        new bw5.bf0();
    }

    public bw5.zh0 b() {
        return this.f25638h[2] ? this.f25634d : new bw5.zh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bf0)) {
            return false;
        }
        bw5.bf0 bf0Var = (bw5.bf0) fVar;
        return n51.f.a(this.BaseResponse, bf0Var.BaseResponse) && n51.f.a(this.f25634d, bf0Var.f25634d) && n51.f.a(java.lang.Boolean.valueOf(this.f25635e), java.lang.Boolean.valueOf(bf0Var.f25635e)) && n51.f.a(this.f25636f, bf0Var.f25636f) && n51.f.a(java.lang.Integer.valueOf(this.f25637g), java.lang.Integer.valueOf(bf0Var.f25637g));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f25638h[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bf0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25638h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            bw5.zh0 zh0Var = this.f25634d;
            if (zh0Var != null && zArr[2]) {
                fVar.i(2, zh0Var.computeSize());
                this.f25634d.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f25635e);
            }
            java.lang.String str = this.f25636f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25637g);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            bw5.zh0 zh0Var2 = this.f25634d;
            if (zh0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, zh0Var2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f25635e);
            }
            java.lang.String str2 = this.f25636f;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f25637g) : i18;
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
        if (intValue != 2) {
            if (intValue == 3) {
                this.f25635e = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f25636f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f25637g = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.zh0 zh0Var3 = new bw5.zh0();
            if (bArr2 != null && bArr2.length > 0) {
                zh0Var3.parseFrom(bArr2);
            }
            this.f25634d = zh0Var3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.bf0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f25638h[1] = true;
        return this;
    }
}
