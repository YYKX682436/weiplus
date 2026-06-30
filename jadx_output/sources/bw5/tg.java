package bw5;

/* loaded from: classes4.dex */
public class tg extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f33421d;

    /* renamed from: e, reason: collision with root package name */
    public int f33422e;

    /* renamed from: f, reason: collision with root package name */
    public int f33423f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33424g = new boolean[5];

    static {
        new bw5.tg();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tg)) {
            return false;
        }
        bw5.tg tgVar = (bw5.tg) fVar;
        return n51.f.a(this.BaseResponse, tgVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f33421d), java.lang.Integer.valueOf(tgVar.f33421d)) && n51.f.a(java.lang.Integer.valueOf(this.f33422e), java.lang.Integer.valueOf(tgVar.f33422e)) && n51.f.a(java.lang.Integer.valueOf(this.f33423f), java.lang.Integer.valueOf(tgVar.f33423f));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f33424g[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33424g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33421d);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33422e);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33423f);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f33421d);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33422e);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f33423f) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f33421d = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f33422e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f33423f = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
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

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.tg) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f33424g[1] = true;
        return this;
    }
}
