package bw5;

/* loaded from: classes2.dex */
public class vg extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f34351d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.rz f34352e;

    /* renamed from: f, reason: collision with root package name */
    public int f34353f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34354g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34355h = new boolean[6];

    static {
        new bw5.vg();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vg)) {
            return false;
        }
        bw5.vg vgVar = (bw5.vg) fVar;
        return n51.f.a(this.BaseResponse, vgVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f34351d), java.lang.Integer.valueOf(vgVar.f34351d)) && n51.f.a(this.f34352e, vgVar.f34352e) && n51.f.a(java.lang.Integer.valueOf(this.f34353f), java.lang.Integer.valueOf(vgVar.f34353f)) && n51.f.a(this.f34354g, vgVar.f34354g);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f34355h[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34355h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34351d);
            }
            bw5.rz rzVar = this.f34352e;
            if (rzVar != null && zArr[3]) {
                fVar.i(3, rzVar.computeSize());
                this.f34352e.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34353f);
            }
            com.tencent.mm.protobuf.g gVar = this.f34354g;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f34351d);
            }
            bw5.rz rzVar2 = this.f34352e;
            if (rzVar2 != null && zArr[3]) {
                i18 += b36.f.i(3, rzVar2.computeSize());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f34353f);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34354g;
            return (gVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.b(5, gVar2);
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
        if (intValue == 2) {
            this.f34351d = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f34353f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f34354g = aVar2.d(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.rz rzVar3 = new bw5.rz();
            if (bArr2 != null && bArr2.length > 0) {
                rzVar3.parseFrom(bArr2);
            }
            this.f34352e = rzVar3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.vg) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f34355h[1] = true;
        return this;
    }
}
