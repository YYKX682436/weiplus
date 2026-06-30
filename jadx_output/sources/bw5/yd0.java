package bw5;

/* loaded from: classes4.dex */
public class yd0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35448d;

    /* renamed from: e, reason: collision with root package name */
    public long f35449e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35450f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.n20 f35451g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.sd0 f35452h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35453i = new boolean[7];

    static {
        new bw5.yd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yd0)) {
            return false;
        }
        bw5.yd0 yd0Var = (bw5.yd0) fVar;
        return n51.f.a(this.BaseResponse, yd0Var.BaseResponse) && n51.f.a(this.f35448d, yd0Var.f35448d) && n51.f.a(java.lang.Long.valueOf(this.f35449e), java.lang.Long.valueOf(yd0Var.f35449e)) && n51.f.a(this.f35450f, yd0Var.f35450f) && n51.f.a(this.f35451g, yd0Var.f35451g) && n51.f.a(this.f35452h, yd0Var.f35452h);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f35453i[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35453i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f35448d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f35449e);
            }
            java.lang.String str2 = this.f35450f;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.n20 n20Var = this.f35451g;
            if (n20Var != null && zArr[5]) {
                fVar.i(5, n20Var.computeSize());
                this.f35451g.writeFields(fVar);
            }
            bw5.sd0 sd0Var = this.f35452h;
            if (sd0Var != null && zArr[6]) {
                fVar.i(6, sd0Var.computeSize());
                this.f35452h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            java.lang.String str3 = this.f35448d;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f35449e);
            }
            java.lang.String str4 = this.f35450f;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            bw5.n20 n20Var2 = this.f35451g;
            if (n20Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, n20Var2.computeSize());
            }
            bw5.sd0 sd0Var2 = this.f35452h;
            return (sd0Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.i(6, sd0Var2.computeSize());
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
            case 2:
                this.f35448d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35449e = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35450f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.n20 n20Var3 = new bw5.n20();
                    if (bArr2 != null && bArr2.length > 0) {
                        n20Var3.parseFrom(bArr2);
                    }
                    this.f35451g = n20Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.sd0 sd0Var3 = new bw5.sd0();
                    if (bArr3 != null && bArr3.length > 0) {
                        sd0Var3.parseFrom(bArr3);
                    }
                    this.f35452h = sd0Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.yd0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f35453i[1] = true;
        return this;
    }
}
